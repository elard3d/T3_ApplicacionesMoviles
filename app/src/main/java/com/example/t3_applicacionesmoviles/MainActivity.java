package com.example.t3_applicacionesmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnListaPokemones = findViewById(R.id.btnMiListaPokemones);
        Button btnMisPokemones = findViewById(R.id.btnMisPokemones);


        btnListaPokemones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, list_Pokemon.class);
                startActivity(intent);
            }
        });

        btnMisPokemones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MisPokemonesActivity.class);
                startActivity(intent);
            }
        });


    }
}