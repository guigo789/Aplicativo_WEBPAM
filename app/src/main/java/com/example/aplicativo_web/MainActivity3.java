package com.example.aplicativo_web;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void voltarescolhatema(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void abririronman(View view){
        Intent intent = new Intent(this, TelaIron.class);
        startActivity(intent);
}
    public void abrirblackpanther(View view){
        Intent intent = new Intent(this, TelaPanteraNegra.class);
        startActivity(intent);
}
}

