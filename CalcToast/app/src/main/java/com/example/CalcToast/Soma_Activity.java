package com.example.CalcToast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Soma_Activity extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soma);

        ActionBar actionBar;

        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3F9742")));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        System.out.println("Cheguei no método onCreateOptionsMenu");
        MenuInflater inflater = getMenuInflater(); //instanciando um objeto MenuInflter, que é o ativador
        inflater.inflate(R.menu.menuopcoes, menu); //ativando menu por meio do metodo inflate da classe menu inflate
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.subSoma:
                System.out.println("Clicou No Main Activity");
                Intent intencao_sub = new Intent(Soma_Activity.this, Subtracao_Activity.class);
                //Instanciação do objeto Intent informando classe de origem e classe destino, nessa ordem (levando para outra "tela")
                startActivity(intencao_sub); //Iniciando uma activity do objeto intenção
                return true;
            case R.id.multSoma:
                System.out.println("Clicou na terceira Opção");
                Intent intencao_mult = new Intent(Soma_Activity.this, Multiplicacao_Activity.class);
                startActivity(intencao_mult);
                return true;
            case R.id.divSoma:
                System.out.println("Clicou na terceira Opção");
                Intent intencao_div = new Intent(Soma_Activity.this, Divisao_Activity.class);
                startActivity(intencao_div);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
    public void somar(View v){


        EditText valorAText = (EditText) this.findViewById(R.id.valorATextSoma);
        String valorA = valorAText.getText().toString();
        System.out.println("O valor de A é:" +valorA);

        EditText valorBText = (EditText) this.findViewById(R.id.valorBTextSoma);
        String valorB = valorBText.getText().toString();
        System.out.println("O valor de B é:" +valorB);

        if (valorA.equals("")) {
            Context context = getApplicationContext();
            CharSequence text = "Digite o primeiro valor para realizar a operação";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        else if (valorB.equals("")) {
            Context context = getApplicationContext();
            CharSequence text = "Digite o segundo valor para realizar a operação";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

        else {

            double primeiroValor = Double.parseDouble(valorA);
            double segundoValor = Integer.parseInt(valorB);
            double resultado = primeiroValor + segundoValor;

            TextView resultadoViewSoma = (TextView) this.findViewById(R.id.resultadoViewSoma);
            resultadoViewSoma.setText("O resultado da soma é: " + resultado);

            System.out.println("Finalizado com a soma de: " + resultado);
        }
    }
}
