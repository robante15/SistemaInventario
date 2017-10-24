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
    
    public UsuarioBD usuarioBD(String usr_name, String nombre, String contra, int num_tel, String Direccion, String rol){
        return new UsuarioBD(usr_name, nombre, contra, num_tel, Direccion, rol);
    }
    
    public VendedoresBD vendedorBD(String nombre, int num_tel, String Direccion){
        return new VendedoresBD(nombre,num_tel, Direccion);
    }
    
    public AgendaVendedores agendaVendedores(){
        return new AgendaVendedores();
    }

/*----------------------CARGA DE LAS GUI-----------------------------*/
    public Login login(){
        return new Login();
    }  
    
    public GUICliente GUIprincipal(){
        return new GUICliente();
    } 
    
    public Registro registro(){
        return new Registro();
    } 
    
    public DirectorioVendedores directorioVendedores(){
        return new DirectorioVendedores();
    } 

}
