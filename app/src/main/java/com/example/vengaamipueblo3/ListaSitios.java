package com.example.vengaamipueblo3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.example.vengaamipueblo3.adaptadores.SitioAdaptador;
import com.example.vengaamipueblo3.moldes.MoldeSitios;

import java.util.ArrayList;

public class ListaSitios extends AppCompatActivity {

    ArrayList<MoldeSitios> listaSitios=new ArrayList<>();
    RecyclerView recyclerSitios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listasitios);
        recyclerSitios=findViewById(R.id.listadinamicasitios);
        recyclerSitios.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));

        crearlista();
        SitioAdaptador adaptador=new SitioAdaptador(listaSitios);
        recyclerSitios.setAdapter(adaptador);
    }
    public void crearlista(){
        listaSitios.add(new MoldeSitios("250000",R.drawable.hoteles3,"Restaurante Hostal el tesoro"));
        listaSitios.add(new MoldeSitios("350000",R.drawable.hoteles3,"Restaurante Hostal el tesoro"));
        listaSitios.add(new MoldeSitios("450000",R.drawable.hoteles3,"Restaurante Hostal el tesoro"));
        listaSitios.add(new MoldeSitios("550000",R.drawable.hoteles3,"Restaurante Hostal el tesoro"));
        listaSitios.add(new MoldeSitios("650000",R.drawable.hoteles3,"Restaurante Hostal el tesoro"));

    }
}