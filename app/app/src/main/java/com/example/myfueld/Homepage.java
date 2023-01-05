package com.example.myfueld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Homepage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //to remove title bar and action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();





        setContentView(R.layout.activity_homepage);

        Button petroladd = findViewById(R.id.petroladd);

        petroladd.setOnClickListener(v -> {

            Intent intent = new Intent(this, Petrolorder.class);
            startActivity(intent);
        });

        Button dieseladd = findViewById(R.id.dieseladd);

        dieseladd.setOnClickListener(v -> {

            Intent intent = new Intent(this, Dieselorder.class);
            startActivity(intent);
        });

        Button chargeadd = findViewById(R.id.chargeadd);

        chargeadd.setOnClickListener(v -> {

            Intent intent = new Intent(this, Chargeorder.class);
            startActivity(intent);
        });






    }
}