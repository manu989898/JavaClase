package Ejemplos;

public class RedondearDecimales {
    public static void main(String[] args) {
        
        /*
         * Como redondear decimales
         */
        
        double numero = 10.0 / 3;

        // Para redondear un numero a dos decimales
        double numRedondeado = Math.round(numero * 100.0) / 100.0;

        System.out.println("Num sin redondear: " + numero);
        System.out.println("Num redondeado: " + numRedondeado);
    }
}
