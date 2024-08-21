package com.mycompanyrty.tienda;

public class Reserva {

    int mesa;
    String nombre;
    String hora;
    int cantidad;

    Reserva(int mesa, String nombre, String hora, int cantidad) {
        this.mesa = mesa;
        this.nombre = nombre;
        this.hora = hora;
        this.cantidad = cantidad;
    }
}
