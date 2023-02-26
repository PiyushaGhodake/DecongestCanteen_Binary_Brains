package com.piyusha.foodorderingapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Loginvendor extends Activity {
    EditText t1;
    Button b;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1 = (EditText) findViewById(R.id.txt1);
        b = (Button) findViewById(R.id.btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vendorclick();
            }
        });
    }
        public void vendorclick() {
            Intent intent1 = new Intent(this, Vendor3.class);
            startActivity(intent1);



    }

}