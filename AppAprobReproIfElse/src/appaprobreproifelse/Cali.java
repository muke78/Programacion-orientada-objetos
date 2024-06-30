/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appaprobreproifelse;

/**
 *
 * @author Muke
 */
public class Cali {
    
    private double cal1;
    private double cal2;
    private double cal3;
    private double resuCal;
    private double resuFinal;
    private double compr;
    
    public Cali() {
        cal1 = cal2 = cal3 = resuCal = resuFinal = compr = 0;
        
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
    
    public void claDat() {
        resuCal = cal1 + cal2 + cal3;
        this.resuFinal = resuCal / 3;
        compr = 7.1 - resuFinal;
        
    }
    
    public String detValor() {
        String msg = "";
        if (resuFinal >= 7) {
            msg = "Aprobo";
        } else {
            msg = "Reprobo";
        }
        return msg;
    }
    public void detValorCal() {
        if (resuFinal <= 7 && resuFinal > 0) {
            System.out.println("Te faltan " + compr + " puntos");
        }else{
            System.out.println("No te falta... Si pasaste...!");
        }
    }
    
    public double getResuFinal() {
        return resuFinal;
    }
    
}
