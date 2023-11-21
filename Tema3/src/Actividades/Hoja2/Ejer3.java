package Actividades.Hoja2;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {

        /*
         * Escribe un programa que lea una lista de nombres (uno a uno, hasta un máximo
         * de 10) por consola y los vaya guardando en un array llamado nombres. La
         * aplicación
         * terminará de pedir palabras cuando el usuario escriba "nadie".
         * A continuación revisará el array y averiguará si se ha introducido el nombre
         * "Calderón". Si es así
         * escribirá "de la Barca". Si no, escribirá "Nombre no encontrado". Utiliza una
         * variable semáforo
         * llamándola nombreEncontrado.
         */

        Scanner scan = new Scanner(System.in);

        String[] nombres = new String[10];
        int i = 0;
        String nombre = "";
        boolean nombreEncontrado = false;
        int contador = 0;

        do {

            System.out.print("Introduce un nombre: ");
            nombre = scan.nextLine();

            if (!nombre.equals("nadie")) {
                nombres[i] = nombre;
                i++;
                contador++;
            }
        } while (!nombre.equals("nadie") && i < 10);
        
        scan.close(); 
        
        for (i = 0; i <= contador; i++) {

            if (nombres[i].equals("Calderon")) {

                nombreEncontrado = true;
            }
        }

        if (nombreEncontrado) {

            System.out.println("de la Barca");
        } else {

            System.out.println("Nombre no encontrado");
        }
           
    }
}
