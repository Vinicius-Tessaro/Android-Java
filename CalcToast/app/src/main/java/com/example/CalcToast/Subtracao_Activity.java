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

public class Subtracao_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtracao);

        ActionBar actionBar;

        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#D11717")));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        System.out.println("Cheguei no método onCreateOptionsMenu");
        MenuInflater inflater = getMenuInflater(); //instanciando um objeto MenuInflter, que é o ativador
        inflater.inflate(R.menu.menuopcoes1, menu); //ativando menu por meio do metodo inflate da classe menu inflate
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.somaSub:
                System.out.println("Clicou No Main Activity");
                Intent intencao1_soma = new Intent(Subtracao_Activity.this, Soma_Activity.class);
                //Instanciação do objeto Intent informando classe de origem e classe destino, nessa ordem (levando para outra "tela")
                startActivity(intencao1_soma); //Iniciando uma activity do objeto intenção
                return true;
            case R.id.multSub:
                System.out.println("Clicou na segunda Opção");
                Intent intencao1_mult = new Intent(Subtracao_Activity.this, Multiplicacao_Activity.class);
                startActivity(intencao1_mult);
                return true;
            case R.id.divSub:
                System.out.println("Clicou na segunda Opção");
                Intent intencao1_div = new Intent(Subtracao_Activity.this, Divisao_Activity.class);
                startActivity(intencao1_div);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void subtracao(View v) {


        EditText valorATextSubtrair = (EditText) this.findViewById(R.id.valorATextSubtrair);
        String valorA = valorATextSubtrair.getText().toString();
        System.out.println("O valor de A é" + valorA);

        EditText valorBTextSubtrair = (EditText) this.findViewById(R.id.valorBTextSubtrair);
        String valorB = valorBTextSubtrair.getText().toString();
        System.out.println("O valor de B é:" + valorB);

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
            double segundoValor = Double.parseDouble(valorB);
            double resultado = primeiroValor - segundoValor;

            TextView resultadoViewSubtrair = (TextView) this.findViewById(R.id.resultadoViewSubtrair);
            resultadoViewSubtrair.setText("O resultado da subtração é: " + resultado);

            System.out.println("Finalizado com a subtração  de: " + resultado);

        }
    }
}