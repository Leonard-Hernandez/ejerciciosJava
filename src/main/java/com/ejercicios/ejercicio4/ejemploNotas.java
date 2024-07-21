package com.ejercicios.ejercicio4;

import java.util.Arrays;

import com.ejercicios.ejercicio4.modelo.Estudiante;
import com.ejercicios.ejercicio4.service.INotasService;
import com.ejercicios.ejercicio4.service.NotasServiceImpl;

public class ejemploNotas {

    public static void main(String[] args) {

        INotasService service = new NotasServiceImpl();

        Estudiante lubraska = new Estudiante("Lubraska", "Escalante");
        lubraska.addNota(5.0).addNota(5.0).addNota(5.0).addNota(5.0);
        Estudiante leonard = new Estudiante("Leonard", "Hernandez");
        leonard.addNota(5.0).addNota(4.0).addNota(4.0).addNota(3.4);

        System.out.println(service.getNotas(Arrays.asList(lubraska, leonard), 4.0));

    }

}
