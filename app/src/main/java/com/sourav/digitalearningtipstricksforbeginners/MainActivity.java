package com.sourav.digitalearningtipstricksforbeginners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.intro);
        btn2 = findViewById(R.id.blog);
        btn3 = findViewById(R.id.seo);
        btn4 = findViewById(R.id.affiliate);
        btn5 = findViewById(R.id.earning);
        btn6 = findViewById(R.id.program);
        btn7 = findViewById(R.id.videos);
        btn8 = findViewById(R.id.about);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this,MainActivity4.class);
                startActivity(intent1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(MainActivity.this,MainActivity5.class);
                startActivity(intent3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(MainActivity.this,MainActivity7.class);
                startActivity(intent4);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(MainActivity.this,MainActivity9.class);
                startActivity(intent5);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6=new Intent(MainActivity.this,MainActivity11.class);
                startActivity(intent6);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7=new Intent(MainActivity.this,MainActivity13.class);
                startActivity(intent7);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8=new Intent(MainActivity.this,MainActivity14.class);
                startActivity(intent8);
            }
        });


    }
}