package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.PriorityQueue;
import java.util.Timer;
import java.util.TimerTask;

public class Splash extends Activity {
    private TimerTask accion;
    private Timer tiempo;
    private Animation anin1,ani2,ani3;
    private TextView titulo,texxto;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        inicializar();
    }

    private void inicializar() {
        titulo = findViewById(R.id.titulo);
        texxto = findViewById(R.id.texto);
        img = findViewById(R.id.imgcen);
        anin1 = AnimationUtils.loadAnimation(Splash.this,R.anim.text_anin);
        ani2 = AnimationUtils.loadAnimation(Splash.this,R.anim.text_arriba);
        ani3 = AnimationUtils.loadAnimation(Splash.this,R.anim.img_ani);
        animation();
        tiempo = new Timer();
        accion = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this,Calculadora.class);
                startActivity(intent);
                finish();
            }
        };
        tiempo.schedule(accion,3000);

    }

    private void animation() {
        titulo.startAnimation(anin1);
        texxto.startAnimation(ani2);
        img.startAnimation(ani3);
    }
}
