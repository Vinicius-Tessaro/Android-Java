package com.example.menu_aul5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class PrimeiroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeiro);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        System.out.println("Cheguei no método onCreateOptionsMenu");
        MenuInflater inflater = getMenuInflater(); //instanciando um objeto MenuInflter, que é o ativador
        inflater.inflate(R.menu.menuopcoes1, menu); //ativando menu por meio do metodo inflate da classe menu inflate
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.main:
                System.out.println("Clicou No Main Activity");
                Intent intencao3 = new Intent(PrimeiroActivity.this, MainActivity.class);
                //Instanciação do objeto Intent informando classe de origem e classe destino, nessa ordem (levando para outra "tela")
                startActivity(intencao3); //Iniciando uma activity do objeto intenção
                return true;
            case R.id.second:
                System.out.println("Clicou na segunda Opção");
                Intent intencao4 = new Intent(PrimeiroActivity.this, SegundaActivity.class);
                startActivity(intencao4);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}