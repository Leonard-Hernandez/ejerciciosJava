package com.ejercicios.ejercicio6.service;

import java.util.HashMap;
import java.util.Map;

import com.ejercicios.ejercicio6.modelo.Boleta;
import com.ejercicios.ejercicio6.modelo.Persona;
import com.ejercicios.ejercicio6.service.contracts.IVentaBoletasService;

public class VentaBoletasServiceImpl implements IVentaBoletasService {

    Map<String, Map<String, Integer>> precios = new HashMap<>();

    public VentaBoletasServiceImpl() {
        Map<String, Integer> cineColombia = new HashMap<>();
        cineColombia.put("35 mm", 8000);
        cineColombia.put("3D", 9500);

        Map<String, Integer> royalFilms = new HashMap<>();
        royalFilms.put("35 mm", 6500);
        royalFilms.put("3D", 8500);

        precios.put("Cine Colombia", cineColombia);
        precios.put("Royal Films", royalFilms);
    }

    @Override
    public String getFactura(Persona persona, Boleta boleta, int cantidad) {

        StringBuilder sb = new StringBuilder();

        return sb.toString();

    }

    @Override
    public String getEstadisticas() {
        return "";
    }

}
