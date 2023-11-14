package actividades.Bucles;
import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {

        /*
         * Diseña un programa que invente un número aleatorio. A continuación pedirá al
         * usuario que lo adivine. Si el usuario falla, entonces el programa le dará otra oportunidad.
         * Una vez que el usuario adivina el número o falla tres veces, el programa termina.
         * Utiliza un bucle do-while.
         * 
         * Ayuda: Puedes generar un número aleatorio mayor o igual a 0 y menor que 1 con la orden
         * Math.random( ). Si lo multiplicas por 10 y le sumas 1, entonces obtendrás un
         * número entre 1 y 10, ambos inclusive: (int) (Math.random()*10 + 1)
         */

        Scanner escaner = new Scanner(System.in);
        int contador = 0;
        int numAleatorio = (int) (Math.random()*10 + 1);
        int respuesta;

        do {

            System.out.println("Introduce un número entre 1 y 10");
            respuesta = escaner.nextInt();
            contador++;

            if (respuesta == numAleatorio) {
                System.out.println("Felicidades, acertaste!");
            } 

        } while ((contador < 3) && (respuesta!=numAleatorio));
       
        escaner.close();
    }
}
