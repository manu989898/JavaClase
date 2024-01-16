package actividades;

import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) {

        /*
         * Crea un método int max(int x, int y) que devuelva el mayor de los números x e
         * y. Análogamente,
         * crea el método int min(int x, int y).
         */

        Scanner escaner = new Scanner(System.in);

        System.out.println("Ingresa el primer número");
        int num1 = escaner.nextInt();

        System.out.println("Ingresa el segundo número");
        int num2 = escaner.nextInt();

        System.out.println("El número mayor es: ");
        max(num1, num2);

        System.out.println("El númeor menor es: ");
        min(num1, num2);
        escaner.close();
    }

    static void max(int num1, int num2) {

        if (num1 < num2) {
            
            System.out.println(num2);
        } else {
            System.out.println(num1);
        }

    }

    static void min(int num1, int num2) {

        if (num1 > num2) {
            
            System.out.println(num2);
        } else {
            System.out.println(num1);
        }
    }
}
