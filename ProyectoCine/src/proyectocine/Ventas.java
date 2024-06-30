package proyectocine;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventas {

    JFrame frl;
    JLabel lbl1, lbl2, lbl3, lbl4, lbl5;
    JTextField txt1, txt2, txt3, txt4, txt5;
    JButton btn1, btn2, btn3, btn4, btn5, btn6;
    JPanel pan1, pan2, pan3, pan4, pan5, pan6;

    Connection conex;
    PreparedStatement stmt;
    ResultSet tabla;
    int sw = 0;
    CineconPepe mypepe = new CineconPepe();
    String nulo = "", sql = "";

    public Ventas() {

        frl = new JFrame("Ventas");
        lbl1 = new JLabel("Id Venta");
        lbl2 = new JLabel("Id Producto");
        lbl3 = new JLabel("Fecha");
        lbl4 = new JLabel("Cantidad");
        lbl5 = new JLabel("Importe");
        txt1 = new JTextField(20);
        txt2 = new JTextField(20);
        txt3 = new JTextField(20);
        txt4 = new JTextField(20);
        txt5 = new JTextField(20);
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
        conex = mypepe.ConectarBD();
    }

    public void usar() {
        frl.setLayout(new GridLayout(6, 1));
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
        pan6.add(btn1);
        pan6.add(btn2);
        pan6.add(btn3);
        pan6.add(btn4);
        pan6.add(btn5);
        pan6.add(btn6);
        frl.add(pan1);
        frl.add(pan2);
        frl.add(pan3);
        frl.add(pan4);
        frl.add(pan5);
        frl.add(pan6);
        frl.pack();
        frl.setLocation(200, 200);
        frl.setVisible(true);

        txt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt1.getText().equals(nulo)) {
                    JOptionPane.showMessageDialog(null, "El Id de la Venta es Obligatorio");
                } else {
                    txt2.requestFocusInWindow();
                }
            }
        });

        txt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt2.getText().equals(nulo)) {
                    JOptionPane.showMessageDialog(null, "El Id del Producto es Obligatorio");
                } else {
                    txt3.requestFocusInWindow();
                }
            }
        });

        txt3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt3.getText().equals(nulo)) {
                    JOptionPane.showMessageDialog(null, "La Fecha de la Venta es Obligatorio");
                } else {
                    txt4.requestFocusInWindow();
                }
            }
        });

        txt4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt4.getText().equals(nulo)) {
                    JOptionPane.showMessageDialog(null, "La cantidad de la Venta es Obligatorio");
                } else {
                    txt5.requestFocusInWindow();
                }
            }
        });

        txt5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt5.getText().equals(nulo)) {
                    JOptionPane.showMessageDialog(null, "El Importe de la Venta es Obligatorio");
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
        txt5.setText(nulo);
    }

    public void grabar() {
        try {
            sql = "insert into ventas values(";
            sql += "'" + txt1.getText() + "',";
            sql += "'" + txt2.getText() + "',";
            sql += "'" + txt3.getText() + "',";
            sql += "'" + txt4.getText() + "',";
            sql += "'" + txt5.getText() + "')";
            stmt = conex.prepareStatement(sql);
            System.out.println(sql);
            sw = stmt.executeUpdate();
            if (sw != 0) {
                JOptionPane.showMessageDialog(null, "Registro Insertado con Exito");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void modificar() {
        try {
            sql = "update  ventas set ";
            sql += " idproducto='" + txt2.getText() + "',";
            sql += "fecha='" + txt3.getText() + "',";
            sql += "cantidad='" + txt4.getText() + "',";
            sql += "importe='" + txt5.getText() + "',";
            sql += "where idventa=" + "'" + txt1.getText() + "'";
            stmt = conex.prepareStatement(sql);
            sw = stmt.executeUpdate();
            if (sw != 0) {
                JOptionPane.showMessageDialog(null, "Registro Actualizado con Exito");
                nuevo();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void consultar() {
        sw = 0;
        try {
            sql = "select * from ventas ";
            sql += "where idventa=" + "'" + txt1.getText() + "'";
            stmt = conex.prepareStatement(sql);
            tabla = stmt.executeQuery();
            while (tabla.next()) {
                sw = 1;
                txt2.setText(tabla.getString(2));
                txt3.setText(tabla.getString(3));
                txt4.setText(tabla.getString(4));
                txt5.setText(tabla.getString(5));
            }
            if (sw == 0) {
                JOptionPane.showMessageDialog(null, "Registro Inexistente");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void borrar() {
        try {
            sql = "delete  from ventas ";
            sql += "where idventa=" + "'" + txt1.getText() + "'";
            stmt = conex.prepareStatement(sql);
            sw = stmt.executeUpdate();
            if (sw != 0) {
                JOptionPane.showMessageDialog(null, "Registro Borrado con Exito");
                nuevo();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void salir() {
        int salir = JOptionPane.showConfirmDialog(pan1, "En verdad desea salir");
        if (salir == 0) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Ventas myventas = new Ventas();
        myventas.usar();
    }
}
