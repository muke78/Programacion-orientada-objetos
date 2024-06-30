/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appaudio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import static sun.audio.AudioPlayer.player;
import sun.audio.AudioStream;

/**
 *
 * @author Muke
 */
public class Audio {

    private int num;
    private String audio;
    private String audio2;
    private String audio3;
    private String audio4;
    

    public Audio() {
        num = 0;
        audio = audio2 = audio3 = audio4 = "";
    }

    public void setNum(int num) {
        this.num = num;
    }

    public AudioPlayer SelectMen() throws FileNotFoundException, IOException {
        switch (num) {
            case 1:
                audio = "C:/Users/pc/Desktop/Sonidos/Spongebob floating meme FULL SONG.wav";
                InputStream in = new FileInputStream(audio);
                AudioStream sonido = new AudioStream(in);
                AudioPlayer.player.start(sonido);
                break;

            case 2:
                audio2 = "C:/Users/pc/Desktop/Sonidos/SpongeBob Music Grass Skirt Chase.wav";
                InputStream ine = new FileInputStream(audio2);
                AudioStream sonido2 = new AudioStream(ine);
                AudioPlayer.player.start(sonido2);

                break;
            case 3:
                audio3 = "C:/Users/pc/Desktop/Sonidos/SpongeBob Production Music Seaweed.wav";
                InputStream inu = new FileInputStream(audio3);
                AudioStream sonido3 = new AudioStream(inu);
                AudioPlayer.player.start(sonido3);
                break;
            case 4:
                audio4 = "C:/Users/pc/Desktop/Sonidos/Gary Vuelve A Casa (letra).wav";
                InputStream ino = new FileInputStream(audio4);
                AudioStream sonido4 = new AudioStream(ino);
                AudioPlayer.player.start(sonido4);
                break;

            default:
                System.out.println("Esa opcion no existe");
        }
        return player;
    }

}
