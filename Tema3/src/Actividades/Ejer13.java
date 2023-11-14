package Actividades;

public class Ejer13 {
    public static void main(String[] args) {
        /*
         * Crea un programa que rellene un array llamado potencias con las primeras 20 potencias de 2.
         * Haz que después se muestren todos los valores mediante un bucle while.
         */

        //INICIALIZAMOS ARRAY DE 20 POSICIONES (0 A 19)

        int [] potencias = new int [20];

        //BUCLE FOR PARA RECORRER ARRAY Y ASIGNARLE VALOR A CADA POSICIÓN
        for (int i = 0; i < potencias.length; i++) {

            //USAMOS MATH.POW PARA CALCULAR POTENCIAS
            potencias [i] = (int) Math.pow(2, i);
        }

        //RESETEAMOS VARIABLE I PARA QUE NO SE REPITA EL VALOR DE LA POSICIÓN 20
        int i = 0;
        
        //USAMOS BUCLE WHILE PARA MOSTRAR VALOR DE LAS POSICIONES
        while (i < potencias.length) {
            
            System.out.println("Posicion " + i + " = " + potencias [i]);
            i++;

        }




        

        

    }
}
