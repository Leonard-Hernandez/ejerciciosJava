package com.ejercicios.ejercicio1.service;

import java.util.List;

import com.ejercicios.ejercicio1.modelo.Nomina;
import com.ejercicios.ejercicio1.modelo.Profesor;
import com.ejercicios.ejercicio1.modelo.Titulo;

public class NominaService implements Nomina {

    // declarando constantes de la nomina
    private final Double IMP_ESTAMPILLA = 0.02;
    private final Double IMP_SEGURIDAD_SOCIAL = 0.038;
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

            sb.append("\nNomina del Profesor: " + profesor + "\n");

            System.out.println(profesor.getTitulo() == Titulo.MAESTRIA);

            if (profesor.getTitulo() == Titulo.MAESTRIA) {
                nomina = SALARIO_MAESTRIA*profesor.getHorasTrabajadas();
                totalHorasMaestria += profesor.getHorasTrabajadas();
            }else if(profesor.getTitulo() == Titulo.DOCTORADO) {
                nomina = SALARIO_DOCTORADO*profesor.getHorasTrabajadas();
                totalHorasDoctorado += profesor.getHorasTrabajadas();
            }else{
                throw new RuntimeException("Profesor no valido");
            }

            sb.append("Nomina antes de Impuesto: " + nomina + "\n");

            seguridadSocial = nomina * IMP_SEGURIDAD_SOCIAL;
            totalSeguridadSocial += seguridadSocial;

            sb.append("Impuesto seguridad " + seguridadSocial + "\n");

            estampilla = nomina * IMP_ESTAMPILLA;

            sb.append("Impuesto estampilla " + estampilla+ "\n");

            nomina = nomina - (seguridadSocial + estampilla);
            totalNomina+=nomina;

            sb.append("Nomina a despues de impuestos:" + nomina+ "\n");

        }

        return sb.toString();
    }

    @Override
    public String getTotales() {
        return "Total Horas trabajadas Maestria "+ totalHorasMaestria + "\n" +
        "Total Horas Trabajadas Doctorado " + totalHorasDoctorado + "\n" +
        "Total dinero pagado a Seguridad Social "+ totalSeguridadSocial + "\n" +
        "Total pagado por nomina " + totalNomina;
    }

}
