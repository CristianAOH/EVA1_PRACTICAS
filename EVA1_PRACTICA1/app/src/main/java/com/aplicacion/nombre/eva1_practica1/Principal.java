package com.aplicacion.nombre.eva1_practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    RadioButton rb_americano,rb_capu,rb_expres,rbgeneral;
    RadioGroup rdgp_tipo;
    EditText edtxt_cant;
    CheckBox chb_azucar,chb_crema;
    Button btn_total;
    TextView txtV_descrip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.BlackTheme);
        setContentView(R.layout.activity_principal);
        rb_americano=(RadioButton)findViewById(R.id.rb_americano);
        rb_capu=(RadioButton)findViewById(R.id.rb_capu);
        rb_expres=(RadioButton)findViewById(R.id.rb_expre);
        edtxt_cant=(EditText)findViewById(R.id.edtxt_cantidad);
        chb_azucar=(CheckBox)findViewById(R.id.chb_azucar);
        chb_crema=(CheckBox)findViewById(R.id.chb_crema);
        btn_total=(Button)findViewById(R.id.btn_total);
        txtV_descrip=(TextView)findViewById(R.id.txtV_descripcion);
        rdgp_tipo=(RadioGroup)findViewById(R.id.rdgp_tipo);
        rdgp_tipo.setOnCheckedChangeListener(this);
        //btn_total.setOnClickListener(this);
    }


    public void boton(View v){
        int cant,total=0,ctotal=0,extra=0;
        String text;
        cant=Integer.parseInt(edtxt_cant.getText().toString());
        if(edtxt_cant.getText().toString().isEmpty()){
            Toast.makeText(this,"Introduzca una cantidad valida ",Toast.LENGTH_SHORT).show();
        }else{
            if(rb_americano.isChecked()){
                if(chb_azucar.isChecked() && chb_crema.isChecked()){
                    txtV_descrip.setText("Americano con azucar y crema");
                    extra=cant*2;
                    ctotal=cant*20;
                    total=ctotal+extra;
                    Toast.makeText(this,"$"+total,Toast.LENGTH_SHORT).show();
                }else if(chb_azucar.isChecked()){
                    txtV_descrip.setText("Americano con azucar");
                    extra=cant*1;
                    ctotal=cant*20;
                    total=ctotal+extra;
                    Toast.makeText(this,"$"+total,Toast.LENGTH_SHORT).show();
                }else if(chb_crema.isChecked()){
                    txtV_descrip.setText("Americano con crema");
                    extra=cant*1;
                    ctotal=cant*20;
                    total=ctotal+extra;
                    Toast.makeText(this,"$"+total,Toast.LENGTH_SHORT).show();
                }else{
                    txtV_descrip.setText("Americano sencillo");
                    ctotal=cant*20;
                    Toast.makeText(this,"$"+ctotal,Toast.LENGTH_SHORT).show();
                }
            }else if(rb_capu.isChecked()){
                if(chb_azucar.isChecked() && chb_crema.isChecked()){
                    txtV_descrip.setText("Capuchino con azucar y crema");
                    extra=cant*2;
                    ctotal=cant*48;
                    total=ctotal+extra;
                    Toast.makeText(this,"$"+total,Toast.LENGTH_SHORT).show();
                }else if(chb_azucar.isChecked()){
                    txtV_descrip.setText("Capuchino con azucar");
                    extra=cant*1;
                    ctotal=cant*48;
                    total=ctotal+extra;
                    Toast.makeText(this,"$"+total,Toast.LENGTH_SHORT).show();
                }else if(chb_crema.isChecked()){
                    txtV_descrip.setText("Capuchino con crema");
                    extra=cant*1;
                    ctotal=cant*48;
                    total=ctotal+extra;
                    Toast.makeText(this,"$"+total,Toast.LENGTH_SHORT).show();
                }else{
                    txtV_descrip.setText("Capuchino sencillo");
                    ctotal=cant*48;
                    Toast.makeText(this,"$"+ctotal,Toast.LENGTH_SHORT).show();
                }
            }else{
                if(chb_azucar.isChecked() && chb_crema.isChecked()){
                    txtV_descrip.setText("Expresso con azucar y crema");
                    extra=cant*2;
                    ctotal=cant*30;
                    total=ctotal+extra;
                    Toast.makeText(this,"$"+total,Toast.LENGTH_SHORT).show();
                }else if(chb_azucar.isChecked()){
                    txtV_descrip.setText("Expresso con azucar");
                    extra=cant*1;
                    ctotal=cant*30;
                    total=ctotal+extra;
                    Toast.makeText(this,"$"+total,Toast.LENGTH_SHORT).show();
                }else if(chb_crema.isChecked()){
                    txtV_descrip.setText("Expresso con crema");
                    extra=cant*1;
                    ctotal=cant*30;
                    total=ctotal+extra;
                    Toast.makeText(this,"$"+total,Toast.LENGTH_SHORT).show();
                }else{
                    txtV_descrip.setText("Expresso sencillo");
                    ctotal=cant*30;
                    Toast.makeText(this,"$"+ctotal,Toast.LENGTH_SHORT).show();
                }
            }

        }
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int i) {
        switch(i){
            case R.id.rb_americano:
                txtV_descrip.setText("Americano");
                break;
            case R.id.rb_capu:
                txtV_descrip.setText("Capuchino");
                break;
            case R.id.rb_expre:
                txtV_descrip.setText("Expresso");
                break;

        }
    }

    public void ponera(View v){
        txtV_descrip.setText(txtV_descrip.getText()+", azucar");

    }

    public void ponerc(View vv){
        txtV_descrip.setText(txtV_descrip.getText()+", crema");
    }

}