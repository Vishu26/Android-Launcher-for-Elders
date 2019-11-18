package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.HashMap;

public class Cab extends AppCompatActivity {

    HashMap<String,Object> map;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cab);

        Integer[] imageIconDatabase = { R.drawable.rick,
                R.drawable.sedan, R.drawable.micro, R.drawable.rental};

        // stores the image database names
        String[] imageNameDatabase = { "Rickshaw", "Sedan", "Micro", "Rental"};

        spinner = findViewById(R.id.cab_list123);
        CabAdapter c = new CabAdapter(this, imageNameDatabase, imageIconDatabase);
        spinner.setAdapter(c);

    }



}
