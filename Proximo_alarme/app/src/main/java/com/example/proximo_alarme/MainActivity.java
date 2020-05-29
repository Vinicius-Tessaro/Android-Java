package com.example.proximo_alarme;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private TextView texto;
    private Button btnAlarme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar;

        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF000000")));

        Context context = getApplicationContext();
        CharSequence text = "Olá, Clique no botão 'Consultar Alarme' para consultar o próximo alarme agendado";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        obterProximoAlarme();
    }
    public void obterProximoAlarme(){
        texto = (TextView) this.findViewById(R.id.txtAlarme);
        String txt = texto.getText().toString();
        System.out.println("Valor do texto é: "+txt);
    }
    public void CliqueBotao (View v){
        System.out.println("Entrou No clique");
        String nextAlarm = "";
        try {
            AlarmManager aM = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
            AlarmManager.AlarmClockInfo aCI = aM.getNextAlarmClock();
            long timestamp = aCI.getTriggerTime();
            Date data = new Date(timestamp);
            nextAlarm = data.toString();
            }
        catch (Exception e){
            nextAlarm = "Não há alarme ativado, favor ativar";
            e.printStackTrace();
        }
        TextView txtAlarme = (TextView) this.findViewById(R.id.txtAlarme);
        txtAlarme.setText(nextAlarm);
    }
}
