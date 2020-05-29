package com.example.CalcToast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn_soma, btn_sub, btn_mult, btn_div;

    public MainActivity() {

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar;

        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#D11717")));

        Context context = getApplicationContext();
        CharSequence text = "Olá, selecione a operação desejada para começar a utilizar nosso APP";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        Button btn_soma = (Button) findViewById(R.id.btnSoma);
        Button btn_sub = (Button) findViewById((R.id.btnSub));
        Button btn_mult = (Button) findViewById(R.id.btnMult);
        Button btn_div = (Button) findViewById(R.id.btnDiv);


    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSoma:
                System.out.println("Clicou No Main Activity");
                Intent intencao_soma = new Intent(MainActivity.this, Soma_Activity.class);
                //Instanciação do objeto Intent informando classe de origem e classe destino, nessa ordem (levando para outra "tela")
                startActivity(intencao_soma); //Iniciando uma activity do objeto intenção
                break;
            case R.id.btnSub:
                System.out.println("Clicou na segunda Opção");
                Intent intencao_sub = new Intent(MainActivity.this, Subtracao_Activity.class);
                startActivity(intencao_sub);
                break;
            case R.id.btnMult:
                System.out.println("Clicou na segunda Opção");
                Intent intencao_mult = new Intent(MainActivity.this, Multiplicacao_Activity.class);
                startActivity(intencao_mult);
                break;
            case R.id.btnDiv:
                System.out.println("Clicou na segunda Opção");
                Intent intencao_div = new Intent(MainActivity.this, Divisao_Activity.class);
                startActivity(intencao_div);
                break;
        }
    }
}
