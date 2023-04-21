package com.example.converto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class weight extends AppCompatActivity {

    EditText e3,e4;
    Button b3;
    Spinner spinner3, spinner4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        e3= findViewById(R.id.btn_from);
        e4= findViewById(R.id.btn_to);
        b3= findViewById(R.id.button);
        spinner3= findViewById(R.id.from);
        spinner4= findViewById(R.id.to);
        String unit[]={"KG","HG","DCG","G","DG","CG","MG"};
        String unit1[]={"KG","HG","DCG","G","DG","CG","MG"};

        ArrayAdapter<String> unitAdapt= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, unit);
        spinner3.setAdapter(unitAdapt);

        ArrayAdapter<String> unitAdapt1= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, unit1);
        spinner4.setAdapter(unitAdapt1);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double to;
                double from= Double.parseDouble(e3.getText().toString());
                if (spinner3.getSelectedItem().toString()=="KG" && spinner4.getSelectedItem().toString()=="KG"){
                    to= from;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="KG" && spinner4.getSelectedItem().toString()=="HG"){
                    to= from*10;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="KG" && spinner4.getSelectedItem().toString()=="DCG"){
                    to= from*100;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="KG" && spinner4.getSelectedItem().toString()=="G"){
                    to= from*1000;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="KG" && spinner4.getSelectedItem().toString()=="DG"){
                    to= from*10000;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="KG" && spinner4.getSelectedItem().toString()=="CG"){
                    to= from*100000;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="KG" && spinner4.getSelectedItem().toString()=="MG"){
                    to= from*1000000;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="HG" && spinner4.getSelectedItem().toString()=="KG"){
                    to= from/10;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="HG" && spinner4.getSelectedItem().toString()=="HG"){
                    to= from;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="HG" && spinner4.getSelectedItem().toString()=="DCG"){
                    to= from*10;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="HG" && spinner4.getSelectedItem().toString()=="G"){
                    to= from*100;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="HG" && spinner4.getSelectedItem().toString()=="DG"){
                    to= from*1000;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="HG" && spinner4.getSelectedItem().toString()=="CG"){
                    to= from*10000;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="HG" && spinner4.getSelectedItem().toString()=="MG"){
                    to= from*100000;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="DCG" && spinner4.getSelectedItem().toString()=="KG"){
                    to= from/100;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="DCG" && spinner4.getSelectedItem().toString()=="HG"){
                    to= from/10;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="DCG" && spinner4.getSelectedItem().toString()=="DCG"){
                    to= from;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="DCG" && spinner4.getSelectedItem().toString()=="G"){
                    to= from*10;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="DCG" && spinner4.getSelectedItem().toString()=="DG"){
                    to= from*100;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="DCG" && spinner4.getSelectedItem().toString()=="CG"){
                    to= from*1000;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="DCG" && spinner4.getSelectedItem().toString()=="MG"){
                    to= from*10000;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="G" && spinner4.getSelectedItem().toString()=="KG"){
                    to= from/1000;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="G" && spinner4.getSelectedItem().toString()=="HG"){
                    to= from/100;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="G" && spinner4.getSelectedItem().toString()=="DCG"){
                    to= from/10;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="G" && spinner4.getSelectedItem().toString()=="G"){
                    to= from;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="G" && spinner4.getSelectedItem().toString()=="DG"){
                    to= from*10;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="G" && spinner4.getSelectedItem().toString()=="CG"){
                    to= from*100;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="G" && spinner4.getSelectedItem().toString()=="MG"){
                    to= from*1000;
                    e4.setText(String.valueOf(to));
                }

                else if (spinner3.getSelectedItem().toString()=="DG" && spinner4.getSelectedItem().toString()=="KG") {
                    to = from / 10000;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="DG" && spinner4.getSelectedItem().toString()=="HG"){
                    to= from/1000;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="DG" && spinner4.getSelectedItem().toString()=="DCG"){
                    to= from/100;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="DG" && spinner4.getSelectedItem().toString()=="G"){
                    to= from/10;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="DG" && spinner4.getSelectedItem().toString()=="DG"){
                    to= from;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="DG" && spinner4.getSelectedItem().toString()=="CG"){
                    to= from*10;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="DG" && spinner4.getSelectedItem().toString()=="MG"){
                    to= from*100;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="CG" && spinner4.getSelectedItem().toString()=="KG"){
                    to= from/100000;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="CG" && spinner4.getSelectedItem().toString()=="HG"){
                    to= from/10000;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="CG" && spinner4.getSelectedItem().toString()=="DCG"){
                    to= from/1000;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="CG" && spinner4.getSelectedItem().toString()=="G"){
                    to= from/100;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="CG" && spinner4.getSelectedItem().toString()=="DG"){
                    to= from/10;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="CG" && spinner4.getSelectedItem().toString()=="CG"){
                    to= from;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="CG" && spinner4.getSelectedItem().toString()=="MG"){
                    to= from*10;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="MG" && spinner4.getSelectedItem().toString()=="KG"){
                    to= from/1000000;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="MG" && spinner4.getSelectedItem().toString()=="HG"){
                    to= from/100000;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="MG" && spinner4.getSelectedItem().toString()=="DCG"){
                    to= from/10000;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="MG" && spinner4.getSelectedItem().toString()=="G"){
                    to= from/1000;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="MG" && spinner4.getSelectedItem().toString()=="DG"){
                    to= from/100;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="MG" && spinner4.getSelectedItem().toString()=="CG"){
                    to= from/10;
                    e4.setText(String.valueOf(to));
                }
                else if (spinner3.getSelectedItem().toString()=="MG" && spinner4.getSelectedItem().toString()=="MG"){
                    to= from;
                    e4.setText(String.valueOf(to));
                }
                else{
                    String a="ERROR!";
                    e4.setText(a);
                }

            }
        });
    }
}