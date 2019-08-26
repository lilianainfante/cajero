package com.example.cajero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class retirar extends AppCompatActivity {
    Integer saldo_total, saldo_actual, retirar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retirar);
    }
    public void retirar(View view) {
        switch (view.getId()){
            case R.id.button:
                retirar = 50;
                consultar(retirar);
                break;
            case R.id.button2:
                retirar = 100;
                consultar(retirar);
                break;
            case R.id.button3:
                retirar = 200;
                consultar(retirar);
                break;
            case R.id.button4:
                retirar = 300;
                consultar(retirar);
                break;
        }
    }

    public void consultar(Integer saldo){
        Global globalVariable = (Global) getApplicationContext();

        Integer saldo_actual = globalVariable.getSaldo();

        if (saldo > saldo_actual){
            Toast.makeText(getApplicationContext(),"Insuficiente saldo para poder retirar",Toast.LENGTH_LONG).show();
        }else{
            saldo_total =  saldo_actual - saldo;
            globalVariable.setSaldo(saldo_total);
            Toast.makeText(getApplicationContext(),"Retiro sactifactorio",Toast.LENGTH_SHORT).show();

        }
    }

    public void regresar(View view) {
        finish();
    }
}

