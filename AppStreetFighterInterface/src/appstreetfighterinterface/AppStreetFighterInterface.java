package appstreetfighterinterface;

import java.applet.AudioClip;
import java.util.Scanner;

public class AppStreetFighterInterface {

    private static int Menu = 0;
    private static int Menurep = 0;
    private static int sw = 0;
    private static int var = 0;

    public static void main(String[] args) {
        do {
            Scanner kb = new Scanner(System.in);
            System.out.println("+ ----------------------------------- +\n|    "
                    + "  "
                    + "  "
                    + "     "
                    + "         "
                    + "              "
                    + " |\n|  "
                    + "                                   |\n|"
                    + "        ○○STREET FIGTHER○○         |\n|           "
                    + "     "
                    + "         "
                    + "          "
                    + " "
                    + " |\n"
                    + "|                                     |\n+ -------------"
                    + "---------------------- +");
            System.out.println("");
            System.out.println("1-. Ryu\n2-. Chun_Li\n3-. Ken\n4-. salir\n");
            System.out.println("Elije un peleador: ");
            Menu = kb.nextInt();
            switch (Menu) {
                case 1:
                    Ryu r = new Ryu("Ryu", "Es de Japon");
                    System.out.println("Has elejido a " + r.getNom() + " "
                            + r.getPais());
                    do {
                        System.out.println("1-. Golpe debil\n2-. Golpe Fuerte"
                                + "\n3-. Patada debil\n4-. Patada fuerte\n5-. "
                                + "Especial \n6-. Salir");
                        sw = kb.nextInt();

                        switch (sw) {

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
                                System.exit(0);
                                break;

                            default:
                                System.out.println("Golpe no valido");

                        }
                    } while (var != 4);

                    break;
                case 2:
                    Chun_Li ch = new Chun_Li("Chun-Li", "Es de China");
                    System.out.println("Has elejido a " + ch.getNom()
                            + " " + ch.getPais());
                    do {
                        System.out.println("1-. Golpe debil\n2-. Golpe "
                                + "Fuerte\n3-. Patada debil\n4-. Patada "
                                + "fuerte\n5-. Especial \n6-. Salir");
                        sw = kb.nextInt();

                        switch (sw) {

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
                                System.exit(0);
                                break;

                            default:
                                System.out.println("No se encontro "
                                        + "este movimiento");

                        }
                    } while (var != 4);

                    break;
                case 3:
                    Ken kn = new Ken("Ken", "Es de Estados Unidos");

                    System.out.println("Elegiste a " + kn.getNom() + " "
                            + kn.getPais());
                    do {
                        System.out.println("1-. Golpe debil\n2-. Golpe"
                                + " Fuerte\n3-. Patada debil\n4-. Patada "
                                + "fuerte\n5-. Especial \n6-. Salir");
                        sw = kb.nextInt();

                        switch (sw) {

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
                                System.exit(0);
                                break;

                            default:
                                System.out.println("No se encontro "
                                        + "este movimiento");

                        }
                    } while (var != 4);

                    break;
                case 4:
                    System.out.println(".....Juego Finalizado.....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("...Peleador no encontrado...");

            }

        } while (Menurep != 4);

    }
}
