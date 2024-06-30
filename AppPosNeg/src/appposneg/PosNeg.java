/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appposneg;

/**
 *
 * @author Muke
 */
public class PosNeg {

    private int num;

    public PosNeg() {
        num = 0;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String detConIf() {
        String msg = "";
        if (num >= 0) 
            msg = "Positivo";
        

        if (num < 0) 
            msg = "Negativo";
        
        return msg;

    }

    public int getNum() {
        return num;
    }

}
