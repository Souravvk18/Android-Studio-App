package com.sourav.digitalearningtipstricksforbeginners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity10 extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        getSupportActionBar().setTitle("Digital Earning");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        webView=findViewById(R.id.webView3);

        int position=getIntent().getIntExtra("story_key",0);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);

        if (position==0){
            webView.loadUrl("file:///android_asset/facebook.html");
        }

        else  if (position==1){
            webView.loadUrl("file:///android_asset/instagram.html");
        }

        else  if (position==2){
            webView.loadUrl("file:///android_asset/instaniche.html");
        }

        else  if (position==3){
            webView.loadUrl("file:///android_asset/freelancing.html");
        }

        else  if (position==4){
            webView.loadUrl("file:///android_asset/moneyfiver.html");
        }

        else  if (position==5){
            webView.loadUrl("file:///android_asset/fivergigs.html");
        }

        else  if (position==6){
            webView.loadUrl("file:///android_asset/amazonn.html");
        }

        else  if (position==7){
            webView.loadUrl("file:///android_asset/content.html");
        }

        else  if (position==8){
            webView.loadUrl("file:///android_asset/youtube.html");
        }

        else  if (position==9){
            webView.loadUrl("file:///android_asset/promote.html");
        }

        else  if (position==10){
            webView.loadUrl("file:///android_asset/blogging.html");
        }

        else  if (position==11){
            webView.loadUrl("file:///android_asset/socialmedia.html");
        }

        else  if (position==12){
            webView.loadUrl("file:///android_asset/mobileapp.html");
        }


        else  if (position==13){
            webView.loadUrl("file:///android_asset/progskill.html");
        }

        else  if (position==14){
            webView.loadUrl("file:///android_asset/programjob.html");
        }



    }
}