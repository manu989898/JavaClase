package notasIncompleto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Libreta {

	private final String NOMBRE_ARCHIVO = "ficheros/notas.txt";
	private final int MAX_NOTAS = 1000;

	private Nota[] notas;
	private int numNotas;

	public Libreta() {
		notas = new Nota[MAX_NOTAS];
		numNotas = 0;
		leerNotas();
	}

	public void addNota(Nota nota) {

		/*
		 * TODO: Añadir después de la última nota del array la nota que se nos pasa como
		 * parámetro. Utilizar el valor de la variable numNotas. Actualizar después el
		 * valor de numNotas. En caso de que hayamos llegado al máximo de notas, no
		 * hacer nada.
		 */

	}

	public void setNota(int posicion, Nota nota) {

		notas[posicion] = nota;

	}

	public Nota getNota(int posicion) {

		return notas[posicion];

	}

	public void delNota(int posicion) {

		/*
		 * TODO: Eliminar el elemento del array notas[] que ocupa la posición indicada.
		 * Para ello, mueve hacia arriba todos los elementos que vengan a continuación
		 * una posición, y actualiza la variable numNotas.
		 */

	}

	public void leerNotas() {

		/*
		 * TODO: Leer todas las filas del archivo, y rellenar el array notas[]. Si no se
		 * encuentra el archivo, hacer que se muestre el mensaje indicado en el
		 * enunciado de la práctica. Si se produce otro tipo de excepción, mostrar un
		 * JOptionPane explicándolo.
		 * 
		 * La información de cada nota está guardada en dos líneas de texto, una para el
		 * título y otra para la descripción. Puedes usar el método split() para separar
		 * los datos de los comentarios del archivo.
		 */
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("notillas/notas.txt"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void guardarNotas() {

		/*
		 * TODO: Guardar las notas del array notas[] en el archivo "notas.txt". El
		 * formato en que se guardarán debe ser el que aparece en el enunciado de la
		 * práctica. Si se produce una excepción, se mostrará el error que aparece en el
		 * enunciado.
		 */

	}

	public int getNumNotas() {
		return numNotas;
	}

}
