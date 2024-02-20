package com.example.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nameInp;
    Button rndBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInp = findViewById(R.id.nameInput);
        rndBtn = findViewById(R.id.rndBtn);

        rndBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        getApplicationContext(),
                        SecondActivity.class
                );

                i.putExtra("name", nameInp.getText().toString());
                startActivity(i);
            }
        });
    }
}