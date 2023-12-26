package com.example.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class HomeScreenActivity extends AppCompatActivity {
    MaterialButton turnOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        turnOn = findViewById(R.id.turnOnBtn);
        turnOn.setOnClickListener(view -> {
            startActivity(new Intent(HomeScreenActivity.this,ListDevicesActivity.class));
        });
    }
}