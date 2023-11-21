package Ejemplos;

public class MinYmaxArray {
    public static void main(String[] args) {
        
        /*
         * *** LOCALIZAR MÍNIMOS Y MAXIMOS EN UN ARRAY ***
         * 
         * edades { [] [] [] [] [] [] }
         *     i    0  1  2  3  4  5
         * 
         * posMin = 0;
         * for () para recorrer array
         * Si i < posMin le asignaremos ese valor a posMin 
         */
        
        int[] edades = {9,20,14,3,74,54};
        int posMin = 0;

        for (int i = 1; i < edades.length;i++){

            if (edades[i] < edades[posMin]){
                posMin = i;
            }
        }
        System.out.println("El valor mínimo es: " + edades[posMin] + " Está en la posición: " + posMin);
    }
}
