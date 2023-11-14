package actividades.Bucles;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        // Crea un programa que pida un carácter al usuario. A continuación lo escribirá
        // 100 veces.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter: ");
        int num = sc.nextInt();

        int contador = 0;
        while (contador < 101) {

            System.out.println(contador+ " - " + num);
            contador++;
        }
        sc.close();

    }
}
