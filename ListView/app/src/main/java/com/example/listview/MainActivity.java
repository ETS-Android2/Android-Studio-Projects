package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String arr[] = {"Item1", "Item2", "Item3","Item4","Item5", "Item6", "Item7","Item8","Item9", "Item10", "Item11","Item12"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        // Built in Array Adapter
        // ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);

        //Custom Adapter

        MyAdapter ad = new MyAdapter(this,R.layout.my_layout,arr);
        listView.setAdapter(ad);

    }
}