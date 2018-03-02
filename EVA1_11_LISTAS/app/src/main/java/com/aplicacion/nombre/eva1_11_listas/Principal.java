package com.aplicacion.nombre.eva1_11_listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener{
    TextView txtVwMostrar;
    ListView lstVwLista;
    String [] asDatos = {"No","fun","and","too","much","work","make","a","dull","boy",
            "No","fun","and","too","much","work","make","a","dull","boy",
            "No","fun","and","too","much","work","make","a","dull","boy"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtVwMostrar=(TextView)findViewById(R.id.txtVwMostrar);
        lstVwLista =(ListView)findViewById(R.id.lstVwLista);
        //Construir Lista
        ArrayAdapter<String> aaOrigenDatos = new ArrayAdapter(this, android.R.layout.simple_list_item_1, asDatos);
        lstVwLista.setAdapter(aaOrigenDatos);
        lstVwLista.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        txtVwMostrar.setText(asDatos[i]);
    }
}
