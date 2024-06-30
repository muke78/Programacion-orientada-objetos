package appstreetfighter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


public class ChungLi extends Luchador {

    private int menu;
    private String audio;
    private String audio2;
    private String audio3;
    private String audio4;
    private String audio5;
    int op = 0;

    public void setMenu(int menu) {
        this.menu = menu;
    }

    public void datosChun(String nombre,String pais) {
        super.getNombre();
        super.getPais();
    }
    
    public void sonidosChung() throws FileNotFoundException, IOException{
        do {
            switch (menu) {

                case 1:
                    audio = "C:/Users/pc/Documents/PROGRAMACION/"
                            + "POO/AppStreetFighter/src/Sonidos/puño1.wav";
                    InputStream in = new FileInputStream(audio);
                    AudioStream sonido = new AudioStream(in);
                    AudioPlayer.player.start(sonido);
                    op = 4;
                    break;
                case 2:
                    audio2 = "C:/Users/pc/Documents/PROGRAMACION/"
                            + "POO/AppStreetFighter/src/Sonidos/puño2.wav";
                    InputStream ina = new FileInputStream(audio2);
                    AudioStream sonido2 = new AudioStream(ina);
                    AudioPlayer.player.start(sonido2);
                    op = 4;
                    break;
                case 3:
                    audio3 = "C:/Users/pc/Documents/PROGRAMACION/"
                            + "POO/AppStreetFighter/src/Sonidos/patada.wav";
                    InputStream ine = new FileInputStream(audio3);
                    AudioStream sonido3 = new AudioStream(ine);
                    AudioPlayer.player.start(sonido3);
                    op = 4;
                    break;
                case 4:
                    audio4 = "C:/Users/pc/Documents/PROGRAMACION/"
                            + "POO/AppStreetFighter/src/Sonidos/patada2.wav";
                    InputStream ini = new FileInputStream(audio4);
                    AudioStream sonido4 = new AudioStream(ini);
                    AudioPlayer.player.start(sonido4);
                    op = 4;
                    break;
                case 5:
                    audio5 = "C:/Users/pc/Documents/PROGRAMACION/"
                            + "POO/AppStreetFighter/src/Sonidos/comboL.wav";
                    InputStream ino = new FileInputStream(audio5);
                    AudioStream sonido5 = new AudioStream(ino);
                    AudioPlayer.player.start(sonido5);
                    op = 4;
                    break;
                case 6:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Movimiento no valido");
                    op = 4;
            }
        } while (op != 4);
    }
}
