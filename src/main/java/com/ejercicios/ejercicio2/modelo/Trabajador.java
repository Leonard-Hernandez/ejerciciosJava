package com.ejercicios.ejercicio2.modelo;

public class Trabajador {

    private String cedula;
    private String nombre;
    private Double salarioMensualNominal;

    public Trabajador(String cedula, String nombre, Double salarioMensualNominal) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.salarioMensualNominal = salarioMensualNominal;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalarioMensualNominal() {
        return salarioMensualNominal;
    }

    public void setSalarioMensualNominal(Double salarioMensual) {
        this.salarioMensualNominal = salarioMensual;
    }

}
