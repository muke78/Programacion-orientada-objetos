package apphombrearañaherencia;

public class Hombre {
    private String nom;
    private String sexo;
    private String hablar;
    private String caminar;
    private int edad;
    private double estatura;
    private double peso;

    public Hombre() {
        System.out.print("Nacio un hombre");
        edad = 0;
        peso = estatura = 0.0;
        nom = sexo = hablar = caminar = "";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getHablar() {
        return hablar;
    }

    public void setHablar(String hablar) {
        this.hablar = hablar;
    }

    public String getCaminar() {
        return caminar;
    }

    public void setCaminar(String caminar) {
        this.caminar = caminar;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void Hablar(){
        this.hablar = "Hooooooolaaaaaaaaaa";
    }
    
    public void Caminar(){
        this.caminar = "Run Run Run";
    }

    @Override
    public String toString() {
        return "Hombre{" + "\nnom=" + nom + ", \nsexo=" + 
                sexo + ", \nhablar=" + hablar + ", \ncaminar=" 
                + caminar + ", \nedad=" + edad + ", \nestatura=" 
                + estatura + ", \npeso=" + peso + '}';
    }
    
    
    
}
