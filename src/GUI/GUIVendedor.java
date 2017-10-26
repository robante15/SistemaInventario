/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Procesos.*;
import factory.Factory;

/**
 *
 * @author roban
 */
public class GUIVendedor extends javax.swing.JFrame {
    private static Factory factory;
    static String usuario;
    

    /**
     * Creates new form GUIVendedor
     */
    public GUIVendedor(String usuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        factory = new Factory();
        this.usuario = usuario;
        this.lbl_usuario.setText("Usuario: "+usuario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_usuario = new javax.swing.JLabel();
        btn_productos = new javax.swing.JButton();
        btn_perfil = new javax.swing.JButton();
        lbl_cajita = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Inventario - Vendedor");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_usuario.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(240, 240, 240));
        lbl_usuario.setText("Usuario:");
        getContentPane().add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        btn_productos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btn_productos.setText("Oferta de Productos");
        btn_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 32, 264, 84));

        btn_perfil.setText("Perfil");
        btn_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_perfilActionPerformed(evt);
            }
        });
        getContentPane().add(btn_perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 120, 80));

        lbl_cajita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/provendedor/productapplication_producto_3010.png"))); // NOI18N
        getContentPane().add(lbl_cajita, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, -1));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/vendedor/fobdo6.jpg"))); // NOI18N
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productosActionPerformed
        ProductosVendedor productosV = factory.productosVendedor(usuario);
        productosV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_productosActionPerformed

    private void btn_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_perfilActionPerformed
        Perfil perfil = factory.GUIPerfil(usuario);
        perfil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_perfilActionPerformed

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
            java.util.logging.Logger.getLogger(GUIVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIVendedor(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_perfil;
    private javax.swing.JButton btn_productos;
    private javax.swing.JLabel lbl_cajita;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_usuario;
    // End of variables declaration//GEN-END:variables
}
