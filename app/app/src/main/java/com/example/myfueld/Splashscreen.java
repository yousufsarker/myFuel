package com.example.myfueld;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splashscreen);
        getSupportActionBar().hide();
        LogoLauncher logoLauncher=new LogoLauncher();
        logoLauncher.start();
    }

    private class LogoLauncher extends Thread{
        public void run(){
            try{
                sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            Intent intent=new Intent(com.example.myfueld.Splashscreen.this,MainActivity.class);
            startActivity(intent);
            com.example.myfueld.Splashscreen.this.finish();


        }
    }
}