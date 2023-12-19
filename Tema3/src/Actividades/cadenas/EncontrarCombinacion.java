package Actividades.cadenas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EncontrarCombinacion {

    public static List<Double> encontrarCombinacion(List<Double> importes, double objetivo) {
        List<Double> combinacionActual = new ArrayList<>();
        List<Double> resultado = new ArrayList<>();
        Set<List<Double>> combinacionesUnicas = new HashSet<>();
        encontrarCombinacionUtil(importes, objetivo, 0, combinacionActual, resultado, combinacionesUnicas);
        return resultado;
    }

    private static void encontrarCombinacionUtil(List<Double> importes, double objetivo,
                                                 int indice, List<Double> combinacionActual, List<Double> resultado,
                                                 Set<List<Double>> combinacionesUnicas) {
        if (Math.abs(sumarLista(combinacionActual) - objetivo) < 1e-6) {
            // Si la suma de la combinación actual es aproximadamente igual al objetivo
            if (esCombinacionUnica(combinacionActual, combinacionesUnicas)) {
                resultado.addAll(combinacionActual);
            }
            return;
        }

        if (indice == importes.size()) {
            return;
        }

        // Incluir el importe actual en la combinación
        combinacionActual.add(importes.get(indice));
        encontrarCombinacionUtil(importes, objetivo, indice + 1, combinacionActual, resultado, combinacionesUnicas);
        combinacionActual.remove(combinacionActual.size() - 1); // Retroceder para probar otras combinaciones

        // Excluir el importe actual de la combinación
        encontrarCombinacionUtil(importes, objetivo, indice + 1, combinacionActual, resultado, combinacionesUnicas);
    }

    private static boolean esCombinacionUnica(List<Double> combinacion, Set<List<Double>> combinacionesUnicas) {
        List<Double> combinacionOrdenada = new ArrayList<>(combinacion);
        combinacionOrdenada.sort(Double::compare);

        for (List<Double> existente : combinacionesUnicas) {
            List<Double> existenteOrdenada = new ArrayList<>(existente);
            existenteOrdenada.sort(Double::compare);

            if (combinacionOrdenada.equals(existenteOrdenada)) {
                return false;
            }
        }

        combinacionesUnicas.add(combinacion);
        return true;
    }

    private static double sumarLista(List<Double> lista) {
        double suma = 0;
        for (Double valor : lista) {
            suma += valor;
        }
        return suma;
    }

    public static void main(String[] args) {
        List<Double> importes = List.of(24463.03,
        -1208.79,
        7506.26,
        1050.62,
        3375.44,
        5755.55,
        1668.06,
        1764.40,
        2569.39,
        16453.58,
        -39.33,
        2988.20,
        2732.18,
        880.78,
        3664.78,
        1830.97,
        3383.81,
        856.83,
        4044.36,
        31217.08,
        2942.49,
        533.25,
        1925.57,
        2607.36,
        2909.55,
        542.25, 
        8865.79,
        2583.11,
        3211.53,
        -58.99,
        3039.88,
        3491.13,
        939.69,
        950.19,
        878.61,
        5620.18,
        1499.49,
        2408.65,
        4275.39,
        4060.78,
        1726.73,
        1593.11,
        7079.52,
        2038.02);

        double objetivo = 55066.14;

        List<Double> resultado = encontrarCombinacion(importes, objetivo);

        if (!resultado.isEmpty()) {
            System.out.println("Combinación encontrada: " + resultado);
        } else {
            System.out.println("No se encontró ninguna combinación.");
        }
        // mostrar resultado de menor a mayor
        resultado.sort(Double::compare);
        System.out.println("Combinación encontrada ordenada: " + resultado);


    }
}
