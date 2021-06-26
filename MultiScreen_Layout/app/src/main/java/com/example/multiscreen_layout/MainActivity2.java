package com.example.multiscreen_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        String name1 = intent.getStringExtra(MainActivity.EXTRA_NAME1);
        String name2 = intent.getStringExtra(MainActivity.EXTRA_NAME2);

        textView.setText(name1 + " " + name2);
    }
}