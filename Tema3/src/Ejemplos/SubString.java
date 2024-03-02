package Ejemplos;

public class SubString {
    public static void main(String[] args) {

        String frase = "Esto es una frase de prueba";

        // Podemos usar en el substring palabras exactas con .indexOf("").
        // articulos[i].substring(articulos[i].indexOf("<nombre>") + 8, articulos[i].indexOf("</nombre>"));
        System.out.println("Los caracteres desde el 3 hasta el 10 (ambos "
                + "inclusive) son: " + frase.substring(3, 11));

        System.out.println("Los caracteres desde el 5 hasta el final son: "
                + frase.substring(5));
    }
}
