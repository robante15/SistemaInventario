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
public class ProductosInventBD {
    private int id_item;
    private int id_persona;
    private String Producto;
    private String descripcion;
    private Double cantidad;
    private String fechaVenc;
    private String unidad;

    public ProductosInventBD(int id_item, int id_persona, String Producto, String descripcion, Double cantidad, String fechaVenc, String unidad) {
        this.id_item = id_item;
        this.id_persona = id_persona;
        this.Producto = Producto;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.fechaVenc = fechaVenc;
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public int getId_item() {
        return id_item;
    }

    public void setId_item(int id_item) {
        this.id_item = id_item;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(String fechaVenc) {
        this.fechaVenc = fechaVenc;
    }
}
