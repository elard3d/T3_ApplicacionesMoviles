package com.example.t3_applicacionesmoviles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.example.t3_applicacionesmoviles.adapters.PokemonAdapter;
import com.example.t3_applicacionesmoviles.entities.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class list_Pokemon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pokemon);

        List<Pokemon> pokemons = GetPokemons();

        RecyclerView rv = findViewById(R.id.rvPokemons);
        rv.setLayoutManager(new LinearLayoutManager(list_Pokemon.this));

        PokemonAdapter pokemonAdapter = new PokemonAdapter(pokemons);
        rv.setAdapter(pokemonAdapter);


    }

    private List<Pokemon> GetPokemons() {
        List<Pokemon> pokemons = new ArrayList<>();

        pokemons.add(new Pokemon("Picachu", "Electricidad", "/img/"));
        pokemons.add(new Pokemon("Squirtle", "Agua", "/img/"));
        pokemons.add(new Pokemon("Charizard", "Fuego", "/img/"));
        pokemons.add(new Pokemon("Bulbasorg", "Planta", "/img/"));

        return pokemons;
    }


}