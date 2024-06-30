/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apptrapecio;

import java.util.Scanner;

/**
 *
 * @author Muke
 */
public class Trapecio {

    private String col;
    private double basMay;
    private double basMen;
    private double altu;
    private double areTra;

    public Trapecio() {
        System.out.println("Nacio un trapecio");
        col = " ";

    }

    public void peddat() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Dame un color: ");
        col = kb.next();
        System.out.println("Dame la Base Mayor del Trapecio: ");
        basMay = kb.nextDouble();
        System.out.println("Dame la Base Menor del Trapecio: ");
        basMen = kb.nextDouble();
        System.out.println("Dame la altura del trapecio: ");
        altu = kb.nextDouble();

    }

    public void caldat() {
        this.areTra = (basMay + basMen) * altu / 2;
    }

    public void impArea() {
        System.out.println("El area de el trapecio es: " + areTra + " metros^2 \n y el colo es: " + col);
    }

}
