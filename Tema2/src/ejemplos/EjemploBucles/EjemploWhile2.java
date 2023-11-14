package ejemplos.EjemploBucles;

import java.util.Scanner;

public class EjemploWhile2 {
    public static void main(String[] args) {

        // Mostramos nuestro nombre tantas veces como indique el usuario

        Scanner escaner = new Scanner(System.in);

        int contador = 1;
        int veces;

        System.out.println("Ingresa cuantas veces quieres que se repita tu nombre");

        veces = escaner.nextInt();

        // Bucle while
        while (contador <= veces) {
            System.out.println("Manu");
            contador++;
        }
        escaner.close();
    }
}
