package com.example.myapplication7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class BreakfastAct3 extends AppCompatActivity {
    private Button b;
    ListView lv;
    ArrayAdapter<String> adp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        b = (Button) findViewById(R.id.button12);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMainActivity2();
            }
        });
        String[] myKitchen = {"1", "2" , "3" };


        lv = (ListView) findViewById(R.id.list1);

        adp = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,myKitchen);
        lv.setAdapter(adp);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String p = Integer.toString(position);
                Intent i = new Intent(BreakfastAct3.this, MainActivity7.class);
                i.putExtra("position",p);
                startActivity(i);


            }});


    }
    public void openMainActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}