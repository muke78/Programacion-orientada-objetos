/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobcartri;

import java.util.Scanner;

/**
 *
 * @author Muke
 */
public class SobCarTri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Triangulo t = new Triangulo();
        t.triangulo();
        System.out.println("Nace un Triangulo");
        double x;
        Scanner kb = new Scanner(System.in);///sobrecarga
        System.out.println("Dame la base y altura");
        x = t.triangulo(kb.nextInt(),kb.nextDouble());
        System.out.println("El area es: " + x);
    }

}
