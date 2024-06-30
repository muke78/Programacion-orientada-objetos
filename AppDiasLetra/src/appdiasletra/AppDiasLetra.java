/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdiasletra;

import java.util.Scanner;

/**
 *
 * @author Muke
 */
public class AppDiasLetra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dias d = new Dias();
        Scanner kb = new Scanner(System.in);
        System.out.println("Dame un dia de la semana: ");
        d.setNum(kb.nextInt());
        d.calDay();
    }

}
