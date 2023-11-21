package Ejemplos;

public class MinYmaxArray {
    public static void main(String[] args) {
        
        /*
         * *** LOCALIZAR MÍNIMOS Y MÁXIMOS EN UN ARRAY ***
         * 
         * edades { [] [] [] [] [] [] }
         *     i    0  1  2  3  4  5
         * 
         * posMax = 1;
         * posMin = 1;
         * for () para recorrer array
         * Si i < posMin le asignaremos ese valor a posMin 
         */
        
        int[] edades = {9,20,14,3,74,54};
        int posMin = 1;
        int posMax = 1;

        for (int i = 1; i < edades.length;i++){

            if (edades[i] < edades[posMin]){
                posMin = i;
            }
            if (edades[i] > edades[posMax]) {
                posMax = i;
            }
        }
        System.out.println("El valor mínimo es: " + edades[posMin] + " Está en la posición: " + posMin);
        System.out.println("El valor máximo es: " + edades[posMax] + " Está en la posición: " + posMax);

    }
}
