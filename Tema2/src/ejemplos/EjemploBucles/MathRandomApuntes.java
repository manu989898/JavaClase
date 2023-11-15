package ejemplos.EjemploBucles;

public class MathRandomApuntes {
    public static void main(String[] args) {
        
        /*
         *  Math.random() Devuelve un número decimal mayor o igual que 0.0 y menor que 1.0.
         */

        double numeroAleatorio = Math.random();

        System.out.println(numeroAleatorio);

        int contador2 = 0;
        while (contador2 <= 10) {
            System.out.println(Math.random());
            contador2++;
        }

        System.out.println("**** USANDO (int) *10 + 1 PARA QUE SEA 1 ENTRE 10 ****");

        // En este caso se multiplicará por 10 y se le sumará 1 
        // para que el número aleatorio sea mayor o igual que 1 y menor que 11.
        int numeroAleatorioEntero = (int) (Math.random() * 10 + 1);

        System.out.println(numeroAleatorioEntero);
        
        int contador=0;
        while (contador <= 10) {
            System.out.println((int) (Math.random() * 10 + 1));
            contador++;
        }

        //Como sacar numeros aleatorios entre 1 y 2
        System.out.println("**** USANDO (int) *2 + 1 PARA QUE SEA 1 ENTRE 2 ****");

        int contador3=0;

        while (contador3 <= 10) {

            int numeroAleatorioEntero2 = (int)(Math.random() * 2 + 1);
            System.out.println(numeroAleatorioEntero2);
            contador3++;
        }

    }
}
