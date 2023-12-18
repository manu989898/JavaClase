public class EntornosApuntes {

    public static void main(String[] args) {

        /*
         * La complejidad ciclomática (VCG) de McCabe indica el número de caminos
         * independientes que hay en el código.
         * 
         * Se puede calcular de tres maneras
         * -Con el número de regiones que tiene el gráfico. R1, R2, R3…
         * -Aplicar la fórmula A-N+2 A -->f lechas N --> nodos
         * -Nodos predicados NP + 1 son nodos con condición
         * if (num > 23) por ejemplo
         * while (num <= 23) por ejemplo
         * 
         */
//-------------------------------------1---------------------------------------------------------------//
        int num = 0;
        int count_pos = 0;
        int count_neg = 0;
        int suma_pos = 0;
        int suma_neg = 0;

        System.out.print("Introduce un número: ");
        num = Integer.parseInt(System.console().readLine());
//-------------------------------------2---------------------------------------------------------------//
        while (num != 0) {
//-------------------------------------3---------------------------------------------------------------//
            if (num > 0) {
//-------------------------------------4---------------------------------------------------------------//
                count_pos++;
                suma_pos += num;
//-------------------------------------5---------------------------------------------------------------//                
            } else {
//-------------------------------------6---------------------------------------------------------------//
                count_neg++;
                suma_neg += num;
            }
//-------------------------------------7---------------------------------------------------------------//            
            System.out.print("Introduce un número: ");
            num = Integer.parseInt(System.console().readLine());
        }
//-------------------------------------8---------------------------------------------------------------//
        if (count_pos > 0) {
//-------------------------------------9---------------------------------------------------------------//
            System.out.println("La media de los números positivos es: " + (suma_pos / count_pos));
        }
//-------------------------------------10---------------------------------------------------------------//
        if (count_neg > 0) {
//-------------------------------------11---------------------------------------------------------------//
                System.out.println("La media de los números negativos es: " + (suma_neg / count_neg));
            }
//-------------------------------------12---------------------------------------------------------------//

    }
}
