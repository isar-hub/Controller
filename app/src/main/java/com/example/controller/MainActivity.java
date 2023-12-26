package com.example.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnContinue = findViewById(R.id.btnContinue);
        btnContinue.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this,HomeScreenActivity.class));
        });
    }
}