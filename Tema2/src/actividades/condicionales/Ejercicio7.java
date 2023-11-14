package actividades.condicionales;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		/*
		 * Juego de adivinar el número secreto. El ordenador nos preguntará un número
		 * del 1 al 10. Si coincide con el número secreto (que habrás codificado como
		 * una constante entera) nos felicitará. Si no, nos dirá que hemos fallado.
		 */
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("Escribe un número del 1 al 10");
		int num = escaner.nextInt();
		final int NUM_SECRETO = 3;
		if (num == NUM_SECRETO) {
			System.out.println("De locos, acertaste!");
		} else {
			System.out.println("F  :(");
		}
		escaner.close();
	}

}
