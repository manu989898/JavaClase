import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Actividad2 {
	
	private static Scanner escaner = new Scanner(System.in);
	private static HashMap<String,String> prospectos;
	
	public static void main(String[] args) {
		
		nuevoMedicamento(prospectos);
		
	}
	
	public static void nuevoMedicamento(HashMap prospectos) {
		prospectos = new HashMap<String, String>();
		
		System.out.println("¿Cual es el nombre del medicamento?");
		String nombre = escaner.nextLine();
		
		System.out.println("¿Cual es el prospecto del medicamento?");
		String prospecto = escaner.nextLine();

		prospectos.put(nombre, prospecto);
		
		System.out.println("Que medicamento desea buscar?");
		String prospectous = escaner.nextLine();
		consulta(prospectos, prospectous);
		
		
	}
	
	public static void consulta(HashMap prospectos, String clave ) {
		
		if (!prospectos.containsKey(clave)) {
			System.out.println("No exsiste el medicamento.");
		} else {
			
			System.out.println("El prospecto de " + clave + " es: " + prospectos.get(clave));
		}
		
	}
	
	public static void guardarTodo(HashMap prospectos) {
		
		
		try {
			BufferedWriter bf = new BufferedWriter(new FileWriter("ficheros/propectos.txt"));
			for (int i = 0; i < prospectos.size(); i++) {
				//bf.write(prospectos.);
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
}
