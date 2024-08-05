package com.ejercicios.ejercicio7.service;

import java.util.List;

import com.ejercicios.ejercicio7.modelo.Camion;
import com.ejercicios.ejercicio7.service.contracts.IVerificarCamion;

public class VerificarCamionImpl implements IVerificarCamion {

    private static int camionesAprovados = 0;
    private static int camionesDescartados = 0;
    private static double totalValorCamionesAprovados = 0;

    @Override
    public String verificar(List<Camion> camiones) {

        for (Camion camion : camiones) {

            if (camion.getAñoModelo() < 2000 || camion.getCantidadCarga() > 10) {
                camionesDescartados++;
                continue;
            }

            boolean capacidadCarga = (camion.getCantidadCarga() >= 6 || camion.getCantidadCarga() <= 8);
            boolean modeloCamion = (camion.getAñoModelo() >= 2010);
            boolean aireAcondicionado = camion.isAireAcondicionado();

            if (capacidadCarga && modeloCamion && aireAcondicionado) {
                camionesAprovados++;
                totalValorCamionesAprovados += camion.getValorComercial();
            } else {
                camionesDescartados++;
            }

        }

        return "Numero camiones aprovados: " + camionesAprovados + "\n" +
                "Numero camiones descartados: " + camionesDescartados + "\n" +
                "Total Valor comercial camiones aprovados: " + totalValorCamionesAprovados + "\n";

    }

}
