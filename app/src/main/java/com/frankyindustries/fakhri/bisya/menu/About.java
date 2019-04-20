package com.frankyindustries.fakhri.bisya.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.frankyindustries.fakhri.bisya.R;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void OurDeveloper(View view) {
        Intent explicit = new Intent(this, Developer.class);
        startActivity(explicit);
    }
}
