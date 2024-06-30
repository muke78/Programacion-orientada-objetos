package appperrolobo;

public class PerroLobo extends Perro {

    private String color;
    private String msgFerroz;
    private String msgAullar;

    public PerroLobo() {
        super();
        System.out.println(" Lobo");
        color = msgFerroz = msgAullar = "";

    }

    public void datosPerro(String nom, String raza, String sexo,int edad) {
        super.setNom(nom);
        super.setRaza(raza);
        super.setSexo(sexo);
        super.setEdad(edad);
    }

    public void ferroz() {
        msgFerroz = "GGGGGGGRRRRRRRR";
    }

    public void aullar() {
        msgAullar = "AUUUUUUUUUUUUUUUU";
    }
    
    public void metPerro(){
        super.movCola();
        super.ladrar();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    

    @Override
    public String toString() {

        return super.toString() + "\nPerroLobo{" + "\ncolor=" + 
                color + ", \nmsgFerroz=" + msgFerroz + ", "
                + "\nmsgAullar=" + msgAullar + '}';
    }

}
