package com.frankyindustries.fakhri.bisya.course.kalimat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.frankyindustries.fakhri.bisya.R;

public class belajarKalimat_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_kalimat_2);
    }

    public void KalimatTunggal(View view) {
        Intent explicit = new Intent(this, belajar_kalimat_3.class);
        startActivity(explicit);
    }
}
