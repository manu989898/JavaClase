package ejemplos.EjemploCondicionales;

import java.util.Scanner;

public class EjemploControlErrores {
    public static void main(String[] args) {

        // CONTROL DE ERRORES EN LA ENTRADA DEL USUARIO

        Scanner escaner = new Scanner(System.in);

        System.out.println("Dime un número y te dire su cuadrado");

        // Devuelve true si el siguiente valor que se va a leer es un float
        escaner.hasNextFloat(); 

        //Al ejecutar .hasNextFloat() el programa se para y lo que escriba el usuario se va al buffer de entrada.
        if (escaner.hasNextFloat()) {

            //Con la siguiente instruccion se lee el valor del buffer de entrada y se guarda en la variable num
            float num = escaner.nextFloat();
            System.out.println("El cuadrado de " + num + " es " + (num * num));
        
        } else {

            System.out.println("El valor introducido no es correcto");

        }

        escaner.close();

    }
}
