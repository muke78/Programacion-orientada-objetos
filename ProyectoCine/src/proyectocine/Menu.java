package proyectocine;
//import cineoracle.Conexion;

import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import ds.desktop.notify.*;

public class Menu {

    JFrame fr1;
    JLabel lbl1, lbl2, lbl3, lbl4, lbl5;
    JTextField txt1, txt2, txt3, txt4, txt5;
    JButton btn1, btn2, btn3, btn4, btn5, btn6;
    JPanel pan1, pan2, pan3, pan4, pan5, pan6;

    Connection conix;
    PreparedStatement atmt;
    ResultSet tabla;
    int sw = 0;
    CineconJesus myjesus = new CineconJesus();

    String nulo = "", sql = "";

    public Menu() {
        fr1 = new JFrame("==MENU==");
        lbl1 = new JLabel("IDMENU");
        lbl2 = new JLabel("IDPRODUCTO");
        lbl3 = new JLabel("CATEGORIA");
        lbl4 = new JLabel("COSTO");

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
        conix = myjesus.conecta();
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

                    DesktopNotify.showDesktopMessage("Error", "El ID del MENU es obligatorio", 1, 3000);//numero 2 se refiere ala imagen en ds.desktop.notify.img
                } else {
                    txt2.requestFocusInWindow();
                }
            }
        });

        txt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt2.getText().equals(nulo)) {
                    JOptionPane.showMessageDialog(null, "El ID del Producto es Obligatorio");
                } else {
                    txt3.requestFocusInWindow();
                }
            }
        });

        txt3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt3.getText().equals(nulo)) {
                    JOptionPane.showMessageDialog(null, "La Categoria es Obligatoria");
                } else {
                    txt4.requestFocusInWindow();
                }
            }
        });

        txt4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt4.getText().equals(nulo)) {
                    JOptionPane.showMessageDialog(null, "El Costo es Obligatorio");
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
        try {

            sql = "Insert into CINE.MENU values(";
            sql += txt1.getText() + ",";
            sql += txt2.getText() + ",";
            sql += "'" + txt3.getText() + "',";
            sql += txt4.getText() + ")";
            System.out.print(sql);
            atmt = conix.prepareStatement(sql);
            sw = atmt.executeUpdate();
            if (sw != 0) {
                JOptionPane.showMessageDialog(null, "Registro insertado con exito.");
                nuevo();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void modificar() {
        try {
            sql = "update cine.menu set ";
            sql += " IDPRODUCTO=" + txt2.getText() + ",";
            sql += "CATEGORIA='" + txt3.getText() + "',";
            sql += "COSTO=" + txt4.getText();
            sql += "Where IDPRODUCTO=" + txt1.getText();
            atmt = conix.prepareStatement(sql);
            sw = atmt.executeUpdate();
            if (sw != 0) {
                JOptionPane.showMessageDialog(null, "Registro Modificado con exito");
                nuevo();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void consultar() {
        try {
            sql = "select * from CINE.MENU ";
            sql += "Where IDMENU=" + txt1.getText();
            atmt = conix.prepareStatement(sql);
            tabla = atmt.executeQuery();
            while (tabla.next()) {
                txt2.setText(tabla.getString(2));
                txt3.setText(tabla.getString(3));
                txt4.setText(tabla.getString(4));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void borrar() {
        try {
            sql = "delete from CINE.MENU ";
            sql += "Where IDMENU=" + txt1.getText();
            atmt = conix.prepareStatement(sql);

            sw = atmt.executeUpdate();

            if (sw != 0) {
                JOptionPane.showMessageDialog(null, "Se a Borrado con exito");
                nuevo();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void salir() {
        int salir = JOptionPane.showConfirmDialog(null, "En verdad deseas salir");
        if (salir == 0) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Menu mymenu = new Menu();
        mymenu.usar();
    }
}
