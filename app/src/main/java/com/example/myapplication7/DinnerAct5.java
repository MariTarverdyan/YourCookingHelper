package com.example.myapplication7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class DinnerAct5 extends AppCompatActivity {
    private Button b;
    ListView lv;
    ArrayAdapter<String> adp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        b = (Button) findViewById(R.id.button9);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMainActivity2();
            }
        });
        String[] myKitchen = {"1", "2" , "3", "4", "5","6","7","8","9","10"};


        lv = (ListView) findViewById(R.id.listview3);

        adp = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,myKitchen);
        lv.setAdapter(adp);


    }
    public void openMainActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}