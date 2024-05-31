package repas;

import java.io.File;
import java.util.Scanner;

public class CrearRistraCarpetas {
    
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Introduce la ristra de carpetas y te la crearé en tu carpeta principal:");

        String ristraCarpetas = escaner.nextLine();

        String rutaCarpetaPersonal = System.getProperty("user.home");
        File nuevaCarpeta = new File(rutaCarpetaPersonal + "/" + ristraCarpetas);
        nuevaCarpeta.mkdirs();

        if (nuevaCarpeta.exists()) {
            System.out.println("Carpeta creada");
        } else {
            System.out.println("No se ha podido crear la carpeta");
        }


    }

}
