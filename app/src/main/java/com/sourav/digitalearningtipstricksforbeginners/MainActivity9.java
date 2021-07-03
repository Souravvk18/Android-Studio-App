package com.sourav.digitalearningtipstricksforbeginners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity9 extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        getSupportActionBar().setTitle("Digital Earning Tips & Tricks");
        getSupportActionBar().setSubtitle("Digital Earning");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView=findViewById(R.id.ListView3);

        String[] storyName=getResources().getStringArray(R.array.Digital_Earning);

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,R.layout.row,R.id.row_text,storyName);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity9.this,MainActivity10.class);
                intent.putExtra("story_key",position);
                startActivity(intent);
            }
        });

    }
}