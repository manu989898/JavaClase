package actividades.Bucles;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        /*
         * Escribe un programa que invente un nº aleatorio entre 1 y 10. El usuario
         * tendrá que adivinarlo en tres intentos como máximo. Al finalizar el programa
         * se le dirá si ha acertado el número y en cuántos intentos lo ha hecho.
         * Utiliza
         * while y break
         * 
         */

        Scanner escaner = new Scanner(System.in);

        int randomNum = (int) (Math.random() * 10 + 1);
        int intentos = 0;
        int num;
        boolean acertado = false;
        int contador = 1;

        System.out.println(randomNum);

        //Bucle while con condcion true para crear bucle infinito.
        while (true) {

            System.out.println("Adivina el número");
            num = escaner.nextInt();

            //Condición para asignar el num de intentos y el acierto.
            if (num == randomNum) {

                //asignamos a intentos el valor de contador para saber cuantos intentos ha usado hasta acertar
                intentos = contador;
                acertado = true;

            }

            contador++;

            // condición de parada usando if y break
            if (contador == 4 && acertado == true) {

                System.out.println("acertaste = " + acertado);
                System.out.println("intentos usados = " + intentos);
                break;

            }
            if (contador ==4 && acertado==false){
                break;
            }
        }
        escaner.close();
    }
}
