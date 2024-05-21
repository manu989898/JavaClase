package ejemplos;

public class ejer11 {

	public static void main(String[] args) {

		char[] nombre = { 'a', 'l', 'o','n' };
		System.out.println(esPalidromo(nombre, 0, 2));
	}

	public static boolean esPalidromo(char[] frase, int inicio, int fin) {

		if (fin <= inicio) {
			return true;
		}
		//recursivo
		if (frase[inicio] == frase[fin]) {
			
			return esPalidromo(frase, inicio + 1, fin - 1);
			
		} else {

			return false;
		}
	}
}
