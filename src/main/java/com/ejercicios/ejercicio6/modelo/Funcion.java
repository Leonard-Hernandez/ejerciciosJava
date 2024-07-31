package com.ejercicios.ejercicio6.modelo;

public enum Funcion {

    Funcion3d("Funcion 3d"),
    Funcion35mm("Funcion 35mm");

    private String nombre;

    Funcion(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

}
