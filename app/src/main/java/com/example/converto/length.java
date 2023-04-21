package com.example.converto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class length extends AppCompatActivity {

    EditText e1,e2;
    Button b2;
    Spinner spinner1, spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        e1= findViewById(R.id.btn_from);
        e2= findViewById(R.id.btn_to);
        b2= findViewById(R.id.button);
        spinner1= findViewById(R.id.from);
        spinner2= findViewById(R.id.to);
        String unit[]={"KM","HM","DCM","M","DM","CM","MM"};
        String unit1[]={"KM","HM","DCM","M","DM","CM","MM"};

        ArrayAdapter<String> unitAdapt= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, unit);
        spinner1.setAdapter(unitAdapt);

        ArrayAdapter<String> unitAdapt1= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, unit1);
        spinner2.setAdapter(unitAdapt1);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double to;
                double from= Double.parseDouble(e1.getText().toString());
                if (spinner1.getSelectedItem().toString()=="KM" && spinner2.getSelectedItem().toString()=="KM"){
                    to= from;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="KM" && spinner2.getSelectedItem().toString()=="HM"){
                    to= from*10;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="KM" && spinner2.getSelectedItem().toString()=="DCM"){
                    to= from*100;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="KM" && spinner2.getSelectedItem().toString()=="M"){
                    to= from*1000;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="KM" && spinner2.getSelectedItem().toString()=="DM"){
                    to= from*10000;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="KM" && spinner2.getSelectedItem().toString()=="CM"){
                    to= from*100000;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="KM" && spinner2.getSelectedItem().toString()=="MM"){
                    to= from*1000000;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="HM" && spinner2.getSelectedItem().toString()=="KM"){
                    to= from/10;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="HM" && spinner2.getSelectedItem().toString()=="HM"){
                    to= from;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="HM" && spinner2.getSelectedItem().toString()=="DCM"){
                    to= from*10;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="HM" && spinner2.getSelectedItem().toString()=="M"){
                    to= from*100;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="HM" && spinner2.getSelectedItem().toString()=="DM"){
                    to= from*1000;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="HM" && spinner2.getSelectedItem().toString()=="CM"){
                    to= from*10000;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="HM" && spinner2.getSelectedItem().toString()=="MM"){
                    to= from*100000;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="DCM" && spinner2.getSelectedItem().toString()=="KM"){
                    to= from/100;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="DCM" && spinner2.getSelectedItem().toString()=="HM"){
                    to= from/10;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="DCM" && spinner2.getSelectedItem().toString()=="DCM"){
                    to= from;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="DCM" && spinner2.getSelectedItem().toString()=="M"){
                    to= from*10;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="DCM" && spinner2.getSelectedItem().toString()=="DM"){
                    to= from*100;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="DCM" && spinner2.getSelectedItem().toString()=="CM"){
                    to= from*1000;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="DCM" && spinner2.getSelectedItem().toString()=="MM"){
                    to= from*10000;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="M" && spinner2.getSelectedItem().toString()=="KM"){
                    to= from/1000;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="M" && spinner2.getSelectedItem().toString()=="HM"){
                    to= from/100;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="M" && spinner2.getSelectedItem().toString()=="DCM"){
                    to= from/10;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="M" && spinner2.getSelectedItem().toString()=="M"){
                    to= from;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="M" && spinner2.getSelectedItem().toString()=="DM"){
                    to= from*10;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="M" && spinner2.getSelectedItem().toString()=="CM"){
                    to= from*100;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="M" && spinner2.getSelectedItem().toString()=="MM"){
                    to= from*1000;
                    e2.setText(String.valueOf(to));
                }

                else if (spinner1.getSelectedItem().toString()=="DM" && spinner2.getSelectedItem().toString()=="KM") {
                    to = from / 10000;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="DM" && spinner2.getSelectedItem().toString()=="HM"){
                    to= from/1000;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="DM" && spinner2.getSelectedItem().toString()=="DCM"){
                    to= from/100;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="DM" && spinner2.getSelectedItem().toString()=="M"){
                    to= from/10;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="DM" && spinner2.getSelectedItem().toString()=="DM"){
                    to= from;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="DM" && spinner2.getSelectedItem().toString()=="CM"){
                    to= from*10;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="DM" && spinner2.getSelectedItem().toString()=="MM"){
                    to= from*100;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="CM" && spinner2.getSelectedItem().toString()=="KM"){
                    to= from/100000;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="CM" && spinner2.getSelectedItem().toString()=="HM"){
                    to= from/10000;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="CM" && spinner2.getSelectedItem().toString()=="DCM"){
                    to= from/1000;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="CM" && spinner2.getSelectedItem().toString()=="M"){
                    to= from/100;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="CM" && spinner2.getSelectedItem().toString()=="DM"){
                    to= from/10;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="CM" && spinner2.getSelectedItem().toString()=="CM"){
                    to= from;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="CM" && spinner2.getSelectedItem().toString()=="MM"){
                    to= from*10;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="MM" && spinner2.getSelectedItem().toString()=="KM"){
                    to= from/1000000;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="MM" && spinner2.getSelectedItem().toString()=="HM"){
                    to= from/100000;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="MM" && spinner2.getSelectedItem().toString()=="DCM"){
                    to= from/10000;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="MM" && spinner2.getSelectedItem().toString()=="M"){
                    to= from/1000;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="MM" && spinner2.getSelectedItem().toString()=="DM"){
                    to= from/100;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="MM" && spinner2.getSelectedItem().toString()=="CM"){
                    to= from/10;
                    e2.setText(String.valueOf(to));
                }
                else if (spinner1.getSelectedItem().toString()=="MM" && spinner2.getSelectedItem().toString()=="MM"){
                    to= from;
                    e2.setText(String.valueOf(to));
                }
                else{
                        String a="ERROR!";
                        e2.setText(a);
                }

            }
        });

    }
}