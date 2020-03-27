package com.frankyindustries.fakhri.bisya.course.angka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.frankyindustries.fakhri.bisya.R;
import com.frankyindustries.fakhri.bisya.menu.MainActivity;
import com.frankyindustries.fakhri.bisya.show_content;

public class BelajarAngka extends AppCompatActivity {

    //List apa aja yang bisa berubah
    Button satu,dua,tiga,empat,lima,enam,tujuh,delapan,sembilan,sepuluh,seratus,seribu;
    String url,keterangan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_angka);

//        sambungin yang bisa berubah dengan ID di tampilan
        satu = findViewById(R.id.satu);
        dua = findViewById(R.id.dua);
        tiga = findViewById(R.id.tiga);
        empat = findViewById(R.id.empat);
        lima = findViewById(R.id.lima);
        enam = findViewById(R.id.enam);
        tujuh = findViewById(R.id.tujuh);
        delapan = findViewById(R.id.delapan);
        sembilan = findViewById(R.id.sembilan);
        sepuluh = findViewById(R.id.sepuluh);
        seratus = findViewById(R.id.seratus);
//        seribu = findViewById(R.id.seribu);

//        Buat onClick (perintah kalau di klik dia ngapain)
        satu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "http://drive.google.com/uc?export=view&id=1G4rc5IYsowgAersTCkXR0fvB8W3Wh187";
//                url = "https://lh3.googleusercontent.com/NaUv4SwpN25xaWD2HUzB9Hsb2S11i3MqYDdoidsJB7w0ia-ZC549uBM_fdU=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/
                keterangan = "Satu";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        dua.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "https://lh5.googleusercontent.com/vvKKn-IxJwnJhjRpCRQcejqFbZ6KJdUw3ZJUb4T4Y51peUOtjUUK7QZK3ik=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/
                keterangan = "Dua";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        tiga.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "https://lh4.googleusercontent.com/aul4xzO6G5GXt3L3NjG1yYTOAsALdklUnpsHQIytniyxRvscaydxCwyb3V4=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/
                keterangan = "Tiga";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        empat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "https://lh5.googleusercontent.com/TeMCeTD7q5NS-yjvnXNppZcf6MpTFkmvPZblfAKhMCekQm8VxeB4GELkH4M=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/
                keterangan = "Empat";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        lima.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "https://lh6.googleusercontent.com/KEj0s9-k-b1tgYrmY73YXUxZcNnVEKu_O6-tBGzr7ZJx6VmodraJvOd26oo=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/
                keterangan = "Lima";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        enam.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "https://lh5.googleusercontent.com/uCdbIvCOi4BqMYRFSkIm_AjdYXKKe19_y-UVHJFvENRjZkzHPCAfMcpRvhg=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/
                keterangan = "Enam";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        tujuh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "https://lh5.googleusercontent.com/h09wCoeCqI9HrGWGM88q-MWj91dYPX0uKFCUW8vbXCQGatz-SbMuEZBuXtE=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/
                keterangan = "Tujuh";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        delapan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "https://lh6.googleusercontent.com/-c59oRwZtkL-xiABncvZd5InvSlAyKPhNe9n215ewZZAuNXIX7Y0CFtHEMU=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/
                keterangan = "Delapan";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        sembilan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "https://lh5.googleusercontent.com/WYPfuBPMYA2CsC_AOq3seDiGwxPO0uk-hgn4cjfyscZKtRgLtKIyP3DjKzQ=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/
                keterangan = "Sembilan";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        sepuluh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "https://lh4.googleusercontent.com/sKPIobHnqGHuLkKRQhGnzIoxuStQeM0sAVHcOdcrjifKIdJjTVEhJLY3mbU=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/
                keterangan = "Sepuluh";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        seratus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "https://lh6.googleusercontent.com/RPA2IIrNBWucP-jWwdECKY5v9H-_YN8bcxeyt1uQZBvFZ-jNZKd_oSOETTQ=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/
                keterangan = "Sepuluh ribu";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
    }
}
