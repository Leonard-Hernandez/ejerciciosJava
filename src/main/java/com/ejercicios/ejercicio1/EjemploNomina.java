package com.ejercicios.ejercicio1;

import java.util.Arrays;
import java.util.List;

import com.ejercicios.ejercicio1.modelo.INominaService;
import com.ejercicios.ejercicio1.modelo.Profesor;
import com.ejercicios.ejercicio1.modelo.Titulo;
import com.ejercicios.ejercicio1.service.NominaServiceImpl;

public class EjemploNomina {

    public static void main(String[] args) {

        INominaService service = new NominaServiceImpl();
        
        Profesor leonard = new Profesor("Leonard", "Hernandez", Titulo.MAESTRIA);
        leonard.addHorasTrabajadas(40.0);
        System.out.println(leonard.getHorasTrabajadas());
        Profesor Lubraska = new Profesor("Lubraska", "Ferreira", Titulo.DOCTORADO);
        Lubraska.addHorasTrabajadas(50.0);
        System.out.println(Lubraska.getHorasTrabajadas());

        List<Profesor> profesores = Arrays.asList(leonard, Lubraska);  

        System.out.println(service.getNomina(profesores));
        System.out.println(service.getTotales());

        //primer comic desde el trabajo
        
    }

}
