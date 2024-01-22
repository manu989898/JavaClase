package actividades;

public class Ejer2 {
    public static void main(String[] args) {

        /*
         * Modifica el programa anterior para que en lugar de escribir nada en pantalla,
         * devuelva el String "Hola, nombre, no parece que tengas edad años"
         */
        
        String nombre = "Manuel";
        int edad = 25;
        System.out.println(halagador(nombre, edad));
    }
    
    

    static String halagador (String nombre, int edad) {
        
        String frase = "Hola, " + nombre + ", no parece que tengas " + edad + " años";
        return frase;
    }
}
