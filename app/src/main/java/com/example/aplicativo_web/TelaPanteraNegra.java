package com.example.aplicativo_web;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaPanteraNegra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pantera_negra);

    }

    public void voltarheroimarvel2(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}