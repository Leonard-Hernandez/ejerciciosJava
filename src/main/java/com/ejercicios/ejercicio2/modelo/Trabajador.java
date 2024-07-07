package com.ejercicios.ejercicio2.modelo;

public class Trabajador {

    private int cedula;
    private int nombre;

    public Trabajador(int cedula, int nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

}
