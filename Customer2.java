package com.piyusha.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Customer2 extends Activity {
    //RecyclerView recview;
    //TextView rateView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer2);
     //    getSupportActionBar().hide();

   // rateView=findViewById(R.id.rateView);

    //getroomdata();
    }

    /*private void getroomdata() {
        MenuDatabase db= Room.databaseBuilder(getApplicationContext(),MenuDatabase.class,"cart_db").allowMainThreadQueries().build();
        DishesDao dishesDao=db.Dishesdao();
        recview=findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));

    }

    private void getSupportActionBar() {
    }*/
}