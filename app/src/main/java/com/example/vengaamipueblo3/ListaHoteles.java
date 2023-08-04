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
        listaHoteles.add(new MoldeHotel("250000",R.drawable.hoteles3,"Hotel el comodo"));
        listaHoteles.add(new MoldeHotel("350000",R.drawable.hotel4,"Hotel nueva vida"));
        listaHoteles.add(new MoldeHotel("450000",R.drawable.hotel1,"Hotel el tesoro de Sonson"));
        listaHoteles.add(new MoldeHotel("550000",R.drawable.hotel4,"Hotel el hotelsito mañanero"));
        listaHoteles.add(new MoldeHotel("650000",R.drawable.hotel4,"Hotel somos el mejor hotel"));

    }
}

