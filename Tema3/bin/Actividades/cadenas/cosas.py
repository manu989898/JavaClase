def encontrar_combinacion(importes, objetivo, combinacion_actual=None, indice=0):
    if combinacion_actual is None:
        combinacion_actual = []

    if sum(combinacion_actual) == objetivo:
        return combinacion_actual
    elif sum(combinacion_actual) > objetivo or indice == len(importes):
        return None

    # Incluir el importe actual en la combinación
    incluir = encontrar_combinacion(importes, objetivo, combinacion_actual + [importes[indice]], indice + 1)
    if incluir:
        return incluir

    # Excluir el importe actual de la combinación
    excluir = encontrar_combinacion(importes, objetivo, combinacion_actual, indice + 1)
    if excluir:
        return excluir

    # Restar el importe actual de la combinación
    restar = encontrar_combinacion(importes, objetivo, combinacion_actual + [-importes[indice]], indice + 1)
    if restar:
        return restar

# Lista de importes y cantidad objetivo
importes = [
3901.44,
391.68 ,
1463.77,
3028.90,
24463.03,
2250.61,
752.40 ,
9125.32,
971.97,
13344.46,
-1208.79,
-533.61,
561.91,
553.14,
1623.42,
7367.25,
971.97,
1070.28,
-21.78,
14674.36,
7506.26,
5206.06,
1793.51,
1011.29,
4104.54,
1109.61,
1050.62,
3170.59,
1634.24,
3375.44,
800.77,
5755.55,
1098.79,
1999.77,
1668.06,
950.26,
2243.74,
1764.40,
667.50,
2569.39,
16453.58,
2824.77,
2648.45,
-39.33,
2988.20,
1733.31,
2732.18,
880.78,
3664.78,
1830.97,
8176.94,
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
2038.02,
1030.96,
-39.33,
1340.49,
14770.81,
759.30,
2274.20,
23672.13,
1013.86,
1478.73,
882.82,
5398.08,
1522.39,
1542.80,
9881.20,
3871.93,
1499.18,
1259.27,
1151.50,
943.87,
7940.63,
950.19]  # Agrega todos tus importes aquí
objetivo = 43634.15

# Encontrar la combinación
combinacion_resultado = encontrar_combinacion(importes, objetivo)

# Imprimir la combinación encontrada
if combinacion_resultado:
    print("Combinación encontrada:", combinacion_resultado)
else:
    print("No se encontró ninguna combinación.")

# imprime el proceso de la operacion para encontrarlo
# print(encontrar_combinacion(importes, objetivo))
    
# Imprimir la suma de la combinación encontrada
print("Suma de la combinación encontrada:", sum(combinacion_resultado))

# IMPRIMIR EL RESULTADO DE LA COMBINACION DE MENOR A MAYOR
print(sorted(combinacion_resultado))
