package com.example.cajero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class opciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);
    }
    public void retirar(View view) {
        Intent i=new Intent(this, retirar.class);
        startActivity(i);
    }

    public void abonar(View view) {
        Intent i=new Intent(this, abonar.class);
        startActivity(i);
    }

    public void consultar(View view) {
        Intent i=new Intent(this, consultar.class);
        startActivity(i);
    }

    public void salir(View view) {
        finish();
    }


}

