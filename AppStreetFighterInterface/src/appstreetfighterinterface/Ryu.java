package appstreetfighterinterface;

import java.applet.AudioClip;

public class Ryu extends Luchador implements Habilidades {

    public Ryu(String nom, String pais) {
        super(nom, pais);
    }
    private int var = 0;

    @Override
    public void Puño1() {
        do {

            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass()
                    .getResource("/Sonidos/puño1.wav"));
            sonido.play();
            var = 4;
        } while (var != 4);
    }

    @Override
    public void Puño2() {
        do {

            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass()
                    .getResource("/Sonidos/puño2.wav"));
            sonido.play();
            var = 4;
        } while (var != 4);
    }

    @Override
    public void Patada1() {
        do {

            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass()
                    .getResource("/Sonidos/patada.wav"));
            sonido.play();
            var = 4;
        } while (var != 4);
    }

    @Override
    public void Patada2() {
        do {

            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass()
                    .getResource("/Sonidos/patada2.wav"));
            sonido.play();
            var = 4;
        } while (var != 4);
    }

    @Override
    public void Combo() {
        do {

            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass()
                    .getResource("/Sonidos/haduken.wav"));
            sonido.play();

            var = 4;
        } while (var != 4);
    }
}
