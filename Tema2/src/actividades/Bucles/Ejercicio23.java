package actividades.Bucles;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        double nota;

        /*    CON DO WHILE 

        Escribe una aplicación que solicite 5 notas. Si el usuario escribe una
         * nota que no está entre
         * 0 y 10 se le informará del error y se le volverá a pedir el dato.
         * 
        do {
            System.out.print("Introduce una nota: ");
            nota = Integer.parseInt(System.console().readLine());

            if (nota < 0 || nota > 10) {
                System.out.println("Error, la nota debe estar entre 0 y 10.");
            } else {
                contador++;
            }
        } while (contador < 5);
        

        System.out.println("Todas las notas han sido introducidas correctamente.");
        */

        // CON FOR ANIDADO

        /*
         * Escribe una aplicación que solicite notas. Si el usuario escribe una
         * nota que no está entre
         * 0 y 10 se le informará del error y se le volverá a pedir el dato.
         */

        for (int i = 0; i <= 5; i++) {

            boolean continuar = true;
            
            do {

                System.out.print("Introduce una nota: ");
                nota = sc.nextDouble();
                
                if (nota >= 0 && nota <= 10) {
                    
                    continuar = false;

                } else {
                    System.out.println("Error, la nota debe estar entre 0 y 10.");
                }
            
            } while (continuar);
        }
        
        sc.close();

    }
}
