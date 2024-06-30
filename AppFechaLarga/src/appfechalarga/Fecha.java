/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appfechalarga;

/**
 *
 * @author Muke
 */
public class Fecha {

    private int dia;
    private int mes;
    private int año;
    private String fechlar;

    public Fecha() {
        dia = mes = año = 0;
    }

    public void setD(int dia) {
        this.dia = dia;
    }

    public void setM(int mes) {
        this.mes = mes;
    }

    public void setA(int año) {
        this.año = año;
    }

    public void ccalcular() {
        switch (mes) {
            case 1:
                this.fechlar = String.valueOf(dia) + " - Enero - "
                        + String.valueOf(año);
                break;
            case 2:
                this.fechlar = String.valueOf(dia) + " - Febrero - "
                        + String.valueOf(año);
                break;
            case 3:
                this.fechlar = String.valueOf(dia) + " - Marzo - "
                        + String.valueOf(año);
                break;
            case 4:
                this.fechlar = String.valueOf(dia) + " - Abril - "
                        + String.valueOf(año);
                break;
            case 5:
                this.fechlar = String.valueOf(dia) + " - Mayo - "
                        + String.valueOf(año);
                break;
            case 6:
                this.fechlar = String.valueOf(dia) + " - Junio - "
                        + String.valueOf(año);
                break;
            case 7:
                this.fechlar = String.valueOf(dia) + " - Julio - "
                        + String.valueOf(año);
                break;
            case 8:
                this.fechlar = String.valueOf(dia) + " - Agosto - "
                        + String.valueOf(año);
                break;
            case 9:
                this.fechlar = String.valueOf(dia) + " - Septiembre - "
                        + String.valueOf(año);
                break;
            case 10:
                this.fechlar = String.valueOf(dia) + " - Octubre - "
                        + String.valueOf(año);
                break;
            case 11:
                this.fechlar = String.valueOf(dia) + " - Noviembre - "
                        + String.valueOf(año);
                break;
            case 12:
                this.fechlar = String.valueOf(dia) + " - Diciembre - "
                        + String.valueOf(año);
                break;
            default:
                this.fechlar = "No es un mes valido";
                break;
        }
    }

    public String getFechlar() {
        return fechlar;
    }
}
