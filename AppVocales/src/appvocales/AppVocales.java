/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvocales;

/**
 *
 * @author Muke
 */
public class AppVocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VocalCons vc = new VocalCons();
        vc.setLetChar('M');
        vc.setLetStr("A");
        vc.evaluaVocalStr();
        System.out.println(vc.getLetStr() + " De cadena " + vc.getMsg());
        vc.evaluaVocalChar();
        System.out.println(vc.getLetChar() + " De caracter " + vc.getMsg());
    }

}
