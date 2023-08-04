package com.example.vengaamipueblo3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vengaamipueblo3.adaptadores.RestauranteAdaptador;
import com.example.vengaamipueblo3.moldes.MoldeRestaurantes;

import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {

    ArrayList<MoldeRestaurantes> listaRestaurantes=new ArrayList<>();
    RecyclerView recyclerRestaurantes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);
        recyclerRestaurantes=findViewById(R.id.listadinamicarestaurantes);
        recyclerRestaurantes.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL, false));

        crearLista();
        RestauranteAdaptador adaptador=new RestauranteAdaptador(listaRestaurantes);
        recyclerRestaurantes.setAdapter(adaptador);

    }

    public void crearLista(){
        listaRestaurantes.add(new MoldeRestaurantes("25000","Restaurante1",R.id.fotoitem1));
        listaRestaurantes.add(new MoldeRestaurantes("25000","Restaurante1",R.id.fotoitem1));
        listaRestaurantes.add(new MoldeRestaurantes("25000","Restaurante1",R.id.fotoitem1));
        listaRestaurantes.add(new MoldeRestaurantes("25000","Restaurante1",R.id.fotoitem1));
        listaRestaurantes.add(new MoldeRestaurantes("25000","Restaurante1",R.id.fotoitem1));
    }
}