package appstreetfighter;

import java.applet.AudioClip;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import static java.lang.System.in;
import java.util.Scanner;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public abstract class Luchador {

    private String audio;
    private int num;
    private String nombre;
    private String pais;
    private int var;
    Scanner kb = new Scanner(System.in);

    public Luchador() {

    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void golpe() throws IOException {
        do {
            switch (num) {
                case 1:
                    Ryu R = new Ryu();
                    System.out.println("\nHas seleccionado a Ryu\n");
                    R.setNombre("Ryu");
                    R.setPais("Japon");
                    System.out.println(R.toString());
                    System.out.println("1-. Golpe debil\n2-. Golpe "
                            + "Fuerte\n3-. Patada debil\n4-. Patada "
                            + "fuerte\n5-. Especial \n6-. Salir");
                    R.setMenu(kb.nextInt());
                    R.sonidosRyu();
                    break;
                case 2:
                    ChungLi C = new ChungLi();
                    System.out.println("\nHas seleccionado a Chun-Li\n");
                    C.setNombre("Chun");
                    C.setPais("China");
                    System.out.println(C.toString());
                    System.out.println("1-. Golpe debil\n2-. Golpe "
                            + "Fuerte\n3-. Patada debil\n4-. Patada "
                            + "fuerte\n5-. Especial \n6-. Salir");
                    C.setMenu(kb.nextInt());
                    C.sonidosChung();
                    break;
                case 3:
                    Ken K = new Ken();
                    System.out.println("\nHas seleccionado a Ken\n");
                    K.setNombre("Ken");
                    K.setPais("EEUU");
                    System.out.println(K.toString());
                    System.out.println("1-. Golpe debil\n2-. Golpe "
                            + "Fuerte\n3-. Patada debil\n4-. Patada "
                            + "fuerte\n5-. Especial \n6-. Salir");
                    K.setMenu(kb.nextInt());
                    K.sonidosKen();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Personaje no valido");
            }
        } while (var!= 4);
    }

    @Override
    public String toString() {
        return "Luchador{" + "nombre=" + nombre + ", pais=" + pais + '}';
    }

    public int getNum() {
        return num;
    }
}
