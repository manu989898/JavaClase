package Ejemplos;

public class Array1 {
    public static void main(String[] args) {
        
        //                                ARRAYS, LLEGA LO COMPLICADO

        /**************************************************************************************************************************************/

        //Creamos un array de 10 posiciones
        float [] precios = new float [10];

        //Asignamos valores a las posiciones del array
        precios [0] = 10f;
        precios [1] = 65f;

        //Mostramos el valor de la posicion 0
        System.out.println("Posicion 0 = " + precios [0]);
        
        //Mostramos el valor de la posicion 1
        System.out.println("Posicion 1 = " + precios [1]);

        //Mostramos el valor de la posicion 2 
        //No tiene valor, por lo que muestra 0 por ser tipo float, en caso de ser String, mostraria null, false si es boolean
        System.out.println("Posicion 2 = " + precios [2]);

        /**************************************************************************************************************************************/

        //Le damos los valores al crearlo
        String [] nombres = {"Juan", "Pedro", "Luis", "Maria", "Ana", "Rosa", "Lola", "Paco", "Pepe", "Luisa"};

        //Recorremos el array con bucle for
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Posicion " + i + " = " + nombres [i]);
        }

    }
}
