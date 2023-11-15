package ejemplos.EjemploCondicionales;

import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {

		/*
		 * Si la edad del usuario es > 18 años el programa permitira entrar. Debido a la
		 * condición if.
		 */

		Scanner escaner = new Scanner(System.in);

		System.out.println("***CÁMARA FRIGORÍFICA***");

		System.out.println("CUAL ES LA TEMPERATURA?");
		float temp = escaner.nextFloat();

		if (temp >= -20) {
			System.out.println("ENCENDER CÁMARA");
		} else {
			System.out.println("APAGAR CÁMARA");
		}

		System.out.println("Fin del programa.");
		escaner.close();

	}

}
