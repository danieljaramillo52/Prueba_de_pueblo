package com.example.vengaamipueblo3.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vengaamipueblo3.R;
import com.example.vengaamipueblo3.moldes.MoldeRestaurantes;

import java.util.ArrayList;

public class RestauranteAdaptador extends RecyclerView.Adapter<RestauranteAdaptador.viewHolder> {

    //ATRIBUTOS
    public ArrayList<MoldeRestaurantes> listaRestaurantes;

    //CONSTRUCTOR

    public RestauranteAdaptador(ArrayList<MoldeRestaurantes> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @Override
    public RestauranteAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.molderestaurante,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull RestauranteAdaptador.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(listaRestaurantes.get(i));

    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView nombreRestaurante;
        TextView precioRestaurante;
        ImageView fotoRestaurante;

        public viewHolder(View item){
            super(item);
            fotoRestaurante=item.findViewById(R.id.fotoitem1);
            nombreRestaurante=item.findViewById(R.id.tituloitem1);
            precioRestaurante=item.findViewById(R.id.precioitem1);
        }
        public void actualizarDatos(MoldeRestaurantes moldeRestaurantes){
            fotoRestaurante.setImageResource(moldeRestaurantes.getFoto());
            nombreRestaurante.setText(moldeRestaurantes.getNombre());
            precioRestaurante.setText(moldeRestaurantes.getPrecio());
        }
    }
}
