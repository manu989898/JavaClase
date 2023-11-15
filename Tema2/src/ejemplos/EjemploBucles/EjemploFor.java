package ejemplos.EjemploBucles;

import java.util.Scanner;

public class EjemploFor {
    public static void main(String[] args) {
        
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Dime una palabra y te la mostraré 10 veces");
        
        String palabra = escaner.nextLine();
        int contador = 1;
        
        // Bucle WHILE:
        System.out.println("*** CON BUCLE WHILE ***");
        while (contador <= 10) {
            System.out.println(contador + " " + palabra);
            contador++;
        }

        // Bucle FOR:
        // Declaramos una variable contador i y la inicializamos a 1, mientras i sea menor o igual a 10, 
        //se ejecuta el código del bucle, y al final de cada iteración incrementamos el valor de i en 1
        
        // for (inicialización; condición; incremento) { ... }
        System.out.println("*** CON BUCLE FOR ***");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " " + palabra);
        }
        escaner.close();
    }
}
