package actividades.Bucles;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        /*
         * Escribe un programa que calcule el resto de una división entre enteros con el
         * procedimiento de ir
         * restando repetidamente el divisor del dividendo hasta que el resultado es
         * menor que el divisor.
         * usando while
         */

        Scanner escaner = new Scanner(System.in);

        int dividendo = 20;
        int divisor = 6;
        int resto = dividendo % divisor;
        int resultado = dividendo - divisor;

        System.out.println("Ejemplo de esta operación: " + dividendo + " % " + divisor + " = " + resto);

        System.out.println("El resto es: " + resto);

        System.out.println(dividendo + " - " + divisor + " = " + resultado);

        if (dividendo < divisor) {
            System.out.println("El dividendo es menor que el divisor");
        } else {

            while ((dividendo > divisor) && (dividendo - divisor > divisor)) {

                dividendo = dividendo - divisor;

                System.out.println(dividendo + " - " + divisor + " = " + (dividendo - divisor));
            }

        }

        escaner.close();
    }
}
