package com.frankyindustries.fakhri.bisya.course.kata.benda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.frankyindustries.fakhri.bisya.R;
import com.frankyindustries.fakhri.bisya.show_content;

public class KataBenda extends AppCompatActivity {
    TextView Benda_1, Benda_2, Benda_3, Benda_4, Benda_5;
    String url, keterangan, Default, deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kata_benda);

        Default = "Kata Benda ";
        Benda_1 = findViewById(R.id.benda_1);
        Benda_2 = findViewById(R.id.benda_2);
        Benda_3 = findViewById(R.id.benda_3);
        Benda_4 = findViewById(R.id.benda_4);
        Benda_5 = findViewById(R.id.benda_5);

        Benda_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                url = "https://lh3.googleusercontent.com/nIis17NsZtT7W_V4z17ZQVktfBe1FUIJN2AaGcZzsEYEwt0jj5WxBCM1fSg=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                deskripsi = "\n\n Digambarkan dengan memposisikan kedua telapak tangan sejajar dan mengarahkan kedua telapak tangan secara terbuka mengarah keatas.";
                keterangan = Default + "Buku" + deskripsi;
                Intent intent = new Intent(getApplicationContext(), show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        Benda_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "https://lh5.googleusercontent.com/Uyg57kSgF5-LRZB1keGHpttb2_3FIETXA-uTF6kNBwQUCAO4VIyeAj78eyw=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                deskripsi = "\n\n Digambarkan dengan memposisikan dua jari tangan kanan yaitu ibu jari dan jari telunjuk didekatkan dan tangan kiri sebagai alasnya.";
                keterangan = Default + "Pulpen" + deskripsi;
                Intent intent = new Intent(getApplicationContext(), show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        Benda_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "https://lh5.googleusercontent.com/U2XMGurKyB7TMpOMjS-it6kGjlO5oNFE99HxBAHOq8rYYp_STJSE0GD3w3I=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                deskripsi = "\n\n Digambarkan dengan memposisikan dua jari tangan kanan yaitu ibu jari dan jari telunjuk membentuk V line.";
                keterangan = Default + "Pensil" + deskripsi;
                Intent intent = new Intent(getApplicationContext(), show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        Benda_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "https://lh6.googleusercontent.com/o1vrYCKfyNivzj72Ss2PECpWqdPDyLLsCFsAOLdVu-I3jcERDBM0290kJ9U=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                deskripsi = "\n\n Digambarkan dengan memposisikan tangan kanan dan tangan kiri sejajar, saling berhadapan, telapak tangan tidak disatukan mengarah kearah depan.";
                keterangan = Default + "Lemari" + deskripsi;
                Intent intent = new Intent(getApplicationContext(), show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        Benda_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "https://lh4.googleusercontent.com/YpOImvIzIo5EMRUjLo6XSPePBMwb6c70DRwEvvY9HwAKDUeAR7QqvHcHM2E=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                deskripsi = "\n\n Digambarkan dengan megarahkan dua jari tangan kanan yaitu ibu jari dan jari telunjuk diposisikan mendekati leher mengarah kearah depan.";
                keterangan = Default + "Piring" + deskripsi;
                Intent intent = new Intent(getApplicationContext(), show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
    }
}