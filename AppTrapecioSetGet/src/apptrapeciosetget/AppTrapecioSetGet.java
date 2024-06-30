/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apptrapeciosetget;

import java.util.Scanner;

/**
 *
 * @author Muke
 */
public class AppTrapecioSetGet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Trapecio t = new Trapecio();
        Scanner kb = new Scanner(System.in);
        System.out.println("Dame la BASE MAYOR, la base menor y la altura: ");
        t.setBM(kb.nextDouble());
        t.setBm(kb.nextDouble());
        t.setAlt(kb.nextDouble());
        t.CalArea();
        System.out.println("El area es: " + t.getAreaTrapecio() + " m^2");
    }

}
