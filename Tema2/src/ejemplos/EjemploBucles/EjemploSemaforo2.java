package ejemplos.EjemploBucles;

import java.util.Scanner;

public class EjemploSemaforo2 {
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);

        int num = 4;
        // Una variable semaforo es siempre booleana.
        boolean pararDePreguntar = false;

        do {

            System.out.println("Ingresa un número entre 1 y 5");
            num = escaner.nextInt();

            if (num == 3) {

                pararDePreguntar = true;

            } else {

                System.out.println("No es el número correcto");

            }

        //Se pone !(NOT): !pararDePreguntar es igual a true, la condificon sea false y el bucle termine.
        } while (!pararDePreguntar);

        System.out.println("Felicidades, acertaste");

        escaner.close();

    }
}
