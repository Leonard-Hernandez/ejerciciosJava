package com.ejercicios.ejercicio5.service.contracts;

import com.ejercicios.ejercicio5.modelo.Pasaportes;
import com.ejercicios.ejercicio5.modelo.Persona;

public interface IVentaPasaportesService {

    public String getFactura(Persona persona, Pasaportes pasaporte, int cantidad);

    public String getEstadisticas();

}
