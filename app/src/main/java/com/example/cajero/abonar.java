package com.example.cajero;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class abonar extends AppCompatActivity {
    private EditText editSaldo;
    Integer saldo, saldo_total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abonar);
        editSaldo = (EditText) findViewById(R.id.editSaldo);
    }

    public void regresar(View view) {
        finish();
    }

    public void abonarsaldo(View view) {
        if (editSaldo.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Favor de ingresar saldo a abonar", Toast.LENGTH_LONG).show();
        } else {
            saldo = Integer.parseInt(editSaldo.getText().toString());
            Global globalVariable = (Global) getApplicationContext();
            Integer saldo_actual = globalVariable.getSaldo();

            saldo_total = saldo + saldo_actual;

            globalVariable.setSaldo(saldo_total);

            Toast.makeText(getApplicationContext(), "Gracias por abonar saldo", Toast.LENGTH_SHORT).show();
        }


    }
}

