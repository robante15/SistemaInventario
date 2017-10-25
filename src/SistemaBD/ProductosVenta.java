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
public class ProductosVenta {
    private int id_producto;
    private int id_persona;
    private String producto;
    private Double precio;
    private Double cantidad;
    private String unidad;
    private String Descripcion;

    public ProductosVenta(int id_producto, int id_persona, String producto, Double precio, Double cantidad, String unidad, String Descripcion) {
        this.id_producto = id_producto;
        this.id_persona = id_persona;
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.unidad = unidad;
        this.Descripcion = Descripcion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
}
