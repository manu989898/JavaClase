package ejemplo02Coche;

import java.util.Scanner;

public class Coche {

	// Propiedades de cada coche.
	String matricula;
	String marca;
	String modelo;
	String averia;
	int quilometros;
	
	// leeDatos() pregunta al usuario los valores de las propiedades y los lee desde consola.
	
	void leeDatos() {
		Scanner escaner = new Scanner(System.in);
		System.out.println("INTRODUCCIÓN DE DATOS EN EL SISTEMA");
		
		System.out.println("Matricula: ");
		matricula = escaner.nextLine();
	
		System.out.println("Marca: ");
		marca = escaner.nextLine();
		
		System.out.println("Modelo: ");
		modelo = escaner.nextLine();
		
		System.out.println("Averia: ");
		averia = escaner.nextLine();
		
		System.out.println("Quilometros:");
		quilometros = escaner.nextInt();
		
	}
}
