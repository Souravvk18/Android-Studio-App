package com.sourav.digitalearningtipstricksforbeginners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity2 extends AppCompatActivity {
ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setTitle("Digital Earning Tips & Tricks");
        getSupportActionBar().setSubtitle("Blogging Guide");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView=findViewById(R.id.ListView);

        String[] storyName=getResources().getStringArray(R.array.Bloging_Guide);

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,R.layout.row,R.id.row_text,storyName);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("story_key",position);
                startActivity(intent);
            }
        });
    }
}