package actividades.Bucles;

public class Ejercicio20 {
    public static void main(String[] args) {
        
        /*
         * Crea un programa que muestre las diez primeras potencias del número 2 (o sea, 2, 4, 8, 16, etc.) usando for.
         */

        System.out.println("*** Lista de potencias de 2 ***");

        int potencia = 1;

        for (int i = 0; i <= 10; i++) {
           
            System.out.println("2 elevado a " + i + " = " + potencia);
           
            potencia = (int) Math.pow(2, i);

        }


        


        

    }
}
