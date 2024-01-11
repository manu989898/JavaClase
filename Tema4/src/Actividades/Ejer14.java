package Actividades;

public class Ejer14 {
    public static void main(String[] args) {
        /*
         * Crea un método que tome un array de Strings, y un String. Devolverá la
         * posición del String
         * dentro del array, ó -1 si no lo encuentra. Utiliza dos instrucciones return.
         * Por ejemplo, teniendo el array siguiente:
         * String[ ] planetas = {"Mercurio", "Venus", "Tierra", "Marte", "Júpiter",
         * "Saturno", "Urano",
         * "Neptuno", "Plutón"};
         * 
         * • buscar(planetas, "Tierra") debería devolver 2 porque el String "Tierra"
         * está en la posición 2
         * del array.
         * • buscar(planetas, "Caronte") debería devolver -1 porque el String "Caronte"
         * no está en el
         * array.
         */
        String[ ] planetas = {"Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Urano",
                              "Neptuno", "Plutón"};
        
        String planeta = "Tierra";

        System.out.println(buscar(planetas, planeta));
    }

    static int buscar (String[] planetas, String planeta) {

        for (int i = 0; i < planetas.length; i++) {
            
            if (planetas[i].equals(planeta)) {
                return i;
            }
        }
        return -1;
    }
}
