package com.example.myapplication7;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity7 extends AppCompatActivity {
    String text;
    int p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        text = "";
        TextView t = (TextView) findViewById(R.id.textView10);
        try {
            InputStream is;
            if (p == 0) {
                is = getAssets().open("recept1.txt");
            } else if (p == 1) {
                is = getAssets().open("recept2.txt");
            } else {
                is = getAssets().open("recept3.txt");
            }
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer);
        }catch (IOException e){
            e.printStackTrace();
            text += e;
        }
        t.setText(text);
    }
}











