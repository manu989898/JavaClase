package repas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CrearArchivosYCarpetas {
    
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce el nombre del archivo:");
        String nombreArchivo = escaner.nextLine();

        try {
            FileWriter archivo = new FileWriter("ficheros/" + nombreArchivo);
            archivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Introduce el nombre de la carpeta:");
        String nombreCarpeta = escaner.nextLine();

        File carpeta = new File("ficheros/" + nombreCarpeta);
        // Para crearla
        carpeta.mkdir();
        if (carpeta.exists()) {
            System.out.println("Carpeta creada");
        } else {
            System.out.println("No se ha podido crear la carpeta");
        }

        escaner.close();

    }
}
