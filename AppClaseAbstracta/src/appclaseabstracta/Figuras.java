package appclaseabstracta;

public abstract class Figuras {

    private String color;

    public Figuras(String color) {
        System.out.print("Nacio una figura ");
        this.color = color;
    }

    public abstract double calArea();

    public String getColor() {
        return color;
    }
}
