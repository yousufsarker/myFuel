package com.example.myfueld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Dieselorder extends AppCompatActivity {

    Button paycash,payonline;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //to remove title bar and action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();



        setContentView(R.layout.activity_dieselorder);

        Spinner myspinner  = (Spinner) findViewById(R.id.spinner3);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(Dieselorder.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Litre));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner.setAdapter(myAdapter);

        paycash = (Button)findViewById(R.id.paycash);
        payonline = (Button)findViewById(R.id.payonline);

        paycash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Dieselorder.this,"Order Placed Successfully",Toast.LENGTH_SHORT).show();
            }
        });

        payonline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dieselorder.this,onlinepayment.class);
                startActivity(intent);
            }
        });


    }
}