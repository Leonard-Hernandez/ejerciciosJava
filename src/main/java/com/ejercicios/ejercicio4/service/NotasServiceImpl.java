package com.ejercicios.ejercicio4.service;

import java.util.List;

import com.ejercicios.ejercicio4.modelo.Estudiante;

public class NotasServiceImpl implements INotasService{

    @Override
    public String getNotas(List<Estudiante> estudiantes) {
        StringBuilder sb = new StringBuilder();


        for(Estudiante estudiante: estudiantes){
            Double nota1 = estudiante.getNotas().get(0);
            Double nota2 = estudiante.getNotas().get(1);
            Double nota3 = estudiante.getNotas().get(2);
            Double nota4 = estudiante.getNotas().get(3);

        }

        return sb.toString();
    }

}
