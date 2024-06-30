package apptabmulti;

public class Tabla {

    private int tabla;
    private int res;
    private String msgRes;

    public Tabla() {
        tabla = res = 0;
        msgRes = "";
    }

    public void setTabla(int tabla) {
        this.tabla = tabla;
    }

    public void impTabla() {
        int vc;
        for (vc = 1; vc <= 10; vc++) {
            res = vc * tabla;
            msgRes += String.valueOf((vc) + " * " + String.valueOf(tabla) + " = " + String.valueOf(res) + "\n");
            
        }
    }

    public String getMsgRes() {
        return msgRes;
    }

    
     
    
    

}
