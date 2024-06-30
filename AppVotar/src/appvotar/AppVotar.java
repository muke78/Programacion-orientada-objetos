package appvotar;

public class AppVotar {

    public static void main(String[] args) {

        Votar v = new Votar();
        v.setActual(2021);
        v.setNacimiento(2000);
        v.calDat();
        System.out.println(v.valIf());
        System.out.println("Tienes : " + v.getResuAño() + " años");
        v.calDatFalt();
    }

}
