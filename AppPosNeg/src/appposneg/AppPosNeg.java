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
public class AppPosNeg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PosNeg pn = new PosNeg();
        pn.setNum(-25);
        System.out.println("Para el numero: " + pn.getNum());
        System.out.println("El resultado es: " + pn.detConIf());
    }

}
