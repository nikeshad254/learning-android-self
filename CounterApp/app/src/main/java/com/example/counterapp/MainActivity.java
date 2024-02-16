package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button incrBtn;
    Button dcrBtn;
    TextView counterLabel;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        incrBtn = findViewById(R.id.incrBtn);
        dcrBtn = findViewById(R.id.dcrBtn);
        counterLabel = findViewById(R.id.counterLabel);

        incrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increment();
                displayCount();
            }
        });

        dcrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrement();
                displayCount();
            }
        });
    }

    public int increment(){
        return ++counter;
    }

    public int decrement(){
        return --counter;
    }

    public void displayCount(){
        if(counter < 0){
            counterLabel.setTextColor(Color.parseColor("#FF0000"));
        } else if (counter == 0) {
            counterLabel.setTextColor(Color.parseColor("#ffffff"));
        }else{
            counterLabel.setTextColor(Color.parseColor("#008000"));
        }

        counterLabel.setText(""+counter);
    }
}