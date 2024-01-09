package Ejemplos;

public class Ejemplo9 {
    public static void main(String[] args) {

        /*
         * Devuelve el precio de venta de un objeto dado su precio inicial. (iva,
         * descuento...)
         */

        System.out.println("El precio final de un artículo que vale 100 euros y se le aplica un descuento " +
                "del 30% y un iva del 21% es de: " + precioVenta(100, 30, 21) + " Euros");
    }

    static double precioVenta(double precio, double descuento, double iva) {

        double descuentoAplicado = precio - (precio * descuento / 100);

        double ivaAplicado = descuentoAplicado + descuentoAplicado * iva / 100;

        return ivaAplicado;
    }
}
