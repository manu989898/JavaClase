package Ejemplos;

public class SubString {
    public static void main(String[] args) {

        String frase = "Esto es una frase de prueba";

        System.out.println("Los caracteres desde el 3 hasta el 10 (ambos "
                + "inclusive) son: " + frase.substring(3, 11));

        System.out.println("Los caracteres desde el 5 hasta el final son: "
                + frase.substring(5));
    }
}
