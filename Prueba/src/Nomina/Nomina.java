package nomina;

import DAO.Conexion;
import ds.desktop.notify.DesktopNotify;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.*;

public class Nomina {

    int a = 1;
    Connection con;
    PreparedStatement stmt, stmt115, stmt116;
    ResultSet tablaempleados, R115, R116;
    int sw = 0;
    Conexion cn = new Conexion();
    double ispt, Subsidios, Total, su, Quin;

    String sql115 = "", sql = "", sql116 = "", nom = "", Emple = "", idemp, date;

    Conexion myconexion = new Conexion();

    Nomina() {

        con = myconexion.conecta();
    }

    public void usar() {
        try {
            Emple = "select * from empleados ";
            sql115 = "select * from tablas where IDtabla=115";
            sql116 = "select * from tablas where IDtabla=116";
            Scanner kb = new Scanner(System.in);
            stmt = con.prepareStatement(Emple);
            tablaempleados = stmt.executeQuery();
            stmt115 = con.prepareStatement(sql115);
            R115 = stmt115.executeQuery();
            stmt116 = con.prepareStatement(sql116);
            R116 = stmt116.executeQuery();

            while (tablaempleados.next()) {
                //System.out.println(Sueldos.getString(2));
                //System.out.println(Sueldos.getDouble(6));
                date = tablaempleados.getString(8);
                su = tablaempleados.getDouble(6);
                nom = tablaempleados.getString(2);
                idemp = tablaempleados.getString(1);

                R115.beforeFirst();
                R116.beforeFirst();

                while (R115.next()) {

                    if (su >= R115.getDouble(4) && su <= R115.getDouble(5)) {
                        ispt = (su - R115.getDouble(4)) * (R115.getDouble(7) / 100) + R115.getDouble(6);
                        System.out.println(ispt);

                    }
                }

                while (R116.next()) {

                    if (su >= R116.getDouble(4) && su <= R116.getDouble(5)) {
                        Subsidios = ((su - R116.getDouble(4)) * R116.getDouble(7)) + R116.getDouble(6);
                        System.out.println(Subsidios);

                    }
                }
                System.out.println(Total);
                Total = ispt - Subsidios;
                try {
                    sql = "Insert into Calculos values(";
                    sql += "\"" + idemp + "\",";
                    sql += "\"" + 500 + "\",";
                    sql += "\"" + 2000 + "-" + 04 + "-" + "24" + "\",";
                    sql += "\"" + 0 + "\",";
                    sql += "\"" + (Total / 2) + "\")";
                    stmt = con.prepareStatement(sql);
                    sw = stmt.executeUpdate();
                    if (sw != 0) {
                        DesktopNotify.showDesktopMessage("Hecho", "Registro insertado con exito", 7, 3000);

                    }
                } catch (SQLException e) {
                    DesktopNotify.showDesktopMessage("Error", e.getMessage(), 8, 8000);
                }
            }

        } catch (SQLException e) {
            DesktopNotify.showDesktopMessage("Error", e.getMessage(), 8, 8000);
        }
    }

    public static void main(String[] args) {
        Nomina myNomina = new Nomina();

        myNomina.usar();

    }
}
