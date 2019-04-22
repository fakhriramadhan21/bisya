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
    TextView kalimat_1, kalimat_2, kalimat_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balajar_kalimat_3);

        kalimat_1 = findViewById(R.id.kalimat_1);
        kalimat_2 = findViewById(R.id.kalimat_dua);
        kalimat_3 = findViewById(R.id.kalimat_3);

        kalimat_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                kodevideo = "lhHlCcDAnjI";
                Intent intent = new Intent(getApplicationContext(), show_video.class);
                intent.putExtra("kodevideo", kodevideo);
                startActivity(intent);
            }
        });
        kalimat_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                kodevideo = "aWE8Ciny8Sc";
                Intent intent = new Intent(getApplicationContext(), show_video.class);
                intent.putExtra("kodevideo", kodevideo);
                startActivity(intent);
            }
        });
        kalimat_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                kodevideo = "BUdkOtitmVQ";
                Intent intent = new Intent(getApplicationContext(), show_video.class);
                intent.putExtra("kodevideo", kodevideo);
                startActivity(intent);
            }
        });
    }
}

