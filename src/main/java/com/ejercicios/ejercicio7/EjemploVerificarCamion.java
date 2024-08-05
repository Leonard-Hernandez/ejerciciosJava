package com.ejercicios.ejercicio7;

import java.util.List;

import com.ejercicios.ejercicio7.modelo.Camion;
import com.ejercicios.ejercicio7.service.VerificarCamionImpl;
import com.ejercicios.ejercicio7.service.contracts.IVerificarCamion;

public class EjemploVerificarCamion {

    public static void main(String[] args) {
        
        IVerificarCamion service = new VerificarCamionImpl();

        Camion camion1 = new Camion("Ford", 2010, 8, true, 1000.0);
        Camion camion2 = new Camion("Chevrolet", 2015, 10, true, 1500.0);
        Camion camion3 = new Camion("Fiat", 2000, 6, false, 500.0);
        Camion camion4 = new Camion("Renault", 2020, 12, true, 2000.0);
        Camion camion5 = new Camion("Volkswagen", 2018, 7, true, 1800.0);
        Camion camion6 = new Camion("Toyota", 2013, 9, false, 1200.0);

        System.out.println(service.verificar(List.of(camion1, camion2, camion3, camion4, camion5, camion6)));

    }

}
