public class TemaCosas {
    public static void main(String[] args) {
        
        /*
         * Bad Smells
         * 
         * Codigo duplicado: El mismo código aparece en más de un lugar
         * Cirugia a tiros : Un cambio en una parte del código requiere cambios en muchas otras partes
         * Complejidad artificial: El código es más complejo de lo que necesita ser.
         * 
         * A nivel de clase:
         * 
         * Clase larga: La clase tiene demasiados métodos y/o atributos
         * Clase simple: La clase tiene pocos métodos y/o atributos
         * Envidia de funcionalidad: Una clase usa más métodos de otra clase que los suyos propios
         * Código divergente: Al realizar un cambio en el sistema una clase sufre más cambios que otra.
         * Grupo de datos: Un grupo de atributos en varias clases que deberian estar en una sola clase
         * Intimidad inapropiada: Una clase expone demasiados atributos
         * Legado rechazado: Una clase no usa métodos de la superclase
         * Complejidad ciclomática: La complejidad ciclomática de una clase es demasiado alta
         * 
         * A nivel de método:
         * 
         * Método largo: El método tiene demasiadas líneas y es dificil de entender
         * Cadenas de mensajes largas: Un método llama a muchos métodos de otras clases
         * Demasiados parámetros: Un método tiene demasiados parámetros
         * Linea de código muy larga: Una línea de código es demasiado larga
         * Excesiva devolución de valores: Un método devuelve mas datos de los necesarios.
         * Tamaño del identificador: El nombre de un método o atributo es demasiado largo
         * 
         * 
         * Control de versiones (147):
         * 
         * Sirve para:
         * Identificar el cambio.
         * Controlar el cambio.
         * Garantizar que el cambio se implemente bien.
         * Informar de los cambios.
         * 
         * Elementos de configuración (EC):
         * EC básicos: Archivos de código fuente, archivos de configuración, archivos de documentación.
         * EC agregados: Archivos de pruebas, archivos de datos, archivos de ejecución.
         * 
         * 
         * La GCS (148): consta de las siguientes actividades:
         * 
         * Identificación de los EC: 
         * Control de cambios: Que los cambios de implementen bien.
         * Auditoría de la configuración: Verificar que los cambios se han implementado bien. 
         * Generación de informes: Documentar los cambios.
         * 
         * 
         * Gestión de versiones (148 y 149):
         * 
         * Grafo de evolución simple: Representa en una simple secuencia lineal las versiones.
         * Arbol: Representa las versiones en una estructura de árbol. SE LLAMA HEAD A LA ULTIMA VERSION.
         * 
         * Los cambios de una versión a otra son los Deltas:
         * Deltas directos: Se almacena la primera versión y los cambios que se han hecho.
         * Deltas inversos: Se almacena la última versión y los cambios necesarios para reconstruir cada versión.
         * Marcado selectivo: Se almacena texto refundido de todas las versiones y se indican por secciones.
         * 
         * 
         * Herramientas de control de versiones (149):
         * Sistemas centralizados: El repositorio se encuentra en un servidor central.
         * Sistemas distribuidos: Cada usuario tiene su propio repositorio.
         * 
         * 
         * Git (150)
         * Ubicaciones de los archivos:
         *  
         * Área de trabajo (Working area): El directorio local donde se trabaja
         * Area de preparación (Staging area): El área donde se preparan los cambios pendientes de confirmarlos
         * Repositorio local (commit area): El directorio donde se almacenan los archivos y sus modificaciones y diferentes versiones.
         * Repositorio remoto: El directorio donde se almacenan los archivos y sus modificaciones y diferentes versiones en un servidor remoto.
         * 
         * 
         * Estados de los archivos:
         * 
         * Fuera de seguimiento (Untracked): Archivos nuevos en el repositorio.
         * Modificado (Modified): Archivos que han sido modificados, pero sin estar confirmado sus cambios.
         * Preparado para confirmación (Staged): Archivos que han sido preparados para ser confirmados.
         * Confirmado (Committed): Archivos que han sido confirmados.
         * 
         * 
         * Documentación (163):
         * 
         * Documentación resultado de la fase de análisis: Documento de análisis
         * Documentación resultado de la fase de diseño: Documento de diseño
         * Documentación resultado de la fase de pruebas: Documento de pruebas
         * Documentación que describe el código: Documentación de código
         * Documentación que describe el uso del sistema: Documentación de usuario.
         */


    }
}
