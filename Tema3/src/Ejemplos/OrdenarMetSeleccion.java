package Ejemplos;

import java.util.Arrays;

public class OrdenarMetSeleccion {
    
    public static void main(String[] args) {
        
        /*
         *  *** ALGORITMO DE SELECCIÓN ***
         * HAY QUE BUSCAR EL VALOR MAS PEQUEÑO E INTERCAMBIARLO CON EL VALOR DE LA PRIMERA POSICION
         * [5, 1, 4, 2, 8]
         * 
         * FASE DE BUSQUEDA, ENCONTRAR EL VALOR MAS PEQUIEÑO DEL ARRAY
         * INTERCAMBIARLO CON EL VALOR DE LA PRIMERA POSICION
         * [1, 5, 4, 2, 8]
         * 
         * FASE DE BUSQUEDA, ENCONTRAR EL VALOR MAS PEQUIEÑO DEL ARRAY SIN TENER EL CUENTA LA PRIMERA POSICION
         * INTERCAMBIARLO CON EL VALOR DE LA SEGUNDA POSICION
         * [1, 2, 4, 5, 8]
         * 
         * FASE DE BUSQUEDA, ENCONTRAR EL VALOR MAS PEQUIEÑO DEL ARRAY SIN TENER EL CUENTA LA PRIMERA Y SEGUNDA POSICION
         * INTERCAMBIARLO CON EL VALOR DE LA TERCERA POSICION
         * [1, 2, 4, 5, 8]
         * 
         * FASE DE BUSQUEDA, ENCONTRAR EL VALOR MAS PEQUIEÑO DEL ARRAY SIN TENER EL CUENTA LA PRIMERA, SEGUNDA Y TERCERA POSICION
         * INTERCAMBIARLO CON EL VALOR DE LA CUARTA POSICION
         * [1, 2, 4, 5, 8]
         * 
         * FASE DE BUSQUEDA, ENCONTRAR EL VALOR MAS PEQUIEÑO DEL ARRAY SIN TENER EL CUENTA LA PRIMERA, SEGUNDA, TERCERA Y CUARTA POSICION
         * INTERCAMBIARLO CON EL VALOR DE LA QUINTA POSICION
         * [1, 2, 4, 5, 8]
         */

        //COMO INTERCAMBIAR DOS VALORES DE UN ARRAY

        //Declaramos el array
        int[] array = { 20, 12, 22, 15, 3 };

        //Declaramos variables
        int aux = 0;
        int posMin = 0;
        
        //Mostramos el array desordenado
        System.out.println(Arrays.toString(array));

        //Recorremos el array menos la posicion final
        for (int i = 0; i < array.length -1; i++) {
            
            //Asignamos el valor de la posicion actual a la variable min
            posMin = i;
            
            //Recorremos el array desde la posicion actual + 1
            for (int j = i + 1; j < array.length; j++) {
                
                //Comprobamos si el valor de la posicion actual es mayor que el valor de la posicion j
                if (array[posMin] > array[j]) {
                    
                    //Asignamos el valor de la posicion j a la variable min
                    posMin = j; 
                }
                
            }  
            //Asignamos el valor de la posicion actual a la variable aux
            aux = array[i];
            
            //Asignamos el valor de la posicion min a la posicion actual
            array[i] = array[posMin];
            
            //Asignamos el valor de la variable aux a la posicion min
            array[posMin] = aux;

            System.out.println(Arrays.toString(array));
        }
        //Mostramos el array ordenado
        System.out.println(Arrays.toString(array));
        
        /*  
            Para mostrar el array sin bucle para recorrerlo
            import java.util.Arrays;
            System.out.println(Arrays.toString(array));
        */
    }
}
