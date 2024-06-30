/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdiasletra;

/**
 *
 * @author Muke
 */
public class Dias {

    private int num;

    public Dias() {
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void calDay() {
        switch (num) {
            case 1:
                System.out.println("El dia es Lunes");
                break;
            case 2:
                System.out.println("El dia es Martes");
                break;
            case 3:
                System.out.println("El dia es Miercoles");
                break;
            case 4:
                System.out.println("El dia es Jueves");
                break;
            case 5:
                System.out.println("El dia es Viernes");
                break;
            case 6:
                System.out.println("El dia es Sabado");
                break;
            case 7:
                System.out.println("El dia es Domingo");
                break;
            default:
                System.out.println("Ese dia no existe");
        }

    }

}
