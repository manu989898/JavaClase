package actividades;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        
        /*
         * Escribe un método que pida al usuario su nombre y devuelva la cadena introducida.
         */
        System.out.println(pregunta());
        
    }

    static String pregunta (){

        System.out.println("Cual es tu nombre? ");

        Scanner escaner = new Scanner(System.in);
        String nombre = escaner.nextLine();
        escaner.close();
        return nombre;
    }
}
