package appclaseabstracta;

public class Triangulo extends Figuras {

    private double bas;
    private double alt;
    private double areaTri;

    public Triangulo(String color) {
        super(color);
        System.out.print("que es un triangulo");
        bas = alt = areaTri = 0.0;
    }

    public void setBas(double bas) {
        this.bas = bas;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    @Override
    public double calArea() {
        return areaTri = bas * alt / 2;
    }
}
