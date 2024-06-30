package proyectocine;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Empleados {

    JFrame frl;
    JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lb1l0;
    JTextField txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9;
    JButton btn1, btn2, btn3, btn4, btn5, btn6;
    JPanel pan1, pan2, pan3, pan4, pan5, pan6, pan7, pan8, pan9, pan10;

    Connection conex;
    PreparedStatement stmt;
    ResultSet tabla;
    int sw = 0;
    CineconPepe mypepe = new CineconPepe();
    String nulo = "", sql = "";

    public Empleados() {

        frl = new JFrame("Empleados");
        lbl1 = new JLabel("Empleado");
        lbl2 = new JLabel("Nombre");
        lbl3 = new JLabel("Ap. Paterno");
        lbl4 = new JLabel("Ap. Materno");
        lbl5 = new JLabel("Direccion");
        lbl6 = new JLabel("Sueldo");
        lbl7 = new JLabel("Edad");
        lbl8 = new JLabel("Telefono");
        lbl9 = new JLabel("Fec. Nac");
        txt1 = new JTextField(20);
        txt2 = new JTextField(20);
        txt3 = new JTextField(20);
        txt4 = new JTextField(20);
        txt5 = new JTextField(20);
        txt6 = new JTextField(20);
        txt7 = new JTextField(20);
        txt8 = new JTextField(20);
        txt9 = new JTextField(20);
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
        pan10 = new JPanel();
        conex = mypepe.ConectarBD();
    }

    public void usar() {
        frl.setLayout(new GridLayout(10, 1));
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
        pan9.add(lbl9);
        pan9.add(txt9);
        pan10.add(btn1);
        pan10.add(btn2);
        pan10.add(btn3);
        pan10.add(btn4);
        pan10.add(btn5);
        pan10.add(btn6);
        frl.add(pan1);
        frl.add(pan2);
        frl.add(pan3);
        frl.add(pan4);
        frl.add(pan5);
        frl.add(pan6);
        frl.add(pan7);
        frl.add(pan8);
        frl.add(pan9);
        frl.add(pan10);
        frl.pack();
        frl.setLocation(350, 300);
        frl.setVisible(true);

        txt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt1.getText().equals(nulo)) {
                    JOptionPane.showMessageDialog(null, "El Id del Empleado es Obligatorio");
                } else {
                    txt2.requestFocusInWindow();
                }
            }
        });

        txt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt2.getText().equals(nulo)) {
                    JOptionPane.showMessageDialog(null, "El Nombre del Empleado es Obligatorio");
                } else {
                    txt3.requestFocusInWindow();
                }
            }
        });

        txt3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt3.getText().equals(nulo)) {
                    JOptionPane.showMessageDialog(null, "El Ap. Paterno del Empleado es Obligatorio");
                } else {
                    txt4.requestFocusInWindow();
                }
            }
        });

        txt4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt4.getText().equals(nulo)) {
                    JOptionPane.showMessageDialog(null, "El Ap. Materno del Empleado es Obligatorio");
                } else {
                    txt5.requestFocusInWindow();
                }
            }
        });

        txt5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt5.getText().equals(nulo)) {
                    JOptionPane.showMessageDialog(null, "La Direccion del Empleado es Obligatorio");
                } else {
                    txt6.requestFocusInWindow();
                }
            }
        });

        txt6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt6.getText().equals(nulo)) {
                    JOptionPane.showMessageDialog(null, "El Sueldo del Empleado es Obligatorio");
                } else {
                    txt7.requestFocusInWindow();
                }
            }
        });

        txt7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt7.getText().equals(nulo)) {
                    JOptionPane.showMessageDialog(null, "La Edad del Empleado es Obligatorio");
                } else {
                    txt8.requestFocusInWindow();
                }
            }
        });

        txt8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt8.getText().equals(nulo)) {
                    JOptionPane.showMessageDialog(null, "El Telefono del Empleado es Obligatorio");
                } else {
                    txt9.requestFocusInWindow();
                }
            }
        });

        txt9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt9.getText().equals(nulo)) {
                    JOptionPane.showMessageDialog(null, "La Fecha de Nac. del Empleado es Obligatorio");
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
        txt6.setText(nulo);
        txt7.setText(nulo);
        txt8.setText(nulo);
        txt9.setText(nulo);
    }

    public void grabar() {
        try {
            sql = "insert into empleados values(";
            sql += "'" + txt1.getText() + "',";
            sql += "'" + txt2.getText() + "',";
            sql += "'" + txt3.getText() + "',";
            sql += "'" + txt4.getText() + "',";
            sql += "'" + txt5.getText() + "',";
            sql += "'" + txt6.getText() + "',";
            sql += "'" + txt7.getText() + "',";
            sql += "'" + txt8.getText() + "',";
            sql += "'" + txt9.getText() + "')";
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
            sql = "update  empleados set ";
            sql += " nombre='" + txt2.getText() + "',";
            sql += "appat='" + txt3.getText() + "',";
            sql += "appmat='" + txt4.getText() + "',";
            sql += "direc='" + txt5.getText() + "',";
            sql += "sueldo='" + txt6.getText() + "',";
            sql += "edad='" + txt7.getText() + "',";
            sql += "telefono='" + txt8.getText() + "',";
            sql += "fecnac='" + txt9.getText() + "' ";
            sql += "where idempleado=" + "'" + txt1.getText() + "'";
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
            sql = "select * from empleados ";
            sql += "where idempleado=" + "'" + txt1.getText() + "'";
            stmt = conex.prepareStatement(sql);
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
                txt9.setText(tabla.getString(9));
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
            sql = "delete  from empleados ";
            sql += "where idempleado=" + "'" + txt1.getText() + "'";
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
        Empleados myempleados = new Empleados();
        myempleados.usar();
    }
}
