package ejemplos;

        // Importamos las librerías necesarias
        import java.io.BufferedReader;
        import java.io.File;
        import java.io.FileNotFoundException;
        import java.io.FileReader;
        import java.io.IOException;
        import java.util.Scanner;
        

public class ejer5 {
    public static void main(String[] args) {

        /*
         * Ejer5. Escribe una aplicación que te pregunte por consola el nombre de un archivo de
         * texto plano, y una palabra. A continuación abrirá el fichero y contará en cuántas líneas aparece dicha palabra.
         * Como mejora, modifica el programa anterior para que cuente cuántas veces aparece la palabra
         * solicitada en el archivo (ten en cuenta que la palabra puede estar repetida
         * dentro de una misma línea).
         */

        // Pedimos el nombre del archivo
        System.out.println("Introduce el nombre del archivo: ");
        Scanner sc = new Scanner(System.in);
        String nombreArchivo = sc.nextLine();
        // Pedimos la palabra a buscar
        System.out.println("Introduce la palabra a buscar: ");
        String palabra = sc.nextLine();
        // Cerramos el scanner
        sc.close();

        
        int contadorLineas = 0;
        int contadorPalabras = 0;

        try {
            // Para acceder al archivo usando un Buffer.
            System.out.println(nombreArchivo);
            BufferedReader buffer = new BufferedReader(new FileReader("ficheros/"+nombreArchivo));
            // Leemos el archivo línea a línea
            String linea = buffer.readLine();
            while (linea != null) {
              
                int index = linea.indexOf(palabra);

                while (index != -1) {

                    contadorPalabras++;
                    index = linea.indexOf(palabra, index + 1);

                }
                linea = buffer.readLine();
                contadorLineas++;
            }
            // Cerramos el buffer de entrada.
            buffer.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo.");
        } catch (IOException e) {
            System.out.println("Error al cerrar el archivo.");
        }

        // Mostramos el resultado
        System.out.println("La palabra '" + palabra + "' aparece " + contadorPalabras + " veces en el archivo '"
                + nombreArchivo + "' en " + contadorLineas + " líneas.");

    }
}
