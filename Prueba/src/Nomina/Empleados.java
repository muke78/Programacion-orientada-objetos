package Nomina;

import DAO.Conexion;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import ds.desktop.notify.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Empleados {

    //Definir los Objetos
    JFrame frl;
    JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8;
    JTextField txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8;
    JButton btn1, btn2, btn3, btn4, btn5, btn6;
    JPanel pan1, pan2, pan3, pan4, pan5, pan6, pan7, pan8, pan9;

    Connection con;
    PreparedStatement stmt;
    ResultSet tabla;
    int sw = 0;
    Conexion myconexion = new Conexion();
    Calendar calendario;
    String nulo = "", sql = "", archivo, actual, hora, separador = "|", linea;
    int hora1, minutos, segundos;
    String[] Vold = new String[10];

    public Empleados() {
        //CREAR

        frl = new JFrame("Empleado");
        lbl1 = new JLabel("Empleado");
        lbl2 = new JLabel("Nombre");
        lbl3 = new JLabel("Ap. Paterno");
        lbl4 = new JLabel("Ap.Materno");
        lbl5 = new JLabel("Direccion");
        lbl6 = new JLabel("Sueldo");
        lbl7 = new JLabel("Edad");
        lbl8 = new JLabel("Fec.Nacimiento");
        txt1 = new JTextField(20);
        txt2 = new JTextField(20);
        txt3 = new JTextField(20);
        txt4 = new JTextField(20);
        txt5 = new JTextField(20);
        txt6 = new JTextField(20);
        txt7 = new JTextField(20);
        txt8 = new JTextField(20);
        btn1 = new JButton("Nuevo");
        btn2 = new JButton("Grabar");
        btn3 = new JButton("Modificar");
        btn4 = new JButton("Consultar");
        btn5 = new JButton("Borrar");
        btn6 = new JButton("Salir");
        pan1 = new JPanel();
        pan2 = new JPanel();
        pan3 = new JPanel();
        pan4 = new JPanel();
        pan5 = new JPanel();
        pan6 = new JPanel();
        pan7 = new JPanel();
        pan8 = new JPanel();
        pan9 = new JPanel();
        con = myconexion.conecta();

    }

    public void usar() {
        frl.setLayout(new GridLayout(9, 1));
        pan1.add(lbl1);
        pan1.add(txt1);
        pan2.add(lbl2);
        pan2.add(txt2);
        pan3.add(lbl3);
        pan3.add(txt3);
        pan4.add(lbl4);
        pan4.add(txt4);
        pan5.add(lbl5);
        pan5.add(txt5);
        pan6.add(lbl6);
        pan6.add(txt6);
        pan7.add(lbl7);
        pan7.add(txt7);
        pan8.add(lbl8);
        pan8.add(txt8);
        pan9.add(btn1);
        pan9.add(btn2);
        pan9.add(btn3);
        pan9.add(btn4);
        pan9.add(btn5);
        pan9.add(btn6);
        frl.add(pan1);
        frl.add(pan2);
        frl.add(pan3);
        frl.add(pan4);
        frl.add(pan5);
        frl.add(pan6);
        frl.add(pan7);
        frl.add(pan8);
        frl.add(pan9);
        frl.pack();
        frl.setLocation(350, 300);
        frl.setVisible(true);
        //MENSAJES EMERGENTES

        txt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt1.getText().equals(nulo)) {
                    DesktopNotify.showDesktopMessage("Error", "El Id del empleado es Obligatorio", 8, 3000);
                } else {
                    txt2.requestFocusInWindow();
                }
            }
        });
        txt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt2.getText().equals(nulo)) {
                    DesktopNotify.showDesktopMessage("Error", "El Nombre del empleado es obligatorio", 8, 3000);
                } else {
                    txt3.requestFocusInWindow();
                }
            }
        });

        txt3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt3.getText().equals(nulo)) {
                    DesktopNotify.showDesktopMessage("Error", "El Apellido Paterno es obligatorio", 8, 3000);
                } else {
                    txt4.requestFocusInWindow();
                }
            }
        });

        txt4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt4.getText().equals(nulo)) {
                    DesktopNotify.showDesktopMessage("Error", "El Apellido Materno es obligatorio", 8, 3000);
                } else {
                    txt5.requestFocusInWindow();
                }
            }
        });
        txt5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt5.getText().equals(nulo)) {
                    DesktopNotify.showDesktopMessage("Error", "La direccion es obligatoria", 8, 3000);
                } else {
                    txt6.requestFocusInWindow();
                }
            }
        });
        txt6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt6.getText().equals(nulo)) {
                    DesktopNotify.showDesktopMessage("Error", "El sueldo es obligatorio", 8, 3000);
                } else {
                    txt7.requestFocusInWindow();
                }
            }
        });
        txt7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt7.getText().equals(nulo)) {
                    DesktopNotify.showDesktopMessage("Error", "La edad es obligatoria", 8, 3000);
                } else {
                    txt8.requestFocusInWindow();
                }
            }
        });
        txt8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt8.getText().equals(nulo)) {
                    DesktopNotify.showDesktopMessage("Error", "La fecha de nacimiento es obligatoria", 8, 3000);
                } else {
                    btn2.requestFocusInWindow();
                }
            }
        });
        //MENSAJES EMERGENTES BOTONES
        btn1.addActionListener((ActionEvent e) -> {
            nuevo();
        });
        btn2.addActionListener((ActionEvent e) -> {
            grabar();
        });
        btn3.addActionListener((ActionEvent e) -> {
            modificar();
        });
        btn4.addActionListener((ActionEvent e) -> {
            consultar();
        });
        btn5.addActionListener((ActionEvent e) -> {
            borrar();
        });
        btn6.addActionListener((ActionEvent e) -> {
            salir();
        });

    }

    //METODOS DE MENSAJE EMERGENTE BTN
    public void nuevo() {
        txt1.setText(nulo);
        txt2.setText(nulo);
        txt3.setText(nulo);
        txt4.setText(nulo);
        txt5.setText(nulo);
        txt6.setText(nulo);
        txt7.setText(nulo);
        txt8.setText(nulo);
        txt1.requestFocusInWindow();
    }

    public void grabar() {
        calendario = new GregorianCalendar();
        hora1 = calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        if (hora1 < 10) {
            hora = "0" + String.valueOf(hora1);
        } else {
            hora = String.valueOf(hora1);
        }
        if (minutos < 10) {
            hora += ":0" + String.valueOf(minutos);
        } else {
            hora += ":" + String.valueOf(minutos);
        }
        if (segundos < 10) {
            hora += ":0" + String.valueOf(segundos);
        } else {
            hora += ":" + String.valueOf(segundos);
        }

        try {
            sql = "insert into empleados values(";
            sql += "\"" + txt1.getText() + "\",";
            sql += "\"" + txt2.getText() + "\",";
            sql += "\"" + txt3.getText() + "\",";
            sql += "\"" + txt4.getText() + "\",";
            sql += "\"" + txt5.getText() + "\",";
            sql += "\"" + txt6.getText() + "\",";
            sql += "\"" + txt7.getText() + "\",";
            sql += "\"" + txt8.getText() + "\")";

            stmt = con.prepareStatement(sql);
            sw = stmt.executeUpdate();
            java.util.Date fechaactual = new java.util.Date();
            SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd");
            actual = sfd.format(fechaactual);
            linea = actual + separador + hora + separador + "100" + separador + "insert" + separador + "IdEmpledo" + separador + "0" + separador + txt1.getText() + separador + "Es un insert\n";
            linea += actual + separador + hora + separador + "100" + separador + "insert" + separador + "Nombre" + separador + "0" + separador + txt2.getText() + separador + "Es un insert\n";
            linea += actual + separador + hora + separador + "100" + separador + "insert" + separador + "Appat" + separador + "0" + separador + txt3.getText() + separador + "Es un insert\n";
            linea += actual + separador + hora + separador + "100" + separador + "insert" + separador + "Appmat" + separador + "0" + separador + txt4.getText() + separador + "Es un insert\n";
            linea += actual + separador + hora + separador + "100" + separador + "insert" + separador + "Direc" + separador + "0" + separador + txt5.getText() + separador + "Es un insert\n";
            linea += actual + separador + hora + separador + "100" + separador + "insert" + separador + "Sueldo" + separador + "0" + separador + txt6.getText() + separador + "Es un insert\n";
            linea += actual + separador + hora + separador + "100" + separador + "insert" + separador + "Edad" + separador + "0" + separador + txt7.getText() + separador + "Es un insert\n";
            linea += actual + separador + hora + separador + "100" + separador + "insert" + separador + "Fecnac" + separador + "0" + separador + txt8.getText() + separador + "Es un insert\n";
            grabararchivo(linea);
            if (sw != 0) {

                DesktopNotify.showDesktopMessage("Hecho", "Registro insertado con exito", 7, 5000);
                nuevo();
            }
        } catch (SQLException | IOException e) {
            DesktopNotify.showDesktopMessage(null, e.getMessage(), 8000);

        }
    }

    public void modificar() {
        calendario = new GregorianCalendar();
        hora1 = calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        if (hora1 < 10) {
            hora = "0" + String.valueOf(hora1);
        } else {
            hora = String.valueOf(hora1);
        }
        if (minutos < 10) {
            hora += ":0" + String.valueOf(minutos);
        } else {
            hora += ":" + String.valueOf(minutos);
        }
        if (segundos < 10) {
            hora += ":0" + String.valueOf(segundos);
        } else {
            hora += ":" + String.valueOf(segundos);
        }
        try {
            sql = "update empleados set ";
            sql += " nombre=\"" + txt2.getText() + "\",";
            sql += " appat=\"" + txt3.getText() + "\",";
            sql += " appmat=\"" + txt4.getText() + "\",";
            sql += " direc=\"" + txt5.getText() + "\",";
            sql += " sueldo=\"" + txt6.getText() + "\",";
            sql += " edad=\"" + txt7.getText() + "\",";
            sql += " fecnac=\"" + txt8.getText() + "\" ";
            sql += " where idempleado = " + "\"" + txt1.getText() + "\"";

            stmt = con.prepareStatement(sql);
            sw = stmt.executeUpdate();
            java.util.Date fechaactual = new java.util.Date();
            SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd");
            actual = sfd.format(fechaactual);
            linea = actual + separador + hora + separador + "200" + separador + "update" + separador + "IdEmpledo" + separador + Vold[1] + separador + txt1.getText() + separador + "Es un update\n";
            linea += actual + separador + hora + separador + "200" + separador + "update" + separador + "Nombre" + separador + Vold[2] + separador + txt2.getText() + separador + "Es un update\n";
            linea += actual + separador + hora + separador + "200" + separador + "update" + separador + "Appat" + separador + Vold[3] + separador + txt3.getText() + separador + "Es un update\n";
            linea += actual + separador + hora + separador + "200" + separador + "update" + separador + "Appmat" + separador + Vold[4] + separador + txt4.getText() + separador + "Es un update\n";
            linea += actual + separador + hora + separador + "200" + separador + "update" + separador + "Direc" + separador + Vold[5] + separador + txt5.getText() + separador + "Es un update\n";
            linea += actual + separador + hora + separador + "200" + separador + "update" + separador + "Sueldo" + separador + Vold[6] + separador + txt6.getText() + separador + "Es un update\n";
            linea += actual + separador + hora + separador + "200" + separador + "update" + separador + "Edad" + separador + Vold[7] + separador + txt7.getText() + separador + "Es un update\n";
            linea += actual + separador + hora + separador + "200" + separador + "update" + separador + "Fecnac" + separador + Vold[8] + separador + txt8.getText() + separador + "Es un update\n";
            grabararchivo(linea);
            if (sw != 0) {
                DesktopNotify.showDesktopMessage("Hecho", "Registro actualizado con exito", 7, 5000);
                nuevo();
            }
        } catch (SQLException | IOException e) {
            DesktopNotify.showDesktopMessage(null, e.getMessage(), 8000);

        }
    }

    public void consultar() {
        sw = 0;
        try {
            sql = "select * from empleados";
            sql += " where idempleado=" + "\"" + txt1.getText() + "\"";
            stmt = con.prepareStatement(sql);
            tabla = stmt.executeQuery();
            while (tabla.next()) {
                sw = 1;
                txt2.setText(tabla.getString(2));
                txt3.setText(tabla.getString(3));
                txt4.setText(tabla.getString(4));
                txt5.setText(tabla.getString(5));
                txt6.setText(tabla.getString(6));
                txt7.setText(tabla.getString(7));
                txt8.setText(tabla.getString(8));
                Vold[1] = tabla.getString(1);
                Vold[2] = tabla.getString(2);
                Vold[3] = tabla.getString(3);
                Vold[4] = tabla.getString(4);
                Vold[5] = tabla.getString(5);
                Vold[6] = tabla.getString(6);
                Vold[7] = tabla.getString(7);
                Vold[8] = tabla.getString(8);
            }

            if (sw == 0) {
                DesktopNotify.showDesktopMessage("Error", "Registro inexistente", 8, 5000);

            }
        } catch (SQLException e) {
            DesktopNotify.showDesktopMessage(null, e.getMessage(), 8000);
        }
    }

    public void borrar() {
        calendario = new GregorianCalendar();
        hora1 = calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        if (hora1 < 10) {
            hora = "0" + String.valueOf(hora1);
        } else {
            hora = String.valueOf(hora1);
        }
        if (minutos < 10) {
            hora += ":0" + String.valueOf(minutos);
        } else {
            hora += ":" + String.valueOf(minutos);
        }
        if (segundos < 10) {
            hora += ":0" + String.valueOf(segundos);
        } else {
            hora += ":" + String.valueOf(segundos);
        }
        try {
            sql = "delete from empleados ";
            sql += "where idempleado=" + "\"" + txt1.getText() + "\"";
            stmt = con.prepareStatement(sql);
            sw = stmt.executeUpdate();
            java.util.Date fechaactual = new java.util.Date();
            SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd");
            actual = sfd.format(fechaactual);
            linea = actual + separador + hora + separador + "300" + separador + "delete" + separador + "IdEmpledo" + separador + Vold[1] + separador + "0" + separador + "Es un delete\n";
            grabararchivo(linea);
            if (sw != 0) {
                DesktopNotify.showDesktopMessage("Hecho", "Registro borrado con exito", 7, 5000);
                nuevo();
            }
        } catch (SQLException | IOException e) {
            DesktopNotify.showDesktopMessage("Error", e.getMessage(), 8, 8000);

        }
    }

    public void salir() {
        int salir = JOptionPane.showConfirmDialog(null, "En verdad deseas salir");
        if (salir == 0) {
            System.exit(0);
        }
    }

    public void grabararchivo(String linea) throws FileNotFoundException, IOException {
        archivo = "C:/Users/M U K E/Documents/Bases de datos AVANZADAS/Log/Log.txt";
        FileWriter fichero = new FileWriter(archivo, true);
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(fichero);
            pw.println(linea);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Empleados myempleados = new Empleados();
        myempleados.usar();

    }

}
