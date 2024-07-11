package com.ejercicios.ejercicio3;

import java.util.Arrays;

import com.ejercicios.ejercicio3.modelo.Jugador;
import com.ejercicios.ejercicio3.service.IPuntajeService;
import com.ejercicios.ejercicio3.service.PuntajeServiceImpl;

public class EjemploPuntaje {

    public static void main(String[] args) {

        IPuntajeService service = new PuntajeServiceImpl();

        Jugador lubraska = new Jugador("Lubraska", "Ferreira");
        
        for (int i = 0; i < 12; i++) {
            lubraska.addDisparos(10.0);
        }

        Jugador leonard = new Jugador("Leonard", "hernandez");
        leonard.setRadioDisparos(Arrays.asList(10d,10d,10d,10d,10d,10d,31d,31d,31d,31d,31d,31d));

        Jugador jose = new Jugador("Jose", "Jose", Arrays.asList(10d,10d,10d,10d,10d,10d,31d,31d,31d,31d,31d,31d));


        System.out.println(service.getPuntajes(lubraska));
        System.out.println(service.getPuntajes(leonard));
        System.out.println(service.getPuntajes(jose));



    }

}
