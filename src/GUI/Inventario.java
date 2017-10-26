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
public class Inventario extends javax.swing.JFrame {
    private static Factory factory;
    static String usuario;
    /**
     * Creates new form Inventario
     */
    public Inventario(String usuario) {
        factory = new Factory();
        this.usuario = usuario;
        initComponents();
        cargarColumnasTabla();
        cargarModeloTabla();
    }
    
    DefaultTableModel modeloTabla = new DefaultTableModel();
    
    //Este metodo carga el modelo de la tabla de inventarios
    private void rellenarTabla(){
        int id_item = 0;
        int id_persona = Integer.parseInt(this.txt_idPersona.getText());
        String Producto = this.txt_producto.getText();
        String descripcion = this.txt_descripcion.getText();
        Double cantidad = Double.parseDouble(this.txt_cantidad.getText());
        String fechaVenc = this.txt_fechaVto.getText();
        String unidad = this.txt_unidades.getText();
        
        ProductosInventBD nuevoProducto = factory.productosInventBD(id_item,id_persona, Producto, descripcion, cantidad, fechaVenc, unidad);
        BaseDatos bd = factory.baseDatos();
        bd.insertarProductoInventario(nuevoProducto);
    }
    
    
    private void cargarColumnasTabla(){
        
        modeloTabla.addColumn("ID Item");
        modeloTabla.addColumn("Producto");
        modeloTabla.addColumn("Descripcion");
        modeloTabla.addColumn("Cantidad");
        modeloTabla.addColumn("Unidad");
        modeloTabla.addColumn("Vencimiento");
    }

    private void cargarModeloTabla(){
        BaseDatos base = new BaseDatos();
        ArrayList<ProductosInventBD> listaInventario = base.obtenerInventario();
        int numeroVendedores = listaInventario.size();
        modeloTabla.setNumRows(numeroVendedores);
        
        for(int i =0;i<numeroVendedores;i++){
            ProductosInventBD inventario = listaInventario.get(i);
            
            int id_item = inventario.getId_item();
            int id_persona = inventario.getId_persona();
            String Producto = inventario.getProducto();
            String descripcion = inventario.getDescripcion();
            Double cantidad  = inventario.getCantidad();
            String fechaVenc = inventario.getFechaVenc();
            String unidad = inventario.getUnidad();
            
            modeloTabla.setValueAt(id_item, i, 0);
            modeloTabla.setValueAt(Producto, i, 1);
            modeloTabla.setValueAt(descripcion, i, 2);
            modeloTabla.setValueAt(cantidad, i, 3);
            modeloTabla.setValueAt(unidad, i, 4);
            modeloTabla.setValueAt(fechaVenc, i, 5);
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

        lbl_inventario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInventario = new javax.swing.JTable();
        txt_idPersona = new javax.swing.JTextField();
        txt_producto = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        lbl_idPersona = new javax.swing.JLabel();
        lbl_producto = new javax.swing.JLabel();
        lbl_descripcion = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        lbl_cantidad = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        lbl_unidades = new javax.swing.JLabel();
        txt_unidades = new javax.swing.JTextField();
        btn_actualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_fechaVto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inventario");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                cerrando(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_inventario.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        lbl_inventario.setForeground(new java.awt.Color(240, 240, 240));
        lbl_inventario.setText("Inventarios:");
        getContentPane().add(lbl_inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, -1, -1));

        tablaInventario.setModel(modeloTabla);
        jScrollPane1.setViewportView(tablaInventario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 1020, 320));
        getContentPane().add(txt_idPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 379, -1));
        getContentPane().add(txt_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 379, -1));

        btn_agregar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 330, 140, 50));

        btn_atras.setText("Atras");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(1081, 11, -1, -1));

        lbl_idPersona.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        lbl_idPersona.setForeground(new java.awt.Color(240, 240, 240));
        lbl_idPersona.setText("ID Persona");
        getContentPane().add(lbl_idPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));

        lbl_producto.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        lbl_producto.setForeground(new java.awt.Color(240, 240, 240));
        lbl_producto.setText("Producto");
        getContentPane().add(lbl_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        lbl_descripcion.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        lbl_descripcion.setForeground(new java.awt.Color(240, 240, 240));
        lbl_descripcion.setText("Descripcion");
        getContentPane().add(lbl_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, -1, -1));
        getContentPane().add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 461, -1));

        lbl_cantidad.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        lbl_cantidad.setForeground(new java.awt.Color(240, 240, 240));
        lbl_cantidad.setText("Cantidad");
        getContentPane().add(lbl_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, -1, -1));
        getContentPane().add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 96, -1));

        lbl_unidades.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        lbl_unidades.setForeground(new java.awt.Color(240, 240, 240));
        lbl_unidades.setText("Unidades");
        getContentPane().add(lbl_unidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, -1, -1));
        getContentPane().add(txt_unidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 260, 152, -1));

        btn_actualizar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 140, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/inventario/closed_box 4x4.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, -30, 550, 460));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/inventario/fondo4.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 750));
        getContentPane().add(txt_fechaVto, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 182, 379, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Fecha Vto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 185, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        //this.cargarModeloTabla();
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        this.dispose();
        System.out.print(usuario);
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
       this.rellenarTabla();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void cerrando(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_cerrando
        GUICliente cliente = factory.GUIprincipal(usuario);
        cliente.setVisible(true);
        this.dispose();// TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_atras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JLabel lbl_descripcion;
    private javax.swing.JLabel lbl_idPersona;
    private javax.swing.JLabel lbl_inventario;
    private javax.swing.JLabel lbl_producto;
    private javax.swing.JLabel lbl_unidades;
    private javax.swing.JTable tablaInventario;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_fechaVto;
    private javax.swing.JTextField txt_idPersona;
    private javax.swing.JTextField txt_producto;
    private javax.swing.JTextField txt_unidades;
    // End of variables declaration//GEN-END:variables
}
