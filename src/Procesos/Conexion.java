/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

//Importacion de las funciones SQL de JAVA
import java.sql.*;

/**
 *
 * @author roban
 */
public class Conexion {
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;  
    
    public void Conexion(){
    try{
            Class.forName("org.postgresql.Driver");
        }
        catch (java.lang.ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        //https://customer.elephantsql.com/instance
        
        String url = "jdbc:postgresql://tantor.db.elephantsql.com:5432/todltynj";
        String username = "todltynj";
        String password = "qMtuu1p3JNYfL2hxbqKojmbL34z2Eq-z";


        try {
            Connection db = DriverManager.getConnection(url, username, password);
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM public.usuario");
            while (rs.next()) {
                System.out.print("Columna 1 retorna:");
                System.out.println(rs.getString(2));
                System.out.print("Columna 2 retorna:");
                System.out.println(rs.getString(3));
            }
            rs.close();
            st.close();
            }
        catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void prueba(){
        System.out.print("Si sirve la Factory1");
    }  
}
