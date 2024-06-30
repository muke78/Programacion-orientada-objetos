package Ventanas;

import Conexiones.*;
import Login.*;
import java.sql.*;

public class Principal extends javax.swing.JFrame {
    Connection con;
    Conexiones myconexion = new Conexiones();
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        ARCHIVO = new javax.swing.JMenu();
        CERRAR = new javax.swing.JMenuItem();
        DULCERIAJJ = new javax.swing.JMenu();
        PRUEBAJJ = new javax.swing.JMenuItem();
        TABLASJJ = new javax.swing.JMenu();
        USUARIOSJJ = new javax.swing.JMenuItem();
        DULCERIACJ = new javax.swing.JMenu();
        PRUEBACJ = new javax.swing.JMenuItem();
        tablasCJ = new javax.swing.JMenu();
        PRODUCTOSCJ = new javax.swing.JMenuItem();
        PEDIDOSCJ = new javax.swing.JMenuItem();
        DULCERIAMV = new javax.swing.JMenu();
        PRUEBAMV = new javax.swing.JMenuItem();
        TABLASMV = new javax.swing.JMenu();
        SUELDOSMV = new javax.swing.JMenuItem();
        DISTRIBUIDORESMV = new javax.swing.JMenuItem();
        AYUDA = new javax.swing.JMenu();
        ACERCA = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dulces-bien 350.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, 162));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/surtido-dulces-sabrosos-mesa_23-2148286747.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 0));
        jMenuBar1.setForeground(new java.awt.Color(102, 102, 255));

        ARCHIVO.setText("ARCHIVOS");
        ARCHIVO.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        CERRAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar 20x21.png"))); // NOI18N
        CERRAR.setText("Cerrar Sesión");
        CERRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CERRARActionPerformed(evt);
            }
        });
        ARCHIVO.add(CERRAR);

        jMenuBar1.add(ARCHIVO);

        DULCERIAJJ.setText("DULCERIA");
        DULCERIAJJ.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        PRUEBAJJ.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        PRUEBAJJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/conexion 20x20.png"))); // NOI18N
        PRUEBAJJ.setText("Prueba de conexion");
        PRUEBAJJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRUEBAJJActionPerformed(evt);
            }
        });
        DULCERIAJJ.add(PRUEBAJJ);

        TABLASJJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tabla 20x20.png"))); // NOI18N
        TABLASJJ.setText("Tablas");
        TABLASJJ.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        USUARIOSJJ.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        USUARIOSJJ.setText("Usuarios");
        USUARIOSJJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USUARIOSJJActionPerformed(evt);
            }
        });
        TABLASJJ.add(USUARIOSJJ);

        DULCERIAJJ.add(TABLASJJ);

        jMenuBar1.add(DULCERIAJJ);

        DULCERIACJ.setText("DULCERIA");
        DULCERIACJ.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        PRUEBACJ.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        PRUEBACJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/conexion 20x20.png"))); // NOI18N
        PRUEBACJ.setText("Prueba de conexion");
        PRUEBACJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRUEBACJActionPerformed(evt);
            }
        });
        DULCERIACJ.add(PRUEBACJ);

        tablasCJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tabla 20x20.png"))); // NOI18N
        tablasCJ.setText("Tablas");
        tablasCJ.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        PRODUCTOSCJ.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        PRODUCTOSCJ.setText("Productos");
        PRODUCTOSCJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRODUCTOSCJActionPerformed(evt);
            }
        });
        tablasCJ.add(PRODUCTOSCJ);

        PEDIDOSCJ.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        PEDIDOSCJ.setText("Pedidos");
        PEDIDOSCJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PEDIDOSCJActionPerformed(evt);
            }
        });
        tablasCJ.add(PEDIDOSCJ);

        DULCERIACJ.add(tablasCJ);

        jMenuBar1.add(DULCERIACJ);

        DULCERIAMV.setText("DULCERIA");
        DULCERIAMV.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        PRUEBAMV.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        PRUEBAMV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/conexion 20x20.png"))); // NOI18N
        PRUEBAMV.setText("Prueba de conexion");
        PRUEBAMV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRUEBAMVActionPerformed(evt);
            }
        });
        DULCERIAMV.add(PRUEBAMV);

        TABLASMV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tabla 20x20.png"))); // NOI18N
        TABLASMV.setText("Tablas");
        TABLASMV.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        SUELDOSMV.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        SUELDOSMV.setText("Sueldos");
        SUELDOSMV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUELDOSMVActionPerformed(evt);
            }
        });
        TABLASMV.add(SUELDOSMV);

        DISTRIBUIDORESMV.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        DISTRIBUIDORESMV.setText("Distribuidores");
        DISTRIBUIDORESMV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DISTRIBUIDORESMVActionPerformed(evt);
            }
        });
        TABLASMV.add(DISTRIBUIDORESMV);

        DULCERIAMV.add(TABLASMV);

        jMenuBar1.add(DULCERIAMV);

        AYUDA.setText("AYUDA");
        AYUDA.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        ACERCA.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ACERCA.setText("Acerca de..");
        ACERCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACERCAActionPerformed(evt);
            }
        });
        AYUDA.add(ACERCA);

        jMenuBar1.add(AYUDA);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PRODUCTOSCJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRODUCTOSCJActionPerformed
       this.dispose();
       Productos pcj = new Productos();
       pcj.setVisible(true);
    }//GEN-LAST:event_PRODUCTOSCJActionPerformed

    private void USUARIOSJJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USUARIOSJJActionPerformed
        this.dispose();
        Usuarios uj = new Usuarios();
       uj.setVisible(true);
    }//GEN-LAST:event_USUARIOSJJActionPerformed

    private void CERRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CERRARActionPerformed
        this.dispose();
        Login lo = new Login();
       lo.setVisible(true);
    }//GEN-LAST:event_CERRARActionPerformed

    private void SUELDOSMVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUELDOSMVActionPerformed
        this.dispose();
        Sueldos smv = new Sueldos();
        smv.setVisible(true);
    }//GEN-LAST:event_SUELDOSMVActionPerformed

    private void DISTRIBUIDORESMVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DISTRIBUIDORESMVActionPerformed
        this.dispose();
        Distribuidores dmv = new Distribuidores();
        dmv.setVisible(true);
    }//GEN-LAST:event_DISTRIBUIDORESMVActionPerformed

    private void PRUEBAJJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRUEBAJJActionPerformed
        con = myconexion.conectasqlserver();
    }//GEN-LAST:event_PRUEBAJJActionPerformed

    private void PRUEBACJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRUEBACJActionPerformed
         con = myconexion.conectasqlserver();
    }//GEN-LAST:event_PRUEBACJActionPerformed

    private void PRUEBAMVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRUEBAMVActionPerformed
        con = myconexion.conectasqlserver();
    }//GEN-LAST:event_PRUEBAMVActionPerformed

    private void PEDIDOSCJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PEDIDOSCJActionPerformed
       this.dispose();
       Pedidos pcj = new Pedidos();
       pcj.setVisible(true);
    }//GEN-LAST:event_PEDIDOSCJActionPerformed

    private void ACERCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACERCAActionPerformed
        this.dispose();
        CREDITOS cs = new CREDITOS();
        cs.setVisible(true);
    }//GEN-LAST:event_ACERCAActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ACERCA;
    private javax.swing.JMenu ARCHIVO;
    private javax.swing.JMenu AYUDA;
    private javax.swing.JMenuItem CERRAR;
    private javax.swing.JMenuItem DISTRIBUIDORESMV;
    private javax.swing.JMenu DULCERIACJ;
    private javax.swing.JMenu DULCERIAJJ;
    private javax.swing.JMenu DULCERIAMV;
    private javax.swing.JMenuItem PEDIDOSCJ;
    private javax.swing.JMenuItem PRODUCTOSCJ;
    private javax.swing.JMenuItem PRUEBACJ;
    private javax.swing.JMenuItem PRUEBAJJ;
    private javax.swing.JMenuItem PRUEBAMV;
    private javax.swing.JMenuItem SUELDOSMV;
    private javax.swing.JMenu TABLASJJ;
    private javax.swing.JMenu TABLASMV;
    private javax.swing.JMenuItem USUARIOSJJ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu tablasCJ;
    // End of variables declaration//GEN-END:variables
}
