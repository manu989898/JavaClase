package actividades.condicionales;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		/*
		 * 10.- Vamos a perfeccionar la aplicación anterior pidiendo un nombre de
		 * usuario y una contraseña para permitir el acceso al ordenador. El programa
		 * guardará el nombre de usuario y la contraseña necesarias en las constantes
		 * NOMBRE_REQUERIDO, PASSWORD_REQUERIDO. Si el nombre de usuario y la contraseña
		 * introducidas coinciden con los de estas constantes, aparecerá el mensaje
		 * "Acceso permitido". En caso contrario se escribirá "Acceso denegado".
		 */

		Scanner escaner = new Scanner(System.in);

		String NOMBRE_REQUERIDO = "manu";
		String PASSWORD_REQUERIDO = "java8";

		System.out.println("Introduce el nombre de usuario");
		String nombreIntro = escaner.nextLine();
		
		System.out.println("Introduce tu contraseña");
		String contraseñaIntro = escaner.nextLine();

		/*
		 * Usamos .equals para meter el condicional de que deben de ser iguales.
		 * Añadimos el && para que sea obligatorio que el otro.
		 */
		if (nombreIntro.equals(NOMBRE_REQUERIDO) && contraseñaIntro.equals(PASSWORD_REQUERIDO)) {

			System.out.println("Acceso permitido");
		} else {
			System.out.println("Acceso denegado");

		}
		escaner.close();
	}
}
