package com.aplicacion.nombre.eva1_2_layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Principal extends AppCompatActivity {
    Button btn_dp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btn_dp=(Button)findViewById(R.id.btn_dp);
        btn_dp.setText("Dont Push");
    }
}
