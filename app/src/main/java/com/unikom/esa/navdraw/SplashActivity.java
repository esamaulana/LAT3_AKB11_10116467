package com.unikom.esa.navdraw;

// 25 - 04 - 19
// esa maulana
// 10116467
// akb11 / if 11

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splash = new Intent(SplashActivity.this, ViewPagerActivity.class);
                startActivity(splash);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
