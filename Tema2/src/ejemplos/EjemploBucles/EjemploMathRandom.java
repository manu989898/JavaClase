package ejemplos.EjemploBucles;

import java.util.Scanner;

public class EjemploMathRandom {
    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);

        int num;
        int randomNumber = (int) (Math.random() * 10 + 1);
        int contador = 5;

        System.out.println(randomNumber);

        System.out.println("Te quedan " + contador + " intentos");

        while (contador > 0) {

            System.out.println("Ingresa el número a adivinar");
            num = escaner.nextInt();

            if (num == randomNumber) {

                System.out.println("Felicidades, acertaste");
                System.exit(0);

            } else {

                System.out.println("Fallaste!");

            }

            contador--;
            System.out.println("Te quedan " + contador + " intentos");
        }

        escaner.close();

    }
}
