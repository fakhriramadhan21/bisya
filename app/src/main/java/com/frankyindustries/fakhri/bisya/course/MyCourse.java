package com.frankyindustries.fakhri.bisya.course;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.frankyindustries.fakhri.bisya.course.angka.BelajarAngka;
import com.frankyindustries.fakhri.bisya.course.huruf.BelajarHuruf;
import com.frankyindustries.fakhri.bisya.course.kalimat.belajar_kalimat_2;
import com.frankyindustries.fakhri.bisya.course.kata.BelajarKata;
import com.frankyindustries.fakhri.bisya.R;

public class MyCourse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_course);
    }

    public void BelajarHuruf(View view) {
        Intent explicit = new Intent(this, BelajarHuruf.class);
        startActivity(explicit);
    }

    public void BelajarKata(View view) {
        Intent explicit = new Intent(this, BelajarKata.class);
        startActivity(explicit);
    }

    public void BelajarKalimat(View view) {
        Intent explicit = new Intent(this, belajar_kalimat_2.class);
        startActivity(explicit);
    }

    public void BelajarAngka(View view) {
        Intent explicit = new Intent(this, BelajarAngka.class);
        startActivity(explicit);
    }
}
