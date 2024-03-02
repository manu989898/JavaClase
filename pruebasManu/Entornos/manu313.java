import java.util.Scanner;

public class manu313 {
    public static void main(String[] args) {
        
        int num;
        int sumapares = 0;
        int sumaimpares = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número (0 para terminar) :");
        num = entrada.nextInt();
        //-------------------------------------------1-------------------------------------------------
        while (num != 0) {
        //-------------------------------------------2-------------------------------------------------
            if (num % 2 == 0) {
        //-------------------------------------------3-------------------------------------------------
                sumapares = sumapares + num;
        //-------------------------------------------4-------------------------------------------------
            } else {
                sumaimpares = sumaimpares + num;
        //-------------------------------------------5-------------------------------------------------
            }
            System.out.println("Introduce un número (0 para terminar) :");
            num = entrada.nextInt();
        }
        //-------------------------------------------6-------------------------------------------------
        System.out.println("La suma de los pares es: " + sumapares);
        System.out.println("La suma de los impares es: " + sumaimpares);
        entrada.close();
    }
}
        //-------------------------------------------7-------------------------------------------------