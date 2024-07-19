package com.ejercicios.ejercicio4.modelo;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {

    private static int index = 0;
    private int codigo;
    private String nombre;
    private String apellido;
    private List<Double> notas;

    public Estudiante() {
        notas = new ArrayList<>();
        this.codigo = ++index;
    }

    public Estudiante(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public List<Double> getNotas() {
        return notas;
    }

    public Estudiante addNota(Double nota) {
        if (notas.size() >= 4) {
            throw new RuntimeException("No se admiten mas notas");
        }
        if (nota < 0.0 || nota > 5.0) {
            throw new RuntimeException("Nota fuera de los parametros");
        }
        notas.add(nota);

        return this;
    }

    @Override
    public String toString() {
        return "codigo " + this.codigo + " " + this.nombre + " " + this.apellido;
    }

}
