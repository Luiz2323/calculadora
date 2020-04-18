package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.app.R.id.igual;

public class Calculadora extends AppCompatActivity implements View.OnClickListener {
    private TextView display;
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,suma,resta,multi,divi,borrar,igual;
    private String cadena;
    private String cadena1;
    private String operadoreslogicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicliazar();
    }

    private void inicliazar() {
        operadoreslogicos="";
        display = findViewById(R.id.display);
        b1 = findViewById(R.id.b1);
        b1.setOnClickListener(this);
        b2 = findViewById(R.id.b2);
        b2.setOnClickListener(this);
        b3 = findViewById(R.id.b3);
        b3.setOnClickListener(this);
        b4 = findViewById(R.id.b4);
        b4.setOnClickListener(this);
        b5 = findViewById(R.id.b5);
        b5.setOnClickListener(this);
        b6 = findViewById(R.id.b6);
        b6.setOnClickListener(this);
        b7 = findViewById(R.id.b7);
        b7.setOnClickListener(this);
        b8 = findViewById(R.id.b8);
        b8.setOnClickListener(this);
        b9 = findViewById(R.id.b9);
        b9.setOnClickListener(this);
        b0 = findViewById(R.id.b0);
        b0.setOnClickListener(this);
        suma = findViewById(R.id.suma);
        suma.setOnClickListener(this);
        resta = findViewById(R.id.resta);
        resta.setOnClickListener(this);
        multi = findViewById(R.id.multi);
        multi.setOnClickListener(this);
        divi = findViewById(R.id.divi);
        divi.setOnClickListener(this);
        borrar = findViewById(R.id.borrar);
        borrar.setOnClickListener(this);
        igual = findViewById(R.id.igual);
        igual.setOnClickListener(this);

        cadena ="";
        cadena1 ="";




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b1:
                cadena = cadena + b1.getText();

                display.setText(cadena);

                break;
            case R.id.b2:
                cadena = cadena + b2.getText();
                display.setText(cadena);

                break;
            case R.id.b3:
                cadena = cadena + b3.getText();
                display.setText(cadena);
                break;
            case R.id.b4:
                cadena = cadena + b4.getText();
                display.setText(cadena);
                break;
            case R.id.b5:
                cadena = cadena + b5.getText();
                display.setText(cadena);
                break;
            case R.id.b6:
                cadena = cadena + b6.getText();
                display.setText(cadena);

                break;
            case R.id.b7:
                cadena = cadena + b7.getText();
                display.setText(cadena);
                break;
            case R.id.b8:
                cadena = cadena + b8.getText();
                display.setText(cadena);
                break;
            case R.id.b9:
                cadena = cadena + b9.getText();
                display.setText(cadena);
                break;
            case R.id.b0:
                cadena = cadena + b0.getText();
                display.setText(cadena);
                break;



            case R.id.suma:
                cadena1 = cadena;
                cadena = "";
                operadoreslogicos="suma";
                break ;

            case R.id.resta:
                cadena1 = cadena;
                cadena = "";
                operadoreslogicos="resta";
               break;
            case R.id.multi:
                cadena1 = cadena;
                cadena = "";
                operadoreslogicos="multi";
               break;
            case R.id.divi:
                cadena1 = cadena;
                cadena = "";
                operadoreslogicos="divi";
              break;
            case R.id.borrar:
                cadena = "";
                display.setText(cadena);

            break;


            case R.id.igual:
                if (operadoreslogicos == "suma") {
                    int resultado = Integer.parseInt(cadena1) + Integer.parseInt(cadena);
                    display.setText(String.valueOf(resultado));
                }
                if (operadoreslogicos =="resta") {
                    int resultado = Integer.parseInt(cadena1) - Integer.parseInt(cadena);
                    display.setText(String.valueOf(resultado));
                }

                if (operadoreslogicos =="multi") {
                    int resultado = Integer.parseInt(cadena1) * Integer.parseInt(cadena);
                    display.setText(String.valueOf(resultado));
                }

                if (operadoreslogicos =="divi") {
                    int resultado = Integer.parseInt(cadena1) / Integer.parseInt(cadena);
                    display.setText(String.valueOf(resultado));
                }
                 default:
                     break;

        }

    }
}
