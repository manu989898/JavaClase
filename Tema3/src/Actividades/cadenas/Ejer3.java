package Actividades.cadenas;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {

        /*
         * Programa que pide una frase y luego la muestra del revés (letra a letra).
         */
        
        Scanner escaner = new Scanner(System.in);

        String frase;
   
        //pedimos la frase
        System.out.println("Introduce una frase: ");
        
        //Asignamos a frase el valor leido por la ocnsola
        frase = escaner.nextLine();

  
        // reocrremos la cadena de atrás hacia adelante
        for (int i = frase.length() - 1; i >= 0; i--) {

            //mostrar la letra en la posición i
            System.out.print(frase.charAt(i));
        }
        System.out.println();
        escaner.close();
        
    }
}
