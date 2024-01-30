package inicio;

import java.util.Scanner;

import biblioteca.Autor;
import biblioteca.Libro;

public class Inicio {

	public static void main(String[] args) {

		Scanner escaner = new Scanner(System.in);
	
		
		// Pedimos datos del Autor.
		System.out.println("Introduce el nombre del Autor:");
		String nombre = escaner.nextLine();
		
		System.out.println("Introduce el email del Autor:");
		String email = escaner.nextLine();
		
		System.out.println("Introduce el año de nacimiento del Autor:");
		int anioNacimiento = escaner.nextInt();
		
		// Creamos el objeto autor1 de tipo Autor.
		Autor autor1 = new Autor(nombre, email, anioNacimiento);
		
		
		//Pedimos datos del Libro
		System.out.println("Introduce el Título del libro");
		
		// Ponemos un nextLine() para vaciar el buffer. Asi evitamos el salto de pregunta.
		escaner.nextLine();
		
		String titulo = escaner.nextLine();
		
		System.out.println("Introduce el isbn del libro");
		String isbn = escaner.nextLine();
		
		System.out.println("Introduce el año actual");
		int anio = escaner.nextInt();
		
		// Creamos el objeto libro1 de tipo Libro.
		Libro libro1 = new Libro(titulo, isbn, autor1);
		Libro.setAnioActual(anio);
		
		// Mostramos los datos con el método toString()
		System.out.println("\n**** DATOS DEL AUTOR ****");
		System.out.println(autor1.toString());
		System.out.println("\n*** DATOS DEL LIBRO ****");
		System.out.println(libro1.toString() + ", Año actual: " + libro1.getAnioActual());
		
	}

}
