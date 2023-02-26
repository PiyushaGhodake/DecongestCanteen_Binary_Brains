package com.piyusha.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.chip.Chip;

import java.util.LinkedList;
import java.util.Queue;

public class Customer1<Check> extends MainActivity {


    Button placeorder;
    CheckBox dosa, sandwich, idli, pattice;
    String order;
    private Button submit;
    private TextView groupsize;
    private EditText seats;
    int size;
    public int canteenseats = 40;
    Queue<Integer> waitinglist = new LinkedList<>();
    Spinner spinner;
    String[] slot = {"Morning", "Evening"};
    @SuppressLint("MissingInflatedId")

    int tokenno = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer1);
        submit = findViewById(R.id.submit);
        groupsize = findViewById(R.id.groupsize);
        seats = findViewById(R.id.seats);
        submit.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                String s = seats.getText().toString();
                size = Integer.parseInt(s);
                canteenseats = canteenseats - size;
                if (canteenseats < 0) {
                    Toast.makeText(Customer1.this, " Sorry seats are not available we will notify you when seats gets available", Toast.LENGTH_SHORT).show();
                    waitinglist.add(size);
                } else {
                    tokenno++;
                    Toast.makeText(Customer1.this, " Seats booked successfully!", Toast.LENGTH_SHORT).show();
                    Toast.makeText(Customer1.this, " TOKEN ID " + tokenno, Toast.LENGTH_SHORT).show();

                }


            }
        });

        spinner = findViewById(R.id.sp);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, slot);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                String value = parent.getItemAtPosition(i).toString();
                Toast.makeText(Customer1.this, value, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
  /*  placeorder=findViewById(R.id.btt1);
    dosa=findViewById(R.id.box1);
    idli=findViewById(R.id.box2);
    sandwich=findViewById(R.id.box3);
    pattice=findViewById(R.id.box4);
    placeorder.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (dosa.isChecked()) {
                order += dosa.getText().toString();


            }

            if (sandwich.isChecked()) {
                order += sandwich.getText().toString();
            }
            if (idli.isChecked()) {
                order += idli.getText().toString();
            }
            if (pattice.isChecked()) {
                order += pattice.getText().toString();
            }
            customerclick2();
          //  q.add(new Order(tokenno,size));
          //  Toast.makeText(getApplicationContext(), "YOUR ORDERS\n" + order, Toast.LENGTH_LONG).show();
        }
    });
    }*/
    /*public void customerclick2() {
        Intent intent1 = new Intent(this, Menu.class);
        startActivity(intent1);

    }
*/

    }
}



