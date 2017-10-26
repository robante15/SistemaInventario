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
        txt_nombre = new javax.swing.JTextField();
        txt_numTel = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        lbl_contrasena = new javax.swing.JLabel();
        txt_contra = new javax.swing.JTextField();
        lbl_direccion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Perfil de Usuario");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                cerrando(evt);
            }
        });

        lbl_IDPersona.setText("ID Persona:");

        lbl_userName.setText("Usuario: ");

        lbl_nombre.setText("Nombre:");

        lbl_contra.setText("Contraseña: ");

        lbl_numTel.setText("Numero de Telefono:");

        lbl_rol.setText("Rol: ");

        lbl_titulo.setText("Perfil de Usuario");

        btn_Actualizar.setText("Actualizar datos");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Actualizar datos"));

        lbl_contra1.setText("Numero Telefono: ");

        lbl_numTel1.setText("Direccion: ");

        lbl_userName1.setText("Usuario: ");

        lbl_nombre1.setText("Nombre:");

        lbl_contrasena.setText("Contraseña:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_nombre1)
                        .addGap(74, 74, 74)
                        .addComponent(txt_nombre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_contra1)
                        .addGap(26, 26, 26)
                        .addComponent(txt_numTel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_numTel1)
                        .addGap(65, 65, 65)
                        .addComponent(txt_direccion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_userName1)
                            .addComponent(lbl_contrasena))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                            .addComponent(txt_contra))))
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
                    .addComponent(lbl_contrasena)
                    .addComponent(txt_contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre1)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_contra1)
                    .addComponent(txt_numTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_numTel1)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lbl_direccion.setText("Direccion:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Actualizar)
                .addGap(49, 49, 49)
                .addComponent(btn_cancelar)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_contra)
                            .addComponent(lbl_nombre)
                            .addComponent(lbl_userName)
                            .addComponent(lbl_IDPersona)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl_rol, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_numTel)
                                .addComponent(lbl_direccion, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(lbl_titulo)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lbl_titulo)
                .addGap(9, 9, 9)
                .addComponent(lbl_IDPersona)
                .addGap(18, 18, 18)
                .addComponent(lbl_userName)
                .addGap(18, 18, 18)
                .addComponent(lbl_nombre)
                .addGap(18, 18, 18)
                .addComponent(lbl_contra)
                .addGap(18, 18, 18)
                .addComponent(lbl_numTel)
                .addGap(18, 18, 18)
                .addComponent(lbl_direccion)
                .addGap(18, 18, 18)
                .addComponent(lbl_rol)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Actualizar)
                    .addComponent(btn_cancelar))
                .addContainerGap())
        );

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

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        BaseDatos base = factory.baseDatos();
        //UsuarioBD perfil = base.obtenerUsuario(usuario);
        UsuarioBD userActualizado = factory.usuarioBD(id_persona, this.txt_usuario.getText(), 
                this.txt_nombre.getText(), this.txt_contra.getText(), Integer.parseInt(this.txt_numTel.getText()), 
                this.txt_direccion.getText(), rol);
        base.actualizarUsuario(userActualizado);
        usuario = base.obtenerUsuariobyID(id_persona).getUsr_name();
        this.rellenarCampos();
    }//GEN-LAST:event_btn_ActualizarActionPerformed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_IDPersona;
    private javax.swing.JLabel lbl_contra;
    private javax.swing.JLabel lbl_contra1;
    private javax.swing.JLabel lbl_contrasena;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_nombre1;
    private javax.swing.JLabel lbl_numTel;
    private javax.swing.JLabel lbl_numTel1;
    private javax.swing.JLabel lbl_rol;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_userName;
    private javax.swing.JLabel lbl_userName1;
    private javax.swing.JTextField txt_contra;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numTel;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
