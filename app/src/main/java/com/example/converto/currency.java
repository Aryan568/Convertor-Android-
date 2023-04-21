package com.example.converto;

import static com.example.converto.config.DATA_URL;
import static com.example.converto.config.JSON_ARRAY;
import static com.google.ar.core.Config.*;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.ar.core.Config;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



public class currency extends AppCompatActivity implements Spinner.OnItemSelectedListener {
    Spinner spinner7, spinner8;
    EditText e7, e8;
    Button b7;
    String fromval, toval, conevertval;
    String country[]={};
    ArrayList<String> list= new ArrayList<>();
    ArrayList<String> list1= new ArrayList<>();
    JSONArray data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        spinner7= findViewById(R.id.from);
        spinner8= findViewById(R.id.to);
        e7= findViewById(R.id.btn_from);
        e8= findViewById(R.id.btn_to);
        b7= findViewById(R.id.button);

        spinner7.setOnItemSelectedListener(this);
        getData();

//        ArrayAdapter<String> unitAdapt= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item);
//        spinner7.setAdapter(unitAdapt);
//
//        ArrayAdapter<String> unitAdapt1= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item);
//        spinner8.setAdapter(unitAdapt1);

    }

    private void getData() {
        StringRequest stringRequest = new StringRequest(config.DATA_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        JSONObject j = null;
                        try {
                            //Parsing the fetched Json String to JSON Object
                            j = new JSONObject(response);

                            //Storing the Array of JSON String to our JSON Array
                            data = j.getJSONArray(config.JSON_ARRAY);

                            //Calling method getStudents to get the students from the JSON Array
                            getVal(data);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        //Creating a request queue
        RequestQueue requestQueue = Volley.newRequestQueue(this);

        //Adding request to the queue
        requestQueue.add(stringRequest);
    }

    private void getVal(JSONArray j) {
        for(int i=0;i<j.length();i++){
            try {
                //Getting json object
                JSONObject json = j.getJSONObject(i);

                //Adding the name of the student to array list
                list.add(json.getString(config.TAG_Currencies));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        spinner7.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, list));
    }
    private void getVal1(JSONArray j) {
        for(int i=0;i<j.length();i++){
            try {
                //Getting json object
                JSONObject json = j.getJSONObject(i);

                //Adding the name of the student to array list
                list1.add(json.getString(config.TAG_Currencies));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        spinner8.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, list1));
    }

    private String getVALUES(int position){
        String name="";
        try {
            //Getting object of given index
            JSONObject json = data.getJSONObject(position);

            //Fetching name from that object
            name = json.getString(String.valueOf(config.TAG_Value));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        //Returning the name
        return name;
    }
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //Setting the values to textviews for a selected item

        e8.setText(getVALUES(position));
    }
    public void onNothingSelected(AdapterView<?> parent) {
        e8.setText("");

    }
}