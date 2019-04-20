package com.frankyindustries.fakhri.bisya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.frankyindustries.fakhri.bisya.course.angka.BelajarAngka;
import com.frankyindustries.fakhri.bisya.course.huruf.BelajarHuruf;
import com.frankyindustries.fakhri.bisya.course.kata.BelajarKata;

public class MyExercise extends AppCompatActivity {
    Button huruf, angka, kata, kalimat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_exercise);

        huruf = (Button) findViewById(R.id.huruf);
        huruf.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(MyExercise.this, BelajarHuruf.class);
                MyExercise.this.startActivity(intent);
            }

        });
        angka = (Button) findViewById(R.id.angka);
        angka.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(MyExercise.this, BelajarAngka.class);
                MyExercise.this.startActivity(intent);
            }
        });
        kata = (Button) findViewById(R.id.kata);
        kata.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(MyExercise.this, BelajarKata.class);
                MyExercise.this.startActivity(intent);
            }
        });
    }
}