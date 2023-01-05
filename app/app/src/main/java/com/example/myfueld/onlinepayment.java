package com.example.myfueld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class onlinepayment extends AppCompatActivity {

    Button payonlpay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //to remove title bar and action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();



        setContentView(R.layout.activity_onlinepayment);




        payonlpay = (Button)findViewById(R.id.payonlinepayment);

        payonlpay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(onlinepayment.this,"Order Placed Successfully",Toast.LENGTH_SHORT).show();
            }
        });


    }
}