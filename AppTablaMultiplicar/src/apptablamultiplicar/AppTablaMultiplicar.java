package apptablamultiplicar;

import java.util.Scanner;

/**
 *
 * @author Muke
 */
public class AppTablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tabla t = new Tabla();
        Scanner kb = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        t.setTab(kb.nextInt());
        t.calDatTable();
        System.out.println(t.getMsg());
    }
}
