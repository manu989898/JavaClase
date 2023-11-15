package Ejemplos;

public class RecorrerArray {
    public static void main(String[] args) {
        
        float [] precios = new float [10];

        precios [0] = 10f;
        precios [1] = 65f;

        //Recorremos el array con un bucle for
        for (int i = 0; i < 10; i++) {
            System.out.println("Posicion " + i + " = " + precios [i]);
        }

        //Recorremos el array con un fucle for usando .length
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Posicion " + i + " = " + precios [i]);
        }

        //Usamos .lenght para sacar el número de posiciones que tiene el array
        System.out.println("Longitud del array = " + precios.length + "posiciones");

    }
}
