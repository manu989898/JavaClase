package actividades.Bucles;

import java.util.Scanner;

public class Ejercicio26b {
    public static void main(String[] args) {
        /*
         * Crea un programa que vaya pidiendo cinco números para mostrar sus tablas de
         * multiplicar. Si
         * el número introducido es 1, el programa escribirá el mensaje y contará com intento.
         * "¡No seas tonto!" y se volverá a
         * formular la pregunta.
         * Usando continue
         */
        Scanner escaner = new Scanner(System.in);
        int numero = 0;
        
        int multiplicador = 0;

        //Usamos while para que el programa pregunte 5 veces por un número

        for (int i = 0;i < 5;i++) {

            System.out.println("Introduce un número para mostrar su tabla de multiplicar: ");
            
            numero = escaner.nextInt();
            
            //Usamos un if para que si el usuario introduce un 1, el programa le diga que no sea tonto y vuelva a preguntar
            if (numero == 1) {
                System.out.println("¡No seas tonto!");
                //Al usar continue vovlerá a ejecutrarse el bucle for.
                continue;

              //Usamos else para que si el usuario introduce un número distinto de 1, el programa muestre la tabla de multiplicar
            } else {
                System.out.println("Tabla de multiplicar del " + numero + ":");
                
                //Usamos for para que se muestre la tabla de multiplicar del número introducido
                for (multiplicador = 0; multiplicador <= 10; multiplicador++) {
                    System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
                }
            }
            

        }
        escaner.close();
    }
}
