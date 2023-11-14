package Actividades;

public class Ejer12 {
    public static void main(String[] args) {
        /*
         * Escribe una aplicación que cree un array de 100 posiciones llamado matriculas
         * y rellene todas las posiciones con el valor por defecto "sinmatricula". 
         * Haz que después se muestren todos los valores mediante un bucle for.
         */

        //INICIALIZAMOS ARRAY DE 100 POSICIONES (0 A 99)
        String [] matriculas = new String [100];

        //BUCLE FOR PARA RECORRER ARRAY Y ASIGNARLE "sinmatricula" A CADA POSICIÓN
        for (int i = 0; i < matriculas.length; i++) {
            matriculas [i] = "sinmatricula";
        }

        //BUCLE FOR PARA MOSTRAR VALOR DE LAS POSICIONES
        for (int i = 0; i < matriculas.length; i++) {
            System.out.println("Posicion " + i + " = " + matriculas [i]);
        }
    }
}
