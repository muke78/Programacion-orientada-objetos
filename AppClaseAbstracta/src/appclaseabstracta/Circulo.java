package appclaseabstracta;

public class Circulo extends Figuras {

    private double rad;
    private final double PI;
    private double areCirc;

    public Circulo(String color) {
        super(color);
        System.out.print("que es un circulo");
        rad = 0;
        PI = 3.141592654;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    @Override
    public double calArea() {
        return areCirc = PI * Math.pow(rad, 2);
    }
}
