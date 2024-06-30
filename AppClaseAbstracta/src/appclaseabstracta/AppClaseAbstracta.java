package appclaseabstracta;

public class AppClaseAbstracta {

    public static void main(String[] args) {
        Triangulo t = new Triangulo("Verde");
        System.out.println(" de color " + t.getColor());
        t.setBas(5);
        t.setAlt(5);
        System.out.println("El area del triangulo es: " + t.calArea());
        System.out.print("\n");
        Circulo c = new Circulo("Rojo");
        System.out.println(" de color " + c.getColor());
        c.setRad(12.35);
        System.out.println("El area del circulo es: " + c.calArea());
        System.out.println("\n");
        Trapecio tr = new Trapecio("Morado");
        System.out.println(" de color: " + tr.getColor());
        tr.setBM(1020);
        tr.setBm(120);
        tr.setH(50);
        System.out.println("El area del trpacio es: " + tr.calArea());
        
    }
    
}
     