package respaldosmysqlframe;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RespaldosMySQLFrame {

    private String BaseData, Query;

    public RespaldosMySQLFrame() {
        BaseData = Query = " ";
    }

    public void setBaseData(String BaseData) {
        this.BaseData = BaseData;
    }

    public void setQuery(String Query) {
        this.Query = Query;
    }

    public void Resp() {
        try {
            Process p = Runtime.getRuntime().exec("mysqldump -u root -pnewroot " + BaseData);
            InputStream is = p.getInputStream();
            FileOutputStream fos = new FileOutputStream("C:/Users/M U K E/Documents/PROGRAMACION/POO/RespaldosMySQLFrame/ " + Query + ".sql");

            byte[] buffer = new byte[1000];

            int leido = is.read(buffer);

            while (leido > 0) {//CUANDO SEA 0 YA NO SE VA A LEER
                fos.write(buffer, 0, leido);
                leido = is.read(buffer);
            }
            
            System.out.println("SE HA COMPLETADO CON EXITO LA OPERACION");
            

        } catch (IOException ex) {
            Logger.getLogger(RespaldosMySQLFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
