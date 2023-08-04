package com.example.vengaamipueblo3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.example.vengaamipueblo3.adaptadores.HotelAdaptador;
import com.example.vengaamipueblo3.moldes.MoldeHotel;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList<MoldeHotel> listaHoteles=new ArrayList<>();
    RecyclerView recyclerHoteles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listahoteles);
        recyclerHoteles=findViewById(R.id.listadinamicahoteles);
        recyclerHoteles.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));

        crearlista();
        HotelAdaptador adaptador=new HotelAdaptador(listaHoteles);
        recyclerHoteles.setAdapter(adaptador);
    }
    public void crearlista(){
        listaHoteles.add(new MoldeHotel("250000",R.drawable.hoteles3,"Hotel1"));
        listaHoteles.add(new MoldeHotel("350000",R.drawable.hotel4,"Hotel1"));
        listaHoteles.add(new MoldeHotel("450000",R.drawable.hotel4,"Hotel3"));
        listaHoteles.add(new MoldeHotel("550000",R.drawable.hotel4,"Hotel4"));
        listaHoteles.add(new MoldeHotel("650000",R.drawable.hotel4,"Hotel5"));

    }
}

/* package com.example.vengaamipueblo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.vengaamipueblo2.adaptadores.HotelAdaptador;
import com.example.vengaamipueblo2.moldes.MoldeHotel;

import java.util.ArrayList;

public class listahoteles extends AppCompatActivity
{
    ArrayList<MoldeHotel>listaHoteles=new ArrayList<>();
    RecyclerView recyclerHoteles;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listahoteles);
        recyclerHoteles=findViewById(R.id.listadinamicahoteles);
        recyclerHoteles.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista();
        HotelAdaptador adaptador=new HotelAdaptador(listaHoteles);
        recyclerHoteles.setAdapter(adaptador);

    }
    public void crearLista()
    {
        listaHoteles.add(new MoldeHotel("Hotel1","250.000", R.drawable.hotel));
        listaHoteles.add(new MoldeHotel("Hotel2","260.000", R.drawable.hotel2));
        listaHoteles.add(new MoldeHotel("Hotel3","270.000", R.drawable.hotel3));
        listaHoteles.add(new MoldeHotel("Hotel4","280.000", R.drawable.hotel4));
        listaHoteles.add(new MoldeHotel("Hotel5","290.000", R.drawable.hotel5));
    }
}*/