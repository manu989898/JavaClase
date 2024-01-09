package Actividades;

public class Ejer1 {
    public static void main(String[] args) {

        /*
         * Escribe un método que reciba dos parámetros: el nombre de una persona y su
         * edad. Deberá mostrar por pantalla la frase "Hola, nombre, no parece que tengas edad años".
         */

        
        halagador("Manuel", 25);
    }

    static void halagador (String nombre, int edad) {

        System.out.println("Hola, " + nombre + ", no parece que tengas " + edad + " años");
    }
}
