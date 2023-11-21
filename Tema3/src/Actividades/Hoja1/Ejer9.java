package Actividades.Hoja1;

public class Ejer9 {
    public static void main(String[] args) {
        /*
         * Escribe un programa que lea desde la consola el enunciado de una pregunta y
         * las cuatro posibles
         * respuestas, guardando los cinco valores en un array llamado test. A
         * continuación los mostrará cómo si fuera una pregunta de tipo test. 
         * Por ejemplo:
         * ¿Quién creó el Altair 8800, el primer ordenador personal?
         * a) Bill Gates
         * b) Steve Jobs
         * c) Ed Roberts
         * d) Gary Kildall
         */

        String [] test = {"a) Bill Gates", "b) Steve Jobs", "c) Ed Roberts", "d) Gary Kildall"};

        System.out.println("¿Quién creó el Altair 8800, el primer ordenador personal?");

        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }
}
