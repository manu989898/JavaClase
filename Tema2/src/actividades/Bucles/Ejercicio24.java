package actividades.Bucles;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {

        /*
         * Amplía la aplicación anterior para que a medida que se van introduciendo las
         * notas se vayan sumando (en una variable llamada suma). Al final, devolverá la nota media de
         * esas notas.
         */
        
        Scanner escaner = new Scanner(System.in);
        double nota;
        int contador = 0;
        double suma=0;
        do {
            System.out.print("Introduce una nota: ");
            nota = escaner.nextInt();
            
            if (nota < 0 || nota > 10) {
                System.out.println("Error, la nota debe estar entre 0 y 10.");
            } else {
                suma = suma + nota;
                contador++;
            }
        } while (contador < 5);

        System.out.println("Todas las notas han sido introducidas correctamente.");
        System.out.println("La media de las notas es: " + suma/5);
        escaner.close();

    }
}
