package com.example.menu_aul5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        System.out.println("Cheguei no método onCreateOptionsMenu");
        MenuInflater inflater = getMenuInflater(); //instanciando um objeto MenuInflter, que é o ativador
        inflater.inflate(R.menu.menuopcoes2, menu); //ativando menu por meio do metodo inflate da classe menu inflate
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.main:
                System.out.println("Clicou No Main Activity");
                Intent intencao = new Intent(SegundaActivity.this, MainActivity.class);
                //Instanciação do objeto Intent informando classe de origem e classe destino, nessa ordem (levando para outra "tela")
                startActivity(intencao); //Iniciando uma activity do objeto intenção
                return true;
            case R.id.first:
                System.out.println("Clicou na segunda Opção");
                Intent intencao2 = new Intent(SegundaActivity.this, PrimeiroActivity.class);
                startActivity(intencao2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
