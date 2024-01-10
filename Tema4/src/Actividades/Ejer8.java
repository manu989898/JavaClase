package Actividades;

public class Ejer8 {
    public static void main(String[] args) {

        /*
         * Escribe un programa que pida los coeficientes a, b y c de una ecuación de
         * segundo grado
         * (ax2+bx+c=0). A continuación mostrará las dos soluciones de la ecuación. Usa
         * dos métodos que
         * tomen como parámetros los coeficientes a, b y c, y devuelvan cada uno una
         * solución de la ecuación.
         */

        double a = 1, b = -3, c = 1;
        
        System.out.println("Las soluciones de la ecuación " + a + "x^2 + " + b + "x + " + c + " son: " + solucion1(a, b, c) + " y " + solucion2(a, b, c));

    }
    // con el +b
    static double solucion1 (double a, double b, double c) {

        return (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }
    // con el -b
    static double solucion2 (double a, double b, double c) {

        return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

}
