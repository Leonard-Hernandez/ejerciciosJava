package com.ejercicios.ejercicio6.service.contracts;

import com.ejercicios.ejercicio6.modelo.Boleta;
import com.ejercicios.ejercicio6.modelo.Persona;

public interface  IVentaBoletasService {

    public String getFactura(Persona persona, Boleta boleta, int cantidad);

    public String getEstadisticas();

}
