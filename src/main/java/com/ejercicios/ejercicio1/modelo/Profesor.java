package com.ejercicios.ejercicio1.modelo;

public class Profesor extends Persona {

    private Titulo titulo;
    private Double horasTrabajadas = 0.0;

    public Profesor(String nombre, String apellido, Titulo titulo) {
        super(nombre, apellido);
        this.titulo = titulo;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public Double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void addHorasTrabajadas(Double horasTrabajadas) {
        this.horasTrabajadas += horasTrabajadas;
    }

}
