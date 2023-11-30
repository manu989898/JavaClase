public class Ejer1_pag91 {
    public static void main(String[] args) {
        
        /*
         *  EJERCICIO PAGINA 91
         * 
         * LINEA 1 - 7      1   INICIO
         * LINEA 8          2   WHILE
         * LINEA 9          3   IF
         * LINEA 10 - 11    4   EJECUCION IF
         * LINEA 12         5   FIN IF/WHILE
         * LINEA 13         6   IF
         * LINEA 14         7   EJECUCION IF
         * LINEA 15 - 16    8   ELSE
         * LINEA 17         9   FIN
         * 
         * EJERCICIO PAGINA 121
        */
        
        int num;
        int sumapares = 0;
        int sumainpares = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduzca un número (0 para terminar): ");
        num = entrada.nextInt();
        //--------------------------------------------1---------------------------------------------------------//
        while (num != 0) {
        //--------------------------------------------2---------------------------------------------------------//
            if (num % 2 == 0) {
        //--------------------------------------------3---------------------------------------------------------//
                sumapares += num;
        //--------------------------------------------4---------------------------------------------------------//
            } else {
                sumainpares += num;
        //--------------------------------------------5---------------------------------------------------------//
            }
            System.out.println("introduzca un número (0 para terminar): ");
            num = entrada.nextInt();
        }
        //--------------------------------------------6---------------------------------------------------------//
        System.out.println("La suma de los pares es: " + sumapares);
        System.out.println("La suma de los impares es: " + sumainpares);
        //--------------------------------------------7---------------------------------------------------------//
    }
}
