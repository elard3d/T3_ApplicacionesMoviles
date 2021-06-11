package com.example.t3_applicacionesmoviles.services;

import com.example.t3_applicacionesmoviles.entities.Pokemon;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.Call;

public interface PokemonService {

    @GET("pokemons/701212")
    Call<List<Pokemon>> getAll();

}
