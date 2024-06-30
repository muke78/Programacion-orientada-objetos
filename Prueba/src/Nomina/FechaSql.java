/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomina;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author M U K E
 */
public class FechaSql {

    public static String formato() {
        Date date = new Date();
        //Caso 2: obtener la fecha y salida por pantalla con formato:
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        System.out.println("Fecha: " + dateFormat.format(date));
        
        return dateFormat.format(date) ;
        
    }

    public static void main(String[] args) {
        FechaSql dt = new FechaSql();
        FechaSql.formato();
    }

}
