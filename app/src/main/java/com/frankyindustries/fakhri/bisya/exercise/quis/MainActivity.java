package com.frankyindustries.fakhri.bisya.exercise.quis;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.frankyindustries.fakhri.bisya.R;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

//import android.support.v7.app.ActionBarActivity;

/**
 * MainActivity.java
 * Purpose: Loads quiz questions for the first time
 *
 * @author Levi Hsiao
 */
public class MainActivity extends AppCompatActivity {

    private static final String FIRST_TIME = "firstTime";
    private QuestionDb db;
    private ProgressDialog progressDialog;
    private Button button;
    private Toolbar toolbar;
    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "12345");
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "My exercise");
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "exercise");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);

        // If running app for the first time, parse xml and populate db
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (!prefs.getBoolean(FIRST_TIME, false)) {
            progressDialog = new ProgressDialog(this);
            db = new QuestionDb(this);
            new PopulateDb().execute();
            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean(FIRST_TIME, true).commit();
        }

//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "123456");
                bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Play Quiz");
                bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "exercise");
                mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                Intent i = new Intent(getApplicationContext(), QuizActivity.class);
                startActivity(i);
            }
        });
    }

    // Performs the background operations of XML parsing
    // and data insertion into db
    private class PopulateDb extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            progressDialog.setTitle("Loading data...");
            progressDialog.setCancelable(false);
            progressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... params) {

            AssetManager assetManager = getAssets();
            db.open();
            try {
                InputStream inputStream = assetManager.open("data/questions.xml");
                List<Question> questionList = new ArrayList<>(new QuestionHandler()
                        .parse(inputStream));
                for (Question q : questionList) {
                    db.createQuestion(q);
                }

            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            db.close();
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            progressDialog.dismiss();
        }
    }
}
