 package com.example.cajero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
     private EditText pin;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         pin = (EditText) findViewById(R.id.clave);
     }

     public void ingresar(View view) {
         if (pin.getText().toString().equals("1234")) {
             Intent i = new Intent(this, opciones.class);
             i.putExtra("saldo", "2000");
             startActivity(i);
         } else {
             Toast.makeText(getApplicationContext(), "Ingresar usuario valido", Toast.LENGTH_SHORT).show();
         }
     }
 }
