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
public class Calificacion {

    private double cal1;
    private double cal2;
    private double cal3;
    private double resuCal;
    private double resuFinal;

    public Calificacion() {
        cal1 = cal2 = cal3 = resuCal = 0;
    }

    public void setCal1(double cal1) {
        this.cal1 = cal1;
    }

    public void setCal2(double cal2) {
        this.cal2 = cal2;
    }

    public void setCal3(double cal3) {
        this.cal3 = cal3;
    }

    public void calDat() {
        resuCal = cal1 + cal2 + cal3;
        this.resuFinal = resuCal / 3;
        
    }

    public String detValor() {
        String msg = "";
        if (resuFinal >= 7) 
            msg = "Aprobo";
        
        if (resuFinal < 7) 
            msg = "Reprobo";
        
        return msg;
    
    }
    public double getResuFinal() {
        return resuFinal;
    }

}
