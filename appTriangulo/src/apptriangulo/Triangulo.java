/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apptriangulo;

import java.util.Scanner;

/**
 *
 * @author Muke
 */
public class Triangulo {

    private String col;
    private double basTri;
    private double altu;
    private double areTri;
    
     public Triangulo() {
        System.out.println("Nacio un triangulo");
        col = " ";
    }

    public void peddat() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Dame un color");
        col = kb.next();
        System.out.println("Dame la base de el triangulo: ");
        basTri = kb.nextDouble();
        System.out.println("Dame la altura de el triangulo: ");
        altu = kb.nextDouble();
    }

    public void caldat(){
        areTri = (basTri*altu)/2;
    }
    
    public void impArea(){
        System.out.println("La area de el triangulo es: " + areTri + " metros^2 \n y su color es: " + col);
    }
}
