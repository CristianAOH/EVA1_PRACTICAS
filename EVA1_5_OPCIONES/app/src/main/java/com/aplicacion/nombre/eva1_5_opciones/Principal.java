package com.aplicacion.nombre.eva1_5_opciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    RadioGroup rdgp_comida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        rdgp_comida=(RadioGroup)findViewById(R.id.rdgp_comida);
        rdgp_comida.setOnCheckedChangeListener(this);
    }

    @Override  //Radiogrup que genera el evento
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        String nombre;
        RadioButton rdBtnSel;
        rdBtnSel=(RadioButton)findViewById(i);
        nombre=(String)rdBtnSel.getText();
       // Toast.makeText(this,rdBtnSel.getText(),Toast.LENGTH_LONG).show();
        double precio=0;
        switch(i){
            case R.id.rbtn_tacos:
                precio=100;
                break;
            case R.id.rbtn_pizza:
                precio=150;
                break;
            case R.id.rbtn_burritos:
                precio=20;
                break;
            case R.id.rbtn_cas:
                precio=180;
                break;
            case R.id.rbtn_alitas:
                precio=130;
                break;
        }
        Toast.makeText(this,"El precio es= "+precio+" de la "+nombre,Toast.LENGTH_SHORT).show();
    }
}
