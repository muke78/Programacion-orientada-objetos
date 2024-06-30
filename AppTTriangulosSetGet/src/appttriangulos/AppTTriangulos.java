 package appttriangulos;

import java.util.*;

public class AppTTriangulos {

    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        Scanner KB = new Scanner(System.in);
        System.out.println("Dame base y altura");
        t.setBas(KB.nextDouble());
        t.setAlt(KB.nextDouble());
        t.CalArea();
        System.out.println("el area es: " + t.getAreTri());
    }

}
