package com.example.petcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        Thread thread=new Thread()  {
            @Override
            public void run() {
                try {
                    sleep(1000);
                }catch (Exception e){

                }finally {
                    Intent intent=new Intent(SplashScreen.this, Login.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        thread.start();
    }
}