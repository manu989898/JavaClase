package ejemplos;

public class ejer12 {

	public static void main(String[] args) {

		char[] nombre = { 'a', 'l', 'o', 'n' };
		System.out.println(esPalidromo(nombre, 0, 2));
	}

	public static boolean esPalidromo(char[] frase, int inicio, int fin) {
		// Caso base.
		if (fin <= inicio) {
			return true;
		}
		// Caso recursivous.
		if (frase[inicio] == frase[fin]) {

			return esPalidromo(frase, inicio + 1, fin - 1);
		} else {
			return false;
		}
	}
}
