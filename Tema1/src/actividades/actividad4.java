package actividades;

import java.util.Scanner;

public class actividad4 {

	public static void main(String[] args) {
		
		/*
		 Crea un programa que pregunte el nombre de un alumno y sus notas de las tres evaluaciones y devuelva la media.
		 */
		
		Scanner escaner = new Scanner(System.in);

		System.out.println("Indica cual es tu nombre");
		String nombre = escaner.nextLine();

		System.out.println("Introduce las tres notas de tus evalucaciones");
		int eval1 = escaner.nextInt();
		int eval2 = escaner.nextInt();
		int eval3 = escaner.nextInt();
		float media = ((eval1 + eval2 + eval3) / 3);

		System.out.println("La nota media es: " + media);
	}

}
