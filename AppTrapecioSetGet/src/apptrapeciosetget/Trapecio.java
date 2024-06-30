/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apptrapeciosetget;

/**
 *
 * @author Muke
 */
public class Trapecio {

    private double BM;
    private double Bm;
    private double Alt;
    private double areaTrapecio;

    public Trapecio() {
        BM = Bm = Alt = 0;

    }

    public void setBM(double BM) {
        this.BM = BM;
    }

    public void setBm(double Bm) {
        this.Bm = Bm;
    }

    public void setAlt(double Alt) {
        this.Alt = Alt;
    }

    public void CalArea() {
        this.areaTrapecio = (BM + Bm) * Alt / 2;
    }

    public double getAreaTrapecio() {
        return areaTrapecio;
    }
}
