package Actividades.Hoja2;

public class Ejer24 {

    public static void main(String[] args) {

        /*
         * Crea un array llamado huecos para ser usado en el juego del tres en raya
         * tridimensional (3x3x3 posiciones).
         * Cada posición en el array guardará el color de la bola colocada allí.
         * • Rellena aleatoriamente cada posición del array con una bola de color rojo o azul.
         * • Recorre todas las posiciones mediante un bucle y cuenta el número de bolas rojas y bolas azules.
         * 
         */


        // Declaramos el array tridimensional de 3x3x3
        String[][][] huecos = new String[3][3][3];

        // Declaramos variables
        int contadorRojo = 0;
        int contadorAzul = 0;
        
        // Rellenamos el array con bolas rojas o azules
        for (int i = 0; i < huecos.length; i++) {

            for (int j = 0; j < huecos[i].length; j++) {

                for (int k = 0; k < huecos[i][j].length; k++) {

                    // Generamos un numero aleatorio entre 1 y 2
                    int numeroAleatorio = (int) (Math.random() * 2 + 1);

                    // Si el numero aleatorio es 1, se coloca una bola roja
                    if (numeroAleatorio == 1) {

                        huecos[i][j][k] = "rojo";
                        contadorRojo++;
                    }

                    // Si el numero aleatorio es 2, se coloca una bola azul
                    if (numeroAleatorio == 2) {

                        huecos[i][j][k] = "azul";
                        contadorAzul++;
                    }
                }
            }
        }

        // Mostrar el array como string
        System.out.println("\nArray de 3x3x3 con bolas rojas y azules:");
        for (int i = 0; i < huecos.length; i++) {

            for (int j = 0; j < huecos[i].length; j++) {

                for (int k = 0; k < huecos[i][j].length; k++) {

                    System.out.print(huecos[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        // Mostramos el numero de bolas rojas y azules
        System.out.println("\nNumero de bolas rojas: " + contadorRojo);
        System.out.println("Numero de bolas azules: " + contadorAzul);

    }
}
