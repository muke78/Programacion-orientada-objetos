package proyectocine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import ds.desktop.notify.*;

public class CineconJesus{

    Connection conix;
    String cadena, driver = "";

    public CineconJesus() {
        System.out.println("Conectando....");
    }

    public Connection conecta() {
        //DesktopNotify.showDesktopMessage("Cargando", "Conectando....", 6, 2500);
        String login = "system";
        String password = "jesus";
        //String url = "jdbc:oracle:thin:@localhost:1521:XE";,   "jdbc:oracle:thin:@25.100.39.229:1521:XE";
        String url = "jdbc:oracle:thin:@25.102.216.30:1521:XE";
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conix = DriverManager.getConnection(url, login, password);
            System.out.println("Conexion Exitosa en Oracle");
            //DesktopNotify.showDesktopMessage("Exito", "Conexion Exitosa en Oracle", 7, 4000);
        } catch (ClassNotFoundException e) {
            DesktopNotify.showDesktopMessage("Error", e.getMessage(), 8, 5000);
        } catch (SQLException e1) {
            DesktopNotify.showDesktopMessage("Error", e1.getMessage(), 8, 5000);
        }
        return conix;
    }

    public static void main(String[] args) {
        CineconJesus myjesus = new CineconJesus();
        myjesus.conecta();
    }
}
