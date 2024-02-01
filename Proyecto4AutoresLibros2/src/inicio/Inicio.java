package inicio;

import java.util.Scanner;

import biblioteca.Autor;
import biblioteca.Libro;

public class Inicio {

	private static Scanner escaner = new Scanner(System.in);

	public static void main(String[] args) {

		
		
		Autor autor1 = leerAutor();
		System.out.println("\n**** DATOS DEL AUTOR ****");
		System.out.println(autor1.toString());

		Autor autor2 = leerAutor();
		System.out.println("\n**** DATOS DEL AUTOR ****");
		System.out.println(autor2.toString());

		
		
		System.out.println("Introduce el Título del libro");
		String titulo = escaner.nextLine();

		System.out.println("Introduce el isbn del libro");
		String isbn = escaner.nextLine();

		System.out.println("Introduce el año actual");
		int anio = escaner.nextInt();

		
		
		Autor[] autores = { autor1, autor2 };
		Libro libro1 = new Libro(titulo, isbn, autores);
		Libro.setAnioActual(anio);
		System.out.println("\n*** DATOS DEL LIBRO ****");
		System.out.println(libro1.toString() + ", Año actual: " + Libro.getAnioActual());

	}

	// static siempre porque está en el main
	private static Autor leerAutor() {

		// Pedimos datos del Autor.
		System.out.println("\nIntroduce el nombre del Autor:");
		String nombre = escaner.nextLine();

		System.out.println("Introduce el email del Autor:");
		String email = escaner.nextLine();

		System.out.println("Introduce el año de nacimiento del Autor:");
		int anioNacimiento = escaner.nextInt();
		
		// Vaciamos el buffer
		escaner.nextLine();

		return new Autor(nombre, email, anioNacimiento);

	}

}
