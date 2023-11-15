package actividades.Bucles;
import java.util.Scanner;
public class Ejercicio26 {
    public static void main(String[] args) {

        /*
         * Crea un programa que vaya pidiendo cinco números para mostrar sus tablas de
         * multiplicar. Si
         * el número introducido es 1, el programa escribirá el mensaje
         * "¡No seas tonto!" y se volverá a
         * formular la pregunta.
         */

        int numero = 0;
        int i = 0;
        int multiplicador = 0;

        Scanner escaner = new Scanner(System.in);

        //Usamos while para que el programa pregunte 5 veces por un número
        while (i < 5) {

            System.out.println("Introduce un número para mostrar su tabla de multiplicar: ");
            
            numero = escaner.nextInt();
            
            //Usamos un if para que si el usuario introduce un 1, el programa le diga que no sea tonto y vuelva a preguntar
            if (numero == 1) {
                System.out.println("¡No seas tonto!");

              //Usamos else para que si el usuario introduce un número distinto de 1, el programa muestre la tabla de multiplicar
            } else {
                System.out.println("Tabla de multiplicar del " + numero + ":");
                
                //Usamos for para que se muestre la tabla de multiplicar del número introducido
                for (multiplicador = 0; multiplicador <= 10; multiplicador++) {
                    System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
                }
            }
            
            i++;

        }

        escaner.close();

    }
}



