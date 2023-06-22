package com.example.aplicativo_web;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaBatman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_batman);
    }

    public void voltarheroidc(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}