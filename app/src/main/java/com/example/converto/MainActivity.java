package com.example.converto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoTemp(View view) {
        Toast.makeText(this, "I M GOING TO TEMOERATURE SCREEN", Toast.LENGTH_SHORT).show();
        Intent intent= new Intent(this, temp.class);
        startActivity(intent);
    }

    public void gotoLen(View view) {
        Toast.makeText(this, "I M GOING TO LENGTH SCREEN", Toast.LENGTH_SHORT).show();
        Intent intent= new Intent(this, length.class);
        startActivity(intent);
    }

    public void gotoWeigh(View view) {
        Toast.makeText(this, "I M GOING TO WEIGHT SCREEN", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, weight.class);
        startActivity(intent);
    }

    public void gotoCurr(View view) {
        Toast.makeText(this, "I M GOING TO CURRENCY SCREEN", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, currency.class);
        startActivity(intent);
    }

    public void gotoBMI(View view) {
        Toast.makeText(this, "I M GOING TO BMI SCREEN", Toast.LENGTH_SHORT).show();
        Intent intent= new Intent(this, bmi.class);
        startActivity(intent);
    }
}