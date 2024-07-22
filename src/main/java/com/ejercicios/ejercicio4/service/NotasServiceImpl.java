package com.ejercicios.ejercicio4.service;

import java.util.List;

import com.ejercicios.ejercicio4.modelo.Estudiante;

public class NotasServiceImpl implements INotasService {
    public final Double PONDERACION_CORTE_1 = 0.20;
    public final Double PONDERACION_CORTE_2 = 0.25;
    public final Double PONDERACION_CORTE_3 = 0.20;
    public final Double PONDERACION_CORTE_4 = 0.35;

    @Override
    public String getNotas(List<Estudiante> estudiantes, double notaObjetivo) {

        StringBuilder sb = new StringBuilder();

        for (Estudiante estudiante : estudiantes) {

            if (estudiante.getNotas().size() < 3) {
                throw new RuntimeException("Cantidad de notas no válidas (tienen que ser más o igual a 3)");
            }

            double nota1 = estudiante.getNotas().get(0);
            double nota2 = estudiante.getNotas().get(1);
            double nota3 = estudiante.getNotas().get(2);

            if (estudiante.getNotas().size() > 3) {
                double nota4 = estudiante.getNotas().get(3);

                sb.append(estudiante + "\n")
                        .append("Notas ponderadas \n")
                        .append("Nota primer corte (" + PONDERACION_CORTE_1 * 100 + "%) = "
                                + nota1 * PONDERACION_CORTE_1 + "\n")
                        .append("Nota segundo corte (" + PONDERACION_CORTE_2 * 100 + "%) = "
                                + nota2 * PONDERACION_CORTE_2 + "\n")
                        .append("Nota tercer corte (" + PONDERACION_CORTE_3 * 100 + "%) = "
                                + nota3 * PONDERACION_CORTE_3 + "\n")
                        .append("Nota cuarto corte (" + PONDERACION_CORTE_4 * 100 + "%) = "
                                + nota4 * PONDERACION_CORTE_4 + "\n")
                        .append("Definitiva = " + (nota1 * PONDERACION_CORTE_1 + nota2 * PONDERACION_CORTE_2
                                + nota3 * PONDERACION_CORTE_3 + nota4 * PONDERACION_CORTE_4) + "\n")
                        .append("\n");

            } else {
                double notasAcumuladas = (nota1 * PONDERACION_CORTE_1 + nota2 * PONDERACION_CORTE_2
                        + nota3 * PONDERACION_CORTE_3);
                double restante = (notaObjetivo - notasAcumuladas) / PONDERACION_CORTE_4;

                sb.append(estudiante + "\n")
                        .append("Nota de los tres primeros cortes ponderada: " + notasAcumuladas + "\n");

                if (restante > 5.0) {
                    sb.append("Nota de los tres primeros cortes ponderada: " + notasAcumuladas + "\n")
                            .append("La nota que necesitas para alcanzar la nota objetivo supera a la nota maxima del 4 corte");
                } else {
                    sb.append("Nota necesaria en el cuarto corte para alcanzar la nota objetivo: " + restante + "\n")
                            .append("\n");
                }

            }
        }

        return sb.toString();
    }
}
