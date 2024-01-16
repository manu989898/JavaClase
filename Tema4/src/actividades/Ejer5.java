package actividades;

public class Ejer5 {
    public static void main(String[] args) {
        
        /*
         * Crea un método que tome un número decimal y devuelva su cubo.
         */
        System.out.println("El cubo de 2 es: " + cubo(2));
    }

    static double cubo (double num) {

        return Math.pow(num, 3);
    }

}
