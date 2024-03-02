package actividades;

public class Ejer6 {
    public static void main(String[] args) {

        /*
         * Escribe un método llamado fahrenheit() que tome como argumento una
         * temperatura en grados centígrados y devuelva la temperatura en grados Fahrenheit.
         */
        double temp = 37.5; 
        System.out.println(temp + "En grados fahrenheit son: " + fahrenheit(temp));
    }

    static double fahrenheit(double temperatura) {

        return ((temperatura * 9) / 5) + 32;

    }
}
