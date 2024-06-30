/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appperrolobointerface;

/**
 *
 * @author Muke
 */
public class AppPerroLoboInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PerroLobo pl = new PerroLobo(4.5,"FIFI",5);
        System.out.printf("%f %s %s %d\n",pl.getTam(),pl.getNom(),pl.getCOLOR(),pl.getEdad());
        System.out.println("Perro " + pl.ladrar() + " " + pl.MoverCola());
        System.out.println("Lobo " + pl.ferroz() + " " + pl.aullar());
    }
    
}
