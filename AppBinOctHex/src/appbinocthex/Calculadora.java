/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbinocthex;

/**
 *
 * @author Muke
 */
public class Calculadora {

    private int num;
    private int r;
    private String rbin;
    private String roct;
    private String rhex;

    public Calculadora() {
        num = r = 0;
        rbin = " ";
        roct = " ";
        rhex = " ";
    }

    public void setNum(int num) {
        this.num = num;
        
    }

    public void caldatBin() {
        while (num > 0) {
            r = num % 2;
            num = num / 2;
            this.rbin = String.valueOf(r) + rbin;

        }

    }
    
    public void caldatOct(){
        while (num > 0) {
            r = num % 8;
            num/=8;
            this.roct += String.valueOf(r) + roct;
        }
        
    }

    public String getRbin() {
        return rbin;
    }

    public String getRoct() {
        return roct;
    }

    public String getRhex() {
        return rhex;
    }
    
    
   
    

}
