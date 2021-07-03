package com.sourav.digitalearningtipstricksforbeginners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity13 extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        getSupportActionBar().setTitle("Digital Earning Tips & Tricks");
        getSupportActionBar().setSubtitle("Useful Video");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        webView=(WebView) findViewById(R.id.webView6);
        webView.setWebChromeClient(new WebChromeClient());
        webView.loadUrl("file:///android_asset/youtubevideo.html");
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);


    }
}