package com.example.root.restasumando;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText sustraendo, minuendo, resultados;
    TextView bienvenida;
    String minuendoValor;

    String sustraendoValor;

    String sustraendoBase1;

    String SumaBase;

    String NumberBase1;

    String cambioSigno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sustraendo = (EditText) findViewById(R.id.editTextSustraendo);
        minuendo = (EditText) findViewById(R.id.editTextMinuendo);
        resultados = (EditText) findViewById(R.id.editTextResultados);
        bienvenida = (TextView) findViewById(R.id.introduccion);

        bienvenida.setText("Las computadoras básicamente solo “saben” sumar. Para restar, se transforma la operación " +
                "en una suma, la multiplicación es una sucesión de sumas y la división es una sucesión de" +
                " restas.");





    }

    //Para mandar a llamar al menu
    @Override

    public boolean onCreateOptionsMenu (Menu menu){

        getMenuInflater().inflate(R.menu.ayuda, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_clear) {

            sustraendo.setText("");
            minuendo.setText("");
            resultados.setText("");

            return true;
        }

        if (id == R.id.action){

            Intent i = new Intent (MainActivity.this, MuestraAyuda.class);
            i.putExtra("valor1",minuendoValor );
            i.putExtra("valor2", sustraendoValor);
            i.putExtra("sustraBase1", sustraendoBase1);
            i.putExtra("sumaBase", SumaBase);
            i.putExtra("numberBase1", NumberBase1);
            i.putExtra("cambioSigno", cambioSigno);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
    public void obtenerdatos(View v) {



        minuendoValor = minuendo.getText().toString();


       sustraendoValor= sustraendo.getText().toString();

       sustraendoBase1 = NumBase(sustraendoValor);

      SumaBase = SumaNumber(minuendoValor,sustraendoBase1);

      NumberBase1= NumBase(SumaBase);

      cambioSigno= signo(NumberBase1);




        resultados.setText(cambioSigno);
        Toast.makeText(this, "Para saber el procedimento preciona ayuda", Toast.LENGTH_SHORT).show();
    }



    public String NumBase (String num1){


        int base = 9999;


        int number = Integer.parseInt(num1);

        int resta =  base - number;

        int resultado = resta + 1;

        return Integer.toString(resultado);


    }

    public  String SumaNumber (String minuen, String sustra){

        int num1 = Integer.parseInt(minuen);
        int num2 = Integer.parseInt(sustra);

        int suma = num1 + num2;

        String resulta = Integer.toString(suma);

        return resulta;


    }


    public String signo (String numbe){

        int numero = Integer.parseInt(numbe);

        int cambio = numero* (-1);

        String resultado = Integer.toString(cambio);

        return resultado;





    }
}





