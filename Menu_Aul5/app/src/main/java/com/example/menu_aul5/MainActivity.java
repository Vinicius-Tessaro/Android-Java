package com.example.menu_aul5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        System.out.println("Cheguei qui no método onCreateOptionsMenu");
        MenuInflater inflater = getMenuInflater(); //instanciando um objeto MenuInflter, que é o ativador
        inflater.inflate(R.menu.menuopcoes,menu); //ativando menu por meio do metodo inflate da classe menu inflate
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.first:
                System.out.println("Clicou primeira Opção");
                Intent intencao = new Intent(MainActivity.this, PrimeiroActivity.class);
                //Instanciação do objeto Intent informando classe de origem e classe destino, nessa ordem (levando para outra "tela")
                startActivity(intencao); //Iniciando uma activity do objeto intenção
                return true;
            case R.id.second:
                System.out.println("Clicou na segunda Opção");
                Intent intencao2 = new Intent(MainActivity.this, SegundaActivity.class);
                startActivity(intencao2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
