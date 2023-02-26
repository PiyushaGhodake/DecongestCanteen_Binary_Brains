package com.piyusha.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import kotlinx.coroutines.internal.AtomicKt;

public class Menu extends MainActivity {
    EditText txt1,txt2,txt;
    Button bt1,bt2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
       txt=findViewById(R.id.tid);
        txt1=findViewById(R.id.dishname);
        txt2 = findViewById(R.id.qty);
        bt1=(Button) findViewById(R.id.button);
        bt2=(Button) findViewById(R.id.button1);

       //MenuDatabase db = Room.databaseBuilder(getApplicationContext(), MenuDatabase.class, "cart_db").allowMainThreadQueries().build();
       // MenuDatabase db = MenuDatabase.getDB(this);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               MenuDatabase db = Room.databaseBuilder(getApplicationContext(), MenuDatabase.class, "cart_db").allowMainThreadQueries().build();
                DishesDao dishesDao = db.Dishesdao();
                int id = Integer.parseInt(txt.getText().toString());
                String nm = txt1.getText().toString();
                int qty = Integer.parseInt(txt2.getText().toString());
                dishesDao.insert(new Dishes(id,nm, qty));
                txt.setText("");
                txt1.setText("");
                txt2.setText("");
                Toast.makeText(Menu.this, " Ordered Placed successfully!", Toast.LENGTH_SHORT).show();
            }



        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               click();
            }
        });


    }
    public void click() {
        Intent intent1 = new Intent(this, Customer2.class);
        startActivity(intent1);

    }
}