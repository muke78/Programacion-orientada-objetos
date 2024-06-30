package appstreetfighter;

import java.io.IOException;
import java.util.Scanner;

public class AppStreetFighter {

    public static void main(String[] args) throws IOException {
        Luchador L = new Luchador() {
        };
        Scanner kb = new Scanner(System.in);
        System.out.println("•••••STREET_FIGHTER•••••");
        System.out.println("\nElige una de estas opciones: ");
        System.out.println("1-. Ryu\n2-. Chun-Li\n3-. Ken\n4-. salir\n");
        System.out.println("Elije un peleador: ");
        L.setNum(kb.nextInt());
        L.golpe();
    }

}