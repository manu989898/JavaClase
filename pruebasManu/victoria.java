public class victoria {
    public static void main(String[] args) {
        
        /*
         * programa que pida serie de números y calcule cuales se neceistan para sumar una cantidad que pida al principio
         */

        Scanner escaner = new Scanner(System.in);

        System.out.println("introduce una cantidad: ");
        int cantidad = escaner.nextInt();

        System.out.println("introduce una serie de números: ");
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = escaner.nextInt();
        }

        escaner.close();

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        if (suma < cantidad) {
            System.out.println("no se puede sumar la cantidad");
        } else {
            int sumaParcial = 0;
            int i = 0;
            while (sumaParcial < cantidad) {
                sumaParcial += numeros[i];
                i++;
            }
            System.out.println("se necesitan " + i + " números para sumar la cantidad");
        }

        


       

    }
}
