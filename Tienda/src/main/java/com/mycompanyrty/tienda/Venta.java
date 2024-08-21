package com.mycompanyrty.tienda;

public class Venta {
    int id;
    String descripcion;
    int cantidad;
    double precio;
    double importe;
    Products producto;

    public Venta(Products producto) {
        this.producto = producto;
       
    }

    public Venta(String descripcion, int cantidad, double precio, double importe) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.importe = importe;
    }

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
