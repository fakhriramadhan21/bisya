package com.frankyindustries.fakhri.bisya.menu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.frankyindustries.fakhri.bisya.MyExercise;
import com.frankyindustries.fakhri.bisya.SettingsActivity;
import com.frankyindustries.fakhri.bisya.exercise.ExerciseMengurutkan;
import com.frankyindustries.fakhri.bisya.course.MyCourse;
import com.frankyindustries.fakhri.bisya.R;

import com.frankyindustries.fakhri.bisya.exercise.quis.MainActivity;
import com.frankyindustries.fakhri.bisya.exercise.quis.QuizActivity;
import com.google.android.gms.appinvite.AppInviteInvitation;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    public static final String MESSAGES_CHILD = "data";
    private static final int REQUEST_INVITE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent explicit = new Intent(this, SettingsActivity.class);
            startActivity(explicit);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_course) {
            Intent explicit = new Intent(this, MyCourse.class);
            startActivity(explicit);
            Toast.makeText(getApplication(),"Ini my course",
                    Toast.LENGTH_LONG).show();
            // Handle the camera action
        } else if (id == R.id.nav_exercise) {
            Intent explicit = new Intent(this, MainActivity.class);
            startActivity(explicit);
            Toast.makeText(getApplication(),"Ini my exercise",
                    Toast.LENGTH_LONG).show();

        } else if (id == R.id.nav_about) {
            Intent explicit = new Intent(this, About.class);
            startActivity(explicit);
            Toast.makeText(getApplication(),"Ini about",
                    Toast.LENGTH_LONG).show();

        } else if (id == R.id.nav_developer) {
            Intent explicit = new Intent(this, Developer.class);
            startActivity(explicit);
            Toast.makeText(getApplication(),"Ini our developer",
                    Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_help) {
            Intent mailIntent = new Intent(Intent.ACTION_VIEW);
            Uri data = Uri.parse("mailto:?subject=" + "BISYA'S FEEDBACK"+ "&body=" + " " + "&to=" + "fakhrikamar216@gmail.com");
            mailIntent.setData(data);
            startActivity(Intent.createChooser(mailIntent, "Send mail..."));
            Toast.makeText(getApplication(),"Ini help",
                    Toast.LENGTH_LONG).show();

        } else if (id == R.id.nav_invite) {
            Intent intent = new AppInviteInvitation.IntentBuilder("BISYA'S INVITATION")
                    .setMessage("Anda mendapatkan undangan untuk menggunakan aplikasi BISYA")
                    .setDeepLink(Uri.parse("https://ewyc6.app.goo.gl/eNh4"))
                    .setCallToActionText("Bisya's Invitation")
                    .build();
            startActivityForResult(intent, REQUEST_INVITE);

            Toast.makeText(getApplication(),"Ini help",
                    Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(getApplication(),"Ini exit",
                    Toast.LENGTH_LONG).show();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void mycourses(View view) {
        Intent explicit = new Intent(this, MyCourse.class);
        startActivity(explicit);
        Toast.makeText(getApplication(),"Ini my courses",
                Toast.LENGTH_LONG).show();
    }


    public void myexercises(View view) {
//        DatabaseReference mFirebaseDatabaseReference;
//        mFirebaseDatabaseReference = FirebaseDatabase.getInstance().getReference();
//        Question friendlyMessage = new Question("Siapa nama saya udin?","Fakri",
//                "Udin","Ali","Baba", "Fakri");
//        mFirebaseDatabaseReference.child(MESSAGES_CHILD).push().setValue(friendlyMessage);
        Intent explicit = new Intent(this, MainActivity.class);
        startActivity(explicit);
        Toast.makeText(getApplication(),"Ini my exercises",
                Toast.LENGTH_LONG).show();
    }

    public void about(View view) {
        Intent explicit = new Intent(this, About.class);
        startActivity(explicit);
        Toast.makeText(getApplication(),"Ini about",
                Toast.LENGTH_LONG).show();
    }

    public void ourdevelopers(View view) {
        Intent explicit = new Intent(this, Developer.class);
        startActivity(explicit);
        Toast.makeText(getApplication(),"Ini our developer",
                Toast.LENGTH_LONG).show();
    }
}
