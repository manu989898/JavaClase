package Ejemplos;

public class Ejemplo7 {
    public static void main(String[] args) {
        
        String palabra = "Hola";
        System.out.println("La inicial de la palabra " + palabra + " es " + inicial(palabra));
    }
    
    
    
    
    // Devuelve la primera letra de la palabra que le pasemos como parametro.
    static char inicial(String palabra) {
            
            return palabra.charAt(0);
    }
}
