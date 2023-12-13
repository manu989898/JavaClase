package Actividades.Hoja2;

public class Ejer23 {

    public static void main(String[] args) {

        /*
         * 23. Un edificio dispone de 3x3x3 oficinas (3x3 oficinas en cada una de sus 3
         * plantas), formando un cubo.
         * • Crea un array con estas dimensiones llamado temperaturas que permita
         *   almacenar, en un instante dado, la temperatura de cada oficina.
         * • Invéntate 5 valores de temperatura y guárdalos en el array.
         * • Calcula la suma de todas las temperaturas del array (las que no has
         *   introducido son cero).
         * • Calcula la temperatura media de las 5 habitaciones mediante un bucle.
         */

        // Declaramos el array tridimensional
        // Array de 3 filas(una por cada planta), 3 columnas(una por cada oficina) y 3 pisos(una por cada oficina)
       

        // Declaramos variables
        int sumaTemperaturas = 0;
        int temperaturaMedia = 0;
        int contador = 0;
        
        int[][][] temperaturas = {{{20, 21, 22}, {23, 24, 25}, {26, 27, 28}},  //primera
                                  {{29, 30, 31}, {32, 33, 34}, {35, 36, 37}},  //segunda
                                  {{38, 39, 40}, {41, 42, 43}, {44, 45, 46}}}; //tercera

        /* Asignamos valores a las temperaturas de las oficinas modo LOCO
        temperaturas[0][0][0] = 20;
        temperaturas[0][0][1] = 21;
        temperaturas[0][0][2] = 22;
        temperaturas[0][1][0] = 23;
        temperaturas[0][1][1] = 24;
        temperaturas[0][1][2] = 25;
        temperaturas[0][2][0] = 26;
        temperaturas[0][2][1] = 27;
        temperaturas[0][2][2] = 28;
        temperaturas[1][0][0] = 29;
        temperaturas[1][0][1] = 30;
        temperaturas[1][0][2] = 31;
        temperaturas[1][1][0] = 32;
        temperaturas[1][1][1] = 33;
        temperaturas[1][1][2] = 34;
        temperaturas[1][2][0] = 35;
        temperaturas[1][2][1] = 36;
        temperaturas[1][2][2] = 37;
        temperaturas[2][0][0] = 38;
        temperaturas[2][0][1] = 39;
        temperaturas[2][0][2] = 40;
        temperaturas[2][1][0] = 41;
        temperaturas[2][1][1] = 42;
        temperaturas[2][1][2] = 43;
        temperaturas[2][2][0] = 44;
        temperaturas[2][2][1] = 45;
        temperaturas[2][2][2] = 46;
        */

        // Mostramos las temperaturas de las oficinas
        System.out.println("\nTemperaturas de las oficinas: ");
        
        System.out.println("\nPlanta 1: ");
        // Para mostrar las temperaturas de la planta 1, recorremos el array de la planta 1
        // La primera planta una seria el primer indice en este caso el [0]
        for (int i = 0; i < temperaturas[0].length; i++) {
            
            for (int j = 0; j < temperaturas[0][i].length; j++) {
                
                System.out.print(temperaturas[0][i][j] + "ºC ");
            }
            System.out.println();
        }

        System.out.println("\nPlanta 2: ");
        // Para mostrar las temperaturas de la planta 2, recorremos el array de la planta 2
        // La segunda planta una seria el primer indice en este caso el [1]
        for (int i = 0; i < temperaturas[1].length; i++) {
        
            for (int j = 0; j < temperaturas[1][i].length; j++) {
                System.out.print(temperaturas[1][i][j] + "ºC ");
            }
            System.out.println();
        }

        System.out.println("\nPlanta 3: ");
        // Para mostrar las temperaturas de la planta 3, recorremos el array de la planta 3
        // La tercera planta una seria el primer indice en este caso el [2]
        for (int i = 0; i < temperaturas[2].length; i++) {
            
            for (int j = 0; j < temperaturas[2][i].length; j++) {
                
                System.out.print(temperaturas[2][i][j] + "ºC ");
            }
            System.out.println();
        }

        // Calculamos la suma de todas las temperaturas del array
        for (int i = 0; i < temperaturas.length; i++) {
            
            for (int j = 0; j < temperaturas[i].length; j++) {
                
                for (int k = 0; k < temperaturas[i][j].length; k++) {
                    
                    sumaTemperaturas += temperaturas[i][j][k];
                }
            }
        }
        System.out.println("\nLa suma de todas las temperaturas es: " + sumaTemperaturas + "ºC");

        // Calculamos la temperatura media 
        for (int i = 0; i < temperaturas.length; i++) {
            
            for (int j = 0; j < temperaturas[i].length; j++) {
                
                for (int k = 0; k < temperaturas[i][j].length; k++) {
                    
                    if (temperaturas[i][j][k] != 0) {
                        // Almacenamos la suma de las temperaturas
                        temperaturaMedia += temperaturas[i][j][k];
                        contador++;
                    }
                }
            }
        }
        temperaturaMedia = temperaturaMedia / contador;
        System.out.println("\nLa temperatura media es: " + temperaturaMedia + "ºC");
    }
}
