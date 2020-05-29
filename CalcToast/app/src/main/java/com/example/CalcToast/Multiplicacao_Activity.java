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

public class Multiplicacao_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacao);

        ActionBar actionBar;

        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#D11717")));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        System.out.println("Cheguei no método onCreateOptionsMenu");
        MenuInflater inflater = getMenuInflater(); //instanciando um objeto MenuInflter, que é o ativador
        inflater.inflate(R.menu.menuopcoes2, menu); //ativando menu por meio do metodo inflate da classe menu inflate
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.somaMult:
                System.out.println("Clicou No Main Activity");
                Intent intencao2_soma = new Intent(Multiplicacao_Activity.this, Soma_Activity.class);
                //Instanciação do objeto Intent informando classe de origem e classe destino, nessa ordem (levando para outra "tela")
                startActivity(intencao2_soma); //Iniciando uma activity do objeto intenção
                return true;
            case R.id.subMult:
                System.out.println("Clicou na segunda Opção");
                Intent intencao2_sub = new Intent(Multiplicacao_Activity.this, Subtracao_Activity.class);
                startActivity(intencao2_sub);
                return true;
            case R.id.divMult:
                System.out.println("Clicou na terceira Opção");
                Intent intencao2_div = new Intent(Multiplicacao_Activity.this, Divisao_Activity.class);
                startActivity(intencao2_div);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
    public void multiplicacao(View v) {


        EditText valorAText = (EditText) this.findViewById(R.id.valorATextMultiplicar);
        String valorA = valorAText.getText().toString();
        System.out.println("O valor de A é:" + valorA);

        EditText valorBText = (EditText) this.findViewById(R.id.valorBTextMultiplicar);
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
            double resultado = primeiroValor * segundoValor;

            TextView resultadoViewMultiplicar = (TextView) this.findViewById(R.id.resultadoViewMultiplicar);
            resultadoViewMultiplicar.setText("Oresultado da multiplicação é: " + resultado);

            System.out.println("Finalizado com a multiplicação de: " + resultado);
        }
    }
}
