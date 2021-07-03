package com.sourav.digitalearningtipstricksforbeginners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity7 extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        getSupportActionBar().setTitle("Digital Earning Tips & Tricks");
        getSupportActionBar().setSubtitle("Affiliate Marketing");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView=findViewById(R.id.ListView2);

        String[] storyName=getResources().getStringArray(R.array.Affiliate_Marketing);

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,R.layout.row,R.id.row_text,storyName);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity7.this,MainActivity8.class);
                intent.putExtra("story_key",position);
                startActivity(intent);
            }
        });

    }
}