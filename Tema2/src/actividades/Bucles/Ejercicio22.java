package actividades.Bucles;

public class Ejercicio22 {
    public static void main(String[] args) {
        
        //Escribe una aplicación que muestre las tablas de multiplicar del 1 al 10. bucle anidado for

        for (int i =0; i<10; i++) {

            System.out.println("Tabla del " + i + ":");

            for (int j = 0; j < 10; j++) {

                System.out.println(i + " x " + j + " = " + i*j);
            }
        }

    }
}
