package actividades.condicionales;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 * Crea un programa que pregunte al usuario cómo se dice en inglés "ordenador".
		 * Si el usuario responde "computer" entonces recibirá una felicitación. Si no,
		 * recibirá un mensaje de consolación.
		 */

		Scanner escaner = new Scanner(System.in);
		
		System.out.println("Escribe (ordenador) en Inglés a continuación");
		String respuesta = escaner.nextLine();
		
		if (respuesta.equals("computer")) {
			System.out.println("Felicidades crack!");
		} else {
			System.out.println("Tendria que consolarte por fallar pero no.");
		}
		escaner.close();
	}

}
