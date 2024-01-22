package Actividades.cadenas;

public class Ejer15 {
    public static void main(String[] args) {

        /*
         * Leer una frase y mostrarla al revés (por palabras)
         */

        // Separamos palabras con espacios
        System.out.println(
                "=============================================================");
        String frase = "Bien hecho es mejor que bien dicho";

        String[] palabras = frase.split(" ");

        System.out.println("Frase descompuesta en palabras sueltas:");
        
        for (int i = palabras.length-1; i >= 0; i--) {
            System.out.println(palabras[i]);
        }
    }
}
