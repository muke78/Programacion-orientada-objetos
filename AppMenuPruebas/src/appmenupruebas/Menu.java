/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmenupruebas;

/**
 *
 * @author Muke
 */
public class Menu {

    private double num1;
    private double num2;
    private int opc;
    private String msgRes;

    public Menu() {
        num1 = num2 = opc = 0;
        msgRes = " ";
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setOpc(int opc) {
        this.opc = opc;
    }

    public void evaMenu() {

        switch (opc) {
            case 1:
                this.msgRes = "La suma es " + String.valueOf(num1 + num2);
                break;
            case 2:
                this.msgRes = "La resta es " + String.valueOf(num1 - num2);
                break;
            case 3:
                this.msgRes = "La multiplicacion es " + String.valueOf(num1 * num2);
                break;
            case 4:
                this.msgRes = "La division es " + String.valueOf(num1 / num2);
                break;
            case 5:
                this.msgRes = "El residuo es " + String.valueOf(num1 % num2);
                break;
            default:
                this.msgRes = "No es una opcion valida";
                
        }
    }

    public String getMsgRes() {
        return msgRes;
    }
}
