package respaldosmysqlframe;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RestaurarMySQLFrame {

    private String BaseData, Query;

    public RestaurarMySQLFrame() {
        BaseData = Query = " ";
    }

    public void setBaseData(String BaseData) {
        this.BaseData = BaseData;
    }

    public void setQuery(String Query) {
        this.Query = Query;
    }

    public void Rest() {

        try {
            Process p = Runtime.getRuntime().exec("mysql -u root -pnewroot " + BaseData);

            OutputStream os = p.getOutputStream();
            FileInputStream fis = new FileInputStream("C:/Users/M U K E/Documents/PROGRAMACION/POO/RespaldosMySQLFrame/ " + Query + ".sql");
            byte[] buffer = new byte[1000];

            int leido = fis.read(buffer);

            while (leido > 0) {
                os.write(buffer, 0, leido);
                leido = fis.read(buffer);
            }
            JOptionPane.showMessageDialog(null, "SE HA COMPLETADO EXITOSAMENTE LA OPERACION");
            os.flush();
            os.close();
            fis.close();
        } catch (IOException ex) {
            Logger.getLogger(RespyRest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
