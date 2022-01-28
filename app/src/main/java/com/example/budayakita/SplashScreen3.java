package com.example.budayakita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SplashScreen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen3);

        getSupportActionBar().hide();
    }

    public void onClickSplashScreen(View view) {
        startActivity(new Intent(getApplicationContext(), pilihprovinsi.class));
    }
}