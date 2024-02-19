package auxiliar;

import java.util.Scanner;

public class Grupo {
	
	private int id;
	private String nivel;
	private int curso;
	private String clase;
	
	public Grupo() {
		
	}
	
	public Grupo(int id, String nivel, int curso, String clase) {
		this.id = id;
		this.nivel = nivel;
		this.curso = curso;
		this.clase = clase;
	}
	
	public String toString() {
		return "\nID: " + id + "\nNIVEL: " + nivel + "\nCURSO: " + curso + "\nCLASE: " + clase;
	
	}
	
	public void leeDatos() {
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("Ingresa el ID:");
		id = escaner.nextInt();
		
		escaner.nextLine();
		
		System.out.println("Ingresa el nivel:");
		nivel = escaner.nextLine();
		
		System.out.println("Ingresa el curso;");
		curso = escaner.nextInt();
		
		escaner.nextLine();
		
		System.out.println("Ingresa la clase:");
		clase = escaner.nextLine();
		
		
	}
}
