/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author roban
 */
public class AgendaVendedores {
    DefaultTableModel modeloTabla = new DefaultTableModel();
    
    //Este metodo carga el modelo de la tabla de inventarios
    public void cargarModeloTabla(){
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Telefono");
        modeloTabla.addColumn("Telefono");
    }
    
}

