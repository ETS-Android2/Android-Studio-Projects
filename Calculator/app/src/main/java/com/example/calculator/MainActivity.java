package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text1,text2,text3,text4;
    EditText n1,n2;
    Button button1,button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);

        text1 = findViewById(R.id.t1);
        button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
                text1.setText("Addition: " + sum);
            }
        });

        text2 = findViewById(R.id.t2);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sub = Integer.parseInt(n1.getText().toString()) - Integer.parseInt(n2.getText().toString());
                text2.setText("Subtraction: " +sub);
            }
        });

        text3 = findViewById(R.id.t3);
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int mul = Integer.parseInt(n1.getText().toString()) * Integer.parseInt(n2.getText().toString());
                text3.setText("Multiplication: " +mul);
            }
        });

        text4 = findViewById(R.id.t4);
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int div = Integer.parseInt(n1.getText().toString()) / Integer.parseInt(n2.getText().toString());
                text4.setText("Division: " +div);
            }
        });
    }
}