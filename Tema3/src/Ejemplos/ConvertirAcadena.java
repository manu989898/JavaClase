package Ejemplos;

public class ConvertirAcadena {
    public static void main(String[] args) {

        /*
         * String.valueOf() convierte cualquier tipo de dato a String
         */

        double pulgadasTv = 15.6;

        String pulgadas = String.valueOf(pulgadasTv);

        // otra manera es haceerlo con el método concatenación
        String pulgadas2 = "" + pulgadasTv;
        System.out.println("El tamaño del monitor es de " + pulgadas + pulgadas2
                + " pulgadas");
    }
}
