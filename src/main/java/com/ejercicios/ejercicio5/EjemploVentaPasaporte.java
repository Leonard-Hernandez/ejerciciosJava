package com.ejercicios.ejercicio5;

import com.ejercicios.ejercicio5.modelo.Pasaportes;
import com.ejercicios.ejercicio5.modelo.Persona;
import com.ejercicios.ejercicio5.service.VentaPasaporteServiceImpl;
import com.ejercicios.ejercicio5.service.contracts.IVentaPasaportesService;

public class EjemploVentaPasaporte {

    public static void main(String[] args) {
        
        IVentaPasaportesService service = new VentaPasaporteServiceImpl();

        Persona leonard = new Persona("Leonard", "Hernandez");
        Persona lubraska = new Persona("Lubraska", "Ferreira");

        String factura = service.getFactura(leonard, Pasaportes.ECONOMICO, 3);
        System.out.println(factura);
        factura = service.getFactura(lubraska, Pasaportes.RECREATIVO, 4);
        System.out.println(factura);

        System.out.println(service.getEstadisticas());


    }

}
