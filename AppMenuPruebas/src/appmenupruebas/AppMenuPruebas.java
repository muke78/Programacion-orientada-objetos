/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmenupruebas;

import java.util.Scanner;

/**
 *
 * @author Muke
 */
public class AppMenuPruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu  m = new  Menu ();
        Scanner kb =new Scanner(System.in);
        System.out.println("Dame 2 numeros: ");
        m.setNum1(kb.nextDouble());
        m.setNum2(kb.nextDouble());
        System.out.println("Dame la opcion que desea: ");
        m.setOpc(kb.nextInt());
        m.evaMenu();
        System.out.println(m.getMsgRes());
    }
    
}
