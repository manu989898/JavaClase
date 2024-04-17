package ejemplos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploFileReader {

	public static void main(String[] args) {
		
		try {
			// Lector de archivo.
			FileReader lector = new FileReader("ficheros/nombres.txt");
			
			// Para acceder al archivo usando un Buffer.
			BufferedReader buffer = new BufferedReader(lector);
			
			//Leemos el archivo linea a linea
			String linea = buffer.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea= buffer.readLine();
			}
			System.out.println("Fin del archivo.");
			
			// Cerramos el buffer de entrada.
			buffer.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo.");
		} catch (IOException e) {
			System.out.println("Error al cerrar el archivo.");
		}
			
	}
	
}
