package com.example.vengaamipueblo3;
/* Package donde guardamos todas las clases*/


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;
/* Archivos preconfigurados , dos archivos importados directamente gracias a android. */

public class MainActivity extends AppCompatActivity {
/* Todas las clases son publicas para que las clases entre ellas se conversen.
* cada clase ya sabemos contiene atributos y métodos
* Nombre de la clase MainActivity , recordemos la herencia. AppComatActivity hereda atributos y métodos a  MainActivity */



    /*
    Aqui vamos a poner los ATRIBUTOS = VARAIBLES
    Vamos a poner usar la clase MediaPlayer, como la estamos usando automaticamrnte se importó arriba*
    vamos a crear su primer objeto cancion*/

    MediaPlayer cancion;
    /* La clase empieza con mayusculas , por normalmente las varaibles todas en minuscula
    * adentro tenemos un atributo cancion.*/
    @Override
    /*Polimorfirsmo estamos reescribiendo por el momento solo da funcionalidades adicionales.
    Todas las clases de java tienen un método que se llama onCreate */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*El onCreate instancia el activity_main que es el archivo de la parte grafica que tenemos dentro de los layouts
        * Gracias a ese método onCreate podemos conectar la parte lógica con la parte grafica.
        * Notemos:
        * R es una clase que relaciona  conoce todas las carpetas = instnaicas del proyecto, (Nótemos que R conoce todas
        * por eso podemos traer la carpeta layout , usaremos la clase R para traer cualquier carpeta. y dentro del layout está
        * el layout */

        /*La el atributo cancion es igual a la clase media player con el método crear ( Vamos a poner una instancia)
        * usamos this para refereirse así msima y decir que va a sonar aquí, y traemos el audio que está en R.raw.sonido1.mp3*/
        cancion=MediaPlayer.create(this,R.raw.sonido1);
        cancion.start();

        /*Pongamos un temporizador para controlar la duración de la cancion así la hayamos reocortado. */

        TimerTask inicioAPP = new TimerTask() {
            @Override
            public void run() {

                /*Usaremos y crearemos la clase Intentet, que son clases Java dentro de android que permiten
                * que yo dentro de una actividad pase a otra dnetro de java. Yo quiero que cuando se acabe el timertask
                * pase al Home ( en ese proyecto*/
                Intent intent = new Intent(MainActivity.this, Home.class);
                /* Por lo tanto creamos una nueva instancia de Intent , new Intent(Donde_estamos.this, para_donde_vamos)*/
                /*Ahora vamos a utilizar este objeto.*/
                startActivity(intent);
            }
        };
        /* Guardamos la clase EN iniciandoAPP por lo tanto le estamos dando un retraso de 15 segundos = 15000 milisegundos.
        * Le vamos a decir que se demore 11 segundos para lanzar la app*/
        Timer tiempo=new Timer();
        tiempo.schedule(inicioAPP,11000);
    } /* Estamos creando el constructor de la clase con new TimerTask. Además la clase TimerTask es una clase
    que llamamos clasee abstracta y nos crea un metodo run() que corre si o si.*/
}