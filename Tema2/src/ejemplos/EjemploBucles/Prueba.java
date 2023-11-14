package ejemplos.EjemploBucles;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    double cuota;
    int mensualidades;
    double totalPagado = 0;
// Inicio del programa, explicación al usuario
    System.out.println("El programa calcula la cuota correspondiente al pago mensual y el total a pagar al final de la financiación  por la compra de un producto.");
// Pedimos datos al usuario
    System.out.print("Introduce la primera cuota a pagar: ");
    cuota = scanner.nextDouble();
    System.out.print("Introduce el número de meses de financiación: ");
    mensualidades = scanner.nextInt();
    
    for (int i=1; i <= mensualidades; i++){
      System.out.println("Cuota "+ i +": "+ cuota);
      totalPagado = totalPagado + cuota;
      cuota = cuota*2;
    } 
// Mostramos el resultado
    System.out.println("Total pagado por el producto: " + (int)totalPagado);
  }
}
    