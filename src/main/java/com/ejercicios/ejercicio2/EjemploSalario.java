package com.ejercicios.ejercicio2;

import java.util.Arrays;
import java.util.List;

import com.ejercicios.ejercicio2.modelo.Trabajador;
import com.ejercicios.ejercicio2.service.NominaServiceImpl;

public class EjemploSalario {

    public static void main(String[] args) {
        
        NominaServiceImpl service = new NominaServiceImpl();

        Trabajador lubraska = new Trabajador("6375721", "Lubraska Ferreira", NominaServiceImpl.SMMLV*4);
        Trabajador leonard = new Trabajador("1034316504", "Leonard Hernandez", NominaServiceImpl.SMMLV);

        List<Trabajador> trabajadores = Arrays.asList(lubraska, leonard);

        System.out.println(service.getSalario(trabajadores));
        System.out.println(service.getTotales());

    }

}
