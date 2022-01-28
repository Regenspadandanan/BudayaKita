package com.example.budayakita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SplashScreen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen2);

        getSupportActionBar().hide();
           /*
        ImageView imageView = findViewById(R.id.imageView2);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SplashScreen3.class));
            }
        });

         */

    }

    public void goToSplashScreen2(View view) {
        startActivity(new Intent(getApplicationContext(), SplashScreen2.class));
    }


}
