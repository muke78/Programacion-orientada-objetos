package proyectocine;

import proyectocine.Cinecon;
import ds.desktop.notify.DesktopNotify;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Salas {

//Definir los Objetos
    JFrame frl;
    JLabel lbl1, lbl2, lbl3;
    JTextField txt1, txt2, txt3;
    JButton btn1, btn2, btn3, btn4, btn5, btn6;
    JPanel pan1, pan2, pan3, pan9;

    Connection con;
    PreparedStatement stmt;
    ResultSet tabla;
    int sw = 0;
    Cinecon myconexion = new Cinecon();
    String nulo = "", sql = " ";

    public Salas() {
        //CREAR

        frl = new JFrame("Salas");
        lbl1 = new JLabel("Id Salas");
        lbl2 = new JLabel("Id Pelicula");
        lbl3 = new JLabel("Tipo Sala");
        txt1 = new JTextField(20);
        txt2 = new JTextField(20);
        txt3 = new JTextField(20);
        btn1 = new JButton("Nuevo");
        btn2 = new JButton("Grabar");
        btn3 = new JButton("Modificar");
        btn4 = new JButton("Consultar");
        btn5 = new JButton("Borrar");
        btn6 = new JButton("Salir");
        pan1 = new JPanel();
        pan2 = new JPanel();
        pan3 = new JPanel();
        pan9 = new JPanel();
        con = myconexion.conecta();

    }

    public void usar() {
        frl.setLayout(new GridLayout(4, 1));
        pan1.add(lbl1);
        pan1.add(txt1);
        pan2.add(lbl2);
        pan2.add(txt2);
        pan3.add(lbl3);
        pan3.add(txt3);
        pan9.add(btn1);
        pan9.add(btn2);
        pan9.add(btn3);
        pan9.add(btn4);
        pan9.add(btn5);
        pan9.add(btn6);
        frl.add(pan1);
        frl.add(pan2);
        frl.add(pan3);
        frl.add(pan9);
        frl.pack();
        frl.setLocation(600, 350);
        frl.setVisible(true);
        //MENSAJES EMERGENTES

        txt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt1.getText().equals(nulo)) {
                    DesktopNotify.showDesktopMessage("Error", "El Id de la sala es obligatorio", 8, 3000);
                } else {
                    txt2.requestFocusInWindow();
                }
            }
        });
        txt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt2.getText().equals(nulo)) {
                    DesktopNotify.showDesktopMessage("Error", "El Id de la pelicula", 8, 3000);
                } else {
                    txt3.requestFocusInWindow();
                }
            }
        });

        txt3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txt3.getText().equals(nulo)) {
                    DesktopNotify.showDesktopMessage("Error", "El tipo de sala es obligatorio", 8, 3000);
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

        txt1.requestFocusInWindow();
    }

    public void grabar() {
        try {
            sql = "insert into salas values(";
            sql += "'" + txt1.getText() + "',";
            sql += "'" + txt2.getText() + "',";
            sql += "'" + txt3.getText() + "')";

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
            sql = "update salas set ";
            sql += " IDPELICULA='" + txt2.getText() + "',";
            sql += "TIPO_SALA='" + txt3.getText() + "'";
            sql += "where idsala=" + "'" + txt1.getText() + "'";

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
        sw = 0;
        try {
            sql = "select * from salas";
            sql += " where idsala=" + "'" + txt1.getText() + "'";
            stmt = con.prepareStatement(sql);
            tabla = stmt.executeQuery();
            while (tabla.next()) {
                sw = 1;
                txt2.setText(tabla.getString(2));
                txt3.setText(tabla.getString(3));

            }

            if (sw == 0) {
                DesktopNotify.showDesktopMessage("Error", "Registro inexistente", 8, 5000);

            }
        } catch (SQLException e) {
            DesktopNotify.showDesktopMessage(null, e.getMessage(), 8000);
        }
    }

    public void borrar() {
        try {
            sql = "delete from salas  ";
            sql += "where idsala=" + "'" + txt1.getText() + "'";
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
        Salas mysala = new Salas();
        mysala.usar();

    }
}
