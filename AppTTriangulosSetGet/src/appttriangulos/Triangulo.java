package appttriangulos;

public class Triangulo {

    private double base;
    private double altura;
    private double areaTriang;

    public Triangulo() {
        base = altura = areaTriang = 0;
    }

    public void setBas(double base) {
        this.base = base;
    }

    public void setAlt(double altura) {
        this.altura = altura;
    }

    public void CalArea() {
        areaTriang = base * altura / 2;
    }

    public double getAreTri() {
        return areaTriang;
    }

}
