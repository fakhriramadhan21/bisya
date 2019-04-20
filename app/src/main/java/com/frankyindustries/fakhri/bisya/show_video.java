package com.frankyindustries.fakhri.bisya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.frankyindustries.fakhri.bisya.R;

public class show_video extends AppCompatActivity {

    String kode_youtube;
    WebView webViewSaya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);// Call this after super.onCreate
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_show_video);

        Intent intent=getIntent();
        kode_youtube = intent.getStringExtra("kodevideo");

        webViewSaya = (WebView) findViewById(R.id.yutub);

        // setting
        webViewSaya.setWebViewClient(new WebViewClient());
        webViewSaya.setWebChromeClient(new WebChromeClient());
        webViewSaya.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webViewSaya.getSettings().setJavaScriptEnabled(true);
        webViewSaya.getSettings().setPluginState(WebSettings.PluginState.ON);
        webViewSaya.getSettings().setDefaultFontSize(18);
//        String kode_youtube = "j7cOvHzrkkA";

        String kodeHTML = "<head></head><body>" +
                "<iframe width=\"464\" height=\"261\" src=\"https://www.youtube.com/embed/" +
                kode_youtube +
                "\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>" +
                "</body>";
        webViewSaya.loadData(kodeHTML,"text/html; charset=utf-8",null);
    }
}
