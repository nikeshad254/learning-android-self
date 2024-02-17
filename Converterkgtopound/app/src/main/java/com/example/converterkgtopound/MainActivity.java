package com.example.converterkgtopound;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText convertInp;
    TextView resultText;
    Button convertBtn;

    DecimalFormat df = new DecimalFormat("#.000");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convertBtn = findViewById(R.id.convertBtn);
        convertInp = findViewById(R.id.convertInput);
        resultText = findViewById(R.id.resultText);
        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double kgInpVal = Double.parseDouble(convertInp.getText().toString());

                    double poundResVal = convertKgToPound(kgInpVal);

                    resultText.setText(kgInpVal+"kg = "+df.format(poundResVal)+" pound" );
                }catch (Exception ex){
                    Toast.makeText(MainActivity.this, ex.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public double convertKgToPound(double kgVal){
        return kgVal * 2.203;
    }
}