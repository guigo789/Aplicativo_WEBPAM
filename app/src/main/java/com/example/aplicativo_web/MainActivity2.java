package com.example.aplicativo_web;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void voltarpraescolha(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void abriraquaman(View view) {
        Intent intent = new Intent(this, TelaAquaman.class);
        startActivity(intent);
    }

    public void abrirbatman(View view) {
        Intent intent = new Intent(this, TelaBatman.class);
        startActivity(intent);
    }
}