package com.piyusha.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Logincust extends Activity {
    EditText t2;
    Button b2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logincust);
        t2 = (EditText) findViewById(R.id.txt2);
        b2 = (Button) findViewById(R.id.bt2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customerclick1();
                Toast.makeText(Logincust.this, " Logged in!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void customerclick1() {
        Intent intent1 = new Intent(this, Menu.class);
        startActivity(intent1);



    }
}