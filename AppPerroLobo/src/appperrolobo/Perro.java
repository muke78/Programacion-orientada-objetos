package appperrolobo;

public class Perro {
    
    private String nom;
    private String raza;
    private String sexo;
    private int edad;
    private String msgLadra;
    private String msgMoverCola;

    public Perro() {
        System.out.print("Nacio un Perro");
        nom = raza = sexo = msgLadra = msgMoverCola = "";
        edad = 0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void movCola() {
        this.msgMoverCola = "Moviendo la cola";
    }

    public void ladrar() {
        this.msgLadra = "GUUUUUUUUAAAAAOOOO";
    }

    @Override
    public String toString() {
        return "Perro{" + "\nnom=" + nom + ", \nraza=" + raza + ", \nsexo="
                + sexo + ", \nedad=" + edad + ", \nmsgLadra=" + msgLadra + ", "
                + "\nmsgMoverCola=" + msgMoverCola + '}';
    }
}