package com.ejercicios.ejercicio1.service;

import java.util.List;

import com.ejercicios.ejercicio1.modelo.Nomina;
import com.ejercicios.ejercicio1.modelo.Profesor;
import com.ejercicios.ejercicio1.modelo.Titulo;

public class NominaService implements Nomina {

    // declarando constantes de la nomina
    private final Double IMP_ESTAMPILLA = 0.2;
    private final Double IMP_SEGURIDAD_SOCIAL = 0.38;
    private final Double SALARIO_MAESTRIA = 67000.0;
    private final Double SALARIO_DOCTORADO = 92000.0;
    // declarando las variables acumulativas
    private static Double totalHorasMaestria = 0.0;
    private static Double totalHorasDoctorado = 0.0;
    private static Double totalSeguridadSocial = 0.0;
    private static Double totalNomina = 0.0;

    @Override
    public String getNomina(List<Profesor> profesores) {
        Double seguridadSocial;
        Double estampilla;
        Double nomina;
        StringBuilder sb = new StringBuilder();

        for (Profesor profesor : profesores) {

            sb.append("Nomina del Profesor: " + profesor + "\n");

            nomina = (profesor.getTitulo() == Titulo.DOCTORADO) ? (SALARIO_DOCTORADO * profesor.getHorasTrabajadas())
                    : (SALARIO_MAESTRIA * profesor.getHorasTrabajadas());

            sb.append("Nomina antes de Impuesto: " + nomina + "\n");

            seguridadSocial = nomina * IMP_SEGURIDAD_SOCIAL;

            sb.append("Impuesto seguridad " + seguridadSocial + "\n");

            estampilla = nomina * IMP_ESTAMPILLA;

            sb.append("Impuesto estampilla" + estampilla);

            nomina = nomina - (seguridadSocial + estampilla);

            sb.append("Nomina a pagar:" + nomina);

        }

        return sb.toString();
    }

    @Override
    public String getTotales() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTotales'");
    }

}
