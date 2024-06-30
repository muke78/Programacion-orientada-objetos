/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appaudio;


import java.util.Scanner;


/**
 *
 * @author Muke
 */
public class AppAudio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Audio a = new Audio();
        Scanner kb = new Scanner(System.in);
        System.out.println("Presione una tecla: \n");
        a.setNum(kb.nextInt());
        a.SelectMen();
    }

}
