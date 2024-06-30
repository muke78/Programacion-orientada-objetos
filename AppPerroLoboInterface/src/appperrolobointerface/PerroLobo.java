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
public class PerroLobo extends Perro implements Lobo{
    private double tam;
    public PerroLobo(double tam, String nom, int edad) {
        super(nom, edad);
        this.tam = tam;
    }
   @Override
    public String ferroz() {
        
        return "GRRRRRRR";
    }

    @Override
    public String aullar() {
        
        return "AUUUUUUUUUU";
    }
    
    public double getTam() {
        return tam;
    }

    public String getCOLOR() {
        return COLOR;
    }
    
    
    
 
    
    
}
