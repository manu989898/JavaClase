import java.util.ArrayList;
import java.util.List;

public class EncontrarCombinacion {

    public static List<Double> encontrarCombinacion(List<Double> importes, double objetivo) {
        List<Double> combinacionActual = new ArrayList<>();
        List<Double> resultado = new ArrayList<>();
        encontrarCombinacionUtil(importes, objetivo, 0, combinacionActual, resultado);
        return resultado;
    }

    private static void encontrarCombinacionUtil(List<Double> importes, double objetivo,
                                                 int indice, List<Double> combinacionActual, List<Double> resultado) {
        if (Math.abs(sumarLista(combinacionActual) - objetivo) < 1e-6) {
            // Si la suma de la combinación actual es aproximadamente igual al objetivo
            resultado.addAll(combinacionActual);
            return;
        }

        if (indice == importes.size()) {
            return;
        }

        // Incluir el importe actual en la combinación
        combinacionActual.add(importes.get(indice));
        encontrarCombinacionUtil(importes, objetivo, indice + 1, combinacionActual, resultado);
        combinacionActual.remove(combinacionActual.size() - 1); // Retroceder para probar otras combinaciones

        // Excluir el importe actual de la combinación
        encontrarCombinacionUtil(importes, objetivo, indice + 1, combinacionActual, resultado);
    }

    private static double sumarLista(List<Double> lista) {
        double suma = 0;
        for (Double valor : lista) {
            suma += valor;
        }
        return suma;
    }

    public static void main(String[] args) {
        List<Double> importes = List.of(759.30, 1147.53, 3901.44, -3345.82, 391.68, 1463.77, 2281.82, 3028.90,
                24463.03, 2250.61, 752.40, 9125.32, 971.97, 13344.46, 561.91, 553.14, 1623.42, 7367.25,
                971.97, 1070.28, 14674.36, 7506.26, 5206.06, 1793.51, 1011.29, 4104.54, 1109.61, 1050.62,
                3170.59, 1634.24, 3375.44, 800.77, 5755.55, 1098.79, 1999.77, 1668.06, 950.26, 2243.74,
                1764.40, 667.50, 2569.39, 16453.58, 1828.26, 2824.77, 2648.45, 980.32, 2988.20, 1733.31,
                2732.18, 880.78, 3664.78, 1830.97, 8176.94);

        double objetivo = 55066.14;

        List<Double> resultado = encontrarCombinacion(importes, objetivo);

        if (!resultado.isEmpty()) {
            System.out.println("Combinación encontrada: " + resultado);
        } else {
            System.out.println("No se encontró ninguna combinación.");
        }
    }
}