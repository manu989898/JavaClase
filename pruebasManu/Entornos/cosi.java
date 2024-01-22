import java.util.Scanner;

public class cosi {
    public static void main(String[] args) {

        int num = 2;
        boolean esPrimo = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        num = sc.nextInt();



        
        while (i < num / 2 && esPrimo) {
            if (num % i == 0) {
                esPrimo = false;
            }
            i++;
        }
        if (esPrimo) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }

    }
}
