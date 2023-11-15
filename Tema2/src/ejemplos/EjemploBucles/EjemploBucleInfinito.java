package ejemplos.EjemploBucles;

import java.util.Scanner;

public class EjemploBucleInfinito {
    public static void main(String[] args) {
        //Bucle infinito

        Scanner escaner = new Scanner(System.in);
        
        //Al usar while(true) siempre será infinito.
        while (true) {
            
            System.out.println("Escribe un nombre:");
            String nombre = escaner.nextLine();
            System.out.println("Escribiste: " + nombre);
            
            //Aqui le añadimos un modo de terminaer el bucle infinito.
            if(nombre.equals("")){
                break;
            }
        }
        escaner.close();
    }
}
