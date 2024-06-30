package DAO;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class LeerArchivo {

    String cadena = "";

    public void leer(String archivo) throws FileNotFoundException, IOException {
        String linea;
        FileReader file = new FileReader(archivo);
        BufferedReader br = new BufferedReader(file);

        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }
        br.close();

    }

    public static void main(String[] args) throws IOException {
        LeerArchivo myLeer = new LeerArchivo();
        myLeer.leer("C:/Users/M U K E/Documents/Bases de datos AVANZADAS/Log/Log.txt");
    }
}
