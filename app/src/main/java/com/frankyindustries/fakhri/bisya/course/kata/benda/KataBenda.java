package com.frankyindustries.fakhri.bisya.course.kata.benda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.frankyindustries.fakhri.bisya.R;

public class KataBenda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kata_benda);
    }
    public void Benda_1(View view) {
        Intent explicit = new Intent(this, KataBenda_1.class);
        startActivity(explicit);
    }
    public void Benda_2(View view) {
        Intent explicit = new Intent(this, KataBenda_2.class);
        startActivity(explicit);
    }
    public void Benda_3(View view) {
        Intent explicit = new Intent(this, KataBenda_3.class);
        startActivity(explicit);
    }
    public void Benda_4(View view) {
        Intent explicit = new Intent(this, KataBenda_4.class);
        startActivity(explicit);
    }
    public void Benda_5(View view) {
        Intent explicit = new Intent(this, KataBenda_5.class);
        startActivity(explicit);
    }
}
