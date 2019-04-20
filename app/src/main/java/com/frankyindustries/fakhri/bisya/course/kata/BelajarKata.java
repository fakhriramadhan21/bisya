package com.frankyindustries.fakhri.bisya.course.kata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.frankyindustries.fakhri.bisya.course.kata.benda.KataBenda;
import com.frankyindustries.fakhri.bisya.course.kata.kerja.KataKerja;
import com.frankyindustries.fakhri.bisya.R;
import com.frankyindustries.fakhri.bisya.course.kata.sifat.KataSifat;

public class BelajarKata extends AppCompatActivity {
    Button sifat, kerja, benda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_kata);

        sifat = findViewById(R.id.sifat);
        sifat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
//                startActivity(new Intent(BelajarKata.this, KataSifat.class));
                Intent openThree = new Intent(BelajarKata.this, KataSifat.class);
                startActivity(openThree);

            }
        });
        kerja = findViewById(R.id.kerja);
        kerja.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
//                startActivity(new Intent(BelajarKata.this, KataKerja.class));
                Intent openThree = new Intent(BelajarKata.this, KataKerja.class);
                startActivity(openThree);

            }
        });
        benda = findViewById(R.id.benda);
        benda.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
//                startActivity(new Intent(BelajarKata.this, KataBenda.class));
                Intent openThree = new Intent(BelajarKata.this, KataBenda.class);
                startActivity(openThree);

            }
        });
    }
}
