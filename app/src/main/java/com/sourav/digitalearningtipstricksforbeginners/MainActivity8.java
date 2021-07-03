package com.sourav.digitalearningtipstricksforbeginners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity8 extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        getSupportActionBar().setTitle("Affiliate Marketing");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        webView=findViewById(R.id.webView2);

        int position=getIntent().getIntExtra("story_key",0);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);

        if (position==0){
            webView.loadUrl("file:///android_asset/types.html");
        }

        else if (position==1){
            webView.loadUrl("file:///android_asset/facebookads.html");
        }

        else if (position==2){
            webView.loadUrl("file:///android_asset/successfulmarketer.html");
        }

        else if (position==3){
            webView.loadUrl("file:///android_asset/bestprograms.html");
        }

        else if (position==4){
            webView.loadUrl("file:///android_asset/practicaltips.html");
        }

        else if (position==5){
            webView.loadUrl("file:///android_asset/extensions.html");
        }

        else if (position==6){
            webView.loadUrl("file:///android_asset/email.html");
        }

        else if (position==7){
            webView.loadUrl("file:///android_asset/amazon.html");
        }

        else if (position==8){
            webView.loadUrl("file:///android_asset/successful.html");
        }

        else if (position==9){
            webView.loadUrl("file:///android_asset/clickbank.html");
        }

        else if (position==10){
            webView.loadUrl("file:///android_asset/marketingtips.html");
        }

        else if (position==11){
            webView.loadUrl("file:///android_asset/promotelink.html");
        }

        else if (position==12){
            webView.loadUrl("file:///android_asset/paidads.html");
        }

        else if (position==13){
            webView.loadUrl("file:///android_asset/myths.html");
        }

    }
}