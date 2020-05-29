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

public class Divisao_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisao);

        ActionBar actionBar;

        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3F9742")));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        System.out.println("Cheguei no método onCreateOptionsMenu");
        MenuInflater inflater = getMenuInflater(); //instanciando um objeto MenuInflter, que é o ativador
        inflater.inflate(R.menu.menuopcoes3, menu); //ativando menu por meio do metodo inflate da classe menu inflate
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.somaDiv:
                System.out.println("Clicou No Main Activity");
                Intent intencao3_soma = new Intent(Divisao_Activity.this, Soma_Activity.class);
                //Instanciação do objeto Intent informando classe de origem e classe destino, nessa ordem (levando para outra "tela")
                startActivity(intencao3_soma); //Iniciando uma activity do objeto intenção
                return true;
            case R.id.subDiv:
                System.out.println("Clicou na segunda Opção");
                Intent intencao3_sub = new Intent(Divisao_Activity.this, Subtracao_Activity.class);
                startActivity(intencao3_sub);
                return true;
            case R.id.multDiv:
                System.out.println("Clicou na terceira Opção");
                Intent intencao3_mult = new Intent(Divisao_Activity.this, Multiplicacao_Activity.class);
                startActivity(intencao3_mult);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    public void divisao(View v) {


        EditText valorAText = (EditText) this.findViewById(R.id.valorATextDividir);
        String valorA = valorAText.getText().toString();
        System.out.println("O valor de A é:" + valorA);

        EditText valorBText = (EditText) this.findViewById(R.id.valorBTextDividir);
        String valorB = valorBText.getText().toString();
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
            double resultado = primeiroValor / segundoValor;

            TextView resultadoViewDividir = (TextView) this.findViewById(R.id.resultadoViewDividir);
            resultadoViewDividir.setText("O resultado da divisão é: " + resultado);

            System.out.println("Finalizado com a divisão de: " + resultado);
        }
    }
}
