package repas;

import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class RenombrarCarpeta2 {

	public static void main(String[] args) {

		Scanner escaner = new Scanner(System.in);

		System.out.println("Introduce el nombre de la carpeta:");
		String nombreCarpeta = escaner.nextLine();

		System.out.println("Introduce el nuevo nombre del archivo:");
		String nombreArchivo = escaner.nextLine();

		JFileChooser elegirArchivo = new JFileChooser("ficheros/");
		int seleccion = elegirArchivo.showOpenDialog(null);

		if (seleccion != JFileChooser.APPROVE_OPTION) {
			System.out.println("No se ha seleccionado ningún archivo");
			return;
		}

		JFileChooser elegirCarpeta = new JFileChooser();
		elegirCarpeta.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int seleccion2 = elegirCarpeta.showOpenDialog(null);

		if (seleccion2 != JFileChooser.APPROVE_OPTION) {
			System.out.println("No se ha seleccionado ninguna carpeta");
			return;
		}

		File archivo = elegirArchivo.getSelectedFile();
		File carpeta = elegirCarpeta.getSelectedFile();

		System.out.println(archivo.toString());
		System.out.println(carpeta.toString());

		carpeta.renameTo(new File("ficheros/" + nombreCarpeta));
		archivo.renameTo(new File("ficheros/" + nombreArchivo));

	}

}
