package Nomina;

import DAO.Conexion;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Productos {

    JFrame fr1;
    JLabel lbl1, lbl2, lbl3, lbl4;
    JTextField txt1, txt2, txt3, txt4;
    JButton btn1, btn2, btn3, btn4, btn5, btn6;
    JPanel pan1, pan2, pan3, pan4, pan5;

    Connection con;
    PreparedStatement stmt;
    ResultSet tabla;
    Calendar calendario;
    int sw = 0;
    //cambiar
    Conexion myconexion = new Conexion();

    String nulo = "", sql = "", archivo, actual, hora, separador = "|", linea;
    int hora1, minutos, segundos;
    String[] Vold = new String[10];

    public Productos() {
        fr1 = new JFrame("Productos");
        lbl1 = new JLabel("Nombre");
        lbl2 = new JLabel("Existencia");
        lbl3 = new JLabel("Precio");
        lbl4 = new JLabel("Unidad Medida");

        txt1 = new JTextField(20);
        txt2 = new JTextField(20);
        txt3 = new JTextField(20);
        txt4 = new JTextField(20);

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
        //cambiar
        con = myconexion.conecta();
    }

    public void usar() {
        fr1.setLayout(new GridLayout(5, 1));
        pan1.add(lbl1);
        pan1.add(txt1);
        pan2.add(lbl2);
        pan2.add(txt2);
        pan3.add(lbl3);
        pan3.add(txt3);
        pan4.add(lbl4);
        pan4.add(txt4);
        pan5.add(btn1);
        pan5.add(btn2);
        pan5.add(btn3);
        pan5.add(btn4);
        pan5.add(btn5);
        pan5.add(btn6);
        fr1.add(pan1);
        fr1.add(pan2);
        fr1.add(pan3);
        fr1.add(pan4);
        fr1.add(pan5);
        fr1.pack();
        fr1.setLocation(350, 300);
        fr1.setVisible(true);

        txt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt1.getText().equals(nulo)) {
                    JOptionPane.showMessageDialog(null, "El Nombre de los Productos es Obligatorio");
                } else {
                    txt2.requestFocusInWindow();
                }
            }
        });

        txt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt2.getText().equals(nulo)) {
                    JOptionPane.showMessageDialog(null, "El Existencia del Productos es Obligatorio");
                } else {
                    txt3.requestFocusInWindow();
                }
            }
        });

        txt3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt3.getText().equals(nulo)) {
                    JOptionPane.showMessageDialog(null, "El Precio del Producto es Obligatorio");
                } else {
                    txt4.requestFocusInWindow();
                }
            }
        });

        txt4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt4.getText().equals(nulo)) {
                    JOptionPane.showMessageDialog(null, "La Unidad de Medida del Producto es Obligatorio");
                } else {
                    btn2.requestFocusInWindow();
                }
            }
        });

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nuevo();
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                grabar();
            }
        });

        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                modificar();
            }
        });

        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                consultar();
            }
        });

        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                borrar();
            }
        });

        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                salir();
            }
        });
    }

    public void nuevo() {
        txt1.setText(nulo);
        txt2.setText(nulo);
        txt3.setText(nulo);
        txt4.setText(nulo);
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
            sql = "CALL FATIMA01(";
            sql += "\"" + txt1.getText() + "\",";
            sql += "\"" + txt2.getText() + "\",";
            sql += "\"" + txt3.getText() + "\",";
            sql += "\"" + txt4.getText() + "\")";
            stmt = con.prepareStatement(sql);
            sw = stmt.executeUpdate();
            java.util.Date fechaactual = new java.util.Date();
            SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd");
            actual = sfd.format(fechaactual);
            linea = actual + separador + hora + separador + "100" + separador + "insert" + separador + "NOMBRE" + separador + "0" + separador + txt1.getText() + separador + "Es un insert\n";
            linea += actual + separador + hora + separador + "100" + separador + "insert" + separador + "EXISTENCIA" + separador + "0" + separador + txt2.getText() + separador + "Es un insert\n";
            linea += actual + separador + hora + separador + "100" + separador + "insert" + separador + "PRECIO" + separador + "0" + separador + txt3.getText() + separador + "Es un insert\n";
            linea += actual + separador + hora + separador + "100" + separador + "insert" + separador + "UNIDADMEDIDA" + separador + "0" + separador + txt4.getText() + separador + "Es un insert\n";
            grabararchivo(linea);
            if (sw != 0) {
                JOptionPane.showMessageDialog(null, "Registro Insertado con exito");
                nuevo();
            }
        } catch (SQLException | IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
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
            sql = "CALL FATIMA02(";
            sql += "\"" + txt1.getText() + "\",";
            sql += "\"" + txt2.getText() + "\",";
            sql += "\"" + txt3.getText() + "\",";
            sql += "\"" + txt4.getText() + "\")";
            stmt = con.prepareStatement(sql);
            sw = stmt.executeUpdate();
            java.util.Date fechaactual = new java.util.Date();
            SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd");
            actual = sfd.format(fechaactual);
            linea = actual + separador + hora + separador + "200" + separador + "update" + separador + "NOMBRE" + separador + Vold[1] + separador + txt1.getText() + separador + "Es un update\n";
            linea += actual + separador + hora + separador + "200" + separador + "update" + separador + "EXISTENCIA" + separador + Vold[2] + separador + txt2.getText() + separador + "Es un update\n";
            linea += actual + separador + hora + separador + "200" + separador + "update" + separador + "PRECIO" + separador + Vold[3] + separador + txt3.getText() + separador + "Es un update\n";
            linea += actual + separador + hora + separador + "200" + separador + "update" + separador + "UNIDADMEDIDA" + separador + Vold[4] + separador + txt4.getText() + separador + "Es un update\n";
             grabararchivo(linea);
            if (sw != 0) {
                JOptionPane.showMessageDialog(null, "Registro Modificado con exito");
                nuevo();
            }
        } catch (SQLException | IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void consultar() {
       sw = 0;
        try {
            sql = "CALL FATIMA03(";
            sql += "\"" + txt1.getText() + "\")";
            stmt = con.prepareStatement(sql);
            tabla = stmt.executeQuery();
            while (tabla.next()) {
                  sw = 1;
                txt2.setText(tabla.getString(2));
                txt3.setText(tabla.getString(3));
                txt4.setText(tabla.getString(4));
                Vold[1] = tabla.getString(1);
                Vold[2] = tabla.getString(2);
                Vold[3] = tabla.getString(3);
                Vold[4] = tabla.getString(4);
            }
             if (sw == 0) {
                JOptionPane.showMessageDialog(null,"Registro inexistente");

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
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
            sql = "CALL FATIMA04(";
            sql += "\"" + txt1.getText() + "\")";
            stmt = con.prepareStatement(sql);
            sw = stmt.executeUpdate();
            java.util.Date fechaactual = new java.util.Date();
            SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd");
            actual = sfd.format(fechaactual);
            linea = actual + separador + hora + separador + "300" + separador + "delete" + separador + "NOMBRE" + separador + Vold[1] + separador + "0" + separador + "Es un delete\n";
            grabararchivo(linea);

            if (sw != 0) {
                JOptionPane.showMessageDialog(null, "Se a Borrado con exito");
                nuevo();
            }
        } catch (SQLException | IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void salir() {
        int salir = JOptionPane.showConfirmDialog(null, "En verdad deseas salir");
        if (salir == 0) {
            System.exit(0);
        }
    }

    public void grabararchivo(String linea) throws FileNotFoundException, IOException {
        archivo = "C:/Users/M U K E/Documents/Bases de datos AVANZADAS/Log/Procedimientos.txt";
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
        Productos myempleados = new Productos();
        myempleados.usar();
    }
}
