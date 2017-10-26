/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;
import factory.Factory;
import Procesos.*;
import GUI.*;

/**
 *
 * @author roban
 */
public class InicioSesion {
    private static Factory factory;
    //Retorna un Booleano para saber si el usuario y contraseña ingresados son correctos
    
    //DEPRECADO POR QUE LA CLASE BASEDATOS YA REALIZA ESTA COMPROVACION Y MEJOR
    public boolean Aprovacion_inicioSesion(String usuario, String contrasena){
        BaseDatos bd =  factory.baseDatos();
        boolean inicio = bd.ValidarLogin(usuario, contrasena);
        
        /*if(usuario.equals("robante15")&&contrasena.equals("0000")){
            inicio = true;
        }
        else{
            inicio = false;
        }*/
        System.out.print(usuario);
        System.out.print(contrasena);
        System.out.print(inicio);
        return inicio;
    }
       
}
