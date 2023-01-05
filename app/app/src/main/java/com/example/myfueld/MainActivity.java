package com.example.myfueld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.PeriodicSync;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //to remove title bar and action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();




        setContentView(R.layout.activity_main);

        Button loginbtn = findViewById(R.id.login);

        loginbtn.setOnClickListener(v -> {

            Intent intent = new Intent(this, Homepage.class);
            startActivity(intent);
        });


        TextView register = findViewById(R.id.register);

        register.setOnClickListener(v -> {

            Intent intent = new Intent(this, RegisterUser.class);
            startActivity(intent);
        });







    }}