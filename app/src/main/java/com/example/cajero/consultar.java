package com.example.cajero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class consultar extends AppCompatActivity {
    private TextView textMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar);

        textMensaje = (TextView) findViewById(R.id.textMensaje);

        Global globalVariable = (Global) getApplicationContext();

        Integer saldo_actual = globalVariable.getSaldo();


        textMensaje.setText("Su saldo actual es: "+ saldo_actual + " soles");
    }

    public void regresar(View view) {
        finish();
    }
}

