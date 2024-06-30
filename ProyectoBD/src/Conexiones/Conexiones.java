package Conexiones;

import ds.desktop.notify.DesktopNotify;
import java.sql.*;

public class Conexiones {

    Connection con;
    String cadena, driver = "";

    public Conexiones() {
        System.out.println("Conectando....");

    }

    public Connection conectasqlserver() {
        DesktopNotify.showDesktopMessage("Cargando", "Conectando....", 6, 2500);
        driver = "com.mysql.jdbc.Driver"; //MARIADB
        cadena = "jdbc:mysql://localhost/dulceria?user=root&password=&useSLL=false"; //MUKE
        //cadena = "jdbc:sqlserver://25.13.136.59\\SQLEXPRESS:1433;databaseName=Empleados;user=jj;password=2212;";//jjserver
        //cadena = "jdbc:sqlserver://25.94.188.191\\SQLEXPRESS:1433;databaseName=Empleados;user=sa;password=1234;";//muke
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(cadena);
            System.out.println("Conexion Exitosa en SQLServer");
            DesktopNotify.showDesktopMessage("Exito", "Conexion Exitosa BD", 7, 4000);
        } catch (ClassNotFoundException e) {
            DesktopNotify.showDesktopMessage("Error", e.getMessage(), 8, 5000);
        } catch (SQLException e1) {
            DesktopNotify.showDesktopMessage("Error", e1.getMessage(), 8, 5000);
        }
        return con;
    }

    public static void main(String[] args) {
        Conexiones myconexion = new Conexiones();
        myconexion.conectasqlserver();

    }

}
