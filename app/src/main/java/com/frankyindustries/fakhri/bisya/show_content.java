package com.frankyindustries.fakhri.bisya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


public class show_content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_content);

        ImageView gambar = (ImageView) findViewById(R.id.gambar);
        TextView urlku = (TextView) findViewById(R.id.keterangan);

        Intent intent=getIntent();
        String url = intent.getStringExtra("url");
        String keterangan = intent.getStringExtra("keterangan");
//Loading image from below url into imageView

//        Picasso.with(this)
//                .load(url)
//                .into(gambar);

        Picasso.get()
                .load(url)
                .into(gambar);
        urlku.setText(keterangan);
    }
}
