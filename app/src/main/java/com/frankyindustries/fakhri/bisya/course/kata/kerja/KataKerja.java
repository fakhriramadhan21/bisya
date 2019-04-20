package com.frankyindustries.fakhri.bisya.course.kata.kerja;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.frankyindustries.fakhri.bisya.R;

public class KataKerja extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kata_kerja);
    }
    public void Kerja_1(View view) {
        Intent explicit = new Intent(this, KataKerja_1.class);
        startActivity(explicit);
    }
    public void Kerja_2(View view) {
        Intent explicit = new Intent(this, KataKerja_2.class);
        startActivity(explicit);
    }
    public void Kerja_3(View view) {
        Intent explicit = new Intent(this, KataKerja_3.class);
        startActivity(explicit);
    }
    public void Kerja_4(View view) {
        Intent explicit = new Intent(this, KataKerja_4.class);
        startActivity(explicit);
    }
    public void Kerja_5(View view) {
        Intent explicit = new Intent(this, KataKerja_5.class);
        startActivity(explicit);
    }
}
