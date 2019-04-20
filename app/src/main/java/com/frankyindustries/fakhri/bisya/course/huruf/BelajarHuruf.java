package com.frankyindustries.fakhri.bisya.course.huruf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.frankyindustries.fakhri.bisya.R;
import com.frankyindustries.fakhri.bisya.show_content;

public class BelajarHuruf extends AppCompatActivity {

    Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
    String url, keterangan,Default;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_huruf);

        Default = "Huruf ";

        a = findViewById(R.id.A);
        b = findViewById(R.id.B);
        c = findViewById(R.id.C);
        d = findViewById(R.id.D);
        e = findViewById(R.id.E);
        f = findViewById(R.id.F);
        g = findViewById(R.id.G);
        h = findViewById(R.id.H);
        i = findViewById(R.id.I);
        j = findViewById(R.id.J);
        k = findViewById(R.id.K);
        l = findViewById(R.id.L);
        m = findViewById(R.id.M);
        n = findViewById(R.id.N);
//        o = findViewById(R.id.O);
//        p = findViewById(R.id.P);
        q = findViewById(R.id.Q);
        r = findViewById(R.id.R);
        s = findViewById(R.id.S);
        t = findViewById(R.id.T);
        u = findViewById(R.id.U);
        v = findViewById(R.id.V);
        w = findViewById(R.id.W);
        x = findViewById(R.id.X);
        y = findViewById(R.id.Y);
        z = findViewById(R.id.Z);

        a.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                url = "https://lh3.googleusercontent.com/_svFAIdf2DQSycNC4v1Gh9WdvKa4Jr5WCVQyKLejFk9d0RCMd1ZoQWnfZ8c=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                keterangan = Default+"A";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://lh4.googleusercontent.com/OEIsQVuhTqdJddsx1Ej7vGoLUiTqTQiriG3jQOtPqtVO_X3oJaPLIHYdP8E=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                keterangan = Default+"B";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://lh3.googleusercontent.com/5-jTEVgg61fTugqWxLCEIVfBg6UQ1XkWAsfFcd0pcb0tD7-OZuVbyHV9kho=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                keterangan = Default+"C";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://lh3.googleusercontent.com/i1vXwFD-K0UNwsHbthjiYWIY8EW5gKUAYY6ehGYY8Dw_NKRGO5bCy1B9bRA=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                keterangan = Default+"D";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://lh4.googleusercontent.com/rRCUAYCZdsPOdDgAghW1DLvi0pMzVIlGCvVAi8EfMWzQ3iGvcwsa9rzkRbY=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                keterangan = Default+"E";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://lh5.googleusercontent.com/xh_064gkH_DniTIdpo5yM_8OcIxqCd4UiNCP2xNSSWjQY2fIoaL95JakM58=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                keterangan = Default+"F";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://lh5.googleusercontent.com/1P8BLRLNvl0aiCZ3m5_GABbAnAh1IRGasCsB_brxrKsOmShwNHX1tCkaW5c=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                keterangan = Default+"G";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://lh4.googleusercontent.com/QWMYhpzelRsGDe7GrqXynjKGclR1J7JgNpPGarJABzPzT_NT2NGH-7IOBwY=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                keterangan = Default+"H";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://lh3.googleusercontent.com/1_qyzPD_dYIoCvsdl5rEhLEwyZ0eAosAbfin5_7xdm2ZzDaHNxMJ8X3KPEQ=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                keterangan = Default+"I";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://lh5.googleusercontent.com/RKr9SYOLRXfQKpZdtfpth9HNGyfaACMJye449dMT8hOEPkM8ZhTTFZxrsjM=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                keterangan = Default+"J";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://lh4.googleusercontent.com/NZ6K7Ps48cB_Xq2N-s53vTqJGVL56oS7j_iMfqmwzbHdBlezQEOjCSb8TuE=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                keterangan = Default+"K";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://lh6.googleusercontent.com/sTq1B719SBrocGVoZ7WieW4PWISGzlAg5K03QxpecgtP2-Vzw6oT7wboCHM=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                keterangan = Default+"L";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://lh6.googleusercontent.com/M7PGYl2CrvkcP78wkYsI5_7B1Amt3fI-iqJ03ETCyXXYOg8UeaE8JqVj3zc=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                keterangan = Default+"M";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://lh5.googleusercontent.com/9kOOokEMubf8dgfmc5JwtSNwTdAkMbJLi71iL1eoDalRnQlXo8PGOmCiXLU=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                keterangan = Default+"N";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
//        o.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                url = "https://lh3.googleusercontent.com/i1vXwFD-K0UNwsHbthjiYWIY8EW5gKUAYY6ehGYY8Dw_NKRGO5bCy1B9bRA=w2400";
////                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/
//
//                keterangan = Default+"O";
//                Intent intent=new Intent(getApplicationContext(),show_content.class);
//                intent.putExtra("url", url);
//                intent.putExtra("keterangan", keterangan);
//                startActivity(intent);
//            }
//        });
//        p.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                url = "https://lh3.googleusercontent.com/i1vXwFD-K0UNwsHbthjiYWIY8EW5gKUAYY6ehGYY8Dw_NKRGO5bCy1B9bRA=w2400";
////                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/
//
//                keterangan = Default+"P";
//                Intent intent=new Intent(getApplicationContext(),show_content.class);
//                intent.putExtra("url", url);
//                intent.putExtra("keterangan", keterangan);
//                startActivity(intent);
//            }
//        });
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://lh5.googleusercontent.com/-qdXXdkcd7FXgsJAl8YvNbhyJ6oC-PzMxnTMcUcrcbp2JPt5DGCAbfo_QL4=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                keterangan = Default+"Q";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://lh6.googleusercontent.com/ZKRpxFZrOg8GLW1Hn3ZM-k2Anru97mi5SSs2ikuMR4U2Nz05-tkqAxHkYJ8=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                keterangan = Default+"R";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://lh6.googleusercontent.com/8S0KvKYwiawHG_f9wH4b0TENggxVg4a1ALDozrDZPaNEb1LjnTOybOqjAvI=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                keterangan = Default+"S";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://lh5.googleusercontent.com/zRz8Co4lysAF6NMfvH2asomk4UPIADs4D5l8U0qHvCG8_Gh8d5935nJMw8c=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                keterangan = Default+"T";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://lh4.googleusercontent.com/Pn989Naqrz6xZ1dyzNwZmkLsCYKTTwH9DzoN3-RQK6DZD8GXJ86g6RliETg=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                keterangan = Default+"U";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://lh4.googleusercontent.com/au9ce9JdgMesbocnMwtTozHeUoJRxtYIGpNrl3-pMzAlBGbj94w6eekmTK8=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                keterangan = Default+"V";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://lh4.googleusercontent.com/au9ce9JdgMesbocnMwtTozHeUoJRxtYIGpNrl3-pMzAlBGbj94w6eekmTK8=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                keterangan = Default+"W";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://lh5.googleusercontent.com/WfqE_gOqUCQCaO39QWTVSslpfZzx4RR6cjRrt9DCw683nt1P55e-faL9w4s=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                keterangan = Default+"X";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://lh5.googleusercontent.com/UsaMO6qXWy8gA4gtT0Yui7trlNRcSJHEa6XnuNJ8ehvy1jxAyMUhGmjZVsw=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                keterangan = Default+"Y";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://lh4.googleusercontent.com/nzeTf1JtlxYRXwcwUG7Ya48yE1TRS3xyFI7GejjdhtmvZBYCg3DwDRY1TXs=w2400";
//                How to get the URL?? open this champ https://www.labnol.org/internet/embed-google-photos-in-website/29194/

                keterangan = Default+"Z";
                Intent intent=new Intent(getApplicationContext(),show_content.class);
                intent.putExtra("url", url);
                intent.putExtra("keterangan", keterangan);
                startActivity(intent);
            }
        });
    }
}
