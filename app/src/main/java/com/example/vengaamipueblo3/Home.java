package com.example.vengaamipueblo3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Locale;

public class Home extends AppCompatActivity {
    // Espacio entre la clase y el método onCreate
    // Aquí declararemos todos los atributos = Varialbes que controlan los elementos que pintamos en el xml
    // Lo que tenemos en el xml hay que declararlo aquí para poder utilizarlo ( como declarar una variable )

    // En la interfaz grafica hay un boton , que es una clase porque empieza en mayuscula, esta asignada a la variable
    //botonhotels
    // Necesiramos usar los tres botones que habiamos creado en el xml del home
    Button botonhoteles;
    Button botonrestaurantes;
    Button botonSitiosTuristicos;
    Button botonmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Vamos a programar el abrir cada zona cuando la persna utilice los botones.
        // Recordar que tenemos el onCreate , que es lo que pasará una vez la aplicación se lance.

        // Aqui vamos primer a enlazar los atributos con los id de los botones con: findViewByid. Vamos a invocar id
        // Recordemos que las cosas todas estan dentro de R  , así los id estan en R.id.nombre_id así:
        // Estamos asociando cada atributo a el id respecto en el xml.
        botonhoteles=findViewById(R.id.botonhoteles);
        botonrestaurantes=findViewById(R.id.botonrestaurantes);
        botonSitiosTuristicos=findViewById(R.id.botonturismo);
        botonmenu=findViewById(R.id.botonmenu);

        //Ahora vamos a escuchar los eventos del boton ( los clicks ) con el uso del método setOnClickListener
        // Y creamos una nueva instancia del método new View.On se autocompleta y por defecto. nos trae:

        /*(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/
        // Dento de esta estructura, vamos a poner  lo que queremos hacer con el boton cuando le den click
        botonhoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Vamos a escribir Toast solo y se autocompleta.
                // Sirve para que al presionar el boton en este caso hoteles, aparecezca la notificacion de android.
                Toast.makeText(Home.this, "Estamos haciendo click en hoteles", Toast.LENGTH_SHORT).show();

                // Utilicemos la clase intent, recordemos que nos lleva de una vista a otra.
                // Estamos abriendo una nueva actividad desde el home. ¿Cuando? , cuando le hacemos click al boton
                //Lanzamos la nueva actividad
                Intent intent= new Intent(Home.this, Hoteles.class);
                startActivity(intent);
                //Recordemos el intent es Intent(donde_estoy.thid, para_donde_voy.class)
                // starActivity para iniciar la actividad
            }
        });

        botonrestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "Estamos haciendo click en restaurantes", Toast.LENGTH_SHORT).show();
                Intent intent2=new Intent(Home.this, Restaurantes.class);
                startActivity(intent2);
            }
        });

        botonSitiosTuristicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "Estamos haciendo click en Sitios turisticos ", Toast.LENGTH_SHORT).show();
                Intent intent3=new Intent(Home.this, Sitios.class);
                startActivity(intent3);
            }
        });

        botonmenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(Home.this, "Estamos haciendo click sobre el boton menu", Toast.LENGTH_SHORT).show();
                Intent intent4=new Intent(Home.this, Menu.class);
                startActivity(intent4);
            }
        });
    }

    //Cargamos el menu de opciones.
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    //Funcion para cargar el funcionamiento del menu.
    public boolean onOptionsItemSelected(MenuItem item) {
        //observar el comportamiento del usuario frente al menu
        int itemSeleccionado = item.getItemId();

        /*switch (itemSeleccionado) {
            case (R.id.opcion1):
                this.// Sin paréntesis
                Intent intentSpanish = new Intent(Home.this, Home.class);
                startActivity(intentSpanish);
                Toast.makeText(this, "accionaste Español", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.opcion2): // Sin paréntesis
                Toast.makeText(this, "accionaste ingles", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.opcion3): // Sin paréntesis
                Toast.makeText(this, "accionaste esperanto", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.opcion4): // Sin paréntesis
                Toast.makeText(this, "accionaste el acerca", Toast.LENGTH_SHORT).show();
                break;
        }*/
        if (itemSeleccionado == R.id.opcion1) {
            this.lenguageChange("es");
            Intent intentSpanish = new Intent(Home.this, Home.class);
            startActivity(intentSpanish);
        } else if (itemSeleccionado == R.id.opcion2) {
            this.lenguageChange("en");
            Intent intentEnglish = new Intent(Home.this, Home.class);
            startActivity(intentEnglish);
        } else if (itemSeleccionado == R.id.opcion3) {
            this.lenguageChange("eo");
            Intent intentEsperanto = new Intent(Home.this, Home.class);
            startActivity(intentEsperanto);
        } /*else if (itemSeleccionado == R.id.opcion4) {
            Intent aboutUs = new Intent(Home.this, AcercaDe.class);
            startActivity(aboutUs);
            Toast.makeText(this, "Accionaste acerca de:", Toast.LENGTH_SHORT).show();
        }*/
        return super.onOptionsItemSelected(item);
    }
    public void lenguageChange(String idioma) {
        Locale lenguaje=new Locale(idioma);
        Locale.setDefault(lenguaje);

        Configuration configurationTelefono=getResources().getConfiguration();
        configurationTelefono.locale=lenguaje;

        getBaseContext().getResources().updateConfiguration(configurationTelefono,getBaseContext().getResources().getDisplayMetrics());
    }
    }
