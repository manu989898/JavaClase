package ejemplos.EjemploCondicionales;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {

		/*
		 * Si la edad del usuario es > 18 años el programa permitira entrar. Debido a la
		 * condición if.
		 */

		Scanner escaner = new Scanner(System.in);

		System.out.println("***PORTERO DE DISCOTECA***");

		System.out.println("Cuántos años tienes?");
		int edad = escaner.nextInt();

		if (edad >= 18) {
			System.out.println("Se te permite entrar");
		} else {
			System.out.println("No tienes la edad requerida para acceder");
		}

		System.out.println("Fin del programa.");
		escaner.close();

	}

}
