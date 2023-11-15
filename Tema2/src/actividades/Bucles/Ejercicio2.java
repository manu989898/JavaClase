package actividades.Bucles;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Modifica el programa anterior para que pida un carácter y también el número
        // de veces que queremos repetirlo.
       
        Scanner sc = new Scanner(System.in);
        
        int contador = 0;
       
        System.out.println("Introduce un caracter: ");
        int num = sc.nextInt();

        System.out.println("Introduce cuantas veces quieres repetirlo: ");
        int veces = sc.nextInt();

        while (contador < veces) {

            System.out.println(contador + " - " + num);
            contador++;
        }
        sc.close();

    }
}
