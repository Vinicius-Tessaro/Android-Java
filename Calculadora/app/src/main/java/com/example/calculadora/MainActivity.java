package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void somar(View v){

        EditText nomeText = (EditText) this.findViewById(R.id.nomeText);
        String nome = nomeText.getText().toString();
        System.out.println("O nome é:" +nome);

        EditText valorAText = (EditText) this.findViewById(R.id.valorAText);
        String valorA = valorAText.getText().toString();
        System.out.println("O valor de A é:" +valorA);

        EditText valorBText = (EditText) this.findViewById(R.id.valorBText);
        String valorB = valorBText.getText().toString();
        System.out.println("O valor de B é:" +valorB);

        int primeiroValor = Integer.parseInt(valorA);
        int segundoValor = Integer.parseInt(valorB);
        int resultado = primeiroValor + segundoValor;

        TextView resultadoView = (TextView) this.findViewById(R.id.resultadoView);
        resultadoView.setText("Oi, "+nome+" o resultado da soma é: "+resultado);

        System.out.println("Finalizado com a soma de: "+resultado);

    }

    public void subtracao(View v){

        EditText nomeText = (EditText) this.findViewById(R.id.nomeText);
        String nome = nomeText.getText().toString();
        System.out.println("O nome é:" +nome);

        EditText valorAText = (EditText) this.findViewById(R.id.valorAText);
        String valorA = valorAText.getText().toString();
        System.out.println("O valor de A é" +valorA);

        EditText valorBText = (EditText) this.findViewById(R.id.valorBText);
        String valorB = valorBText.getText().toString();
        System.out.println("O valor de B é:" +valorB);

        int primeiroValor = Integer.parseInt(valorA);
        int segundoValor = Integer.parseInt(valorB);
        int resultado = primeiroValor - segundoValor;

        TextView resultadoView = (TextView) this.findViewById(R.id.resultadoView);
        resultadoView.setText("Oi, "+nome+" o resultado da subtração é: "+resultado);

        System.out.println("Finalizado com a subtração  de: "+resultado);

    }

    public void divisao(View v) {

        EditText nomeText = (EditText) this.findViewById(R.id.nomeText);
        String nome = nomeText.getText().toString();
        System.out.println("O nome é:" + nome);

        EditText valorAText = (EditText) this.findViewById(R.id.valorAText);
        String valorA = valorAText.getText().toString();
        System.out.println("O valor de A é:" + valorA);

        EditText valorBText = (EditText) this.findViewById(R.id.valorBText);
        String valorB = valorBText.getText().toString();
        System.out.println("O valor de B é:" + valorB);

        int primeiroValor = Integer.parseInt(valorA);
        int segundoValor = Integer.parseInt(valorB);
        int resultado = primeiroValor / segundoValor;

        TextView resultadoView = (TextView) this.findViewById(R.id.resultadoView);
        resultadoView.setText("Oi, "+nome+" o resultado da divisão é: "+resultado);

        System.out.println("Finalizado com a divisão de: " + resultado);
    }

    public void multiplicacao(View v) {

        EditText nomeText = (EditText) this.findViewById(R.id.nomeText);
        String nome = nomeText.getText().toString();
        System.out.println("O nome é:" + nome);

        EditText valorAText = (EditText) this.findViewById(R.id.valorAText);
        String valorA = valorAText.getText().toString();
        System.out.println("O valor de A é:" + valorA);

        EditText valorBText = (EditText) this.findViewById(R.id.valorBText);
        String valorB = valorBText.getText().toString();
        System.out.println("O valor de B é:" + valorB);

        int primeiroValor = Integer.parseInt(valorA);
        int segundoValor = Integer.parseInt(valorB);
        int resultado = primeiroValor * segundoValor;

        TextView resultadoView = (TextView) this.findViewById(R.id.resultadoView);
        resultadoView.setText("Oi, "+nome+" o resultado da multiplicação é: "+resultado);

        System.out.println("Finalizado com a multiplicação de: " + resultado);
    }
}