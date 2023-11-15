package actividades.Bucles;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {

        /*
         * Crea un programa que pida un número y escriba la tabla de multiplicar de ese
         * número.
         */

        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce un número para ver su tabla de multiplicar");

        int numero = escaner.nextInt();
        int i = 0;

        for (i = 0; i <= 10; i++) {

            int resultado = numero * i;
            
            System.out.println(numero + " X " + i + " = " + resultado);
            
            escaner.close();
        }

    }
}
