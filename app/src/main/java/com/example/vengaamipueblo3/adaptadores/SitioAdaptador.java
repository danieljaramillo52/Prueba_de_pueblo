package com.example.vengaamipueblo3.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vengaamipueblo3.R;
import com.example.vengaamipueblo3.moldes.MoldeSitios;
import java.util.ArrayList;

public class SitioAdaptador extends RecyclerView.Adapter<SitioAdaptador.viewHolder>{

    //ATRIBUTOS
    public ArrayList<MoldeSitios> listaSitios;

    //CONSTRUCTOR

    public SitioAdaptador(ArrayList<MoldeSitios> listaSitios) {
        this.listaSitios = listaSitios;
    }
    @NonNull
    @Override
    public SitioAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View vista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.moldesitios,null,false);
        return new viewHolder(vista) ;
    }
    @Override
    public void onBindViewHolder(@NonNull SitioAdaptador.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(listaSitios.get(i));
    }

    @Override
    public int getItemCount() {
        return listaSitios.size();

    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView nombreSitio;
        TextView precioSitio;
        ImageView fotodelSitio;

        public viewHolder(@NonNull View item) {
            super(item);
            fotodelSitio= item.findViewById(R.id.fotoitem2);
            nombreSitio= item.findViewById(R.id.tituloitem2);
            precioSitio = item.findViewById(R.id.precioitem2);
        }

        public void actualizarDatos(MoldeSitios moldeSitios) {
            fotodelSitio.setImageResource(moldeSitios.getFoto());
            nombreSitio.setText(moldeSitios.getNombre());
            precioSitio.setText(moldeSitios.getPrecio());
        }
    }
}

