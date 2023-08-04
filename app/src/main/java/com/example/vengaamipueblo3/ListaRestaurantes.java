package com.example.vengaamipueblo3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vengaamipueblo3.adaptadores.RestauranteAdaptador;
import com.example.vengaamipueblo3.moldes.MoldeRestaurantes;
import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {

    ArrayList<MoldeRestaurantes> listaRestaurantes = new ArrayList<>();
    RecyclerView recyclerRestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);
        recyclerRestaurantes = findViewById(R.id.listadinamicarestaurantes);
        recyclerRestaurantes.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        crearlista();
        RestauranteAdaptador adaptador = new RestauranteAdaptador(listaRestaurantes);
        recyclerRestaurantes.setAdapter(adaptador);
    }

    public void crearlista() {
        listaRestaurantes.add(new MoldeRestaurantes("250000", "Restaurante divino tesoro", R.drawable.hoteles3, "Somos el mejor restaurante de sonson platos típicos, de toda colombia a los que tenemos acceso gracias a nuestros pisos termicos"));
        listaRestaurantes.add(new MoldeRestaurantes("350000", "Restaurante nueva esperanza", R.drawable.hotel4, "Restaurante Sabores del Pueblo:\n" +
                "Disfruta de la auténtica cocina local en un ambiente acogedor. Nuestros platos tradicionales resaltan los sabores únicos de la región, utilizando ingredientes frescos de agricultores locales. Una experiencia culinaria que te conectará con la esencia de Sonson."));
        listaRestaurantes.add(new MoldeRestaurantes("450000", "Restaurante el oiste", R.drawable.hotel1, "Eleva tus sentidos en La Terraza, donde la gastronomía se fusiona con vistas panorámicas. Saborea exquisitos platos gourmet preparados por chefs apasionados. Nuestra terraza al aire libre es perfecta para cenas románticas y ocasiones especiales"));
        listaRestaurantes.add(new MoldeRestaurantes("550000", "Restaurante el sabor sonsoneño", R.drawable.hotel2, "Sumérgete en un oasis culinario de sabores mediterráneos en el corazón de Sonson. En el Bistró Verde Oliva, cada bocado es una aventura de aromas y texturas. Nuestra selección de aceites de oliva y hierbas frescas realza cada platillo, brindándote una experiencia única."));
        listaRestaurantes.add(new MoldeRestaurantes("650000", "Restaurante dios sabe lo que hace", R.drawable.hotel4, "Un rincón bohemio donde el arte y la comida se entrelazan. Nuestro café es el lugar perfecto para relajarte con una taza de café artesanal y deleitarte con deliciosos platillos creativos. Sumérgete en un ambiente artístico mientras saboreas lo mejor de la gastronomía local."));

    }
}