package com.ejercicios.ejercicio6.modelo;

public class Boleta {

    private String pelicula;
    private  Promotora promotora;
    private Funcion funcion;
    
    public Boleta(String pelicula, Promotora promotora, Funcion funcion){
        this.pelicula = pelicula;
        this.promotora = promotora;
        this.funcion = funcion;
    }   

    public String getPelicula(){
        return this.pelicula;
    }

    public Promotora getPromotora(){
        return this.promotora;
    }

    public Funcion getFuncion(){
        return this.funcion;
    }

}
