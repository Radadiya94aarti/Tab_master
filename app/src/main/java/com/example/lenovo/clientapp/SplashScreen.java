package com.example.lenovo.clientapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by lenovo on 17-03-2017.
 */

public class SplashScreen extends AppCompatActivity {


    private static final int LOADING_SCREEN_TIME = 1000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Thread thread = new Thread(){

            @Override
            public void run() {

                try {
                    sleep(LOADING_SCREEN_TIME);
                    Intent intent = new Intent(SplashScreen.this,Login.class);
                    startActivity(intent);
                    finish();
                }
                catch (InterruptedException e) {

                    e.printStackTrace();
                }

            }
        };
        thread.start();
    }
}
