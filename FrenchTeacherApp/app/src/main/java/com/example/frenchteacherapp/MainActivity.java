package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button blackBtn, greenBtn, purpleBtn, redBtn, yellowBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackBtn = findViewById(R.id.blackBTn);
        greenBtn = findViewById(R.id.greenBtn);
        purpleBtn = findViewById(R.id.purpleBtn);
        redBtn = findViewById(R.id.redBtn);
        yellowBtn = findViewById(R.id.yellowBtn);

        // here this refers to the interface View.OnCLickListener which redirects code to onClick below
        redBtn.setOnClickListener(this);
        blackBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Here we find the button by Id and play the correct sound
        int clickedBtnId = v.getId();

        if(clickedBtnId == R.id.redBtn){
            playSounds(R.raw.red);
        }else if(clickedBtnId == R.id.blackBTn){
            playSounds(R.raw.black);
        }else if(clickedBtnId == R.id.greenBtn){
            playSounds(R.raw.green);
        }else if(clickedBtnId == R.id.purpleBtn){
            playSounds(R.raw.purple);
        }else if(clickedBtnId == R.id.yellowBtn){
            playSounds(R.raw.yellow);
        }
    }

    public void playSounds(int id){
        MediaPlayer mp = MediaPlayer.create(
                getApplicationContext(),
                id
        );
        mp.start();
    }
}