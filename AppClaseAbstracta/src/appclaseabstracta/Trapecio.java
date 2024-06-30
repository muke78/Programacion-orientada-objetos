package appclaseabstracta;

public class Trapecio extends Figuras {

    private double BM;
    private double Bm;
    private double h;
    private double areaTra;

    public Trapecio(String color) {
        super(color);
        System.out.println("es un trapecio");
        BM = Bm = h = 0;
    }

    public void setBM(double BM) {
        this.BM = BM;
    }

    public void setBm(double Bm) {
        this.Bm = Bm;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double calArea() {
        return areaTra = (BM + Bm) * h / 2;
    }
}
