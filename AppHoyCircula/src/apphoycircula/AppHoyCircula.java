package apphoycircula;

public class AppHoyCircula {

    public static void main(String[] args) {
        Placas p = new Placas();
        p.setPlaca(5);
        p.detCircula();
        System.out.println("Dia: " + p.getDia() + " " + "Color: " + p.getColor());

    }

}
