
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
importes = [391.68,
3028.90,
24463.03,
752.40,
13344.46,
-1208.79,
7367.25,
-21.78,
7506.26,
1011.29,
4104.54,
1109.61,
1050.62,
3170.59,
1634.24,
3375.44,
800.77]  # Agrega todos tus importes aquí
objetivo = 49206.49

# Encontrar la combinación
combinacion_resultado = encontrar_combinacion(importes, objetivo)

# Filtrar la combinación para eliminar valores negativos no presentes en la lista
combinacion_resultado = [valor for valor in combinacion_resultado if valor in importes]

# Imprimir la combinación encontrada
if combinacion_resultado:
    print("Combinación encontrada:", combinacion_resultado)
else:
    print("No se encontró ninguna combinación.")

#muestra el resultado de menor a mayor
print(sorted(combinacion_resultado))

