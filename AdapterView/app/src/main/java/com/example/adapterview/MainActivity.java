package com.example.adapterview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1> Creating Adatper View here: List View
        lv = findViewById(R.id.listDisplay);

        //2> creating data source: array string
        String[] countries = {"Nepal", "India", "China", "USA"};

        //3> forming a adapter
        MyCustomAdapter adapter = new MyCustomAdapter(this, countries);

        //4> loading data
        lv.setAdapter(adapter);
    }
}