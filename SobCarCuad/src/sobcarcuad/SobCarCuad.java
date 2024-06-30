/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobcarcuad;

import java.util.Scanner;

/**
 *
 * @author Muke
 */
public class SobCarCuad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Cuadrado c = new Cuadrado();
        c.Cuadrado();
        double x;
        Scanner kb = new Scanner(System.in);
        System.out.println("Damer la longitud de un lado: ");
        x = c.Cuadrado(kb.nextDouble());
        System.out.println("El resultado es: " + x);
    }

}
