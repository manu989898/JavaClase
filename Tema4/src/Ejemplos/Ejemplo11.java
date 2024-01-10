package Ejemplos;

public class Ejemplo11 {

    // Una variable Global se tiene que declarar fuera del método main y abarca toda la clase.
    static String respuesta = "";
    public static void main(String[] args) {

        /*
         * 
         */

         System.out.println("Llamando al mayordomo.");
		
         // Llamamos al método mayordomo.
         mayordomo(respuesta);
         
         System.out.println("Traigame unos turrones");
         
     }
     
     
     static void mayordomo(String respuesta) {
         
        respuesta = "¿Que desea, señor?";
         System.out.println(respuesta);

    }
}
