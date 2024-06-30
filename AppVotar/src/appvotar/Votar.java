package appvotar;

public class Votar {

    private int nacimiento;
    private int actual;
    private int resuAño;
    private int faltAño;

    public Votar() {
        resuAño = faltAño = nacimiento = actual = 0;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

    public void calDat() {
        resuAño = actual - nacimiento;
        faltAño = 18 - resuAño;

    }

    public String valIf() {
        String msg = "";
        if (resuAño >= 18) {
            msg = "Si puede votar";
        }
        if (resuAño < 18) {
            msg = "No puedes votar";
        }
        return msg;
    }

    public void calDatFalt() {

        if (faltAño <= 18 && faltAño > 0) {
            System.out.println("Te faltan " + faltAño + " años");
        }

    }

    public int getResuAño() {
        return resuAño;
    }

    public int getFaltAño() {
        return faltAño;
    }
}
