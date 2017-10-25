/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import SistemaBD.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import factory.Factory;


/**
 *
 * @author roban
 */
public class BaseDatos {
    private static Factory factory;
    Connection conn = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    

    
    //String url = "jdbc:postgresql://tantor.db.elephantsql.com:5432/todltynj";
    //String username = "todltynj";
    //String password = "qMtuu1p3JNYfL2hxbqKojmbL34z2Eq-z";
    
    String url = "jdbc:postgresql://dbsistemainventario.cggurv4urvfd.us-east-2.rds.amazonaws.com:5432/dbsistemainventario";
    String username = "robante15";
    String password = "ROBert123";
    
    public BaseDatos(){
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    /*-----------------------------------Metodos de Insersion-----------------------------------*/
    
    public void insertarUsuario(UsuarioBD usuario){
        try {
            conn = DriverManager.getConnection(url, username, password);
            String SQLQuery = "INSERT INTO public.usuario (usr_name, nombre, contra, num_tel, direccion, rol) VALUES (?, ?, ?, ?, ?, ?)";
            st = conn.prepareStatement(SQLQuery);
            
            //El setString sirve para saber que tipo de valor le va a pasar; el # sirve para saber de que posicion es, y lo otro es el valor que le va a pasar
            st.setString(1, usuario.getUsr_name());
            st.setString(2, usuario.getNombre());
            st.setString(3, usuario.getContra());
            st.setInt(4, usuario.getNum_tel());
            st.setString(5, usuario.getDireccion());
            st.setString(6, usuario.getRol());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Nuevo registro agregado correctamente");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally{
            try {
                st.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void insertarProducto(ProductosInventBD producto){
        try {
            conn = DriverManager.getConnection(url, username, password);
            String SQLQuery = "INSERT INTO public.inventario (id_persona, producto, descripcion, cantidad, fecha_vencimiento, unidad) VALUES (?, ?, ?, ?, ?, ?)";
            st = conn.prepareStatement(SQLQuery);
            
            //El setString sirve para saber que tipo de valor le va a pasar; el # sirve para saber de que posicion es, y lo otro es el valor que le va a pasar
            st.setInt(1, producto.getId_persona());
            st.setString(2, producto.getProducto());
            st.setString(3, producto.getDescripcion());
            st.setDouble(4, producto.getCantidad());
            st.setString(5, producto.getFechaVenc());
            st.setString(6, producto.getUnidad());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Nuevo producto agregado correctamente");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally{
            try {
                st.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    /*-----------------------------------Metodos de Obtencion-----------------------------------*/
    
    public boolean obtenerUsuario(String usuario, String contra){
        boolean aproved = false;
        try {
            conn = DriverManager.getConnection(url, username, password);
            String SQLQuery = "SELECT usr_name, contra FROM public.usuario WHERE usr_name='"+usuario+"' AND contra='"+contra+"'";
            st = conn.prepareStatement(SQLQuery);
            rs = st.executeQuery();
            
            while(rs.next()){
            String BD_usuario = rs.getString("usr_name");
            System.out.print(BD_usuario);
            String BD_contra = rs.getString("contra");
            System.out.print(BD_contra);
            
            if(usuario.equals(BD_usuario) && contra.equals(BD_contra)){
                aproved = true;
            }
            
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally{
            try {
                st.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return aproved;
    }
    
    public String obtenerRol(String usuario){
        String rol = "";
        try {
            conn = DriverManager.getConnection(url, username, password);
            String SQLQuery = "SELECT rol FROM public.usuario WHERE usr_name='"+usuario+"'";
            st = conn.prepareStatement(SQLQuery);
            rs = st.executeQuery();
            
            while(rs.next()){
            rol = rs.getString("rol");
            System.out.print(rol);            
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally{
            try {
                st.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return rol;
    }
    
    public void prueba(){
        factory = new Factory();
        BaseDatos base  = factory.baseDatos();
        System.out.print(base.obtenerVendedores().get(2).getNombre());
    }
    
    
    public ArrayList<VendedoresBD> obtenerVendedores(){
        factory = new Factory();
        ArrayList<VendedoresBD> listaVendedorBD = new ArrayList<VendedoresBD>();
        try {
            conn = DriverManager.getConnection(url, username, password);
            String SQLQuery = "SELECT * FROM public.usuario WHERE rol='Vendedor'";
            st = conn.prepareStatement(SQLQuery);
            rs = st.executeQuery();
            
            while(rs.next()){
                
                String nombre = rs.getString("nombre");
                int num_tel = rs.getInt("num_tel");
                String direccion = rs.getString("direccion");
 
                
                VendedoresBD vendedorBD = factory.vendedorBD(nombre,num_tel, direccion);
                listaVendedorBD.add(vendedorBD);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally{
            try {
                st.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return listaVendedorBD;
    }
    
    
    public ArrayList<ProductosInventBD> obtenerInventario(){
        factory = new Factory();
        ArrayList<ProductosInventBD> listaInventarioBD = new ArrayList<ProductosInventBD>();
        try {
            conn = DriverManager.getConnection(url, username, password);
            String SQLQuery = "SELECT * FROM public.inventario WHERE id_persona=1";
            st = conn.prepareStatement(SQLQuery);
            rs = st.executeQuery();
            
            while(rs.next()){
                
                int id_item = rs.getInt("id_item");
                int id_persona = rs.getInt("id_persona");
                String Producto = rs.getString("producto");
                String descripcion = rs.getString("descripcion");
                Double cantidad  = rs.getDouble("cantidad");
                String fechaVenc = rs.getString("fecha_vencimiento");
                String unidad = rs.getString("unidad");

                ProductosInventBD inventarioBD = factory.productosInventBD(id_item,id_persona, Producto, descripcion, cantidad, fechaVenc, unidad);
                listaInventarioBD.add(inventarioBD);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally{
            try {
                st.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return listaInventarioBD;
    }
    
    public ArrayList<ProductosVenta> obtenerProductos(int id_personal){
        factory = new Factory();
        ArrayList<ProductosVenta> listaProductosVenta = new ArrayList<ProductosVenta>();
        try {
            conn = DriverManager.getConnection(url, username, password);
            String SQLQuery = "SELECT * FROM public.productos WHERE id_persona="+id_personal+"";
            st = conn.prepareStatement(SQLQuery);
            rs = st.executeQuery();
            
            while(rs.next()){
                
                int id_producto = rs.getInt("id_producto");
                int id_persona = rs.getInt("id_persona");
                String producto = rs.getString("producto");
                Double precio = rs.getDouble("precio");
                Double cantidad  = rs.getDouble("cantidad");
                String unidad = rs.getString("unidad");
                String Descripcion = rs.getString("descripcion");
                

                ProductosVenta productosBD = factory.productosVenta(id_producto, id_persona, producto, precio, cantidad, unidad, Descripcion);
                listaProductosVenta.add(productosBD);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally{
            try {
                st.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return listaProductosVenta;
    }
    
    
    /*public ArrayList<UsuarioBD> obtenerUsuario(){
        ArrayList<UsuarioBD> listaUsuarioBD = new ArrayList<UsuarioBD>();
        try {
            conn = DriverManager.getConnection(url, username, password);
            String SQLQuery = "SELECT * FROM public.usuario";
            st = conn.prepareStatement(SQLQuery);
            rs = st.executeQuery();
            
            while(rs.next()){
                
                String usr_name = rs.getString("usr_name");
                String nombre = rs.getString("nombre");
                String contra = rs.getString("contra");
                int num_tel = rs.getInt("num_tel");
                String direccion = rs.getString("direccion");
                
                UsuarioBD usuarioBD = factory.usuarioBD(usr_name,nombre,contra,num_tel,direccion);
                listaUsuarioBD.add(usuarioBD);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally{
            try {
                st.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return listaUsuarioBD;
    }*/ 

    public static void main(String args[]) {
    factory = new Factory();
    BaseDatos base  = factory.baseDatos();
    System.out.print(base.obtenerVendedores().get(2).getNombre());
    }
    
    
}
