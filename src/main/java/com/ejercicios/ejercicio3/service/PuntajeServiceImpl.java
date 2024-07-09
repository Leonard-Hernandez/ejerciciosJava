package com.ejercicios.ejercicio3.service;

import com.ejercicios.ejercicio3.modelo.Jugador;

public class PuntajeServiceImpl implements IPuntajeService{

    public final Integer RADIO_DIANA = 30;

    /*
     * Rango 1 Mayor o igual que cero y menor o igual que 10.  = 30
     * Rango 2 Mayor que 10 y menor o igual que 30 = 10
     * Rango 3 Mayor que 30. = . 10
     */

    @Override
    public String getPuntajes(Jugador jugador) {
        int acumuladorPuntaje = 0;
        int contadorRango1 = 0;
        int contadorRango2 = 0;
        int contadorRango3 = 0;

        for(Double radio: jugador.getRadioDisparos()){

            if (radio > RADIO_DIANA) {
                acumuladorPuntaje -= 10;
                contadorRango3++;                
            }else if (radio > 10 && radio <= 30) {
                acumuladorPuntaje += 10;
                contadorRango2++;
            } else if (radio >= 0 && radio <= 10) {
                acumuladorPuntaje+=30;
                contadorRango1++;
            }

        }

        return "Jugador: " + jugador.getNombre() + " " + jugador.getApellido() + "\n"
        + "Puntaje : " + acumuladorPuntaje + "\n" 
        + "Cantida Por Rangos \n" 
        + "Rango de 0 a 10: " + contadorRango1 + "\n" 
        + "Rango de 10 a 30: " + contadorRango2 + "\n" 
        + "Rango mayor a 30: " + contadorRango3 + "\n";


    }

}
