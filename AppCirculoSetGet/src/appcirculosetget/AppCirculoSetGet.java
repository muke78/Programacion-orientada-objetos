/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcirculosetget;

import java.util.Scanner;

/**
 *
 * @author Muke
 */
public class AppCirculoSetGet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo c = new Circulo();
        Scanner kb=new Scanner(System.in);
        System.out.println("Ingresa el radio: ");
        c.setRad(kb.nextDouble());
        c.calArea();
        System.out.println("El area del circulo es: " + c.getAreCir());
    }

}
