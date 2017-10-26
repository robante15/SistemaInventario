/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;
import Procesos.*; //Importacion de todos las clases que contienen procesos
import SistemaBD.*;
import GUI.*;

/**
 *
 * @author robante15 and Enforcer110
 */
public class Factory {
    
    //Implementacion de la clase Conexion dentro de la factoria
    public Conexion connect(){
        return new Conexion();
    }
    
    public InicioSesion inicioSesion(){
        return new InicioSesion();
    }
    
    public BaseDatos baseDatos(){
        return new BaseDatos();
    }
    
    public UsuarioBD usuarioBD(int id_persona,String usr_name, String nombre, String contra, int num_tel, String Direccion, String rol){
        return new UsuarioBD(id_persona, usr_name, nombre, contra, num_tel, Direccion, rol);
    }
    
    public VendedoresBD vendedorBD(String nombre, int num_tel, String Direccion){
        return new VendedoresBD(nombre,num_tel, Direccion);
    }
    
    public ProductosInventBD productosInventBD(int id_item, int id_persona, String Producto, String descripcion, Double cantidad, String fechaVenc, String unidad){
        return new ProductosInventBD(id_item, id_persona, Producto, descripcion, cantidad, fechaVenc, unidad);
    }
    
    public ProductosVenta productosVenta(int id_producto, int id_persona, String producto, Double precio, Double cantidad, String unidad, String Descripcion){
        return new ProductosVenta(id_producto, id_persona, producto, precio, cantidad, unidad, Descripcion);
    }
    
    public AgendaVendedores agendaVendedores(){
        return new AgendaVendedores();
    }

/*----------------------CARGA DE LAS GUI-----------------------------*/
    public Login login(){
        return new Login();
    }  
    
    public GUICliente GUIprincipal(String usuario){
        return new GUICliente(usuario);
    } 
    
    public Registro registro(){
        return new Registro();
    } 
    
    public DirectorioVendedores directorioVendedores(String usuario){
        return new DirectorioVendedores(usuario);
    } 
    
    public Inventario inventarioForm(String usuario){
        return new Inventario(usuario);
    }
    
    public GUIVendedor GUIvendedor(String usuario){
        return new GUIVendedor(usuario);
    }
    
    public Perfil GUIPerfil(String usuario){
        return new Perfil(usuario);
    } 
    
    public ProductosVendedor productosVendedor(String usuario){
        return new ProductosVendedor(usuario);
    } 

}
