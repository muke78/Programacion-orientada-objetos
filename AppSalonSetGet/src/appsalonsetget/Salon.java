/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appsalonsetget;

/**
 *
 * @author Muke
 */
public class Salon {

    private double aluTot;
    private double aluBoy;
    private double aluGirl;
    private double resPor;
    private double resPor2;
    private double resPor3;

    public Salon() {
        aluTot = aluBoy = aluGirl = resPor = resPor2 = resPor3 = 0;
    }

    public void setAluBoy(double aluBoy) {
        this.aluBoy = aluBoy;
    }

    public void setAluGirl(double aluGirl) {
        this.aluGirl = aluGirl;
    }
    
    public void calDat(){
        resPor = aluBoy + aluGirl;
        resPor2 = (aluBoy * 100) / resPor;
        resPor3 = (aluGirl * 100) / resPor;
    }

    public double getResPor2() {
        return resPor2;
    }

    public double getResPor3() {
        return resPor3;
    }
}
