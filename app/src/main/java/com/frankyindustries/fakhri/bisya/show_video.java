package com.frankyindustries.fakhri.bisya;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

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

//        webViewSaya.setWebChromeClient(new MyChrome());
//        webViewSaya.setWebViewClient(new WebViewClient());
//        webViewSaya.setWebChromeClient(new WebChromeClient());
//        webViewSaya.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
//        webViewSaya.getSettings().setJavaScriptEnabled(true);
//        webViewSaya.getSettings().setPluginState(WebSettings.PluginState.ON);
//        webViewSaya.getSettings().setDefaultFontSize(18);
//        String kode_youtube = "j7cOvHzrkkA";
        webViewSaya.setWebViewClient(new Browser_home());
        webViewSaya.setWebChromeClient(new MyChrome());
        WebSettings webSettings = webViewSaya.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setAppCacheEnabled(true);
//        loadWebsite();

        String kodeHTML = "<head></head><body>" +
                "<iframe width=\"464\" height=\"261\" src=\"https://www.youtube.com/embed/" +
                kode_youtube +
                "\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>" +
                "</body>";
        webViewSaya.loadData(kodeHTML,"text/html; charset=utf-8",null);





    }
    class Browser_home extends WebViewClient {

        Browser_home() {
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);

        }

        @Override
        public void onPageFinished(WebView view, String url) {
            setTitle(view.getTitle());
//            progressBar.setVisibility(View.GONE);
            super.onPageFinished(view, url);

        }
    }

    private class MyChrome extends WebChromeClient {

        private View mCustomView;
        private WebChromeClient.CustomViewCallback mCustomViewCallback;
        protected FrameLayout mFullscreenContainer;
        private int mOriginalOrientation;
        private int mOriginalSystemUiVisibility;

        MyChrome() {
        }

        public Bitmap getDefaultVideoPoster() {
            if (mCustomView == null) {
                return null;
            }
            return BitmapFactory.decodeResource(getApplicationContext().getResources(), 2130837573);
        }

        public void onHideCustomView() {
            ((FrameLayout) getWindow().getDecorView()).removeView(this.mCustomView);
            this.mCustomView = null;
            getWindow().getDecorView().setSystemUiVisibility(this.mOriginalSystemUiVisibility);
            setRequestedOrientation(this.mOriginalOrientation);
            this.mCustomViewCallback.onCustomViewHidden();
            this.mCustomViewCallback = null;
        }

        public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback) {
            if (this.mCustomView != null) {
                onHideCustomView();
                return;
            }
            this.mCustomView = paramView;
            this.mOriginalSystemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
            this.mOriginalOrientation = getRequestedOrientation();
            this.mCustomViewCallback = paramCustomViewCallback;
            ((FrameLayout) getWindow().getDecorView()).addView(this.mCustomView, new FrameLayout.LayoutParams(-1, -1));
            getWindow().getDecorView().setSystemUiVisibility(3846);
        }
    }

}
