package com.frankyindustries.fakhri.bisya.course.kalimat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
//import com.frankyindustries.fakhri.bisya.R;

//import com.frankyindustries.fakhri.bisya.R;
import com.frankyindustries.fakhri.bisya.R;
import com.frankyindustries.fakhri.bisya.show_video;

public class belajar_kalimat_3 extends AppCompatActivity {

    String kodevideo;
    TextView kalimat_1, kalimat_2, kalimat_3, kalimat_4, kalimat_5, kalimat_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balajar_kalimat_3);

        kalimat_1 = findViewById(R.id.kalimat_1);
        kalimat_2 = findViewById(R.id.kalimat_2);
        kalimat_3 = findViewById(R.id.kalimat_3);
        kalimat_4 = findViewById(R.id.kalimat_4);
        kalimat_5 = findViewById(R.id.kalimat_5);
        kalimat_6 = findViewById(R.id.kalimat_6);

        kalimat_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                kodevideo = "1pSs3ZVlKBSHKZCelfNOmUhnox8LehyRe";
                Intent intent = new Intent(getApplicationContext(), show_video.class);
                intent.putExtra("kodevideo", kodevideo);
                startActivity(intent);
            }
        });
        kalimat_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                kodevideo = "1b4Z0X1yY27z7ctzRXng1rADwj1aIpY5_";
                Intent intent = new Intent(getApplicationContext(), show_video.class);
                intent.putExtra("kodevideo", kodevideo);
                startActivity(intent);
            }
        });
        kalimat_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                kodevideo = "1rboostAhFkS4s-pPaROXZGzgaWMxfUCO";
                Intent intent = new Intent(getApplicationContext(), show_video.class);
                intent.putExtra("kodevideo", kodevideo);
                startActivity(intent);
            }
        });
        kalimat_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                kodevideo = "1oguacUKKZGPAoDS6FiTD6HDHsV9x1BjE";
                Intent intent = new Intent(getApplicationContext(), show_video.class);
                intent.putExtra("kodevideo", kodevideo);
                startActivity(intent);
            }
        });
        kalimat_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                kodevideo = "1sJqjROEPqaxDbjPqyRXCzUIlqjgKck9o";
                Intent intent = new Intent(getApplicationContext(), show_video.class);
                intent.putExtra("kodevideo", kodevideo);
                startActivity(intent);
            }
        });
        kalimat_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                kodevideo = "1rU_1KMRmwrWEFSGEI2CiwbIcwCi8NNRc";
                Intent intent = new Intent(getApplicationContext(), show_video.class);
                intent.putExtra("kodevideo", kodevideo);
                startActivity(intent);
            }
        });
    }
}

