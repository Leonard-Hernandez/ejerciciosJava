package com.ejercicios.ejercicio3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Jugador {

    private String nombre;
    private String apellido;
    private List<Double> radioDisparos;
    public final int MAX_DISPAROS = 12;
    private int indice =0 ;

    public Jugador(){
        this.radioDisparos = new ArrayList<>();
    }

    public Jugador(String nombre, String apellido){
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Jugador(String nombre, String apellido, List<Double> radioDisparos){
        this(nombre, apellido);
        this.radioDisparos = radioDisparos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Double> getRadioDisparos() {
        return radioDisparos;
    }

    public void setRadioDisparos(List<Double> radioDisparos) {
        if (radioDisparos.size() >=MAX_DISPAROS) {
            throw new RuntimeException("No puede haber mas de doce disparos");
        }
        this.radioDisparos = radioDisparos;
    }

    public void addDisparos(Double disparo){
        if (radioDisparos.size()>= MAX_DISPAROS) {
            throw new RuntimeException("No puede haber mas de doce disparos");
        }
        radioDisparos.add(disparo);
    }

    

}
