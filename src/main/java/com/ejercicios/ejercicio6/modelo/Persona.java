package com.ejercicios.ejercicio6.modelo;

public class Persona {

    private String nombre;
    private String apellido;
    private TargetaDescuento targetaDescuento;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
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

    public TargetaDescuento getTargetaDescuento(){
        return this.targetaDescuento;
    }

    public void setTargetaDescuento(TargetaDescuento targetaDescuento){
        this.targetaDescuento = targetaDescuento;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }

}
