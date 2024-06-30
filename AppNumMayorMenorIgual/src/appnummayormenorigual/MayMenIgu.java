/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appnummayormenorigual;

/**
 *
 * @author Muke
 */
public class MayMenIgu {

    private double x1;
    private double x2;

    public MayMenIgu() {
        x1 = x2 = 0;

    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public String valNum() {
        String msg = "";
        if (x1 > x2) 
            msg = "Es mayor el numero: " + x1 + " y menor: " + x2;
        

        if (x2 > x1) 
            msg = "Es mayor el numero: " + x2 + " y menor: " + x1;
        
        if (x1 == x2) 
            msg = "Los numeros son iguales: " + x1 + " y " + x2;
        
        return msg;
    }

}
