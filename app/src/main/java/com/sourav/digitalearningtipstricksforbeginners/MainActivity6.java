package com.sourav.digitalearningtipstricksforbeginners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity6 extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        getSupportActionBar().setTitle("SEO Tips");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        webView=findViewById(R.id.webView1);

        int position=getIntent().getIntExtra("story_key",0);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);

        if (position==0){
            webView.loadUrl("file:///android_asset/extension.html");
        }

        else if (position==1){
            webView.loadUrl("file:///android_asset/keywordtools.html");
        }

        else if (position==2){
            webView.loadUrl("file:///android_asset/keywordresearch.html");
        }

        else if (position==3){
            webView.loadUrl("file:///android_asset/besttools.html");
        }
        else if (position==4){
            webView.loadUrl("file:///android_asset/backlinkschecker.html");
        }

        else if (position==5){
            webView.loadUrl("file:///android_asset/seotools.html");
        }
        else if (position==6){
            webView.loadUrl("file:///android_asset/onpage.html");
        }

        else if (position==7){
            webView.loadUrl("file:///android_asset/googletrend.html");
        }

        else if (position==8){
            webView.loadUrl("file:///android_asset/offpage.html");
        }

        else if (position==9){
            webView.loadUrl("file:///android_asset/linkbuilding.html");
        }


    }
}