package appconversiones;

/**
 *
 * @author Muke
 */
public class Conversiones {

    private double resu;
    private String msg;

    public Conversiones() {
        resu = 0;
        msg = "";
    }

    public void calDat() {

        int i;
        for (i = 10; i <= 100; i+=10) {
            
            resu = i * 39.3701;
            this.msg += String.valueOf(i) + "m " + " = " + String.valueOf
        (resu)+ "plg "+ "\n";
           
        }
    }

    public String getMsg() {
        return msg;
    }
}
