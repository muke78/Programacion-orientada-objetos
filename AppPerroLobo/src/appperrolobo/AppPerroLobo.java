package appperrolobo;

public class AppPerroLobo {

    public static void main(String[] args) {
        // TODO code application logic here
       
        PerroLobo pl = new PerroLobo();
        pl.datosPerro("FIFI", "ELECTRICO", "F", 3);
        pl.metPerro();
        pl.metPerro();
        pl.aullar();
        pl.ferroz();
        pl.setColor("NEGRO");
        System.out.println(pl.toString());
    }

}
