package com.example.myapplication7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = (Button) findViewById(R.id.button2);
        button1 = (Button) findViewById(R.id.button3);
        button2 = (Button) findViewById(R.id.button4);
        button3 = (Button) findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMainActivity3();
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMainActivity4();
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMainActivity5();
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMainActivity6();
            }
        });
    }


    public void openMainActivity3(){
        Intent intent = new Intent(this, BreakfastAct3.class);
        startActivity(intent);
    }
    public void openMainActivity4(){
        Intent intent = new Intent(this, LunchAct4.class);
        startActivity(intent);
    }
    public void openMainActivity5(){
        Intent intent = new Intent(this, DinnerAct5.class);
        startActivity(intent);
    }
    public void openMainActivity6(){
        Intent intent = new Intent(this, DessertAct6.class);
        startActivity(intent);
    }

}