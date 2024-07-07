package com.ejercicios.ejercicio2.service;

import java.util.List;

import com.ejercicios.ejercicio2.modelo.Trabajador;

public class NominaServiceImpl implements INominaService {

    // declarando constantes
    public static final Double SMMLV = 689454d;
    public static final Double AUX_TRANSPORTE = 75000d;
    public static final Double IMP_PRESTACIONES = 0.09;
    public static final Double IMP_SOLIDARIADAD = 0.01;
    // declarando acumuladores
    private Double totalPagadoNomina = 0d;
    private Double totalPagadoSolidaridad = 0d;

    @Override
    public String getSalario(List<Trabajador> trabajadores) {
        Double salarioRecibir = 0d;
        Double descontadoSeguridad = 0d;
        Double descontadoSolidaridad = 0d;
        Double auxTranporte = 0d;

        StringBuilder sb = new StringBuilder();

        for (Trabajador trabajador : trabajadores) {
            // refresh variables
            auxTranporte = 0d;
            descontadoSolidaridad = 0d;

            salarioRecibir = trabajador.getSalarioMensualNominal();
            descontadoSeguridad = salarioRecibir * IMP_PRESTACIONES;

            if (salarioRecibir <= (SMMLV * 2)) {
                auxTranporte = AUX_TRANSPORTE;

            } else if (salarioRecibir >= (SMMLV * 4)) {
                descontadoSolidaridad = salarioRecibir * IMP_SOLIDARIADAD;
                totalPagadoSolidaridad += descontadoSolidaridad;
            }

            salarioRecibir -= descontadoSeguridad;
            salarioRecibir -= descontadoSolidaridad;
            salarioRecibir += auxTranporte;
            totalPagadoNomina += salarioRecibir;

            sb.append("Celuda: " + trabajador.getCedula() + " Nombre: " + trabajador.getNombre() + "\n")
                    .append("Salario Mensual Nominal: " + trabajador.getSalarioMensualNominal() + "\n")
                    .append("Salario a recibir: " + salarioRecibir + "\n");

        }

        return sb.toString();

    }

    @Override
    public String getTotales() {
        return "Total pagado Nomina: " + totalPagadoNomina + "\n" +
                "Total Pagado Solidaridad: " + totalPagadoSolidaridad + "\n";
    }

}
