package com.ejercicios.ejercicio2.service;

import java.util.List;

import com.ejercicios.ejercicio2.modelo.Trabajador;

public interface INominaService {

    public String getSalario(List<Trabajador> trabajadores);
    public String getTotales();


}
