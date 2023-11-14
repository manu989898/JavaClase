package actividades.Bucles;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        /*
         * Crea una aplicación para probar la capacidad de cálculo mental de los
         * usuarios. Se calcularán dos números aleatorios entre 1 y 100 y se mostrarán
         * en pantalla. A continuación el usuario deberá escribir el resultado de la
         * suma de ambos números y se le indicará si ha acertado o no.Estas acciones se
         * repetirán indefinidamente mediante un bucle while
         */

        Scanner escaner = new Scanner(System.in);

        while (true) {

            int numA = (int) (Math.random() + 100 + 1);
            int numB = (int) (Math.random() + 100 + 1);
            int resultado;

            System.out.println("Calcula la suma de :" + numA + " + " + numB);

            resultado = escaner.nextInt();

            if (resultado == (numA + numB)) {
                System.out.println("Acertaste!");
            } else {
                System.out.println("Fallaste");
            }

        }
    }
}
