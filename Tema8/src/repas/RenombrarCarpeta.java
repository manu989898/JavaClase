package repas;

import java.io.File;
import java.util.Scanner;

public class RenombrarCarpeta {
	
	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("Introduce el nombre de la carpeta:");
		String nombreCarpeta = escaner.nextLine();

		System.out.println("Introduce el nuevo nombre del archivo:");
		String nombreArchivo = escaner.nextLine();
		
		File archivo = new File("ficheros/archivoNuevo");
		File carpeta = new File("ficheros/nuevo");
		
		carpeta.renameTo(new File("ficheros/" + nombreCarpeta));
		archivo.renameTo(new File("ficheros/" + nombreArchivo));
		

	}
	
}
