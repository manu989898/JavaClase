package Ejemplos;

public class IndexOf_cadena {
    public static void main(String[] args) {

        String frase = "Si tú crees que puedes, puedes. Si tú crees que no puedes, no puedes." 
        + "Tanto si piensas una cosa como la otra, estás en lo cierto (Henry Ford).";
        
        //Busca desde el principio hacia el final
        System.out.println("La palabra crees aparece en la posición " +
                frase.indexOf("crees"));

        //Si no encuentra la palabra nos devuelve -1
        System.out.println("La palabra luz aparece en la posición " +
                frase.indexOf("luz"));

        //Busca desde el final hacia el principio
        System.out.println("La palabra crees aparece por última vez en la posición " + frase.lastIndexOf("crees"));

        //Podemos pasarle a indexOf() un segundo parámetro que indica desde donde queremos que empiece a buscar
        System.out.println("La palabra crees aparece a partir de la posición 12 " + frase.indexOf("crees", 12));
    }
}
