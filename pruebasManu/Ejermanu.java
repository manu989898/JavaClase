public class Ejermanu {
    public static void main(String[] args) {

        /*
         * Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó 10
         * €,el segundo 20 €, el tercero 40 € y así sucesivamente.
         * Realizar un programa para determinar cuánto debe pagar mensualmente y el
         * total de lo que pagará después de los 20 meses.
         * Este programa puede servir para calcular otras compras y con diferentes plazos.
         */

        int meses = 20;
        int precio = 10;
        int precioTotal = 0; 

        for (int i = 1; i <= meses; i++) {

            System.out.println("precio mes " + i + " = " + precio);
            precioTotal = precioTotal + precio;
            precio = precio*2;

        }
        System.out.println("El total pagado por este producto es: " + precioTotal);
    }
}
