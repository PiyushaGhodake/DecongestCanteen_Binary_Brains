package com.piyusha.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Vendor extends MainActivity {

    Button button;
    int result;
    TextView TokenDetail;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor2);

        button.setOnClickListener(new View.OnClickListener()

        {

            @Override
            public void onClick(View v) {
                vendorclick3();

            }

        });
    }
    public void vendorclick3() {
        Intent intent2 = new Intent(this, Vendor3.class);
        startActivity(intent2);


    }




}