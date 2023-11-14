package actividades.condicionales;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        /*
         * Escribe un programa que pida la edad del usuario. Si ésta es menor de 18
         * años, el valor de la
         * variable mayorDeEdad será verdadero. Si no, será falso. Al final se mostrará
         * este valor.
         */

         Scanner entrada = new Scanner(System.in);

         System.out.println("Introduce tu edad: ");

         int edad = entrada.nextInt();

         boolean mayorDeEdad = (edad >= 18) ? true : false;

         System.out.println("¿Eres mayor de edad? " + mayorDeEdad);
         entrada.close();
    }
}
