package Ejemplos;

public class CompararCadenas {
    public static void main(String[] args) {

        /*
         * cadena1.compareTo(cadena2) 
         * si el resultado es negativo cadena1 alfabeticamente iria antes que cadena 2
         * si el resultado es cero son iguales
         * si el resultado es positivo cadena1 alfabeticamente iria despues que cadena 2
         */


        String palabra1 = "Roma", palabra2 = "Florencia";
        
        if (palabra1.compareTo(palabra2) < 0) {
        
            System.out.println(palabra1 + " va antes de " + palabra2);

        } else if (palabra1.compareTo(palabra2) == 0) {
        
            System.out.println(palabra1 + " es igual a " + palabra2);

        } else {
        
            System.out.println(palabra1 + " va después de " + palabra2);
        }
        
        System.out.println(palabra1.compareTo(palabra2));
    }
}
