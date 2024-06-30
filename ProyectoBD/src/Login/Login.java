package Login;

import Conexiones.Conexiones;
import Ventanas.Principal;
import java.sql.*;
import javax.swing.*;
import java.text.*;

public class Login extends javax.swing.JFrame {

    Connection con;
    PreparedStatement atmt;
    ResultSet tabla;
    int sw = 0;
    Conexiones myconexion = new Conexiones();
    String nulo = "", sql = "", fechaactual = "";
    java.util.Date actual = new java.util.Date();
    SimpleDateFormat adf = new SimpleDateFormat("yyyy-MM-dd");

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        TXT1.requestFocusInWindow();
        con = myconexion.conectasqlserver();
        fechaactual = adf.format(actual);
        System.out.println("Fecha Actual: " + fechaactual + " actual:" + actual);
    }

    public void validar() {
        sql = "select * from usuarios where idusuarios=";
        sql += "'" + TXT1.getText() + "' and CONTRASEÑA=";
        sql += "'" + TXT2.getText() + "'";
        System.out.println(sql);
        sw = 0;
        try {
            atmt = con.prepareStatement(sql);
            tabla = atmt.executeQuery();
            while (tabla.next()) {
                sw = 1;
                if (tabla.getString(6).equals("N")) {
                    sw = 2;
                }
                if (sw != 2) {
                    if (tabla.getString(5).compareTo(fechaactual) < 0) {
                        sw = 3;
                    } else {
                        sw = 4;
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        if (sw == 0) {
            JOptionPane.showMessageDialog(null, "***No existe el Usuario o checa tu contraseña o usuario***");
        }
        if (sw == 2) {
            JOptionPane.showMessageDialog(null, "***Usuario inactivo, contacta a sistemas***");
        }
        if (sw == 3) {
            JOptionPane.showMessageDialog(null, "***Contraseña Vencida***");
            this.dispose();
        }
        if (sw == 4) {
            JOptionPane.showMessageDialog(null, "Accediendo al Menu Principal");
            this.dispose();
            Principal p = new Principal();
            p.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Acceso = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TXT2 = new javax.swing.JPasswordField();
        TXT1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SALIR = new javax.swing.JButton();
        Minimizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        Acceso.setBackground(new java.awt.Color(102, 0, 255));
        Acceso.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Acceso.setForeground(new java.awt.Color(255, 255, 255));
        Acceso.setText("Ingresar");
        Acceso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Acceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccesoActionPerformed(evt);
            }
        });
        Acceso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AccesoKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");

        TXT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT2ActionPerformed(evt);
            }
        });

        TXT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id Usuario");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enter.png"))); // NOI18N

        SALIR.setBackground(new java.awt.Color(102, 0, 255));
        SALIR.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        SALIR.setForeground(new java.awt.Color(255, 255, 255));
        SALIR.setText("Salir");
        SALIR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });

        Minimizar.setBackground(new java.awt.Color(102, 0, 255));
        Minimizar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Minimizar.setForeground(new java.awt.Color(255, 255, 255));
        Minimizar.setText("Minimizar");
        Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizarActionPerformed(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Minimizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 24, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(Acceso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SALIR)
                    .addComponent(Minimizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TXT2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Acceso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_MinimizarActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        int salir = JOptionPane.showConfirmDialog(null, "En verdad deseas salir");
        if (salir == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_SALIRActionPerformed

    private void TXT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT1ActionPerformed
        if (TXT1.getText().equals(nulo)) {
            JOptionPane.showMessageDialog(null, "El Id del Usuario es requerido");
        } else {
            TXT2.requestFocus();
        }
    }//GEN-LAST:event_TXT1ActionPerformed

    private void TXT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT2ActionPerformed
        if (TXT2.getText().equals(nulo)) {
            JOptionPane.showMessageDialog(null, "El Id del Usuario es requerido");
        } else {
            Acceso.requestFocus();
        }
    }//GEN-LAST:event_TXT2ActionPerformed

    private void AccesoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AccesoKeyPressed
        Acceso.doClick();
    }//GEN-LAST:event_AccesoKeyPressed

    private void AccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccesoActionPerformed
        if (TXT1.getText().equals("") || TXT2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No se a llenado algunos campos");
        } else {
            this.dispose();
            validar();
        }
    }//GEN-LAST:event_AccesoActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acceso;
    private javax.swing.JButton Minimizar;
    private javax.swing.JButton SALIR;
    private javax.swing.JTextField TXT1;
    private javax.swing.JPasswordField TXT2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
