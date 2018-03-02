package com.aplicacion.nombre.eva1_9_colores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Prinicipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int val=(int)(Math.random()*10)+1;
        //setTheme(R.style.BlackTheme);
        if(val<=5){
            setTheme(R.style.BlackTheme);
        }else{
            setTheme(R.style.GreenTheme);
        }
        setContentView(R.layout.activity_prinicipal);
    }
}
