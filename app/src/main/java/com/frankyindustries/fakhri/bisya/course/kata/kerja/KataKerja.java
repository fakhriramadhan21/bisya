package com.frankyindustries.fakhri.bisya.course.kata.kerja;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.frankyindustries.fakhri.bisya.R;
import com.frankyindustries.fakhri.bisya.show_content;

public class KataKerja extends AppCompatActivity {
    TextView Kerja_1, Kerja_2, Kerja_3, Kerja_4, Kerja_5;
    String url, keterangan, Default, deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kata_kerja);

        Default = "Kata Kerja ";
        Kerja_1 = findViewById(R.id.kerja_1);
        Kerja_2 = findViewById(R.id.kerja_2);
        Kerja_3 = findViewById(R.id.kerja_3);
        Kerja_4 = findViewById(R.id.kerja_4);
        Kerja_5 = findViewById(R.id.kerja_5);

        Kerja_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                url = "https://lh3.googleusercontent.com/yd0gfWCzwhPcIhAdG-X_ynfsxzQvzmXkjcy80PUiiEtEk1Z1NSflc4CD0Vg=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                deskripsi = "\n\n Digambarkan dengan menyatukan semua ujung jari kita kemudian arahkan semua jari kita kedepan mulut.";
                keterangan = Default + "Makan" + deskripsi;
                Intent intent = new Intent(getApplicationContext(), show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        Kerja_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "https://lh3.googleusercontent.com/fCaxZlmRcgDJ1RqtOlWsOC6OZEcw1qpwRb_-G8WiKwVSRiUh4Exd1HHPNsU=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                deskripsi = "\n\n Digambarkan dengan membentuk tangan kita seperti sedang memegang gelas kemudian arahkan semua jari kita kedepan mulut.";
                keterangan = Default + "Minum" + deskripsi;
                Intent intent = new Intent(getApplicationContext(), show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        Kerja_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "https://lh3.googleusercontent.com/oeGDkrFrp8LPokd5asSPHzoofO9u6wRrRnIiX5oE5DBTwm0vUlHomvT4KhM=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                deskripsi = "\n\n Digambarkan dengan dua jari tangan kanan yang membentuk dua kaki yang sedang berjalan kemudian tangan kiri dibuat tempat seperti jalanan.";
                keterangan = Default + "Jalan" + deskripsi;
                Intent intent = new Intent(getApplicationContext(), show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        Kerja_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "https://lh5.googleusercontent.com/iBT7wsvTr2LUKPdxwy4UX08zxUnyBemTDjwYKSe4MUMZ30swU0-rEG_6jKA=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                deskripsi = "\n\n Digambarkan dengan mengarahkan tangan kanan kita kearah telinga kita seolah kita sedang mendengarkan sesuatu.";
                keterangan = Default + "Dengar" + deskripsi;
                Intent intent = new Intent(getApplicationContext(), show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        Kerja_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "https://lh3.googleusercontent.com/KYW4Xbmk5AofBI2cODyvxW7FFN5myW1xkwbD61KwkS1nG9qGSYrMtQsinSE=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                deskripsi = "\n\n Digambarkan dengan tangan kiri yang dibuat seperti sedang membaca buku dan dua jari tangan kanan yang dibuat mengarahkan kearah buku yang dibaca.";
                keterangan = Default + "Baca" + deskripsi;
                Intent intent = new Intent(getApplicationContext(), show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
    }
}