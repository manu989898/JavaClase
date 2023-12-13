package Practicas;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		/*
		 * Actividad 2 Escribe una aplicación que pregunte dos números al usuario y le
		 * diga cuál es mayor (o si son iguales). Este proceso se repetirá
		 * infinitamente.
		 */

		int num1 = 0;
		int num2 = 0;

		Scanner escaner = new Scanner(System.in);
		
		//Bucle infinito (sin condicion de salida porque no lo pone en el enunciado)
		while (true) {

			System.out.println("Ingresa el primer número");
			num1 = escaner.nextInt();

			System.out.println("Ingresa el segundo número");
			num2 = escaner.nextInt();

			if (num1 < num2) {
				System.out.println("El numero mayor es: " + num2);
				
			} else if (num1 > num2) {
				
				System.out.println("El numero mayor es: " + num1);
			} else if (num1 == num2) {
				
				System.out.println("Los dos números son iguales");
			}

		}

	}

}
