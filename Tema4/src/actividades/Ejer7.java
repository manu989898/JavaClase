package actividades;

public class Ejer7 {
    public static void main(String[] args) {

        /*
         * Escribe un método llamado celsius() que tome como argumento una temperatura
         * en grados Fahrenheit y devuelva la temperatura en grados centígrados.
         */
        double temp = 99.5; 
        System.out.println(temp + "f. En grados centigrados son: " + centigrados(temp));
    }

    static double centigrados (double temperatura) {

        return (temperatura - 32) * 5 / 9;
    }
}
