package com.ejercicios.ejercicio5.service;

import com.ejercicios.ejercicio5.modelo.Pasaportes;
import com.ejercicios.ejercicio5.modelo.Persona;

public interface IVentaPasaportesService {

    public double getPrecio(Persona persona ,Pasaportes pasaporte, int Cantidad);

}
