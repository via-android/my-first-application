package com.morepranit.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView txtText = findViewById(R.id.txt_text);

        Intent intent = getIntent();
        if (intent != null) {
            String txt = intent.getStringExtra(MainActivity.TEXT);
            txtText.setText(txt);
        }
    }
}
