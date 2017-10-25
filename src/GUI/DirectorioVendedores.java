/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import factory.Factory;
import Procesos.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import SistemaBD.*;

/**
 *
 * @author roban
 */
public class DirectorioVendedores extends javax.swing.JFrame {
    private static Factory factory;
    static String usuario;
    /**
     * Creates new form DirectorioVendedores
     */
    public DirectorioVendedores() {
        initComponents();
        factory = new Factory();
        cargarColumnasTabla();
        cargarModeloTabla();
    }
    
    DefaultTableModel modeloTabla = new DefaultTableModel();
    
    //Este metodo carga el modelo de la tabla de inventarios
    private void cargarColumnasTabla(){
        
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Telefono");
        modeloTabla.addColumn("Direccion");
    }
    
    private void cargarModeloTabla(){
        BaseDatos base = new BaseDatos();
        ArrayList<VendedoresBD> listaVendedores = base.obtenerVendedores();
        int numeroVendedores = listaVendedores.size();
        modeloTabla.setNumRows(numeroVendedores);
        
        for(int i =0;i<numeroVendedores;i++){
            VendedoresBD vendedores = listaVendedores.get(i);
            
            String nombre = vendedores.getNombre();
            String numTel = String.valueOf(vendedores.getNum_tel());
            String direccion = vendedores.getDireccion();
            
            modeloTabla.setValueAt(nombre, i, 0);
            modeloTabla.setValueAt(numTel, i, 1);
            modeloTabla.setValueAt(direccion, i, 2);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_vendedores = new javax.swing.JTable();
        lbl_buscar = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        btn_atras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vendedores");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                cerrando(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_vendedores.setModel(modeloTabla);
        jScrollPane1.setViewportView(table_vendedores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 1020, 240));

        lbl_buscar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lbl_buscar.setForeground(new java.awt.Color(240, 240, 240));
        lbl_buscar.setText("Buscar");
        getContentPane().add(lbl_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 215, -1));

        btn_atras.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        btn_atras.setText("Regresar");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(974, 46, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/directorios/fobdo5.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        GUICliente cliente = factory.GUIprincipal(usuario);
        cliente.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void cerrando(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_cerrando
        GUICliente cliente = factory.GUIprincipal(usuario);
        cliente.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(DirectorioVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DirectorioVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DirectorioVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DirectorioVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DirectorioVendedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_buscar;
    private javax.swing.JTable table_vendedores;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
