package actividades.condicionales;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*
		 * Queremos crear una aplicación que controle el acceso a un ordenador pidiendo
		 * una clave de acceso. El programa pedirá una cadena de caracteres al usuario.
		 * La comparará con la cadena "java8" y si son iguales, escribirá
		 * "Acceso permitido". En caso contrario escribirá "Acceso denegado". Para
		 * guardar la clave "java8" utiliza una constante llamada
		 * CLAVE_REQUERIDA.[Ayuda: Recuerda que para comparar dos cadenas no podemos
		 * utilizar el símbolo == sino que hay que usar variable.equals(cadena).]
		 */

		Scanner escaner = new Scanner(System.in);
		final String CLAVE_REQUERIDA = "java8";

		System.out.println("***PROGRAMA CLAVE ACCESO***");

		System.out.println("Ingrese la clave de acceso");
		String CLAVE_INTRODUCIDA = escaner.nextLine();

		if (CLAVE_INTRODUCIDA.equals(CLAVE_REQUERIDA)) {

			System.out.println("Acceso permitido");
		} else {

			System.out.println("Acceso denegado");
		}
		escaner.close();
	}

}
