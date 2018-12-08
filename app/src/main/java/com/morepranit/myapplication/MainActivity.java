package com.morepranit.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtEnterText;
    public static final String TEXT = "text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEnterText = findViewById(R.id.edt_enter_text);
        // Button btnSend = findViewById(R.id.btn_send);

        /*btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt = edtEnterText.getText().toString();
                Toast.makeText(MainActivity.this, txt, Toast.LENGTH_SHORT).show();
            }
        });*/
    }

    public void onSend(View view) {
        String txt = edtEnterText.getText().toString();
        // Toast.makeText(MainActivity.this, txt, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra(TEXT, txt);
        startActivity(intent);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause", "Activity paused");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume", "Activity resumed");
    }
}
