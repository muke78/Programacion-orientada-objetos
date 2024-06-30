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
public class Triangulo {

    private double bas;
    private double alt;
    private double aretri;

    public void triangulo() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Dame la base y la altura: ");
        this.bas = kb.nextDouble();
        this.alt = kb.nextDouble();
        this.aretri = bas * alt / 2;
    }

    public double triangulo(double bas, double alt) {
        return bas * alt / 2;
    }

    public double triangulo(int bas, double alt) {
        return bas * alt / 2;
    }

    public double triangulo(int bas, int alt) {
        return bas * alt / 2;
    }

    public double triangulo(double bas, int alt) {
        return bas * alt / 2;
    }
}
