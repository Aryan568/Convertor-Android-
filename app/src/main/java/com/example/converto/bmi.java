package com.example.converto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class bmi extends AppCompatActivity {

    EditText et1, et2;
    TextView res, cat;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        et1= findViewById(R.id.txt_kg);
        et2= findViewById(R.id.txt_m);
        b1= findViewById(R.id.button);
        res= findViewById(R.id.txt_Result);
        cat= findViewById(R.id.txt_Categories);
        b1.setOnClickListener(new View.OnClickListener() {
            public final DecimalFormat df = new DecimalFormat("0.00");
            @Override
            public void onClick(View view) {

                float valkg = Float.parseFloat(et1.getText().toString());
                float valm = Float.parseFloat(et2.getText().toString());
//                float sum= Float.parseFloat(et1.getText().toString())/(Float.parseFloat(et1.getText().toString()*Float.parseFloat(et1.getText().toString())));
                float sum = valkg / (valm * valm);
                res.setText(String.valueOf(df.format(sum)));

                if (sum < 18.5) cat.setText("You need to eat more");
                if (sum >= 18.5 && sum < 25) cat.setText("You are fitt");
                if (sum >= 25 && sum < 30) cat.setText("Yoy fatty boy, you eat too much");
                if (sum >= 30) cat.setText("Oh man, you intake unlimited material");
            }
        });
    }
}