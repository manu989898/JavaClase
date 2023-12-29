package Practica2;

import Actividades.Hoja2.ActividadesLibres.Arrays;

public class Ejer3 {
    public static void main(String[] args) {
        /*
         * En esta actividad tienes que escribir un programa para obtener información
         * de este documento XML:
         * 
         * Para ello, quita los espacios y los saltos de línea y guarda el texto en
         * forma de variable así:
         * String xml =
         * "<factura><fecha>2023-12-20</fecha><cliente>Rubén Martínez</cliente><articulos><articulo><nombre>Cuaderno Oxford A4</nombre><precio>3.25</precio></articulo><articulo><nombre>Archivador</ nombre><precio>4</precio></articulo><articulo><nombre>Grapadora grande</nombre><precio>5.5</precio></articulo></articulos></factura>"
         * ;
         * Usando tus conocimientos de cadenas de caracteres tienes que conseguir que el
         * programa muestre la fecha de la factura y un listado con los artículos
         * comprados (esto último mediante un bucle):
         */

        String xml = "<factura><fecha>2023-12-20</fecha><cliente>Rubén Martínez</cliente><articulos><articulo><nombre>Cuaderno Oxford A4</nombre><precio>3.25</precio></articulo><articulo><nombre>Archivador</nombre><precio>4</precio></articulo><articulo><nombre>Grapadora grande</nombre><precio>5.5</precio></articulo></articulos></factura>";
        System.out.println("\n### MI JAVA PARSER ###");
        // Aqui le decimos que asigne a un String llamado fecha lo que esta entre las etiquetas <fecha> y </fecha> del String xml
        // Para ello, le decimos que nos muestre lo que esta entre el primer indice de <fecha> + 7 
        // Ya que empezaria por "<" y le tendriamos que sumar 7 para que nos muestre lo que esta entre las etiquetas
        String fecha = xml.substring(xml.indexOf("<fecha>") + 7, xml.indexOf("</fecha>"));
        System.out.println("\nFecha: ");
        System.out.println(fecha);

        System.out.println("\nArticulos: ");

        // Aqui le decimos que separe el String xml en un array de Strings cada vez que encuentre la etiqueta <articulo>
        String[] articulos = xml.split("<articulo>");

        // Aqui le decimos que recorra el array de Strings articulos y que nos muestre lo que esta entre las etiquetas <nombre> y </nombre>
        // Para ello, le decimos que nos muestre lo que esta entre el primer indice de <nombre> + 8 
        // ya que empezaria por "<" y le tendriamos que sumar 8 para que nos muestre lo que esta entre las etiquetas
        for (int i = 1; i < articulos.length; i++) {
            String nombre = articulos[i].substring(articulos[i].indexOf("<nombre>") + 8,
                    articulos[i].indexOf("</nombre>"));
            
            System.out.println("  * " + nombre) ; 
        }

        // He estado tres dias para plantear como atacar este problema!!!
    }
}