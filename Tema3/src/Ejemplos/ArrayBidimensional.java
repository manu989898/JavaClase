package Ejemplos;

public class ArrayBidimensional {
    public static void main(String[] args) {

        /*
         * 
         */

        double[][] medidas = { { 8.5, 1020, 40 }, { 14.2, 1021, 35 }, { 11, 1022, 45 }, { 7, 1023, 50 } };

        System.out.println(medidas[0][0]);
        System.out.println(medidas[0][1]);
        System.out.println(medidas[0][2]);
        System.out.println(medidas[1][0]);
        System.out.println(medidas[1][1]);
        System.out.println(medidas[1][2]);
        System.out.println(medidas[2][0]);
        System.out.println(medidas[2][1]);
        System.out.println(medidas[2][2]);
        System.out.println(medidas[3][0]);
        System.out.println(medidas[3][1]);
        System.out.println(medidas[3][2]);

        System.out.println("\n-------------------------------------------------");
        System.out.println("\nTemp\tPresión\tHumedad");
        // Va recorriendo las columnas
        for (int fila = 0; fila < medidas.length; fila++) {

            // Va recorriendo las filas
            for (int col = 0; col < medidas[0].length; col++) {

                System.out.print(medidas[fila][col] + "\t");
            }
            // Salto de linea para que se muestre en forma de tabla
            System.out.println();
        }
        System.out.println("\n-------------------------------------------------");
        System.out.println("\nTemp\tPresión\tHumedad");
        // Si la tabla tiene pocas columnas se puede hacer de esta forma
        for (int fila = 0; fila < medidas.length; fila++) {

            System.out.println(medidas[fila][0] + "\t" + medidas[fila][1] + "\t" + medidas[fila][2]);
        }
        System.out.println();

    }
}
