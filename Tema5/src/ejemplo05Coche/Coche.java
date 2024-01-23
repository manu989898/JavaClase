package ejemplo05Coche;

import java.util.Scanner;

public class Coche {

	// Propiedades de cada coche.
	String matricula;
	String marca;
	String modelo;
	String averia;
	int quilometros;
	
	// Constructor explícito que tome los 5 valores de los atributos
	Coche(String matricula, String marca, String modelo, String averia, int quilometros){
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.averia = averia;
		this.quilometros = quilometros;
	}
	
	// Constructor explicíto que tome matricula, marca y modelo.
	Coche(String matricula, String marca, String modelo){
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	
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
	
	void mostrar() {
		System.out.println("\n*** DATOS DEL VEHÍCULO ***");
		System.out.println("Matricula: " + matricula);
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Averia: " + averia);
		System.out.println("KM: " + quilometros);
	}
}
