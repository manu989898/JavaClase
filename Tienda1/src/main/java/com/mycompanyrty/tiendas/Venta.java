package com.mycompanyrty.tienda;

public class Venta {
    int id;
    String descripcion;
    int cantidad;
    double precio;
    double importe;

    public Venta() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    void setId(int selectedIndex) {
        this.id = id;
    }
    
    
}
