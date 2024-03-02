package Practicas;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		/*
		 * Actividad 3
		 * Crea un programa que calcule un número aleatorio entre 1 y 7. A continuación
		 * el usuario tendrá que
		 * intentar adivinarlo. Cada vez que haga un intento, el programa le dirá si se
		 * ha quedado corto o se ha
		 * pasado. Si acierta el número, el programa le dirá "Acertaste" y terminará. Si
		 * no acierta en tres
		 * intentos, habrá perdido el juego.
		 * 
		 */
		Scanner escaner = new Scanner(System.in);
		int rand = (int) (Math.random() * 7 + 1);
		int intentos = 0;
		int num;

		// Número random para hacer pruebas
		System.out.println(rand);

		while (intentos < 3) {

			System.out.println("Intenta adivinar el número");
			num = escaner.nextInt();

			if (num == rand) {
				System.out.println("Acertaste!");
				intentos++;
				System.exit(num);

			} else if (num < rand) {
				System.out.println("Se ha quedado corto");
				intentos++;

			} else if (num > rand) {
				System.out.println("Te has pasado");
				intentos++;

			}
		}

		System.out.println("Has fallado, el número era: " + rand);

	}

}
