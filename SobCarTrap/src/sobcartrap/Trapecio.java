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
public class Trapecio {

    private double BM;
    private double Bm;
    private double alt;
    private double resAre;

    public void Trapecio() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Dame la base mayor, la base menor y la altura: ");
        this.BM = kb.nextDouble();
        this.Bm = kb.nextDouble();
        this.alt = kb.nextDouble();
        resAre = (BM + Bm)/2 *alt;
        System.out.println("El area es: " + resAre);
    }
    
    public double Trapecio(double BM,double Bm, double alt){
        return resAre = (BM + Bm)/2 *alt;
    }
    public double Trapecio(double BM,int Bm, double alt){
        return resAre = (BM + Bm)/2 *alt;
    }
    public double Trapecio(int BM,double Bm,int alt){
        return resAre = (BM + Bm)/2 *alt;
    }
    public double Trapecio(int BM,int Bm, int alt){
        return resAre = (BM + Bm)/2 *alt;
    }

}
