package com.example.converto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;



public class temp extends AppCompatActivity {
    EditText e5, e6;
    Button b4;
    Spinner spinner5, spinner6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        e5= findViewById(R.id.btn_from);
        e6= findViewById(R.id.btn_to);
        b4= findViewById(R.id.button);
        spinner5= findViewById(R.id.from);
        spinner6= findViewById(R.id.to);
        String unit[]={"Celsius","Farenheit","Kelvin"};
        String unit1[]={"Celsius", "Farenheit", "Kelvin"};



        ArrayAdapter<String> unitAdapt= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, unit);
        spinner5.setAdapter(unitAdapt);
        ArrayAdapter<String> unitAdapt1= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, unit1);
        spinner6.setAdapter(unitAdapt1);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double to;
                double from= Double.parseDouble(e5.getText().toString());

                if(spinner5.getSelectedItem().toString()=="Celsius" && spinner6.getSelectedItem().toString()=="Farenheit"){
                    to= from*(9/5)+32;
                    e6.setText(String.valueOf(to));
                }
                else if(spinner5.getSelectedItem().toString()=="Celsius" && spinner6.getSelectedItem().toString()=="Kelvin"){
                    to= from+273.15;
                    e6.setText(String.valueOf(to));
                }
                else if(spinner5.getSelectedItem().toString()=="Farenheit" && spinner6.getSelectedItem().toString()=="Celsius"){
                    to= (from-32)*5/9;
                    e6.setText(String.valueOf(to));
                }
                else if(spinner5.getSelectedItem().toString()=="Farenheit" && spinner6.getSelectedItem().toString()=="Kelvin") {
                    to = (from - 32) * (5 / 9) + 273.15;
                    e6.setText(String.valueOf(to));
                }
                else if(spinner5.getSelectedItem().toString()=="Kelvin" && spinner6.getSelectedItem().toString()=="Celsius"){
                    to= from-273.15;
                    e6.setText(String.valueOf(to));
                }
                else if(spinner5.getSelectedItem().toString()=="Kelvin" && spinner6.getSelectedItem().toString()=="Farenheit"){
                    to= (from-273.15)*(9/5)+32;
                    e6.setText(String.valueOf(to));
                }
                else{
                    String a="ERROR!";
                    e6.setText(a);
                }
            }
        });
    }

}

