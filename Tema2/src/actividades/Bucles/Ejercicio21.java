package actividades.Bucles;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        /*
         * Utiliza un bucle for para preguntar 5 veces por un número entero, y al final
         * devolver la frase
         * "Has fallado".
         */

        Scanner escaner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            
            System.out.println("Inserta un número entero");
            int num = escaner.nextInt();
            
            System.out.println("Has introducido el número " + num);
        }

        System.out.println("Has fallado");
        escaner.close();

    }
}
