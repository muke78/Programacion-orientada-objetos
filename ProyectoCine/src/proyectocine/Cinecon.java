package proyectocine;

import ds.desktop.notify.DesktopNotify;
import java.sql.*;

public class Cinecon {

    Connection con;
    int sw = 0;
    String cadena, driver = "";

    public Connection conecta() {

        driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; //SQL SERVER
        cadena = "jdbc:sqlserver://25.94.188.191\\SQLEXPRESS:1433;databaseName=Cine;user=sa;password=1234;"; //localhost mio SQLSERVER

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(cadena);
            //DesktopNotify.showDesktopMessage("Hecho", "Conexion exitosa", 7, 5000);
        } catch (ClassNotFoundException | SQLException e) {
            DesktopNotify.showDesktopMessage("Error", e.getMessage(), 8, 8000);
        }
        return con;
    }

    public static void main(String[] args) {
        Cinecon myconexion = new Cinecon();
        myconexion.conecta();
    }
}
