package com.example.test_bmi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class BMI_List extends AppCompatActivity {

    private RecyclerView bmi_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi__list);

        bmi_list = (RecyclerView) findViewById(R.id.bmi_list);


    }
}
