package com.aplicacion.nombre.eva1_3_widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    TextView txt_hola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //Enlazando
        txt_hola=(TextView)findViewById(R.id.txt_hola);
        txt_hola.setText("Que pedo macho!");
    }
}
