package com.aplicacion.nombre.eva1_practica3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements Button.OnClickListener{
    int contador=0;
    String[] nomb=new String[20];
    String[] apellido=new String[20];
    String[] edad=new String[20];
    String[] organiza=new String[20];
    String[] sexo=new String[20];
    String[] correo=new String[20];
    EditText edtxt_nom,edtxt_apell,edtxt_edad,edtxt_org,edtxt_correo;
    RadioGroup rgp_sexo;
    RadioButton rb_hom,rb_mujer;
    Button btn_agregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.PurpleTheme);
        setContentView(R.layout.activity_principal);
        //VINCULANDO COMPONENTES
        edtxt_nom=(EditText)findViewById(R.id.edtxt_nom);
        edtxt_apell=(EditText)findViewById(R.id.edtxt_apell);
        edtxt_edad=(EditText)findViewById(R.id.edtxt_edad);
        edtxt_org=(EditText)findViewById(R.id.edtxt_org);
        edtxt_correo=(EditText)findViewById(R.id.edtxt_correo);
        rgp_sexo=(RadioGroup)findViewById(R.id.rgp_sexo);
        rb_hom=(RadioButton)findViewById(R.id.rb_hom);
        rb_mujer=(RadioButton)findViewById(R.id.rb_mujer);
        btn_agregar=(Button)findViewById(R.id.btn_agregar);
        btn_agregar.setOnClickListener(this);
        //TERMINA LA VINCULACION
    }

    public void captura(View v){
        Toast.makeText(this,"Ya no se que hacer",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        nomb[contador]=edtxt_nom.getText().toString();
        apellido[contador]=edtxt_apell.getText().toString();
        edad[contador]=edtxt_edad.getText().toString();
        if(rb_hom.isChecked()){
            sexo[contador]="Hombre";
        }else{
            sexo[contador]="Mujer";
        }
        verificar(edtxt_correo.getText().toString());
    }

    public void verificar(String email){
        for (int i=0;i<correo.length;i++){
            if (email==correo[i]){
                Toast.makeText(this,"Correo ya ingresado, ingrese uno nuevo",Toast.LENGTH_SHORT).show();
                edtxt_nom.setText(nomb[contador]);
                edtxt_apell.setText(apellido[contador]);
                edtxt_edad.setText(edad[contador]);
                edtxt_org.setText(organiza[contador]);
                edtxt_correo.setText("");
                break;
            }else if(email!=correo[i]){
                correo[contador]=email;
                Toast.makeText(this,"Cantidad de agregados= "+contador,Toast.LENGTH_SHORT).show();
                contador++;
                reinicio();
                break;
            }
        }
    }

    public void reinicio(){
        edtxt_nom.setText("");
        edtxt_apell.setText("");
        edtxt_edad.setText("");
        edtxt_org.setText("");
        rb_hom.isChecked();
        edtxt_correo.setText("");
    }
}
