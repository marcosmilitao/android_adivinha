package com.militao.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoJogar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = findViewById(R.id.botaoJogarId);
        textoResultado = findViewById(R.id.resultadoId);

        // textoResultado.setText("Texto Alterado");

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textoResultado.setText("Numero Sorteado é " + sortear());
            }
        });
    }

    private int sortear(){
        int numeroSorteado;

        Random andamico = new Random();

        numeroSorteado = andamico.nextInt(10);

        return numeroSorteado;
    }
}
