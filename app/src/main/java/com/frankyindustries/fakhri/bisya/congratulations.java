package com.frankyindustries.fakhri.bisya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.frankyindustries.fakhri.bisya.exercise.quis.MainActivity;
import com.frankyindustries.fakhri.bisya.menu.home;

public class congratulations extends AppCompatActivity {

    TextView selamat;

    Button home1, game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congratulations);



        selamat = findViewById(R.id.congratulation);

        selamat.setText("SELAMAT SKOR ANDA 10");

        home1 =findViewById(R.id.bck_home);
        game =findViewById(R.id.bck_game);

        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),home.class);
                startActivity(intent);
            }
        });
        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
