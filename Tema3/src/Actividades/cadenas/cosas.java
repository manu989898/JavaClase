package Actividades.cadenas;

import java.util.Scanner;

public class cosas {
    public static void main(String[] args) {
         /*
          * UN PROGRAMA QUE CON UNA LISTA DE CANTIDADES RESUELVA CUALES SON NECESARIAS PARA SUMAR UNA CANTIDAD DADA deben de ser tipo float

          */
        Scanner escaner = new Scanner(System.in);

        System.out.println("introduce una cantidad: ");
        double cantidad = escaner.nextFloat();

        System.out.println("introduce una serie de números: ");

        double[] numeros = {759.30,
            1147.53,
3901.44,
3345.82,
391.68,
1463.77,
2281.82,
3028.90,
24463.03,
2250.61,
752.40,
9125.32,
971.97,
13344.46,
561.91,
553.14,
1623.42,
7367.25,
971.97,
1070.28,
14674.36,
7506.26,
5206.06,
1793.51,
1011.29,
4104.54,
1109.61,
1050.62,
3170.59,
1634.24,
3375.44,
800.77,
5755.55,
1098.79,
1999.77,
1668.06,
950.26,
2243.74,
1764.40,
667.50,
2569.39,
16453.58,
1828.26,
2824.77,
2648.45,
980.32,
2988.20,
1733.31,
2732.18,
880.78,
3664.78,
1830.97,
8176.94,
3383.81,
856.83,
507.55,
4044.36,
1959.37,
31217.08,
3657.88,
2942.49,
533.25,
1925.57,
2607.36,
2909.55,
542.25,
8865.79,
2583.11,
3211.53,
3039.88,
3491.13,
939.69,
950.19,
878.61,
5620.18,
1499.49,
2408.65,
4275.39,
4060.78,
1726.73,
1593.11,
7079.52,
2038.02,
2460.49,
1030.96,
18309.82,
2523.70,
4598.62,
1340.49,
3938.39,
2852.96,
1009.18,
14770.81,
969.85,
3570.59,
665.81,
1898.55,
17344.62,
2077.34,
1109.61,
1146.81,
759.30,
2274.20,
23672.13,
1013.86,
1478.73,
882.82,
5398.08,
1522.39,
1542.80,
9881.20,
3871.93,
1499.18,
1259.27,
1151.50,
943.87,
7940.63,
950.19};

        /*for (int i = 0; i < numeros.length; i++) {
            numeros[i] = escaner.nextFloat();
        }*/

        escaner.close();

        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        if (suma < cantidad) {
            System.out.println("no se puede sumar la cantidad");
        } else {
            double sumaParcial = 0;
            int i = 0;
            while (sumaParcial < cantidad) {
                sumaParcial += numeros[i];
                i++;
            }
            System.out.println("se necesitan " + i + " números para sumar la cantidad");
        }
        //mostrar que cantidades del array se necesitan para sumar la cantidad

        double sumaParcial = 0;
        int i = 0;
        while (sumaParcial <= cantidad) {
            sumaParcial += numeros[i];
            i++;
        }

        System.out.println("se necesitan " + i + " números para sumar la cantidad");
        double sumasssss=0;
        for (int j = 0; j < i; j++) {
            System.out.println(numeros[j]);
            sumasssss+=numeros[j];
            
        }
System.out.println(sumasssss);
        
    }
}
