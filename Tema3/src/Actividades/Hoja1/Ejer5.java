package Actividades.Hoja1;

public class Ejer5 {
    public static void main(String[] args) {
        /*
         * Crea un array llamado notas con cinco posiciones y ve asignando a cada una de
         * ellas el valor de
         * un examen que hayas hecho este curso (no sólo de programación). Haz que
         * después se muestren todos los valores mediante un bucle while.
         */

        double [] notas = {7.7,7.03,7.7,10,10 };
        
        int i = 0;

        while (i < 5) {
            System.out.println(notas[i]);
            i++;
        }

    }
}
