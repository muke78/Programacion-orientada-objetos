package DAO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Respaldo {

    private String BaseData, Query;

    public Respaldo() {
        BaseData = Query = "";
    }

    public void setBaseData(String BaseData) {
        this.BaseData = BaseData;
    }

    public void setQuery(String Query) {
        this.Query = Query;
    }

    public void Resp() {
        try {
            Process p = Runtime.getRuntime().exec("cmd /k \"cd C:\\Program Files\\MariaDB 10.5\\bin && mysqldump -u root -pnewroot " + BaseData ); 
            InputStream is = p.getInputStream();
            FileOutputStream fos = new FileOutputStream(Query + ".sql");

            byte[] buffer = new byte[1000];

            int leido = is.read(buffer);

            while (leido > 0) {
                fos.write(buffer, 0, leido);
                leido = is.read(buffer);
            }
            System.out.println("RESPALDO EXITOSO");
            fos.flush();
            fos.close();

        } catch (IOException ex) {
            Logger.getLogger(Respaldo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
