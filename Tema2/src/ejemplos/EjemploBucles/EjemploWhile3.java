package ejemplos.EjemploBucles;

import java.util.Scanner;

public class EjemploWhile3 {
    public static void main(String[] args) {
         Scanner escaner = new Scanner(System.in);

        // Mostramos nuestro nombre tantas veces como indique el usuario, muestra el numero de veces que se repite

        int contador = 1;
        int veces;

        System.out.println("Ingresa cuantas veces quieres que se repita tu nombre");

        veces = escaner.nextInt();

        // Bucle while
        while (contador <= veces) {
            System.out.println(contador + " - " + "Manu");
            //Se actualiza el contador 
            contador++;
        }
        escaner.close();
    }
}
