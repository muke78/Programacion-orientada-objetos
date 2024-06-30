package apphombrearañaherencia;

public class HombreAraña extends Hombre {

    private String poder;
    private String trepar;
    private String valiente;

    public HombreAraña() {
        System.out.println(" Araña");
        poder = trepar = valiente = " ";
    }

    public void datosHombre(String nom, String sexo, int edad,
            double estatura, double peso) {
        super.setNom(nom);
        super.setSexo(sexo);
        super.setEdad(edad);
        super.setEstatura(estatura);
        super.setPeso(peso);

    }

    public void Poder() {
        this.poder = "Arriba arriba y muy lejos";
    }

    public void Trepar() {
        this.trepar = "Witzi witzi";
    }

    public void Valiente() {
        this.valiente = "Alv prros";
    }

    public void metHombre() {
        super.Hablar();
        super.Caminar();
    }

    @Override
    public String toString() {
        return super.toString() + "\nHombreAra\u00f1a{" + " "
                + "\npoder=" + poder + ", \ntrepar=" + trepar
                + ", \nvaliente=" + valiente + '}';
    }
}
