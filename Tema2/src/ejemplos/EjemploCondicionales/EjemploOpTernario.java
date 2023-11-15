package ejemplos.EjemploCondicionales;

import java.util.Scanner;

public class EjemploOpTernario {
    public static void main(String[] args) {
        /*   
        *** OPERADOR TERNARIO (?) ***

        Es un operador condicional que evalúa una condición booleana y devuelve un resultado
        dependiendo de si la condición es verdadera o falsa.
        Sustituye a un if-else cuando se quiere asignar un valor a una variable dependiendo de una condición.
        
        Sintaxis:
        variable = condición ? resultado1 : resultado2;
        */
        
        
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Cual es tu temperatura corporal?");

        float temperatura = entrada.nextFloat();
        String diagnostico;

        // Con if-else
        if (temperatura >= 37) {
            System.out.println("Tienes fiebre");
        } else {
            System.out.println("No tienes fiebre");
        }
    
        // Con operador ternario
        diagnostico = temperatura >= 37 ? "Tienes fiebre" : "No tienes fiebre";
        System.out.println("Diagnostico: " + diagnostico);

        entrada.close();

    }
}
