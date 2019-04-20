package com.frankyindustries.fakhri.bisya.course.kata.sifat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.frankyindustries.fakhri.bisya.R;
import com.frankyindustries.fakhri.bisya.course.kata.BelajarKata;

public class KataSifat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kata_sifat);
    }

    public void Sifat_1(View view) {
            Intent explicit = new Intent(this, KataSifat_1.class);
            startActivity(explicit);
    }
    public void Sifat_2(View view) {
        Intent explicit = new Intent(this, KataSifat_2.class);
        startActivity(explicit);
    }
    public void Sifat_3(View view) {
        Intent explicit = new Intent(this, KataSifat_3.class);
        startActivity(explicit);
    }
    public void Sifat_4(View view) {
        Intent explicit = new Intent(this, KataSifat_4.class);
        startActivity(explicit);
    }
    public void Sifat_5(View view) {
        Intent explicit = new Intent(this, KataSifat_5.class);
        startActivity(explicit);
    }
    public void btnkembali_sifat(View view) {
        Intent explicit = new Intent(this, BelajarKata.class);
        startActivity(explicit);
    }
}
