package com.ejercicios.ejercicio6.modelo;

public enum Promotora {

    CineColombia("Cine Colombia"),
    RoyalFilms("Royal Film");

    private String nombre;

    Promotora(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

}
