package com.frankyindustries.fakhri.bisya.course.kalimat.tanya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.frankyindustries.fakhri.bisya.R;
import com.frankyindustries.fakhri.bisya.show_video;

public class KalimatTanya extends AppCompatActivity {
    String kodevideo;
    TextView kalimat_1, kalimat_2, kalimat_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalimattanya);

        kalimat_1 = findViewById(R.id.kalimat_1);
        kalimat_2 = findViewById(R.id.kalimat_dua);
        kalimat_3 = findViewById(R.id.kalimat_3);

        kalimat_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                kodevideo = "_qKCoI-egts";
                Intent intent = new Intent(getApplicationContext(), show_video.class);
                intent.putExtra("kodevideo", kodevideo);
                startActivity(intent);
            }
        });
        kalimat_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                kodevideo = "u2_66zcKnPQ";
                Intent intent = new Intent(getApplicationContext(), show_video.class);
                intent.putExtra("kodevideo", kodevideo);
                startActivity(intent);
            }
        });
        kalimat_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                kodevideo = "XTFtl_suWJc";
                Intent intent = new Intent(getApplicationContext(), show_video.class);
                intent.putExtra("kodevideo", kodevideo);
                startActivity(intent);
            }
        });
    }
}