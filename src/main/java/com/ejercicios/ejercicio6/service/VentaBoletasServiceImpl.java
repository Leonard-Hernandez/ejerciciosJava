package com.ejercicios.ejercicio6.service;

import java.util.HashMap;
import java.util.Map;

import com.ejercicios.ejercicio6.modelo.Boleta;
import com.ejercicios.ejercicio6.modelo.Funcion;
import com.ejercicios.ejercicio6.modelo.Persona;
import com.ejercicios.ejercicio6.modelo.Promotora;
import com.ejercicios.ejercicio6.service.contracts.IVentaBoletasService;

public class VentaBoletasServiceImpl implements IVentaBoletasService {
    private Map<String, Map<Funcion, Double>> precios;
    private Map<Funcion, Double> cineColombia;
    private Map<Funcion, Double> royalFilms;
    private static double facturacionCineColombia = 0;
    private static double facturacionRoyalFilms = 0;
    private int contadorFunci35mm;
    private int contadorFuncion3d;
    private Funcion funcionMasComprada;

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

        // generando el encabezado de la factura
        StringBuilder sb = new StringBuilder();
        sb.append("Factura Boletas\n").append(persona + "\n")
        .append("Promotora " + boleta.getPromotora().getNombre() + "\n");
 
        // buscando el precio por promotora y funcion
        precio = precios.get(boleta.getPromotora().getNombre()).get(boleta.getFuncion());
        total = precio * cantidad;

        // definiendo el descuento
        if (persona.getTargetaDescuento() != null) {
            if (persona.getTargetaDescuento().getPromotora().equals(boleta.getPromotora())) {
                descuento = total * 0.10;
            }
        }

        // generando el resto de la factura
        sb.append("Funcion: " + boleta.getPelicula() + " Funcion " + boleta.getFuncion().getNombre() + "\n")
                .append("Precio unitario : " + precio + " cantidad: " + cantidad + " total: " + total + "\n");
        total -= descuento;
        sb.append("Descuento :" + descuento + "\n")
                .append("Total: " + total + "\n");

        // sacando estadisticas

        if (boleta.getPromotora().equals(Promotora.CineColombia)) {
            facturacionCineColombia += total;
        } else {
            facturacionRoyalFilms += total;
        }

        if (boleta.getFuncion().equals(Funcion.Funcion35mm)) {
            contadorFunci35mm += cantidad;            
        }else{
            contadorFuncion3d += cantidad;
        }

        if (contadorFunci35mm>contadorFuncion3d) {
            funcionMasComprada = Funcion.Funcion35mm;            
        }else{
            funcionMasComprada = Funcion.Funcion3d;
        }


        return sb.toString();

    }

    @Override
    public String getEstadisticas() {
        return "Facturacion Cine Colombia: " + facturacionCineColombia + "\n"+
        "Factura Royal Films: " + facturacionRoyalFilms + "\n" +
        "Funcion mas comprada: " + funcionMasComprada.getNombre(); 

    }

}
