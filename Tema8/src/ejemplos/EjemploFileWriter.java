package ejemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EjemploFileWriter {

	public static void main(String[] args) {
		// Podemos usar System.getProperty("user.home") para que detecte la ruta automáticamente.
		final String RUTA = System.getProperty("user.home") + "/nombres.txt";
		Scanner escaner = new Scanner(System.in);
		
		// Abrir el archivo para escritura.
		try {
			// Le asociamos un buffer en memoria para mejorar el rendimiento.
			BufferedWriter buffer = new BufferedWriter(new FileWriter(RUTA));
			
			System.out.println("Escribe tu apellido:");
			String nombre = escaner.nextLine();
			
			while (!nombre.equals("listo")) {
				// Orden para escribir
				buffer.write(nombre+"\n");	
				System.out.println("Escribe tu apellido:");
				nombre = escaner.nextLine();
			}
			// Siempre hay que cerrar el buffer!!!!!!!!!!!!!!!!!!
			buffer.close();
			
		} catch (IOException e) {
			System.out.println("Error de escritura.");
		}
	}	
	
}
