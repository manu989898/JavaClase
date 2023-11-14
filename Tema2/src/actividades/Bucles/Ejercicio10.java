package actividades.Bucles;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        /*
         * Trivial. Escribe una aplicación que haga una pregunta y muestre un menú con
         * cuatro posibles
         * respuestas numeradas. Por ejemplo:
         * 
         * ¿Cómo se escribe 30 en hexadecimal?
         * 1) 1E
         * 2) 2F
         * 3) 33
         * 4) Ninguno de los anteriores.
         * 
         * Si el número introducido por el usuario no está entre uno y cuatro, se le
         * volverá a repetir la pregunta
         * hasta que lo esté. Finalmente se le dirá si ha acertado o fallado.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Quien es el mejor profesor?");
        System.out.println("1) Carlos");
        System.out.println("2) David");
        System.out.println("3) Pablo");
        System.out.println("4) Ninguno de los anteriores.");

        System.out.println("Introduce una respuesta: ");

        int respuesta = sc.nextInt();

        while (respuesta < 1 || respuesta > 4) {
            
            System.out.println("Respuesta incorrecta, vuelve a intentarlo");
            System.out.println("¿Quien es el mejor profesor?");
            System.out.println("1) Carlos");
            System.out.println("2) David");
            System.out.println("3) Pablo");
            System.out.println("4) Ninguno de los anteriores.");

            System.out.println("Introduce una respuesta: ");
            respuesta = sc.nextInt();
        }

        if (respuesta == 1) {
            System.out.println("Respuesta correcta");
        } else {
            System.out.println("Respuesta incorrecta");
        }

        sc.close();
    }
}
