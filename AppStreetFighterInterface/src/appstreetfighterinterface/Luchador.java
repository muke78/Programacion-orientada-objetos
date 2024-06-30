package appstreetfighterinterface;

public class Luchador {

    private String nom = "";
    private String pais = "";

    public Luchador(String nom, String pais) {
        this.nom = nom;
        this.pais = pais;

    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNom() {
        return nom;
    }

    public String getPais() {
        return pais;
    }
}
