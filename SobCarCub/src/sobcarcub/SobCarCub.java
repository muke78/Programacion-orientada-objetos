/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobcarcub;

import java.util.Scanner;

/**
 *
 * @author Muke
 */
public class SobCarCub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Cubo c = new Cubo();
        c.Cubo();
        double x;
        Scanner kb = new Scanner(System.in);
        System.out.println("Dame la longitud de las aristas: ");
        x = c.Cubo(kb.nextDouble());
        System.out.println("El resultado es: " + x);

    }

}
