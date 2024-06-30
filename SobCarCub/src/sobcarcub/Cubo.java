/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobcarcub;

import java.util.Scanner;

/**
 *
 * @author Muke
 */
public class Cubo {

    private double a;
    private double resAre;

    public void Cubo(){
        Scanner kb=new Scanner(System.in);
        System.out.println("Dame la longitud de sus aristas: ");
        a=kb.nextDouble();
        resAre = 6*(Math.pow(a, 2));
        System.out.println("El area es: " + this.resAre);
        
    }
    
    public double Cubo(double a){
        return resAre = 6*(Math.pow(a, 2));
    }
    public double Cubo(int a){
        return resAre = 6*(Math.pow(a, 2));
    }
    public double Cubo(float a){
        return resAre = 6*(Math.pow(a, 2));
    }
    
}
