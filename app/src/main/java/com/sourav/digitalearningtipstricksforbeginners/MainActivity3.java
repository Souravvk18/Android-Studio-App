package com.sourav.digitalearningtipstricksforbeginners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity3 extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getSupportActionBar().setTitle("Blogging Guide");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        webView=findViewById(R.id.webView);

        int position=getIntent().getIntExtra("story_key",0);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);

        if (position==0){
            webView.loadUrl("file:///android_asset/startablog.html");
        }

      else   if (position==1){
            webView.loadUrl("file:///android_asset/chooseniche.html");
        }

       else if (position==2){
            webView.loadUrl("file:///android_asset/blogplatform.html");
        }

       else if (position==3){
            webView.loadUrl("file:///android_asset/domainhosting.html");
        }

       else if (position==4){
            webView.loadUrl("file:///android_asset/freeblog.html");
        }

       else if (position==5){
            webView.loadUrl("file:///android_asset/profitableniche.html");
        }

       else if (position==6){
            webView.loadUrl("file:///android_asset/nocontent.html");
        }

       else if (position==7){
            webView.loadUrl("file:///android_asset/blogcontent.html");
        }

        else if (position==8){
            webView.loadUrl("file:///android_asset/blogpost.html");
        }

        else if (position==9){
            webView.loadUrl("file:///android_asset/articleformat.html");
        }

        else if (position==10){
            webView.loadUrl("file:///android_asset/bloggingtools.html");
        }

        else if (position==11){
            webView.loadUrl("file:///android_asset/freehost.html");
        }

        else if (position==12){
            webView.loadUrl("file:///android_asset/microniche.html");
        }

        else if (position==13){
            webView.loadUrl("file:///android_asset/bloggingmistake.html");
        }

        else if (position==14){
            webView.loadUrl("file:///android_asset/generatetraffic.html");
        }

        else if (position==15){
            webView.loadUrl("file:///android_asset/promoteblog.html");
        }

        else if (position==16){
            webView.loadUrl("file:///android_asset/monetizeblog.html");
        }

    }
}