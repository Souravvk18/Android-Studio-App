package com.sourav.digitalearningtipstricksforbeginners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity14 extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        getSupportActionBar().setTitle("Digital Earning Tips & Tricks");
        getSupportActionBar().setSubtitle("About Us");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        webView=(WebView) findViewById(R.id.webView5);
        webView.setWebChromeClient(new WebChromeClient());
        webView.loadUrl("file:///android_asset/about.html");
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);


    }
}