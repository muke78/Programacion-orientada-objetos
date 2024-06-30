/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appperrolobointerface;

/**
 *
 * @author Muke
 */
public class Perro {

    private final String nom;
    private final int edad;

    public Perro(String nom, int edad) {
        this.nom = nom;
        this.edad = edad;
    }

    public String ladrar() {

        return "GUAAAAAOOOOO";
    }

    public String MoverCola() {

        return "Moviendo la cola";
    }

    public String getNom() {
        return nom;
    }

    public int getEdad() {
        return edad;
    }
}
