package com.example.mymusicbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        // Agregar animaciones
        Animation animacion1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation animacion2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);

        TextView fromTextView = findViewById(R.id.fromTextView);
        TextView MusicBoxTextView = findViewById(R.id.musicBoxTextView);
        ImageView logoImageview = findViewById(R.id.LogoImageView);

        fromTextView.setAnimation(animacion2);
        MusicBoxTextView.setAnimation(animacion2);
        logoImageview.setAnimation(animacion1);

        fromTextView.setAnimation(animacion2);
        MusicBoxTextView.setAnimation(animacion2);
        logoImageview.setAnimation(animacion1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               Intent intent = new Intent(MainActivity.this, LoginActivity.class);
               startActivity(intent);
               finish();
            }
        }, 5000);//Cantidad de milisegudnos que tienen que pasar para pasar a la actividad de login

    }
}