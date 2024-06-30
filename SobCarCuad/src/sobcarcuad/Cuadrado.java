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
public class Cuadrado {

    private double l;
    private double resuAre;

    public void Cuadrado() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Dame la longitud de un lado: ");
        l = kb.nextDouble();
        resuAre = Math.pow(l, 2);
        System.out.println("El resultado es: " + this.resuAre);
    }

    public double Cuadrado(double l) {
        return resuAre = Math.pow(l, 2);
    }

    public double Cuadrado(int l) {
        return resuAre = Math.pow(l, 2);
    }

    public double Cuadrado(float l) {
        return resuAre = Math.pow(l, 2);
    }
}
