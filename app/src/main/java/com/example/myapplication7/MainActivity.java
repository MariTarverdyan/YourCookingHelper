package com.example.myapplication7;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private Button b2;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button7);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMainActivity2();
            }
        });
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("nn")
                        .setMessage("mm")
                        .setCancelable(true)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                                startActivity(i);

                            }
                        })
                        .setNegativeButton("Cancle",null);
                builder.create().show();
            }
        });
    }
    public void openMainActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

}