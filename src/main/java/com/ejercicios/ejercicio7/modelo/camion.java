package com.ejercicios.ejercicio7.modelo;

public class Camion {

    private String nombreModelo;
    private int añoModelo;
    private int cantidadCarga;
    private boolean aireAcondicionado;
    private double valorComercial;

    public Camion(String nombreModelo, int añoModelo, int cantidadCarga, boolean aireAcondicionado,
            double valorComercial) {
        this.nombreModelo = nombreModelo;
        this.añoModelo = añoModelo;
        this.cantidadCarga = cantidadCarga;
        this.aireAcondicionado = aireAcondicionado;
        this.valorComercial = valorComercial;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public int getAñoModelo() {
        return añoModelo;
    }

    public int getCantidadCarga() {
        return cantidadCarga;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public double getValorComercial() {
        return valorComercial;
    }

}
