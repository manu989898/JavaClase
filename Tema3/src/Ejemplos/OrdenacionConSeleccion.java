package Ejemplos;

import java.util.Arrays;

public class OrdenacionConSeleccion {
    
    public static void main(String[] args) {
        
        int [] valores = {20, 12, 22, 15, 3};

        int aux = 0;
        int posMin;


        System.out.println("Array desordenado: ");
        System.out.println(Arrays.toString(valores));
        //Recorremos el array
        for (int i = 0; i < valores.length; i++) {
            //Asignamos el valor de la posicion actual a la variable min
            posMin = i;
            //Recorremos el array desde la posicion actual + 1
            for (int j = i + 1; j < valores.length; j++) {
                
                //Comprobamos si el valor de la posicion actual es mayor que el valor de la posicion j
                if (valores[j] < valores[posMin]) {
                    
                    //Asignamos a min el valor de j
                    posMin = j;
                }
            }
            //Intercambiamos los valores
            aux = valores[i];
            valores[i] = valores[posMin];
            valores[posMin] = aux;
        }
        //Mostramos el array ordenado
        System.out.println("Array ordenado: ");
        System.out.println(Arrays.toString(valores));

    }
}
