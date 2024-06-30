package DAO;

import DAO.Conexion;

import ds.desktop.notify.DesktopNotify;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Encriptacion{

    //Definir los Objetos
    JFrame frl;
    JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10;
    JTextField txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10;
    JButton btn1, btn2, btn3, btn4, btn5, btn6;
    JPanel pan1, pan2, pan3, pan4, pan5, pan6, pan7, pan8, pan9, pan10, pan11;

    Connection con;
    PreparedStatement stmt;
    ResultSet tabla;
    int sw = 0;
    Conexion myconexion = new Conexion();
    String nulo = "", sql = " ";

    public Encriptacion() {
        //CREAR

        frl = new JFrame("PROGRAMA DE ENCRIPTACION");
        lbl1 = new JLabel("ID EQUIPO");
        lbl2 = new JLabel("NOMBRE");
        lbl3 = new JLabel("PROPIETARIO");
        lbl4 = new JLabel("DIRECCION");
        lbl5 = new JLabel("ESTADIO");
        lbl6 = new JLabel("VALORDEEQUIPO");
        lbl7 = new JLabel("PAGINA");
        lbl8 = new JLabel("EMAIL");
        lbl9 = new JLabel("NACIONALIDAD");
        lbl10 = new JLabel("NOJUGADORES");
        txt1 = new JTextField(20);
        txt2 = new JTextField(20);
        txt3 = new JTextField(20);
        txt4 = new JTextField(20);
        txt5 = new JTextField(20);
        txt6 = new JTextField(20);
        txt7 = new JTextField(20);
        txt8 = new JTextField(20);
        txt9 = new JTextField(20);
        txt10 = new JTextField(20);
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
        pan11 = new JPanel();
        con = myconexion.conecta();
    }

    public void usar() {
        frl.setLayout(new GridLayout(11, 1));
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
        pan10.add(lbl10);
        pan10.add(txt10);
        pan11.add(btn1);
        pan11.add(btn2);
        pan11.add(btn3);
        pan11.add(btn4);
        pan11.add(btn5);
        pan11.add(btn6);
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
        frl.add(pan11);
        frl.pack();
        frl.setLocation(350, 300);
        frl.setVisible(true);
        //MENSAJES EMERGENTES
        txt1.addActionListener((ActionEvent e) -> {
            if (txt1.getText().equals(nulo)) {
                DesktopNotify.showDesktopMessage("Error","El ID del equipo es obligatorio", 8, 5000);
            } else {
                txt2.requestFocusInWindow();
            }
        });
        txt2.addActionListener((ActionEvent e) -> {
            if (txt2.getText().equals(nulo)) {
                
                DesktopNotify.showDesktopMessage("Error","El Nombre del equipo es obligatorio", 8, 5000);
            } else {
                txt3.requestFocusInWindow();
            }
        });
        txt3.addActionListener((ActionEvent e) -> {
            if (txt3.getText().equals(nulo)) {
                DesktopNotify.showDesktopMessage("Error","El Propietario es obligatorio", 8, 5000);
                
            } else {
                txt4.requestFocusInWindow();
            }
        });
        txt4.addActionListener((ActionEvent e) -> {
            if (txt4.getText().equals(nulo)) {
                DesktopNotify.showDesktopMessage("Error","La Direccion es obligatoria", 8, 5000);
                
            } else {
                txt5.requestFocusInWindow();
            }
        });
        txt5.addActionListener((ActionEvent e) -> {
            if (txt5.getText().equals(nulo)) {
                DesktopNotify.showDesktopMessage("Error","El estadio es obligatorio", 8, 5000);
                
            } else {
                txt6.requestFocusInWindow();
            }
        });
        txt6.addActionListener((ActionEvent e) -> {
            if (txt6.getText().equals(nulo)) {
                DesktopNotify.showDesktopMessage("Error","EL valor del equipo es obligatorio", 8, 5000);
                
            } else {
                txt7.requestFocusInWindow();
            }
        });
        txt7.addActionListener((ActionEvent e) -> {
            if (txt7.getText().equals(nulo)) {
                DesktopNotify.showDesktopMessage("Error","la pagina es obligatoria", 8, 5000);
               
            } else {
                txt8.requestFocusInWindow();
            }
        });
        txt8.addActionListener((ActionEvent e) -> {
            if (txt8.getText().equals(nulo)) {
                DesktopNotify.showDesktopMessage("Error","El Email es obligatorio", 8, 5000);
                
            } else {
                txt9.requestFocusInWindow();
            }
        });
        txt9.addActionListener((ActionEvent e) -> {
            if (txt9.getText().equals(nulo)) {
                DesktopNotify.showDesktopMessage("Error","La Nacionalidad es obligatoria", 8, 5000);
                
            } else {
                txt10.requestFocusInWindow();
            }
        });
        txt9.addActionListener((ActionEvent e) -> {
            if (txt9.getText().equals(nulo)) {
                DesktopNotify.showDesktopMessage("Error","El numero de Jugadores es obligatorio", 8, 5000);
                
            } else {
                btn2.requestFocusInWindow();
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
        txt9.setText(nulo);
        txt10.setText(nulo);
        txt1.requestFocusInWindow();
    }

    public void grabar() {
        try {
            sql = "insert into equiposdefutbol values(";
            sql += "\"" + txt1.getText() + "\",";
            sql += "aes_encrypt (" + "\"" + txt2.getText() + "\"" + ",\"" + "123\"),";
            sql += "aes_encrypt (" + "\"" + txt3.getText() + "\"" + ",\"" + "123\"),";
            sql += "aes_encrypt (" + "\"" + txt4.getText() + "\"" + ",\"" + "123\"),";
            sql += "aes_encrypt (" + "\"" + txt5.getText() + "\"" + ",\"" + "123\"),";
            sql += "aes_encrypt (" + "\"" + txt6.getText() + "\"" + ",\"" + "123\"),";
            sql += "aes_encrypt (" + "\"" + txt7.getText() + "\"" + ",\"" + "123\"),";
            sql += "aes_encrypt (" + "\"" + txt8.getText() + "\"" + ",\"" + "123\"),";
            sql += "aes_encrypt (" + "\"" + txt9.getText() + "\"" + ",\"" + "123\"),";
            sql += "aes_encrypt (" + "\"" + txt10.getText() + "\"" + ",\"" + "123\"))";

            System.out.println(sql);
            stmt = con.prepareStatement(sql);
            sw = stmt.executeUpdate();
            if (sw != 0) {
                DesktopNotify.showDesktopMessage("Hecho","Registro encriptado con exito", 7, 5000);
                
                nuevo();
            }
        } catch (SQLException e) {
           DesktopNotify.showDesktopMessage("Error",e.getMessage(), 8, 8000);

        }
    }

    public void modificar() {
        try {
            sql = "update equiposdefutbol set ";
            sql += " nombre=AES_ENCRYPT(\"" + txt2.getText() + "\",\"123\"),";
            sql += "propietario=AES_ENCRYPT(\"" + txt3.getText() + "\",\"123\"),";
            sql += "direccion=AES_ENCRYPT(\"" + txt4.getText() + "\",\"123\"),";
            sql += "estadio=AES_ENCRYPT(\"" + txt5.getText() + "\",\"123\"),";
            sql += "valorequipo=AES_ENCRYPT(\"" + txt6.getText() + "\",\"123\"),";
            sql += "pagina=AES_ENCRYPT(\"" + txt7.getText() + "\",\"123\"),";
            sql += "email=AES_ENCRYPT(\"" + txt7.getText() + "\",\"123\"),";
            sql += "nacionalidad=AES_ENCRYPT(\"" + txt8.getText() + "\",\"123\"),";
            sql += "nojugadores=AES_ENCRYPT(\"" + txt7.getText() + "\",\"123\")";
            sql += "Where idequipo=" + "\"" + txt1.getText() + "\"";
            stmt = con.prepareStatement(sql);
            System.out.println(sql);
            sw = stmt.executeUpdate();
            if (sw != 0) {
                DesktopNotify.showDesktopMessage("Hecho","Registro Modificado con exito", 7, 5000);
                
                nuevo();
            }
        } catch (SQLException e) {
            DesktopNotify.showDesktopMessage("Error",e.getMessage(), 8, 8000);
        }
    }

    public void consultar() {
        sw = 0;
        try {
            sql = "select idequipo,";
            sql += "AES_DECRYPT(nombre,\"123\"),";
            sql += "AES_DECRYPT(propietario,\"123\"),";
            sql += "AES_DECRYPT(direccion ,\"123\"),";
            sql += "AES_DECRYPT(estadio,\"123\"),";
            sql += "AES_DECRYPT(valorequipo ,\"123\"),";
            sql += "AES_DECRYPT(pagina,\"123\"),";
            sql += "AES_DECRYPT(email,\"123\"),";
            sql += "AES_DECRYPT(nacionalidad,\"123\"),";
            sql += "AES_DECRYPT(nojugadores,\"123\") FROM equiposdefutbol ";
            sql += " Where idequipo=" + "\"" + txt1.getText() + "\"";
            stmt = con.prepareStatement(sql);
            System.out.println(sql);
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
                txt10.setText(tabla.getString(10));
            }
            if (sw == 0) {
                 DesktopNotify.showDesktopMessage("Error","Registro inexistente", 8, 5000);

            }
        } catch (SQLException e) {
             DesktopNotify.showDesktopMessage("Error",e.getMessage(), 8, 8000);
        }
    }

    public void borrar() {
        try {
            sql = "delete from EQUIPOSDEFUTBOL ";
            sql += "where idequipo=" + "\"" + txt1.getText() + "\"";
            System.out.println(sql
            );
            stmt = con.prepareStatement(sql);
            sw = stmt.executeUpdate();
            if (sw != 0) {
                 DesktopNotify.showDesktopMessage("Hecho","Registro borrado con exito", 7, 5000);
                nuevo();
            }
        } catch (SQLException e) {
            DesktopNotify.showDesktopMessage("Error",e.getMessage(), 8, 8000);

        }
    }

    public void salir() {
        int salir = JOptionPane.showConfirmDialog(null, "En verdad deseas salir");
        if (salir == 0) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Encriptacion myencriptacion = new Encriptacion();
        myencriptacion.usar();
        
    }

    

    

    
}
