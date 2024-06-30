package Nomina;

import DAO.Conexion;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import ds.desktop.notify.*;

public class RecuEmpleados {

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
    String nulo = "", sql = " ";

    public RecuEmpleados() {
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
        try {
            sql = "CALL INSERTEMP(";
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
            if (sw != 0) {
                DesktopNotify.showDesktopMessage("Hecho", "Registro insertado con exito", 7, 5000);
                nuevo();
            }
        } catch (SQLException e) {
            DesktopNotify.showDesktopMessage(null, e.getMessage(), 8000);

        }
    }

    public void modificar() {
        try {
            sql = "CALL MODEMP(";
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
            if (sw != 0) {
                DesktopNotify.showDesktopMessage("Hecho", "Registro actualizado con exito", 7, 5000);
                nuevo();
            }
        } catch (SQLException e) {
            DesktopNotify.showDesktopMessage(null, e.getMessage(), 8000);

        }
    }

    public void consultar() {
        try {
            sql = "CALL CONSUEMP(";
            sql += "\"" + txt1.getText() + "\")";
            stmt = con.prepareStatement(sql);
            tabla = stmt.executeQuery();
            while (tabla.next()) {
                txt2.setText(tabla.getString(2));
                txt3.setText(tabla.getString(3));
                txt4.setText(tabla.getString(4));
                txt5.setText(tabla.getString(5));
                txt6.setText(tabla.getString(6));

                txt7.setText(tabla.getString(7));
                txt8.setText(tabla.getString(8));
            }
        } catch (SQLException e) {
            DesktopNotify.showDesktopMessage("Error", "Registro inexistente", 8, 5000);
        }
    }

    public void borrar() {
        try {
            sql = "CALL DELEMP(";
            sql += "\"" + txt1.getText() + "\")";
            stmt = con.prepareStatement(sql);

            sw = stmt.executeUpdate();
            if (sw != 0) {
                DesktopNotify.showDesktopMessage("Hecho", "Registro borrado con exito", 7, 5000);
                nuevo();
            }
        } catch (SQLException e) {
            DesktopNotify.showDesktopMessage("Error", e.getMessage(), 8, 8000);

        }
    }

    public void salir() {
        int salir = JOptionPane.showConfirmDialog(null, "En verdad deseas salir");
        if (salir == 0) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        RecuEmpleados myempleados = new RecuEmpleados();
        myempleados.usar();

    }

}
