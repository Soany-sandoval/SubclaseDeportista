/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.herencia;

/**
 *
 * @author usuario
 */


class Deportista extends Persona {
    // Atributo especÃ­fico de Deportista
    String deporte;

    // Constructor
    public Deportista(String nombre, int edad, String genero, String deporte) {
        // Llamada al constructor de la clase base (Persona)
        super(nombre, edad, genero);
        this.deporte = deporte;
    }

    // MÃ©todo especÃ­fico de Deportista
    public void entrenar() {
        System.out.println(nombre + " esta entrenando para la copa mundial de: " + deporte + ".");
    }
}