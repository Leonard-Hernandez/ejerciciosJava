package com.ejercicios.ejercicio5.modelo;

public enum Pasaportes {

    ECONOMICO(21000d, 19500d),
    RECREATIVO(37000d, 34500);

    private final Double precio;
    private final Double precioDesc;

    Pasaportes(double precio, double precioDesc) {
        this.precio = precio;
        this.precioDesc = precioDesc;
    }

    public Double getPrecio() {
        return precio;
    }

    public Double getPrecioDesc() {
        return precioDesc;
    }

}
