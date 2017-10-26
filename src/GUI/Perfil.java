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
public class Perfil extends javax.swing.JFrame {
    private static Factory factory;
    static String usuario;
    static int id_persona;
    static String rol;
    /**
     * Creates new form Perfil
     */
    public Perfil(String usuario) {
        initComponents();
        factory = new Factory();
        this.usuario = usuario;
        this.rellenarCampos();
    }

    private void rellenarCampos(){
        BaseDatos base = factory.baseDatos();
        UsuarioBD perfil = base.obtenerUsuario(usuario);
        id_persona = perfil.getId_persona();
        rol = perfil.getRol();
        this.lbl_IDPersona.setText("ID Personal: " + Integer.toString(id_persona));
        this.lbl_userName.setText("Usuario: " + perfil.getUsr_name());
        this.lbl_nombre.setText("Nombre: " + perfil.getNombre());
        this.lbl_contra.setText("Contraseña: " + perfil.getContra());
        this.lbl_numTel.setText("Numero Telefono: " + perfil.getNum_tel());
        this.lbl_direccion.setText("Direccion: " + perfil.getDireccion());
        this.lbl_rol.setText("Rol: " + rol);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_IDPersona = new javax.swing.JLabel();
        lbl_userName = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_contra = new javax.swing.JLabel();
        lbl_numTel = new javax.swing.JLabel();
        lbl_rol = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();
        btn_Actualizar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt_usuario = new javax.swing.JTextField();
        lbl_contra1 = new javax.swing.JLabel();
        lbl_numTel1 = new javax.swing.JLabel();
        lbl_userName1 = new javax.swing.JLabel();
        lbl_nombre1 = new javax.swing.JLabel();
        txt_nomre = new javax.swing.JTextField();
        txt_numTel = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        lbl_direccion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Perfil de Usuario");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                cerrando(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_IDPersona.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_IDPersona.setForeground(new java.awt.Color(240, 240, 240));
        lbl_IDPersona.setText("ID Persona:");
        getContentPane().add(lbl_IDPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 44, -1, -1));

        lbl_userName.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_userName.setForeground(new java.awt.Color(240, 240, 240));
        lbl_userName.setText("Usuario: ");
        getContentPane().add(lbl_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 76, -1, -1));

        lbl_nombre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(240, 240, 240));
        lbl_nombre.setText("Nombre:");
        getContentPane().add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 108, -1, -1));

        lbl_contra.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_contra.setForeground(new java.awt.Color(240, 240, 240));
        lbl_contra.setText("Contraseña: ");
        getContentPane().add(lbl_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 140, -1, -1));

        lbl_numTel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_numTel.setForeground(new java.awt.Color(240, 240, 240));
        lbl_numTel.setText("Numero de Telefono:");
        getContentPane().add(lbl_numTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 172, -1, -1));

        lbl_rol.setText("Rol: ");
        getContentPane().add(lbl_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 236, -1, -1));

        lbl_titulo.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(240, 240, 240));
        lbl_titulo.setText("Perfil de Usuario");
        getContentPane().add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        btn_Actualizar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_Actualizar.setText("Actualizar datos");
        getContentPane().add(btn_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 482, -1, -1));

        btn_cancelar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 482, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Actualizar datos"));

        lbl_contra1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbl_contra1.setText("Numero Telefono: ");

        lbl_numTel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbl_numTel1.setText("Direccion: ");

        lbl_userName1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbl_userName1.setText("Usuario: ");

        lbl_nombre1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbl_nombre1.setText("Nombre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_userName1)
                        .addGap(72, 72, 72)
                        .addComponent(txt_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_nombre1)
                        .addGap(74, 74, 74)
                        .addComponent(txt_nomre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_contra1)
                        .addGap(26, 26, 26)
                        .addComponent(txt_numTel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_numTel1)
                        .addGap(65, 65, 65)
                        .addComponent(txt_direccion)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_userName1)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre1)
                    .addComponent(txt_nomre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_contra1)
                    .addComponent(txt_numTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_numTel1)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 268, -1, -1));

        lbl_direccion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_direccion.setForeground(new java.awt.Color(240, 240, 240));
        lbl_direccion.setText("Direccion:");
        getContentPane().add(lbl_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 204, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/perfil/11.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/perfil/11.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 580, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void cerrando(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_cerrando
        if(rol.equals("Cliente")){
            GUICliente cliente = factory.GUIprincipal(usuario);
            cliente.setVisible(true);
            this.dispose();
        }
        else{
            GUIVendedor vendedor = factory.GUIvendedor(usuario);
            vendedor.setVisible(true);
            this.dispose();
        }
        
        
    }//GEN-LAST:event_cerrando

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
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfil(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_IDPersona;
    private javax.swing.JLabel lbl_contra;
    private javax.swing.JLabel lbl_contra1;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_nombre1;
    private javax.swing.JLabel lbl_numTel;
    private javax.swing.JLabel lbl_numTel1;
    private javax.swing.JLabel lbl_rol;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_userName;
    private javax.swing.JLabel lbl_userName1;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nomre;
    private javax.swing.JTextField txt_numTel;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
