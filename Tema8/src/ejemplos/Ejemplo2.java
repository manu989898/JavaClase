package ejemplos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo2 {

	public static void main(String[] args) {
		final String NOMBRE_ARCHIVO = "ficheros/mascotas.txt";

		try {

			BufferedReader buffer = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));
			int numPerros = 0;
			String linea = buffer.readLine();
			while (linea != null) {
				if (linea.contains("Perro")) {

					numPerros++;
				}
				linea = buffer.readLine();

			}
			System.out.println(numPerros);

			buffer.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
