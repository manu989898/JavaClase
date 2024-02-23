package auxiliar;

import java.util.Scanner;

public class Alumno {
	private int numExpediente;
	private String apellidos;
	private String nombre;
	private Grupo grupo;
	
	public Alumno() {
		
	}
	
	public Alumno(int numExpediente, String apellidos, String nombre,Grupo grupo) {
		this.numExpediente = numExpediente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.grupo = grupo;
	}
	
	public String toString() {
		return "\nNum Expediente: " + numExpediente + "\nApellidos: " + apellidos + 
				"\nNombre: " + nombre + "\nGrupo: " + grupo;
	}
	public void leeDatos() {
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("Ingresa el num de expediente:");
		numExpediente = escaner.nextInt();

		
		System.out.println("Ingresa los apellidos:");
		apellidos = escaner.nextLine();
		
		System.out.println("Ingresa el nombre;");
		nombre = escaner.nextLine();
		
		System.out.println("Ingresa el gurpo:");
		Grupo grupo1 = new Grupo();
		grupo1.leeDatos();
		
	}

	public int getNumExpediente() {
		return numExpediente;
	}
	
	
}
