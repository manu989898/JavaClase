package actividades.Bucles;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {

        /*
         * Escribe una aplicación que pregunte repetidamente un número entero hasta que
         * el usuario
         * escriba un valor entre 1 y 10. A continuación el programa escribirá un
         * mensaje informando del
         * número introducido. usando while y Scanner
         */ 
        Scanner escaner = new Scanner(System.in);
        int num = 0;

        while (num < 1 || num > 10) {
            System.out.println("Introduce un numero entre 1 y 10: ");
            num = escaner.nextInt();
        }
        System.out.println("El numero introducido es: " + num);
        escaner.close();

    }
}
