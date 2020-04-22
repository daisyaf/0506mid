package com.example.test_bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Cal_BMI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal__bmi);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String height = bundle.getString("height");
        String weight = bundle.getString("weight");

        double h = Double.parseDouble(height) /100.0;
        double w = Double.parseDouble(weight);

        double bmi = w / (h *h);

        String msg = "";
        if(bmi<18.5) {
            msg = "過輕";
        } else if (bmi > 24) {
            msg = "過重";
        } else {
            msg = "標準";
        }


    }
}
