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
    

    
    String url = "jdbc:postgresql://tantor.db.elephantsql.com:5432/todltynj";
    String username = "todltynj";
    String password = "qMtuu1p3JNYfL2hxbqKojmbL34z2Eq-z";
    
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
 
    
}
