package com.ejercicios.ejercicio4.service;

import java.util.List;

import com.ejercicios.ejercicio4.modelo.Estudiante;

public class NotasServiceImpl implements INotasService {
    public final Double PONDERACION_CORTE_1 = 0.20;
    public final Double PONDERACION_CORTE_2 = 0.25;
    public final Double PONDERACION_CORTE_3 = 0.20;
    public final Double PONDERACION_CORTE_4 = 0.35;

    @Override
    public String getNotas(List<Estudiante> estudiantes) {

        StringBuilder sb = new StringBuilder();

        for (Estudiante estudiante : estudiantes) {

            if (estudiante.getNotas().size() < 3) {
                throw new RuntimeException("Cantidad de notas no validas (tienen que ser mas o igual 3)");
            }

            double nota1 = estudiante.getNotas().get(0) * PONDERACION_CORTE_1;
            double nota2 = estudiante.getNotas().get(1) * PONDERACION_CORTE_2;
            double nota3 = estudiante.getNotas().get(2) * PONDERACION_CORTE_3;

            if (estudiante.getNotas().size() > 3) {

                double nota4 = estudiante.getNotas().get(3) * PONDERACION_CORTE_4;

                sb.append(estudiante + "\n")
                        .append("Notas ponderadas \n")
                        .append("Nota primer corte (" + PONDERACION_CORTE_1 * 100 + "%) = " + nota1 + "\n")
                        .append("Nota segundo corte (" + PONDERACION_CORTE_2 * 100 + "%) = " + nota2 + "\n")
                        .append("Nota tercer corte (" + PONDERACION_CORTE_3 * 100 + "%) = " + nota3 + "\n")
                        .append("Nota cuarto corte (" + PONDERACION_CORTE_4 * 100 + "%) = " + nota4 + "\n")
                        .append("Definitiva = " + (nota1 + nota2 + nota3 + nota4) / 1 + "\n")
                        .append("\n");

            }

        }

        return sb.toString();
    }

}
