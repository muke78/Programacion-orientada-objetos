package Ventanas;


import Conexiones.Conexiones;
import java.sql.*;
import javax.swing.*;

public class Usuarios extends javax.swing.JFrame {

    Connection con;
    PreparedStatement atmt;
    ResultSet tabla;
    int sw = 0;
    Conexiones myconexion = new Conexiones();
    String sql = "", id = "";

    public Usuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        con = myconexion.conectasqlserver();
        TXT1.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TXT1 = new javax.swing.JTextField();
        TXT2 = new javax.swing.JTextField();
        TXT3 = new javax.swing.JTextField();
        TXT4 = new javax.swing.JTextField();
        TXT5 = new javax.swing.JTextField();
        TXT6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        SALIR = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        grabar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TXT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT1ActionPerformed(evt);
            }
        });

        TXT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT2ActionPerformed(evt);
            }
        });

        TXT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT3ActionPerformed(evt);
            }
        });

        TXT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT4ActionPerformed(evt);
            }
        });

        TXT5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT5ActionPerformed(evt);
            }
        });

        TXT6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Empleados");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha de Vencimiento");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estatus");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Usuarios");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ID Usuarios");

        SALIR.setBackground(new java.awt.Color(102, 102, 255));
        SALIR.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        SALIR.setForeground(new java.awt.Color(255, 255, 255));
        SALIR.setText("Salir");
        SALIR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });

        menu.setBackground(new java.awt.Color(102, 102, 255));
        menu.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setText("< Menu");
        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        nuevo.setBackground(new java.awt.Color(102, 102, 255));
        nuevo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        nuevo.setForeground(new java.awt.Color(255, 255, 255));
        nuevo.setText("Nuevo");
        nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        grabar.setBackground(new java.awt.Color(102, 102, 255));
        grabar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        grabar.setForeground(new java.awt.Color(255, 255, 255));
        grabar.setText("Grabar");
        grabar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grabarActionPerformed(evt);
            }
        });
        grabar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                grabarKeyPressed(evt);
            }
        });

        modificar.setBackground(new java.awt.Color(102, 102, 255));
        modificar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        modificar.setForeground(new java.awt.Color(255, 255, 255));
        modificar.setText("Modificar");
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        consultar.setBackground(new java.awt.Color(102, 102, 255));
        consultar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        consultar.setForeground(new java.awt.Color(255, 255, 255));
        consultar.setText("Consultar");
        consultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        borrar.setBackground(new java.awt.Color(102, 102, 255));
        borrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        borrar.setForeground(new java.awt.Color(255, 255, 255));
        borrar.setText("Borrar");
        borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(SALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(3, 3, 3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TXT6, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TXT5, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TXT4, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TXT3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TXT2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(menu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nuevo)
                                .addGap(10, 10, 10)
                                .addComponent(grabar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(consultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(borrar)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SALIR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TXT2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menu)
                    .addComponent(nuevo)
                    .addComponent(grabar)
                    .addComponent(modificar)
                    .addComponent(consultar)
                    .addComponent(borrar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT2ActionPerformed
        if (TXT2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El ID del Empleado es requerido");
        } else {
            TXT3.requestFocus();
        }
    }//GEN-LAST:event_TXT2ActionPerformed

    private void TXT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT3ActionPerformed
        if (TXT3.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El Nombre del Usuario es requerido");
        } else {
            TXT4.requestFocus();
        }
    }//GEN-LAST:event_TXT3ActionPerformed

    private void TXT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT4ActionPerformed
        if (TXT4.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "La Contraseña del Usuario es requerida");
        } else {
            TXT5.requestFocus();
        }
    }//GEN-LAST:event_TXT4ActionPerformed

    private void TXT5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT5ActionPerformed
        if (TXT5.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "La Fecha de Vencimiento del Usuario es requerido");
        } else {
            TXT6.requestFocus();
        }
    }//GEN-LAST:event_TXT5ActionPerformed

    private void TXT6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT6ActionPerformed
        if (TXT6.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El Estatus del Empleado es requerido");
        } else {
            this.grabar.requestFocus();
        }
    }//GEN-LAST:event_TXT6ActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        int salir = JOptionPane.showConfirmDialog(null, "En verdad deseas salir");
        if (salir == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_SALIRActionPerformed

    private void TXT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT1ActionPerformed
        if (TXT1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El ID del Usuario es requerido");
        } else {
            TXT2.requestFocus();
        }
    }//GEN-LAST:event_TXT1ActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        int m = JOptionPane.showConfirmDialog(null, "En verdad deseas regresar al menu Principal");
        if (m == 0) {
            this.dispose();
            Principal p = new Principal();
            p.setVisible(true);
        }

    }//GEN-LAST:event_menuActionPerformed

    public void nuevo() {
        TXT1.setText("");
        TXT2.setText("");
        TXT3.setText("");
        TXT4.setText("");
        TXT5.setText("");
        TXT6.setText("");
        TXT1.requestFocusInWindow();
    }

    public void grabar() {
        try {
            sql = "insert into usuarios values(";
            sql += "'" + TXT1.getText() + "',";
            sql += "'" + TXT2.getText() + "',";
            sql += "'" + TXT3.getText() + "',";
            sql += "'" + TXT4.getText() + "',";
            sql += "'" + TXT5.getText() + "',";
            sql += "'" + TXT6.getText() + "')";
            System.out.println(sql);
            atmt = con.prepareStatement(sql);
            sw = atmt.executeUpdate();
            if (sw != 0) {
                JOptionPane.showMessageDialog(null, "Registro Insertado con exito");
                nuevo();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void modificar() {
        try {
            sql = "update usuarios set ";
            sql += " IDEMPLEADOS='" + TXT1.getText() + "',";
            sql += "NOMBRE='" + TXT3.getText() + "',";
            sql += "CONTRASEÑA='" + TXT4.getText() + "',";
            sql += "FECHA_DE_VENCIMIENTO='" + TXT5.getText() + "',";
            sql += "ESTATUS='" + TXT6.getText() + "'";
            sql += "Where IDUSUARIOS=" + "'" + TXT2.getText() + "'";
            System.out.println(sql);
            atmt = con.prepareStatement(sql);
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
            sql = "select * from usuarios ";
            sql += "Where IDUSUARIOS=" + "'" + TXT2.getText() + "' OR ";
            sql += "IDUSUARIOS=" + "'" + TXT1.getText() + "'";
            System.out.println(sql);
            atmt = con.prepareStatement(sql);
            tabla = atmt.executeQuery();
            while (tabla.next()) {
                TXT1.setText(tabla.getString(1));
                TXT2.setText(tabla.getString(2));
                TXT3.setText(tabla.getString(3));
                TXT4.setText(tabla.getString(4));
                TXT5.setText(tabla.getString(5));
                TXT6.setText(tabla.getString(6));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void borrar() {
        try {
            sql = "delete from usuarios ";
            sql += " Where idempleado=" + "'" + TXT2.getText() + "' OR ";
            sql += "IDUSUARIOS=" + "'" + TXT1.getText() + "'";
            System.out.println(sql);
            atmt = con.prepareStatement(sql);

            sw = atmt.executeUpdate();

            if (sw != 0) {
                JOptionPane.showMessageDialog(null, "Se a Borrado con exito");
                nuevo();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        if (TXT1.getText().equals("") || TXT2.getText().equals("") || TXT3.getText().equals("") || TXT4.getText().equals("")|| TXT5.getText().equals("") || TXT6.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ya esta limpio");
        } else {
        this.nuevo();
        }
    }//GEN-LAST:event_nuevoActionPerformed

    private void grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grabarActionPerformed
        if (TXT1.getText().equals("") || TXT2.getText().equals("") || TXT3.getText().equals("") || TXT4.getText().equals("")|| TXT5.getText().equals("") || TXT6.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No se a llenado algunos campos");
        } else {
        this.grabar();
        }
    }//GEN-LAST:event_grabarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if (TXT1.getText().equals("") || TXT2.getText().equals("") || TXT3.getText().equals("") || TXT4.getText().equals("")|| TXT5.getText().equals("") || TXT6.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No se a llenado algunos campos");
        } else {
        this.modificar();
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        if (TXT1.getText().equals("") && TXT2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No se a llenado algunos campos");
        } else {
        this.consultar();
        }
    }//GEN-LAST:event_consultarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        if (TXT1.getText().equals("") && TXT2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No se a llenado algunos campos");
        } else {
        int b = JOptionPane.showConfirmDialog(null, "En verdad deseas Borrar");
        if (b == 0) {
        this.borrar();
        }
        }
    }//GEN-LAST:event_borrarActionPerformed

    private void grabarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grabarKeyPressed
        this.grabar.doClick();
    }//GEN-LAST:event_grabarKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SALIR;
    private javax.swing.JTextField TXT1;
    private javax.swing.JTextField TXT2;
    private javax.swing.JTextField TXT3;
    private javax.swing.JTextField TXT4;
    private javax.swing.JTextField TXT5;
    private javax.swing.JTextField TXT6;
    private javax.swing.JButton borrar;
    private javax.swing.JButton consultar;
    private javax.swing.JButton grabar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton menu;
    private javax.swing.JButton modificar;
    private javax.swing.JButton nuevo;
    // End of variables declaration//GEN-END:variables
}
