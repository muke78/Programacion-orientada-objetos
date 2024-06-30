/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appaprrep;

/**
 *
 * @author Muke
 */
public class AppAprRep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calificacion c = new Calificacion();
        c.setCal1(10);
        c.setCal2(7);
        c.setCal3(7.1);
        c.calDat();
        System.out.println(c.detValor());
        System.out.println("El promedio de las calificaciones: " + c.getResuFinal());
    }
    
}
