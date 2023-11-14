package actividades.condicionales;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		/*
		 * Crea un programa que pida al usuario una contraseña. Si escribe "1234" el
		 * programa responderá "Acceso concedido.".
		 */
		Scanner escaner = new Scanner(System.in);

		System.out.println("***PROGRAMA CONTRASEÑA SEGURA***");
		System.out.println("Escriba su contraseña");
		String password = escaner.nextLine();

		//Usamos el .equals para preguntar si es igual a lo que pongamos.
		if (password.equals("1234")) {
			System.out.println("Acceso concedido");
		}
		escaner.close();
	}

}
