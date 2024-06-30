package appstreetfighterpoli;

import java.applet.*;

public class Chun_Li extends Luchador {

    public Chun_Li(String nom, String pais) {
        super(nom, pais);
    }
    private int v = 0;

    @Override
    public void Puño1() {
        do {
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource
        ("/Sonidos/golpe debil.wav"));
            sonido.play();
            v = 4;
        } while (v != 4);
    }

    @Override
    public void Puño2() {
        do {
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource
        ("/Sonidos/golpe debil2.wav"));
            sonido.play();
            v = 4;
        } while (v != 4);
    }

    @Override
    public void Patada1() {
        do {
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource
        ("/Sonidos/patada.wav"));
            sonido.play();
            v = 4;
        } while (v != 4);
    }

    @Override
    public void Patada2() {
        do {
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource
        ("/Sonidos/patada2.wav"));
            sonido.play();
            v = 4;
        } while (v != 4);
    }

    @Override
    public void Combo() {
        do {
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource
        ("/Sonidos/combok.wav"));
            sonido.play();
            v = 4;
        } while (v != 4);
    }
}
