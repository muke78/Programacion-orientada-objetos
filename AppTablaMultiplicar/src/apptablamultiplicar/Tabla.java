package apptablamultiplicar;

/**
 *
 * @author Muke
 */
public class Tabla {

    private int tab;
    private int resu;
    private String msg;

    public Tabla() {
        tab = resu = 0;
        msg = "";
    }

    public void setTab(int tab) {
        this.tab = tab;
    }

    public void calDatTable() {
        int i;
        for (i = 1; i <= 10; i++) {
            resu = i * tab;
            this.msg += String.valueOf(i) + " X " + String.valueOf(tab) 
                    + " = " + String.valueOf(resu) + "\n";
        }
    }
    public String getMsg() {
        return msg;
    }

}
