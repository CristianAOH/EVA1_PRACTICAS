package com.aplicacion.nombre.eva1_4_eventos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements View.OnClickListener {
    Button btn_list,btn_anon;

    Context cntContexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        cntContexto=getApplicationContext();
        btn_list=(Button)findViewById(R.id.btn_list);
        btn_anon=(Button)findViewById(R.id.btn_anon);
        //Algo de listener
        btn_list.setOnClickListener(this);
        btn_anon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(cntContexto,"Que pedo macho",Toast.LENGTH_SHORT).show();

            }
        });

    }

    public void miClick(View v){
        Toast.makeText(this,"Que pedo macho",Toast.LENGTH_SHORT).show();
    }
    public void otroClick(View vv){
        Toast.makeText(this,"Hola mundo",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this,"Hola mundo",Toast.LENGTH_SHORT).show();
    }
}
