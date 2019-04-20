package com.frankyindustries.fakhri.bisya.course.kata.sifat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.frankyindustries.fakhri.bisya.R;
import com.frankyindustries.fakhri.bisya.course.kata.BelajarKata;

public class KataSifat_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kata_sifat_1);
    }
    public void btnsifat_1(View view) {
        Intent explicit = new Intent(this, BelajarKata.class);
        startActivity(explicit);
    }
}
