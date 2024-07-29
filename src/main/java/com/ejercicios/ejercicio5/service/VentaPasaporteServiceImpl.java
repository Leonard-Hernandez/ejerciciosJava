package com.ejercicios.ejercicio5.service;

import com.ejercicios.ejercicio5.modelo.Pasaportes;
import com.ejercicios.ejercicio5.modelo.Persona;
import com.ejercicios.ejercicio5.service.contracts.IVentaPasaportesService;

public class VentaPasaporteServiceImpl implements IVentaPasaportesService {

    private static int contadorMasDeTresRecreativo = 0;
    private static double acumTotalVentaEconomicos = 0;
    private static double totalVenta = 0;

    @Override
    public String getFactura(Persona persona, Pasaportes pasaporte, int cantidad) {

        double totalPagar;
        StringBuilder sb = new StringBuilder();

        // hacemos la factura
        sb.append("Factura\n").append(persona)
                .append("\n");

        if (cantidad <= 0) {
            throw new RuntimeException("Cantidad a comprar erronea");
        }

        sb.append("Producto\tcantidad\ttotal\n");

        totalPagar = (cantidad < 3) ? pasaporte.getPrecio() * cantidad : pasaporte.getPrecioDesc() * cantidad;

        sb.append(pasaporte).append("\t").append(cantidad).append("\t").append(totalPagar);

        // sacamos las estadisticas
        totalVenta += totalPagar;

        if (cantidad > 3 && pasaporte.equals(Pasaportes.RECREATIVO)) {
            contadorMasDeTresRecreativo++;
        }

        if (pasaporte.equals(Pasaportes.ECONOMICO)) {
            acumTotalVentaEconomicos += totalPagar;
        }

        return sb.toString();

    }

    @Override
    public String getEstadisticas() {
        return "Total ventas = " + totalVenta + "\n" +
                "Total ventas mas de 3 pasaportes recreativos = " + contadorMasDeTresRecreativo + "\n" +
                "Total venta pasaportes economicos = " + acumTotalVentaEconomicos;

    }

}
