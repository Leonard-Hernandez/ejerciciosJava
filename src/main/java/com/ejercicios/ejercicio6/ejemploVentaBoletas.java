package com.ejercicios.ejercicio6;

import com.ejercicios.ejercicio6.modelo.Boleta;
import com.ejercicios.ejercicio6.modelo.Funcion;
import com.ejercicios.ejercicio6.modelo.Persona;
import com.ejercicios.ejercicio6.modelo.Promotora;
import com.ejercicios.ejercicio6.modelo.TargetaDescuento;
import com.ejercicios.ejercicio6.service.VentaBoletasServiceImpl;
import com.ejercicios.ejercicio6.service.contracts.IVentaBoletasService;


public class ejemploVentaBoletas {

    public static void main(String[] args) {

        IVentaBoletasService service = new VentaBoletasServiceImpl();
        
        Persona lubraska = new Persona("Lubraska", "Ferreira");
        lubraska.setTargetaDescuento(new TargetaDescuento(Promotora.CineColombia));
        Boleta boletaLubraska = new Boleta("Cuando lloran las rosas", Promotora.CineColombia, Funcion.Funcion3d);

        Persona leonard = new Persona("Leonard", "Hernandez");
        leonard.setTargetaDescuento(new TargetaDescuento(Promotora.RoyalFilms));
        Boleta boletaLeonard = new Boleta("Chainsaw Man la Pelicula", Promotora.CineColombia, Funcion.Funcion35mm);

        String factura = service.getFactura(leonard, boletaLeonard, 2);
        System.out.println(factura);

        factura = service.getFactura(lubraska, boletaLubraska, 1);
        System.out.println(factura);



    }

}
