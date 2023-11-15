package ejemplos.EjemploBucles;

import java.util.Scanner;

public class EjemploSemaforo {

    public static void main(String[] args) {

        /*
         * Escribe una aplicación que pregunte al usuario un número entre 1 y 5. Si
         * responde "3", se le felicitará por haber acertado. Si no, se le seguirá
         * pidiendo más números.
         */

        Scanner escaner = new Scanner(System.in);

        int num = 4;
        // Una variable semaforo es siempre booleana.
        boolean seguirPreguntando = true;

        do {

            System.out.println("Ingresa un número entre 1 y 5");
            num = escaner.nextInt();

            if (num == 3) {

                seguirPreguntando = false;

            } else {

                System.out.println("No es el número correcto");

            }

        //no se pone seguirPreguntando == true porque ya es true cuando la declaramos.
        } while (seguirPreguntando);

        System.out.println("Felicidades, acertaste");

        escaner.close();

    }

}
