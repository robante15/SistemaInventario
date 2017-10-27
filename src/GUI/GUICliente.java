package GUI;
import factory.Factory;
import Procesos.*;

public class GUICliente extends javax.swing.JFrame {
    private static Factory factory;
    static String usuario;
    public GUICliente(String usuarioLog) {
        initComponents();
        this.setLocationRelativeTo(null);
        factory = new Factory();
        this.usuario = usuarioLog;
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

        btn_inventario = new javax.swing.JButton();
        btn_planCompra = new javax.swing.JButton();
        btn_agenda = new javax.swing.JButton();
        lbl_usuario = new javax.swing.JLabel();
        btn_perfil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();
        MenuBar_Principal = new javax.swing.JMenuBar();
        menu_archivo = new javax.swing.JMenu();
        menuItem_salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItem_AcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Inventario - Cliente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_inventario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btn_inventario.setText("Inventario");
        btn_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inventarioActionPerformed(evt);
            }
        });
        getContentPane().add(btn_inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 168, 119));

        btn_planCompra.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        btn_planCompra.setText("Productos Disponibles");
        btn_planCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_planCompraActionPerformed(evt);
            }
        });
        getContentPane().add(btn_planCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 168, 119));

        btn_agenda.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btn_agenda.setText("Agenda de vendedores");
        btn_agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agendaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_agenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 168, 119));

        lbl_usuario.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setText("Usuario: ");
        getContentPane().add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        btn_perfil.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btn_perfil.setText("Perfil");
        btn_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_perfilActionPerformed(evt);
            }
        });
        getContentPane().add(btn_perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 110, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/cliente/rererer.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/cliente/fondo5.jpg"))); // NOI18N
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        menu_archivo.setText("Archivo");

        menuItem_salir.setText("Salir");
        menuItem_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_salirActionPerformed(evt);
            }
        });
        menu_archivo.add(menuItem_salir);

        MenuBar_Principal.add(menu_archivo);

        jMenu2.setText("Ayuda");

        menuItem_AcercaDe.setText("Acerca de");
        jMenu2.add(menuItem_AcercaDe);

        MenuBar_Principal.add(jMenu2);

        setJMenuBar(MenuBar_Principal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Codigo del boton de Salir dentro del menú Archivo
    private void menuItem_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_salirActionPerformed
        System.exit(0); //Este codigo cierra todo el programa, no solo cierra el Form
    }//GEN-LAST:event_menuItem_salirActionPerformed

    private void btn_agendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agendaActionPerformed
        DirectorioVendedores agenda = factory.directorioVendedores(usuario);
        agenda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_agendaActionPerformed

    private void btn_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inventarioActionPerformed
        Inventario inventGUI = factory.inventarioForm(usuario);
        inventGUI.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_inventarioActionPerformed

    private void btn_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_perfilActionPerformed
        Perfil perfil = factory.GUIPerfil(usuario);
        perfil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_perfilActionPerformed

    private void btn_planCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_planCompraActionPerformed
        PlanCompra planCompraGUI = factory.planCompra(usuario);
        planCompraGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_planCompraActionPerformed

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
            java.util.logging.Logger.getLogger(GUICliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICliente(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar_Principal;
    private javax.swing.JButton btn_agenda;
    private javax.swing.JButton btn_inventario;
    private javax.swing.JButton btn_perfil;
    private javax.swing.JButton btn_planCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JMenuItem menuItem_AcercaDe;
    private javax.swing.JMenuItem menuItem_salir;
    private javax.swing.JMenu menu_archivo;
    // End of variables declaration//GEN-END:variables
}
