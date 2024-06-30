package appstreetfighterpoli;

import java.util.Scanner;

public class AppStreetFighterPoli {

    private static int M, Mer, s, v = 0;

    public static void main(String[] args) {
        do {
            Scanner kb = new Scanner(System.in);
            System.out.println("----------Street Fighter----------");
            System.out.println("");
            System.out.println("1.Ryu\n2.Chun Li\n3.Ken\n4.salir\n");
            System.out.println("Elije un peleador: ");
            M = kb.nextInt();
            switch (M) {
                case 1:
                    Luchador r = new Ryu("Ryu", "Es de Japon");
                    System.out.println("Has seleccionado a " + r.getNom()
                            + " " + r.getPais());
                    do {
                        System.out.println("1. Golpe debil\n2. Golpe Fuerte"
                                + "\n3. Patada debil\n4. Patada fuerte\n5. "
                                + "Especial \n6. Salir");
                        s = kb.nextInt();

                        switch (s) {
                            case 1:
                                r.Puño1();
                                break;
                            case 2:
                                r.Puño2();
                                break;
                            case 3:
                                r.Patada1();
                                break;
                            case 4:
                                r.Patada2();
                                break;
                            case 5:
                                r.Combo();
                                break;
                            case 6:
                                System.out.println(".....Juego Finalizado"
                                        + ".....");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("No existe ese movimiento");
                        }
                    } while (v != 4);
                    break;

                case 2:
                    Luchador ch = new Chun_Li("Chun-Li", "Es de China");
                    System.out.println("Has seleccionado a " + ch.getNom()
                            + " " + ch.getPais());
                    do {
                        System.out.println("1. Golpe debil\n2. Golpe Fuerte"
                                + "\n3. Patada debil\n4. Patada fuerte\n5."
                                + " Especial \n6. Salir");
                        s = kb.nextInt();
                        switch (s) {
                            case 1:
                                ch.Puño1();
                                break;
                            case 2:
                                ch.Puño2();
                                break;
                            case 3:
                                ch.Patada1();
                                break;
                            case 4:
                                ch.Patada2();
                                break;
                            case 5:
                                ch.Combo();
                                break;
                            case 6:
                                System.out.println(".....Juego Finalizado"
                                        + ".....");
                                System.exit(0);
                                break;

                            default:
                                System.out.println("No existe ese movimiento");
                        }
                    } while (v != 4);

                    break;
                case 3:
                    Luchador kn = new Ken("Ken", "Es de Estados Unidos");

                    System.out.println("Elegiste a " + kn.getNom() + " "
                            + kn.getPais());
                    do {
                        System.out.println("1. Golpe debil\n2. Golpe Fuerte"
                                + "\n3. Patada debil\n4. Patada fuerte\n5. "
                                + "Especial \n6. Salir");
                        s = kb.nextInt();

                        switch (s) {

                            case 1:
                                kn.Puño1();
                                break;
                            case 2:
                                kn.Puño2();
                                break;
                            case 3:
                                kn.Patada1();
                                break;
                            case 4:
                                kn.Patada2();
                                break;
                            case 5:
                                kn.Combo();
                                break;
                            case 6:
                                System.out.println(".....Juego Finalizado"
                                        + ".....");
                                System.exit(0);
                                break;

                            default:
                                System.out.println("No existe ese movimiento");

                        }
                    } while (v != 4);

                    break;
                case 4:
                    System.out.println(".....Juego Finalizado.....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("...Peleador no encontrado...");
            }
        } while (Mer != 4);
    }

}
