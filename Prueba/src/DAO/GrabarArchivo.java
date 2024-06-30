package DAO;

import java.io.*;
import java.util.logging.*;
import javax.swing.JOptionPane;

public class GrabarArchivo {

    String cadena = "";

    public void grabar(String archivo) throws FileNotFoundException, IOException {
        String linea;
        linea = JOptionPane.showInputDialog("Digite la linea");
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
        GrabarArchivo mygrab = new GrabarArchivo();
        try {
            mygrab.grabar("C:/Users/M U K E/Documents/Bases de datos AVANZADAS/Log/Log.txt");
        } catch (IOException ex) {
            Logger.getLogger(GrabarArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
