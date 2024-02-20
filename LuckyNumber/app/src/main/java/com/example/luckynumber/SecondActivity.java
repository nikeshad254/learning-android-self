package com.example.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    Button shareNumberBtn;
    TextView luckyNumberText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        shareNumberBtn = findViewById(R.id.shareNumberBtn);
        luckyNumberText = findViewById(R.id.luckyNumberText);

        Intent i = getIntent();
        String userName = i.getStringExtra("name");

        // generating rnd number
        int rndNum = generateRndNum();
        luckyNumberText.setText(""+rndNum);

        shareNumberBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareData(userName, rndNum);
            }
        });


    }

    public int generateRndNum(){
        Random rnd = new Random();
        int upperLimit = 1000;
        return rnd.nextInt(upperLimit);
    }

    public void shareData(String uname, int rndNum){
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");

        // Additional Info
        // extra to pre-populate content like while sharing from emails
        i.putExtra(Intent.EXTRA_SUBJECT, uname + " Got Lucky Today!");
        i.putExtra(Intent.EXTRA_TEXT, "His lucky number is = "+ rndNum);

        startActivity(Intent.createChooser(i, "Choose a platform"));
    }
}