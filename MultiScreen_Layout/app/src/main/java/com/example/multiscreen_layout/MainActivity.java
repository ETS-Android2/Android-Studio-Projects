package com.example.multiscreen_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText FirstName, LastName;
    public static final String EXTRA_NAME1 = "com.example.multiscreen_layout.extra.NAME1";
    public static final String EXTRA_NAME2 = "com.example.multiscreen_layout.extra.NAME2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActivity(View v){
        Toast.makeText(this, "Opening Second Activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity2.class);

        FirstName = findViewById(R.id.editTextTextPersonName);
        LastName = findViewById(R.id.editTextTextPersonName2);
        String nameText1 = FirstName.getText().toString();
        String nameText2 = LastName.getText().toString();
        intent.putExtra(EXTRA_NAME1,nameText1);
        intent.putExtra(EXTRA_NAME2,nameText2);



        startActivity(intent);
    }
}