package com.frankyindustries.fakhri.bisya.course.kata.sifat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.frankyindustries.fakhri.bisya.R;
import com.frankyindustries.fakhri.bisya.course.kata.BelajarKata;
import com.frankyindustries.fakhri.bisya.show_content;

public class KataSifat extends AppCompatActivity {
    TextView Sifat_1, Sifat_2, Sifat_3, Sifat_4, Sifat_5;
    String url, keterangan, Default, deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kata_sifat);

        Default = "Kata Sifat ";
        Sifat_1 = findViewById(R.id.sifat_1);
        Sifat_2 = findViewById(R.id.sifat_2);
        Sifat_3 = findViewById(R.id.sifat_3);
        Sifat_4 = findViewById(R.id.sifat_4);
        Sifat_5 = findViewById(R.id.sifat_5);

        Sifat_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "https://lh6.googleusercontent.com/jA4xHIe5YZn6Hsd21epO7s8HdDQ-hMUnlG57WgTxZnE4XhQSm254P7ZJuAw=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                deskripsi = "\n\n Digambarkan dengan mengarahkan seluruh jari kita kearah bawah kemudian mendekatkan jari tengah tangan kanan dan tangan kiri kita.";
                keterangan = Default + "Bagus" + deskripsi;
                Intent intent = new Intent(getApplicationContext(), show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        Sifat_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "https://lh3.googleusercontent.com/8-fqUMRuAA5b8ovLg4Ux4EQCn1GkEpK7msHsCt9wXhPp6VzpbB0VyQYnTyw=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                deskripsi = "\n\n Digambarkan dengan memposisikan ibu jari tangan kanan mendekati pipi kanan dengan mengarahkannya kearah depan.";
                keterangan = Default + "Jelek" + deskripsi;
                Intent intent = new Intent(getApplicationContext(), show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        Sifat_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "https://lh3.googleusercontent.com/9rndcOEY8jxmI3LKvPfGDrmsVrESaxCrhhgg679YGzTOb_9vWhnZ-lflrf8=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                deskripsi = "\n\n Digambarkan dengan memposisikan jari kelingking tangan kanan menghadap kearah bawah.";
                keterangan = Default + "Laki-laki" + deskripsi;
                Intent intent = new Intent(getApplicationContext(), show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        Sifat_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "https://lh3.googleusercontent.com/WYaduE_g9kqy96khe6e_Y5hOvfq5rVpeCEQn2cL4vbOXE24ybaxkN1KCeos=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                deskripsi = "\n\n Digambarkan dengan memposisikan keempat jari baik tangan kanan maupun tangan kiri mengarah kearah bawah kecuali ibu jari dari tangan kanan dan tangan kiri yang diposisikan saling berhadapan.";
                keterangan = Default + "Perempuan" + deskripsi;
                Intent intent = new Intent(getApplicationContext(), show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        Sifat_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "https://lh3.googleusercontent.com/7f5ChWgEYLrX02-ZVfU5O3AcnF7PIBSvX_F4-iQf9Sc9NMuZFr5Mxr1FLXk=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                deskripsi = "\n\n Digambarkan dengan memposisikan kedua tangan kanan dan tangan kiri mendekati pundak masing-masing sisi dan mengarah kearah belakang badan kita.";
                keterangan = Default + "Bahagia" + deskripsi;
                Intent intent = new Intent(getApplicationContext(), show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
    }
}