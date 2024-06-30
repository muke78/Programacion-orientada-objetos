/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcirculo;

import java.util.Scanner;

/**
 *
 * @author Muke
 */
public class Circulo {

    private String col;
    private double rad;
    private final double PI;
    private double areCir;

    public Circulo() {
        System.out.println("Nacio un circulo");
        col = " ";
        rad = areCir = 0;
        PI = 3.1416;

    }
    public void peddat(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Dame un color: ");
        col = kb.next();
        System.out.println("Dame el radio : ");
        rad = kb.nextDouble();
        
    }
    public void caldat(){
        
        this.areCir = PI*Math.pow(rad,2);
                
    }
    
    public void impArea(){
        System.out.println("El area del cirulo es: " + areCir + " y el color es: " + col);
    }

}
