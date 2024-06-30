package proyectocine;

import ds.desktop.notify.DesktopNotify;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class CineconPepe {

    private Connection conex;

    private String usuario = "postgres";
    private String pass = "newroot";
    String driver, cadena;

    public Connection ConectarBD() {

        driver = "org.postgresql.Driver";
        cadena = "jdbc:postgresql://25.99.13.63:5432/cine";
        try {
            Class.forName(driver);
            conex = DriverManager.getConnection(cadena, usuario, pass);
            //DesktopNotify.showDesktopMessage("Hecho", "Conexion exitosa", 7, 5000);
        } catch (ClassNotFoundException | SQLException e) {
            DesktopNotify.showDesktopMessage("Error", e.getMessage(), 8, 8000);

        }
        return conex;
    }

    public void CerrarBD() {
        try {
            conex.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        CineconPepe mypepe = new CineconPepe();
        mypepe.ConectarBD();
    }
}
