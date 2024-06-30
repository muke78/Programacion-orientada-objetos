package Ventas;

import DAO.Conexion;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Productos {

    //Definir los Objetos
    JFrame frl;
    JLabel lbl1, lbl2, lbl3, lbl4;
    JTextField txt1, txt2, txt3, txt4;
    JButton btn1, btn2, btn3, btn4, btn5, btn6;
    JPanel pan1, pan2, pan3, pan4, pan5, pan6, pan7, pan8, pan9;

    Connection con;
    PreparedStatement stmt;
    ResultSet tabla;
    int sw = 0;
    Conexion myconexion = new Conexion();
    String nulo = "", sql = "";

    public Productos() {
        //CREAR

        frl = new JFrame("Productos");
        lbl1 = new JLabel("Producto");
        lbl2 = new JLabel("Nombre");
        lbl3 = new JLabel("Existencia");
        lbl4 = new JLabel("Unidad de Medida");
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
        pan6 = new JPanel();
        pan7 = new JPanel();
        pan8 = new JPanel();
        pan9 = new JPanel();
        con = myconexion.conecta();
    }

    public void usar() {
        frl.setLayout(new GridLayout(5,1));
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
        frl.add(pan1);
        frl.add(pan2);
        frl.add(pan3);
        frl.add(pan4);
        frl.add(pan5);
        frl.pack();
        frl.setLocation(350, 300);
        frl.setVisible(true);
        //MENSAJES EMERGENTES
        txt1.addActionListener((ActionEvent e) -> {
            if (txt1.getText().equals(nulo)) {
                JOptionPane.showMessageDialog(null, "El ID del Producto es obligatorio");
            } else {
                txt2.requestFocusInWindow();
            }
        });
        txt2.addActionListener((ActionEvent e) -> {
            if (txt2.getText().equals(nulo)) {
                JOptionPane.showMessageDialog(null, "El Nombre del producto es obligatorio");
            } else {
                txt3.requestFocusInWindow();
            }
        });
        txt3.addActionListener((ActionEvent e) -> {
            if (txt3.getText().equals(nulo)) {
                JOptionPane.showMessageDialog(null, "La existencia del producto es obligatorio");
            } else {
                txt4.requestFocusInWindow();
            }
        });
         txt4.addActionListener((ActionEvent e) -> {
             if (txt4.getText().equals(nulo)) {
                 JOptionPane.showMessageDialog(null, "La unidad de medida es obligatorio");
             } else {
                 btn1.requestFocusInWindow();
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
        txt1.requestFocusInWindow();
    }

    public void grabar() {
        try {
            sql = "insert into productos values(";
            sql += "\"" + txt1.getText() + "\",";
            sql += "\"" + txt2.getText() + "\",";
            sql += "\"" + txt3.getText() + "\",";
            sql += "\"" + txt4.getText() + "\")";
            

            stmt = con.prepareStatement(sql);
            sw = stmt.executeUpdate();
            if (sw != 0) {
                JOptionPane.showMessageDialog(null, "Registro insertado con exito");
                nuevo();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }

    public void modificar() {
        try {
            sql = "update productos set ";
            sql += " nombre=\"" + txt2.getText() + "\",";
            sql += " existencia=\"" + txt3.getText() + "\",";
            sql += " unidadmedida=\"" + txt4.getText() + "\" ";
            sql += " where idproducto= " + "\"" + txt1.getText() + "\"";

            stmt = con.prepareStatement(sql);
            sw = stmt.executeUpdate();
            if (sw != 0) {
            JOptionPane.showMessageDialog(null, "Registro actualizado con exito");
                nuevo();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }

    public void consultar() {
        sw = 0;
        try {
            sql = "select * from productos";
            sql += " where idproducto=" + "\"" + txt1.getText() + "\"";
            stmt = con.prepareStatement(sql);
            tabla = stmt.executeQuery();
            while (tabla.next()) {
                sw = 1;
                txt2.setText(tabla.getString(2));
                txt3.setText(tabla.getString(3));
                txt4.setText(tabla.getString(4));
               
            }

            if (sw == 0) {
                JOptionPane.showMessageDialog(null, "Registro inexistente");

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }

    public void borrar() {
        try {
            sql = "delete from productos ";
            sql += "where idproducto=" + "\"" + txt1.getText() + "\"";
            stmt = con.prepareStatement(sql);
            sw = stmt.executeUpdate();
            if (sw != 0) {
                JOptionPane.showMessageDialog(null, "Registro borrado con exito");
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
        Productos myproductos = new Productos();
        myproductos.usar();
    }
}
