package actividades.Bucles;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        /*
         * Escribe un programa que invente un nº aleatorio entre 1 y 10. El usuario
         * tendrá que adivinarlo en tres intentos como máximo. Al finalizar el programa
         * se le dirá si ha acertado el número y en cuántos intentos lo ha hecho.
         * Utiliza
         * while y break
         * Añade al final del programa anterior el código necesario para que indique la
         * puntuación obtenidapor el jugador:
         * •Si ha acertado en un intento → Recibe 10 puntos.
         * •Si ha acertado en dos intentos → Recibe 5 puntos.
         * •Si ha acertado en tres intentos → Recibe 2 puntos.
         * •En otro caso → Recibe 0 puntos
         */
        Scanner escaner = new Scanner(System.in);

        int randomNum = (int) (Math.random() * 10 + 1);
        int intentos = 0;
        int num;
        boolean acertado = false;
        int contador = 1;
        System.out.println(randomNum + 1);
        

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
            if (contador == 4 && acertado==true) {

                System.out.println("acertaste = " + acertado);
                System.out.println("intentos usados = " + intentos);
                break;

            }
            if (contador ==4 && acertado==false){
                break;
            }
        }
        // IF ELSE IF para las condiciones de puntuación según el num de intentos.
        if (intentos ==1){
            System.out.println("Recibes 10 puntos");
        }else if (intentos ==2) {
            System.out.println("Recibes 5 puntos");
        }else if (intentos ==3){
            System.out.println("Recibes 2 puntos");
        } else {
            System.out.println("Recibes 0 puntos");
        }


        escaner.close();
    }
}
