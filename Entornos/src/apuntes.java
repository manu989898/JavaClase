import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class apuntes {
    public static void main(String[] args) {

        /*
         * Pruebas de unidad:
         * Se hacen clase por clase y en ellas se prueban los métodos de la clase.
         * 
         * Pruebas de integración:
         * Se juntan las clases y se prueban
         * 
         * Basadas en hebra: Se prueban las clases que son necesarias para que una hebra
         * funcione
         * Basadas en uso: Primero se prueban las clases mas independientes y luego las
         * que dependen de ellas
         * 
         * Pruebas de sistema:
         * Se prueba hardware y software
         * 
         * Prueba de recuperación:
         * Se fuerza el programa a fallar y se comprueba que se recupera
         * 
         * Prueba de seguridad:
         * Se intenta extraer información del programa
         * 
         * Prueba de esfuerzo:
         * Se fuerza el programa a trabajar al máximo
         * 
         * Prueba de rendimiento:
         * Se mide el rendimiento del programa
         * 
         * Pruebas de despliegue:
         * Se prueba el programa en distintos sistemas operativos y plataformas
         */
    }
    // PRUEBAS AUTOMÁTICAS
    // JUnit
    @Test
    void testGetSaldo() {
        CuentaCorriente cuenta1 = new CuentaCorriente();
        cuenta1.setSaldo(100);
        assertEquals(100, cuenta1.getSaldo());
    }
    
    @Test
    void testExtraerDinero() {
        CuentaCorriente cuenta1 = new CuentaCorriente();
        cuenta1.setSaldo(100);
        cuenta1.extraerDinero(50);
        assertEquals(50, cuenta1.getSaldo());
    }

    // TRY CATCH
    //ejemplo try catch
    try {
        CuentaCorriente cuenta1 = new CuentaCorriente("ES34535", 100);
        cuenta1.extraerDinero(200);
        fail("ERROR: No se ha lanzado la excepción esperada");

    } catch (Exception e) {
        // Código que se ejecuta si se lanza una excepción
    }

    // TRATAMIENTOS DE EXCEPCIONES
    double saldo;

    public void extraerDinero(float importe) {

        if ((saldo - importe) < 0) {

            throw new java.lang.ArithmeticException("Saldo insuficiente");
        } else {

            saldo -= importe;
        }
    }
}
