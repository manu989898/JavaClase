package Actividades.Hoja2.ActividadesLibres;

import java.util.Scanner;

public class Arrays {
    
    public static void main(String[] args) {
        
        /*
         * Escribe un programa que pida al ususario 10 productos con sus 10 precios y luego
         * los guarde en un array y los ordene.
         */

        Scanner entrada = new Scanner(System.in);

        //Declaramos el array
        String[] productos = new String[10];
        double[] precios = new double[10];

        //Declaramos variables
        String producto = "";
        double precio = 0;

        //Pedimos los productos y los precios    
        for (int i = 0; i < productos.length; i++) {
            
            System.out.println("Introduce el nombre del producto " + (i + 1) + ": ");
            producto = entrada.nextLine();
            productos[i] = producto;
            
            System.out.println("Introduce el precio del producto " + (i + 1) + ": ");
            precio = entrada.nextDouble();
            precios[i] = precio;
            
            entrada.nextLine();   
        }

        entrada.close();

        //Mostramos el array desordenado     
        System.out.println("Array desordenado: ");

        for (int i = 0; i < productos.length; i++) {
            
            System.out.println(productos[i] + " - " + precios[i]);          
        }

        //Declaramos variables auxiliares
        String auxProducto = "";
        double auxPrecio = 0;
        
        //Ordenamos el array
        for (int i = 0; i < precios.length - 1; i++) {
            
            for (int j = i + 1; j < precios.length; j++) {
                
                if (precios[i] > precios[j]) {
                    
                    //Intercambiamos los valores
                    auxPrecio = precios[i];
                    precios[i] = precios[j];
                    precios[j] = auxPrecio;
                    
                    //Intercambiamos los valores de productos en funcion de precios
                    auxProducto = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxProducto;   
                }               
            }         
        }

        //Mostramos el array ordenado
        System.out.println("Array ordenado: ");

        for (int i = 0; i < productos.length; i++) {
            
            System.out.println(productos[i] + " - " + precios[i]);     
        }
    }

    public static String[] removeEmptyElements(String[] datos) {
        return null;
    }
}
