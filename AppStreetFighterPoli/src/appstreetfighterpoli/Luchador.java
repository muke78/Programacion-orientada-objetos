package appstreetfighterpoli;

public abstract class Luchador {

    private String nom = "";
    private String pais = "";

    public Luchador(String nom, String pais) {
        this.nom = nom;
        this.pais = pais;
    }

    public String getNom() {
        return nom;
    }

    public String getPais() {
        return pais;
    }

    public void Puño1() {
        System.out.println("No existe");
    }

    public void Puño2() {
        System.out.println("No existe");
    }

    public void Patada1() {
        System.out.println("No existe");
    }

    public void Patada2() {
        System.out.println("No existe");
    }

    public void Combo() {
        System.out.println("No existe");
    }
}
