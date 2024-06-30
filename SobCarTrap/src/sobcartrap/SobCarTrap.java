/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobcartrap;

import java.util.Scanner;

/**
 *
 * @author Muke
 */
public class SobCarTrap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Trapecio t = new Trapecio();
        t.Trapecio();
        double x;
        Scanner kb = new Scanner(System.in);
        System.out.println("Dame la base mayor, la base menor y la altura: ");
        x = t.Trapecio(kb.nextDouble(), kb.nextDouble(), kb.nextDouble());
        System.out.println("El area es: " + x);
    }

}
