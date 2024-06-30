/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcirculosetget;

/**
 *
 * @author Muke
 */
public class Circulo {

    private double rad;
    private final double PI;
    private double areCir;

    public Circulo() {
        rad = areCir = 0;
        PI = 3.141592654;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public void calArea() {
        this.areCir = PI * Math.pow(rad, 2);
    }

    public double getAreCir() {
        return areCir;
    }
}
