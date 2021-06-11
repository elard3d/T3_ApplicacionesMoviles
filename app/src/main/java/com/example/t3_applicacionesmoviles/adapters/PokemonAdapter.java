package com.example.t3_applicacionesmoviles.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.t3_applicacionesmoviles.R;
import com.example.t3_applicacionesmoviles.entities.Pokemon;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder> {

    List<Pokemon> pokemons;

    public PokemonAdapter(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    @Override
    public PokemonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_pokemon,parent,false);

        return new PokemonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PokemonAdapter.PokemonViewHolder holder, int position) {
        View view = holder.itemView;

        Pokemon pokemon = pokemons.get(position);

        TextView tvNombre = view.findViewById(R.id.tvNombre);
        TextView tvTipo = view.findViewById(R.id.tvTipo);
        Button btnCaptura = view.findViewById(R.id.btnCaptura);
        Button btnDetalle = view.findViewById(R.id.btnDetalle);

        tvNombre.setText(pokemon.nombre);
        tvTipo.setText(pokemon.tipo);

        btnCaptura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Main_APP", "Capturar Pokemon " + pokemon.nombre);
            }
        });

        btnDetalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Main_APP", "Detalle Pokemon " + pokemon.nombre);
            }
        });

    }

    @Override
    public int getItemCount() {
        return pokemons.size();
    }

    public class PokemonViewHolder extends RecyclerView.ViewHolder{

        public PokemonViewHolder(View itemView) {
            super(itemView);
        }
    }
}
