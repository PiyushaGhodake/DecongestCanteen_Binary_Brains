package com.piyusha.foodorderingapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.LinkedList;
import java.util.Queue;

public class MainActivity extends Activity {

    EditText t1, t2;
    Button b1, b2,b3;
   // Queue<Order> q=new LinkedList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginvpage();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logincpage();
            }
        });





    }

    public void loginvpage() {
        Intent intent = new Intent(this, Loginvendor.class);
        startActivity(intent);
    }
    public void logincpage() {
        Intent intent = new Intent(this, Logincust.class);
        startActivity(intent);
    }
}
/*class Order
{
    int tokenid,noofpeople;
    Order(int id,int n)
    {
        this.tokenid=id;
        this.noofpeople=n;
    }

}*/