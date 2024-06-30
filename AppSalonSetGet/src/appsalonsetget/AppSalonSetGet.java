/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appsalonsetget;

import java.util.Scanner;

/**
 *
 * @author Muke
 */
public class AppSalonSetGet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Salon s = new Salon();
        Scanner kb = new Scanner(System.in);
        System.out.println("Dame el numero de hombres y el de mujeres: ");
        s.setAluBoy(kb.nextDouble());
        s.setAluGirl(kb.nextDouble());
        s.calDat();
        System.out.println("El porcentaje de hombres es: " + s.getResPor2()+ " %" + "\n"
                + " y el porcentaje de mujeres es: " + s.getResPor3()+ " %");
    }

}
