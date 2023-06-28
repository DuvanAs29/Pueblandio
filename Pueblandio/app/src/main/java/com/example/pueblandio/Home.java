package com.example.pueblandio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {


    //zona atributos
    Button botonhoteles;
    Button brestaurantes;
    Button bsitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        botonhoteles=findViewById(R.id.botonhotel);
        brestaurantes=findViewById(R.id.restaurantes);
        bsitios=findViewById(R.id.sitios);

        //detectando
        botonhoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "clip pa", Toast.LENGTH_SHORT).show();
            }
        });

    }
}