package com.aplicacion.nombre.eva1_6_recursos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Principal extends AppCompatActivity implements View.OnClickListener{
    Button btn_change;
    ImageView vWImagen;
    boolean bandera=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btn_change=(Button)findViewById(R.id.btn_change);
        vWImagen=(ImageView)findViewById(R.id.vwImagen);

        btn_change.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(bandera){
            vWImagen.setImageResource(R.drawable.s);
        }else{
            vWImagen.setImageResource(R.drawable.c);
            bandera=!bandera;
        }
    }
}
