package com.mycompanyrty.tienda;

public class Products {
    
    String nombre;
    double precio;


    Products(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    Products() {
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
