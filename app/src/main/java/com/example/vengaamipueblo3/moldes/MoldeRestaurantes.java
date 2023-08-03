package com.example.vengaamipueblo3.moldes;

public class MoldeRestaurantes {

    private String precio;

    private String nombre;

    private int foto;

    public MoldeRestaurantes() {
    }

    public MoldeRestaurantes(String precio, String nombre, int foto) {
        this.precio = precio;
        this.nombre = nombre;
        this.foto = foto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
