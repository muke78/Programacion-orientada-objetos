package DAO;

import ds.desktop.notify.DesktopNotify;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    Connection con;
    int sw = 0;
    String cadena, driver = "";

    public Connection conecta() {
        driver = "com.mysql.jdbc.Driver"; //MARIADB
        //driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"; //SQL SERVER
        //cadena = "jdbc:mysql://25.99.13.63/ADM65120212?user=root&password=newroot&useSLL=false"; //pepe
        cadena = "jdbc:mysql://localhost/ADM65120212?user=root&password=newroot&useSLL=false"; //MUKE
        //cadena = "jdbc:mysql://25.13.136.59/adm65120212?user=root&password=1234&useSSL=false"; //JJ
        //cadena = "jdbc:sqlserver://DESKTOP-72OOIPQ\\SQLEXPRESS:1433;databaseName=Cine;user=sa;password=1234;"; //localhost mio SQLSERVER
        //cadena = "jdbc:sqlserver://25.94.188.191\\SQLEXPRESS:1433;databaseName=Empleados;user=sa;password=1234;"; MIO IPV4 
        //cadena = "jdbc:sqlserver://25.13.136.59\\SQLEXPRESS:1433;databaseName=Empleados;user=jj;password=2212;";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(cadena);
           //DesktopNotify.showDesktopMessage("Hecho","Conexion exitosa", 7, 5000);
            JOptionPane.showMessageDialog(null, "Conexion exitosa ");
        } catch (ClassNotFoundException | SQLException e) {
            DesktopNotify.showDesktopMessage("Error",e.getMessage(), 8, 8000);
            
        }
        return con;
    }

    public static void main(String[] args) {
        Conexion myconexion = new Conexion();
        myconexion.conecta();
    }
}
