package com.ejercicios.ejercicio1.modelo;

public class Profesor extends Persona {

    private Titulo titulo;
    private Double horasTrabajadas;

    public Profesor(String nombre, String apellido, Titulo titulo, Double horasTrabajadas) {
        super(nombre, apellido);
        this.titulo = titulo;
        this.horasTrabajadas = horasTrabajadas;

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

    public void setHorasTrabajadas(Double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

}
