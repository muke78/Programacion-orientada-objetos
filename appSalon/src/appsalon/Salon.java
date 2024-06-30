/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appsalon;

import java.util.Scanner;

/**
 *
 * @author Muke
 */
public class Salon {

    private int aluTot;
    private int aluBoy;
    private int aluGirl;
    private double resPor;
    private double resPor2;
    private double resPor3;

    public Salon() {
        System.out.println("Ha nacido un salon");

    }

    public void peddat() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Cuantos hombres hay?: ");
        aluBoy = kb.nextInt();
        System.out.println("Cuantas mujeres hay?: ");
        aluGirl = kb.nextInt();
    }

    public void caldat() {
        resPor = aluBoy + aluGirl;
        resPor2 = (aluBoy * 100) / resPor;
        resPor3 = (aluGirl * 100) / resPor;
    }

    public void impdat() {

        System.out.println("El porcentaje de hombres en el salon es de: " + resPor2 + "%\n "
                + "El porcentaje de mujeres en el salon es de: " + resPor3 + "%");
    }

}
