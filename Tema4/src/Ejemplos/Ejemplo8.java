package Ejemplos;

public class Ejemplo8 {
    public static void main(String[] args) {
        
        /*
         * Devuelve el área de un triangulo con los argumentos de base y altura recibidos.
         */

        System.out.println("El area del triangulo de base 4 y altura 5 es: " + area(4,5));
    }

    static double area(double a,double b) {

        return a*b/2;
    }
}
