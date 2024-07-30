package com.ejercicios.ejercicio6.service;

import java.util.HashMap;
import java.util.Map;

import com.ejercicios.ejercicio6.modelo.Boleta;
import com.ejercicios.ejercicio6.modelo.Funcion;
import com.ejercicios.ejercicio6.modelo.Persona;
import com.ejercicios.ejercicio6.service.contracts.IVentaBoletasService;

public class VentaBoletasServiceImpl implements IVentaBoletasService {
    Map<String, Map<Funcion, Double>> precios;
    Map<Funcion, Double> cineColombia;
    Map<Funcion, Double> royalFilms;

    public VentaBoletasServiceImpl() {
        precios = new HashMap<>();
        cineColombia = new HashMap<>();
        royalFilms = new HashMap<>();
        cineColombia.put(Funcion.Funcion35mm, 8000d);
        cineColombia.put(Funcion.Funcion3d, 9500d);

        royalFilms.put(Funcion.Funcion35mm, 6500d);
        royalFilms.put(Funcion.Funcion3d, 8500d);

        precios.put("Cine Colombia", cineColombia);
        precios.put("Royal Films", royalFilms);
    }

    @Override
    public String getFactura(Persona persona, Boleta boleta, int cantidad) {

        double precio = 0;
        double descuento = 0;
        double total = 0;

        StringBuilder sb = new StringBuilder();
        sb.append("Factura Boletas\n").append(persona + "\n");

        try {

            var prueba = precios.get(boleta.getPromotora().getNombre());
            System.out.println(prueba);
            
        } catch (Exception e) {
            System.out.println("Error");
        }

        //precio = precios.get(boleta.getPromotora().getNombre()).get(boleta.getFuncion());
        total = precio * cantidad;

        if (persona.getTargetaDescuento().getPromotora().equals(boleta.getPromotora())) {
            descuento = total * 0.10;
        }

        sb.append("Funcion: " + boleta.getPelicula() + "Funcion " + boleta.getFuncion() + "\n")
                .append("Precio unitario : " + precio + "cantidad: " + cantidad + "total: " + total + "\n");
        total -= descuento;
        sb.append("Descuento :" + descuento + "\n")
                .append("Total: " + total + "\n");

        return sb.toString();

    }

    @Override
    public String getEstadisticas() {
        return "";
    }

}
