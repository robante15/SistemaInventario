/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaBD;

/**
 *
 * @author roban
 */
public class VendedoresBD {
    private String nombre;
    private int num_tel;
    private String Direccion;

    public VendedoresBD(String nombre, int num_tel, String Direccion) {
        this.nombre = nombre;
        this.num_tel = num_tel;
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(int num_tel) {
        this.num_tel = num_tel;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
}
