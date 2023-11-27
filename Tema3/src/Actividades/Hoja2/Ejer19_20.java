package Actividades.Hoja2;

import java.util.Scanner;

public class Ejer19_20 {

    public static void main(String[] args) {

        /*
         * 19. Crea un programa que vaya pidiendo por la terminal los apellidos, el nombre y
         * el sueldo de cuatro empleados de una empresa, y guardándolo como filas en un array
         * bidimensional llamado
         * nominas. A continuación muestra los datos por la pantalla en forma de tabla y
         * calcula el salario total que paga la empresa cada mes.
         * 
         * 20. Añade al programa anterior un bucle que busque el salario más bajo, e
         * indique el nombre y
         * apellidos del trabajador al que corresponde, así como la cantidad.
         *
         * ------nominas------
         * [0][0] [0][1] [0][2]
         * [1][0] [1][1] [1][2]
         * [2][0] [2][1] [2][2]
         * [3][0] [3][1] [3][2]
         * -------------------
         * 
         */

        
        // Declaramos el array bidimensional
        //Array de 4 filas(una por cada empleado) y 3 columnas(apellidos, nombre y sueldo)
        String[][] nominas = new String[4][3];

        // Declaramos el scanner
        Scanner entrada = new Scanner(System.in);

        // Declaramos variables
        float salarioTotal = 0;
        float salarioMasBajo = 30000;
        String empleadoSalarioMasBajo = "";

        System.out.println();

        // Pedimos los datos de los empleados
        for (int i = 0; i < nominas.length; i++) {

            System.out.println("\nEmpleado " + (i + 1) + ": ");

            // Añadimos +1 en el segundo indice para cambiar de columna y en este caso la fila seria i
            System.out.print("Apellidos: ");
            nominas[i][0] = entrada.nextLine();
            
            System.out.print("Nombre: ");
            nominas[i][1] = entrada.nextLine();

            System.out.print("Sueldo: ");
            nominas[i][2] = entrada.nextLine();

            // Sumamos el sueldo actual al sueldo total
            // Convertimos el sueldo actual a float con el método Float.parseFloat()
            salarioTotal += Float.parseFloat(nominas[i][2]);

            // Comprobamos si el sueldo actual es el más bajo
            if (Float.parseFloat(nominas[i][2]) < salarioMasBajo) {

                // Guardamos el sueldo actual como el más bajo
                salarioMasBajo = Float.parseFloat(nominas[i][2]);

                // Guardamos el nombre y apellidos del empleado con el sueldo más bajo
                empleadoSalarioMasBajo = nominas[i][0] + " " + nominas[i][1];
            }
        }
        // Mostramos el array bidimensional
        System.out.println("\nArray bidimensional: ");

        for (int i = 0; i < nominas.length; i++) {

            for (int j = 0; j < nominas[i].length; j++) {

                System.out.print(nominas[i][j] + " ");
            }
            System.out.println();
        }
        // Mostramos el sueldo total
        System.out.println("\nEl sueldo total es: " + salarioTotal);

        // Mostramos el empleado con el sueldo más bajo
        System.out.println(empleadoSalarioMasBajo + " tiene el sueldo más bajo, un " + salarioMasBajo);

        // Cerramos el scanner
        entrada.close();
    }
}
