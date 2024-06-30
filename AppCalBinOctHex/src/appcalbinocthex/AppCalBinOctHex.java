package appcalbinocthex;

import java.util.Scanner;

/**
 *
 * @author Muke
 */
public class AppCalBinOctHex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cal c = new Cal();
        Scanner kb = new Scanner(System.in);
        System.out.println("Dame un numero: ");
        c.setNum(kb.nextInt());
        c.Bin();
        c.Oct();
        c.Hex();
        System.out.print("En base binaria: ");
        System.out.println(c.getResiBin());
        System.out.print("En base octal: ");
        System.out.println(c.getResiCot());
        System.out.print("En base hexadecimal: ");
        System.out.println(c.getResiHex());
    }
}
