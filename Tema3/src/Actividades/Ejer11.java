package Actividades;

import java.util.Scanner;

public class Ejer11 {
    public static void main(String[] args) {
        /*
         * Crea un programa que almacene las órdenes que debe seguir un robot en un
         * array de 1000
         * elementos. Las órdenes son palabras escritas por el usuario en la consola
         * como:
         * 
         * • izquierda
         * • derecha
         * • arriba
         * • abajo
         * • matar
         * 
         * El programa parará de pedir órdenes cuando el usuario escriba "ejecutar".
         * Entonces mostrará la lista
         * de comandos que debe seguir el robot.
         */

        Scanner escaner = new Scanner(System.in);

        String [] ordenes = new String [1000];

        System.out.println("****** BIENVENIDO AL PROGRAMA DE ROBOT V.2300d-43 ******");

        //AÑADIR ORDENES
        for (int i = 0; i < ordenes.length; i++){

            System.out.println("Escribe las ordenes que debe seguir el robot");
            ordenes[i] = escaner.nextLine();
            
            //CREO LA VARIABLE J QUE VALDRÁ EL VALOR DE LA CANTIDAD DE ORDENES INTRODUCIDAS
            //PARA QUE NO ME MUESTRE LAS 1000 POSICIONES DEL ARRAY
            int j = i;
            
            //CONDICION DE ESCRIBIR EJECUTAR
            if (ordenes[i].equals("ejecutar")){

                //RECORRER ARRAY PARA MOSTRAR VALORES
                //USAMOS LA CONDICIÓN DE J PARA QUE SE PARE EN LA POSICIÓN DE LA ULTIMA ORDEN INTRODUCIDA
                for (i = 0; i< j; i++){
                    
                    System.out.println("Lista de ordenes: ");
                    System.out.println(ordenes[i]);
                        
                }
            }
        }

        //CERRAMOS ESCANER AUNQUE A CARLOS NO LE GUSTE
        escaner.close();
    }
}
