package Practica;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {

        /*
         * Actividad 3
         * Crea un programa que te pida un texto largo y te lo muestre limitando la
         * longitud de las líneas a 80 caracteres de ancho. Este ancho de línea estará
         * codificado en una constante llamada ANCHO_LINEA, de forma que si se
         * cambia el valor de esta constante, el programa seguirá funcionando bien.
         */

        Scanner teclado = new Scanner(System.in);
        String texto = "";
        // varable tipo final para que no se pueda cambiar el valor
        final int ANCHO_LINEA = 80;

        System.out.println("Escribe un texto largo y te lo mostraré limitando la longitud de las líneas a 80 caracteres de ancho: ");
       
        System.out.println("\nTexto:");
        System.out.println();
        texto = teclado.nextLine();

         System.out.println("\n Texto con líneas de 80 caracteres");
        
        // Bucle para recorrer el texto
        for (int i = 0; i < texto.length(); i++) {
            // Si el resto de dividir i entre el ancho de línea es 0 
            if (i % ANCHO_LINEA == 0) {
                // Salto de línea
                System.out.println();
            }
            // Imprimo el caracter
            System.out.print(texto.charAt(i));
        }
        teclado.close();
    }
}
