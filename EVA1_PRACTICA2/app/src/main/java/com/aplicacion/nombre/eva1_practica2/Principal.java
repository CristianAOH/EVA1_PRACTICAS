package com.aplicacion.nombre.eva1_practica2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    EditText edtxt_edad;
    RadioGroup rdgp_pais,rdgp_sexo;
    RadioButton rb_pdes,rb_amlat,rb_asia,rb_africa,rb_homb,rb_mujer;
    TextView txtV_expec,txtV_deceso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.BlueTheme);
        setContentView(R.layout.activity_principal);
        edtxt_edad=(EditText)findViewById(R.id.edtxt_año);
        rdgp_pais=(RadioGroup)findViewById(R.id.rdgp_paises);
        rdgp_sexo=(RadioGroup)findViewById(R.id.rdgp_sexo);
        rb_amlat=(RadioButton)findViewById(R.id.rb_amlat);
        rb_pdes=(RadioButton)findViewById(R.id.rb_rdes);
        rb_asia=(RadioButton)findViewById(R.id.rb_asia);
        rb_africa=(RadioButton)findViewById(R.id.rb_africa);
        rb_homb=(RadioButton)findViewById(R.id.rb_homb);
        rb_mujer=(RadioButton)findViewById(R.id.rb_mujer);
        txtV_expec=(TextView)findViewById(R.id.txtV_expectativa);
        txtV_deceso=(TextView)findViewById(R.id.txtV_deceso);
        rdgp_pais.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int i) {
        String año=edtxt_edad.getText().toString();
        String otra;
        int ed,america=0,desarr=0,asia=0,afric=0,dif=0,total=0;
        if(TextUtils.isEmpty(año)){
            Toast.makeText(this,"Entrada vacía",Toast.LENGTH_SHORT).show();
        }else{
            switch (i){

                //REGIONES DESARROLLADAS
                case R.id.rb_rdes:
                    ed=Integer.parseInt(edtxt_edad.getText().toString());
                    if(ed>1950 && ed<=1959){
                        desarr=75;
                        dif=5;
                        if(rb_homb.isChecked()){
                            total=desarr-dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }else{
                            total=desarr+dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }
                    }else if(ed>1960 && ed<=1969){
                        desarr=75;
                        dif=9;
                        if(rb_homb.isChecked()){
                            total=desarr-dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }else{
                            total=desarr+dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }
                    }else if(ed>1970 && ed<=1979){
                        desarr=80;
                        dif=8;
                        if(rb_homb.isChecked()){
                            total=desarr-dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }else{
                            total=desarr+dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }
                    }else if(ed>1980 && ed<=1989){
                        desarr=80;
                        dif=7;
                        if(rb_homb.isChecked()){
                            total=desarr-dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }else{
                            total=desarr+dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }
                    }else if(ed>1990 && ed<=1999){
                        desarr=85;
                        dif=6;
                        if(rb_homb.isChecked()){
                            total=desarr-dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }else{
                            total=desarr+dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }
                    }else if(ed>2000){
                        desarr=90;
                        dif=4;
                        if(rb_homb.isChecked()){
                            total=desarr-dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }else{
                            total=desarr+dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }
                    }else{
                        Toast.makeText(this,"Fuera de rango",Toast.LENGTH_SHORT).show();
                    }
                    break;

                    //AMERICA LATINA
                case R.id.rb_amlat:
                    ed=Integer.parseInt(edtxt_edad.getText().toString());
                    if(ed>1950 && ed<=1959){
                        america=60;
                        dif=10;
                        if(rb_homb.isChecked()){
                            total=america-dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }else{
                            total=america+dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }
                    }else if(ed>1960 && ed<=1969){
                        america=65;
                        dif=9;
                        if(rb_homb.isChecked()){
                            total=america-dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }else{
                            total=america+dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }
                    }else if(ed>1970 && ed<=1979){
                        america=70;
                        dif=8;
                        if(rb_homb.isChecked()){
                            total=america-dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }else{
                            total=america+dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }
                    }else if(ed>1980 && ed<=1989){
                        america=75;
                        dif=7;
                        if(rb_homb.isChecked()){
                            total=america-dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }else{
                            total=america+dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }
                    }else if(ed>1990 && ed<=1999){
                        america=75;
                        dif=6;
                        if(rb_homb.isChecked()){
                            total=america-dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }else{
                            total=america+dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }
                    }else if(ed>2000){
                        america=70;
                        dif=4;
                        if(rb_homb.isChecked()){
                            total=america-dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }else{
                            total=america+dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }
                    }else{
                        Toast.makeText(this,"Fuera de rango",Toast.LENGTH_SHORT).show();
                    }
                    break;

                    //ASIA
                case R.id.rb_asia:
                    ed=Integer.parseInt(edtxt_edad.getText().toString());
                    if(ed>1950 && ed<=1959){
                        asia=45;
                        dif=10;
                        if(rb_homb.isChecked()){
                            total=asia-dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }else{
                            total=asia+dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }
                    }else if(ed>1960 && ed<=1969){
                        asia=50;
                        dif=9;
                        if(rb_homb.isChecked()){
                            total=asia-dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }else{
                            total=asia+dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }
                    }else if(ed>1970 && ed<=1979){
                        asia=65;
                        dif=8;
                        if(rb_homb.isChecked()){
                            total=asia-dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }else{
                            total=asia+dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }
                    }else if(ed>1980 && ed<=1989){
                        asia=65;
                        dif=7;
                        if(rb_homb.isChecked()){
                            total=asia-dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }else{
                            total=asia+dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }
                    }else if(ed>1990 && ed<=1999){
                        asia=60;
                        dif=6;
                        if(rb_homb.isChecked()){
                            total=asia-dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }else{
                            total=asia+dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }
                    }else if(ed>2000){
                        asia=65;
                        dif=4;
                        if(rb_homb.isChecked()){
                            total=asia-dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }else{
                            total=asia+dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }
                    }else{
                        Toast.makeText(this,"Fuera de rango",Toast.LENGTH_SHORT).show();
                    }
                    break;

                    //AFRICA
                case R.id.rb_africa:
                    ed=Integer.parseInt(edtxt_edad.getText().toString());
                    if(ed>1950 && ed<=1959){
                        afric=35;
                        dif=10;
                        if(rb_homb.isChecked()){
                            total=afric-dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }else{
                            total=afric+dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }
                    }else if(ed>1960 && ed<=1969){
                        afric=45;
                        dif=9;
                        if(rb_homb.isChecked()){
                            total=afric-dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }else{
                            total=afric+dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }
                    }else if(ed>1970 && ed<=1979){
                        afric=55;
                        dif=8;
                        if(rb_homb.isChecked()){
                            total=afric-dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }else{
                            total=afric+dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }
                    }else if(ed>1980 && ed<=1989){
                        afric=60;
                        dif=7;
                        if(rb_homb.isChecked()){
                            total=afric-dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }else{
                            total=afric+dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }
                    }else if(ed>1990 && ed<=1999){
                        afric=55;
                        dif=6;
                        if(rb_homb.isChecked()){
                            total=afric-dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }else{
                            total=afric+dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }
                    }else if(ed>2000){
                        afric=60;
                        dif=4;
                        if(rb_homb.isChecked()){
                            total=afric-dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }else{
                            total=afric+dif;
                            otra=String.valueOf(total);
                            txtV_expec.setText(otra);
                            total=total+ed;
                            otra=String.valueOf(total);
                            txtV_deceso.setText(otra);
                        }
                    }else{
                        Toast.makeText(this,"Fuera de rango",Toast.LENGTH_SHORT).show();
                    }
                    break;
            }


        }
    }
}