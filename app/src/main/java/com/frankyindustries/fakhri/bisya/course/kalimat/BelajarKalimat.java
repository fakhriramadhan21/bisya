package com.frankyindustries.fakhri.bisya.course.kalimat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.frankyindustries.fakhri.bisya.R;

public class BelajarKalimat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajarkalimat);
    }

    public void KalimatTunggal(View view) {
            Intent explicit = new Intent(this, belajarKalimat_2.class);
            startActivity(explicit);
    }
}
