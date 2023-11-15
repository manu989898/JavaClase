package actividades.Bucles;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {

        /*
         * Concurso. El programa preguntará continuamente el número secreto (que es 6,
         * evidentemente).
         * En el momento en que el usuario acierte, se escribirá el mensaje
         * "Felicidades" y terminará el
         * programa. Si el usuario agota sus 10 posibilidades, el mensaje que verá es
         * "Has perdido".
         */

        Scanner escaner = new Scanner(System.in);
        int introducido = 0;
        int num = 6;

        for (int i = 0; i < 10; i++) {

            System.out.println("Ingresa el número: ");
            introducido = escaner.nextInt();

            if (introducido==num) {
                System.out.println("Felicidades, has acertado!");
                break;
            }

        }

        if (introducido!=num) {
            System.out.println("Has perdido");
        }
        escaner.close();
    }
}
