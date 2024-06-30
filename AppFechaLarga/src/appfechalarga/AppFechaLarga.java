/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appfechalarga;

import java.util.Scanner;

/**
 *
 * @author Muke
 */
public class AppFechaLarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fecha f = new Fecha();
        Scanner kb = new Scanner(System.in);
        System.out.print("Dame un dia: ");
        f.setD(kb.nextInt());
        System.out.println("Dame un mes: ");
        f.setM(kb.nextInt());
        System.out.println("Dame un año: ");
        f.setA(kb.nextInt());
        f.ccalcular();
        System.out.println(f.getFechlar());
    }

}
