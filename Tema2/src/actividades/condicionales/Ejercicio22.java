package actividades.condicionales;

import java.util.Scanner;

public interface Ejercicio22 {
    public static void main(String[] args) {

        /*
         * Crea un programa que pida un número entero por teclado, entre 1 y 10. Si el
         * usuario escribe un
         * número entero, se escribirá su valor en pantalla. Si lo que escribe no es un
         * entero, se mostará un
         * mensaje de error. con if
         */

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número entero entre 1 y 10: ");

        if (entrada.hasNextInt()) {
            int numero = entrada.nextInt();

            if (numero >= 1 && numero <= 10) {
                System.out.println("El número introducido es: " + numero);
            } else {
                System.out.println("El número introducido no está entre 1 y 10");
            }
        } else {
            System.out.println("El valor introducido no es un número entero");
        }
        entrada.close();
        

    }
}
