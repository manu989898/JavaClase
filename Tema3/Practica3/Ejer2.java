package Practica3;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {

        /*
         * Crea un programa que te pregunte el nombre de un archivo (incluyendo su
         * extensión) y te indique
         * por separado el nombre y la extensión.
         * Usa dos métodos, nombreArchivo() y extensionArchivo(), que reciban como
         * argumento un nombre
         * completo de archivo y devuelvan el nombre y la extensión, respectivamente.
         */

        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce el nombre del archivo: ");

        String nombre = escaner.nextLine();
        System.out.println("El nombre del archivo sin extension es: " + nombreArchivo(nombre));
        System.out.println("La extension del archivo es: " + extensionArchivo(nombre));
        escaner.close();
    }

    static String nombreArchivo(String nombre) {

        String nombreSinExtension = "";
        
        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i) == '.') {
                break;
            } else {
                nombreSinExtension += nombre.charAt(i);
            }
        }
            return nombreSinExtension;
    }
    
    static String extensionArchivo(String nombre) {

        String extension = "";
        
        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i) == '.') {
                extension = nombre.substring(i,nombre.length());
            }
        }
            return extension;
    }
}
