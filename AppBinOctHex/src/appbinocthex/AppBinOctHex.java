/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbinocthex;

import java.util.Scanner;

/**
 *
 * @author Muke
 */
public class AppBinOctHex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora c = new Calculadora();
        Scanner kb = new Scanner(System.in);
        System.out.println("Dame un numero: ");
        c.setNum(kb.nextInt());
        c.caldatBin();
        c.caldatOct();
        System.out.println(c.getRbin());
        System.out.println(c.getRoct());
        
        
        
    }
    
}
