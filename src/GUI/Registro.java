/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import factory.Factory;
import Procesos.*;
import GUI.*;
import SistemaBD.*;

/**
 *
 * @author roban
 */
public class Registro extends javax.swing.JFrame {

    private static Factory factory;
    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        factory = new Factory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroup_rol = new javax.swing.ButtonGroup();
        lbl_registro = new javax.swing.JLabel();
        btn_aceptar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        lbl_usuario = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_contrasena = new javax.swing.JTextField();
        lbl_contrasena = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        txt_numTel = new javax.swing.JTextField();
        lbl_numTel = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        lbl_direccion = new javax.swing.JLabel();
        rbtn_cliente = new javax.swing.JRadioButton();
        rbtn_vendedor = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_registro.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lbl_registro.setForeground(new java.awt.Color(255, 255, 255));
        lbl_registro.setText("Registro de Nuevo Usuario");
        getContentPane().add(lbl_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        btn_aceptar.setBackground(new java.awt.Color(255, 255, 255));
        btn_aceptar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btn_aceptar.setText("Aceptar");
        btn_aceptar.setToolTipText("");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 130, 60));

        btn_cancelar.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 130, 60));

        lbl_usuario.setBackground(new java.awt.Color(0, 0, 0));
        lbl_usuario.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setText("Usuario");
        getContentPane().add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txt_usuario.setToolTipText("");
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 309, -1));

        txt_contrasena.setToolTipText("");
        getContentPane().add(txt_contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 309, -1));

        lbl_contrasena.setBackground(new java.awt.Color(0, 0, 0));
        lbl_contrasena.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lbl_contrasena.setForeground(new java.awt.Color(255, 255, 255));
        lbl_contrasena.setText("Contraseña");
        getContentPane().add(lbl_contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txt_nombre.setToolTipText("");
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 309, -1));

        lbl_nombre.setBackground(new java.awt.Color(0, 0, 0));
        lbl_nombre.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombre.setText("Nombre");
        getContentPane().add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txt_numTel.setToolTipText("");
        getContentPane().add(txt_numTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 309, -1));

        lbl_numTel.setBackground(new java.awt.Color(0, 0, 0));
        lbl_numTel.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lbl_numTel.setForeground(new java.awt.Color(255, 255, 255));
        lbl_numTel.setText("Numero Telefono");
        getContentPane().add(lbl_numTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        txt_direccion.setToolTipText("");
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 309, -1));

        lbl_direccion.setBackground(new java.awt.Color(0, 0, 0));
        lbl_direccion.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lbl_direccion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_direccion.setText("Direccion");
        getContentPane().add(lbl_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        btngroup_rol.add(rbtn_cliente);
        rbtn_cliente.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        rbtn_cliente.setText("Cliente");
        getContentPane().add(rbtn_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));

        btngroup_rol.add(rbtn_vendedor);
        rbtn_vendedor.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        rbtn_vendedor.setText("Vendedor");
        getContentPane().add(rbtn_vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/regis/fondo3.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        //Variables temporales para almacenar los datos que posteriormente se van a mandar al metodo
        String usr_name = this.txt_usuario.getText();
        String nombre = this.txt_nombre.getText();
        String contra = this.txt_contrasena.getText();
        int num_tel = Integer.parseInt(this.txt_numTel.getText());
        String Direccion = this.txt_direccion.getText();
        StringBuilder B_rol = new StringBuilder();
        
        if(rbtn_cliente.isSelected()){
           B_rol.append("Cliente"); 
        }
        else{
            if(true==rbtn_vendedor.isSelected()){
                B_rol.append("Vendedor");
                } 
        }
        System.out.print(B_rol);
        String rol = B_rol.toString();
        System.out.print(rol);
        UsuarioBD usuario = factory.usuarioBD(usr_name, nombre, contra, num_tel, Direccion, rol);
        BaseDatos bd = factory.baseDatos();
        bd.insertarUsuario(usuario);
    }//GEN-LAST:event_btn_aceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.ButtonGroup btngroup_rol;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_contrasena;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_numTel;
    private javax.swing.JLabel lbl_registro;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JRadioButton rbtn_cliente;
    private javax.swing.JRadioButton rbtn_vendedor;
    private javax.swing.JTextField txt_contrasena;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numTel;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
