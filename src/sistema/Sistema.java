/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

//Importacion de la factoria para su utilizacion y de los procesos
import factory.Factory;
import Procesos.*;
import GUI.*;

/**
 *
 * @author roban
 */
public class Sistema {
    
    static int id_persona;
    static String usuario;
    static String nombre;
    /**
     * @param args the command line arguments
     */
    
    private static Factory factory;
    
    public static void main(String[] args) {
        factory = new Factory();
        Conexion conn = factory.connect();
        //conn.Conexion();
        //conn.prueba();
        
        BaseDatos bd = factory.baseDatos();
        boolean aprovado = bd.obtenerUsuario("robante125", "ROBert123");
        System.out.print(aprovado);
        
        Login form = factory.login(); 
        form.setVisible (true); 
        
    }
    
}
