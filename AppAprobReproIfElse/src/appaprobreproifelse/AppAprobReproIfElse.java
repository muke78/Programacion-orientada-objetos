/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appaprobreproifelse;

import java.util.Scanner;

/**
 *
 * @author Muke
 */
public class AppAprobReproIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cali c = new Cali();
        Scanner kb =new Scanner(System.in);
        System.out.println("Dame tres calificaciones: ");
        c.setCal1(kb.nextDouble());
        c.setCal2(kb.nextDouble());
        c.setCal3(kb.nextDouble());
        c.claDat();
        c.detValor();
        c.detValorCal();
        System.out.println("Tu calificacion es: " + c.getResuFinal());
    }

}
