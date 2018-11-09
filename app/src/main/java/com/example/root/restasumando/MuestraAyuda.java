package com.example.root.restasumando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MuestraAyuda extends AppCompatActivity {

    TextView tr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muestra_ayuda);

        tr = (TextView) findViewById(R.id.textView1);
        String nombre = getIntent().getStringExtra("nombre");
        String apellidos = getIntent().getStringExtra("apellido");

        String minuendoValor = getIntent().getStringExtra("valor1");

        String sustraendoValor= getIntent().getStringExtra("valor2");

        String sustraendoBase1= getIntent().getStringExtra("sustraBase1");


        String SumaBase =  getIntent().getStringExtra("sumaBase");

        String NumberBase1 = getIntent().getStringExtra("numberBase1");

        String cambioSigno = getIntent().getStringExtra("cambioSigno");

        tr.setText("1-Primero convertimos el sustraendo en base -1: \n\n" + sustraendoBase1 +
                "\n\n2-Luego tienes que sumar el sustraendo obtenido con el minuendo:"+ "\n\n"+"  0"+minuendoValor+"\n"+sustraendoBase1 + "\n__________\n"+SumaBase+ "\n\n" + "3-El valor obtenido le cambiamos el signo:\n" + "\n"+NumberBase1
                + "\n\n4-Ahora tenemos nuestro resultado:" + "\n\n" + cambioSigno);
    }
}
