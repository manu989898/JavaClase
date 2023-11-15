
public class Ejemplo11 {

	public static void main(String[] args) {
		//Variables char. Realmente el char guarda el valor UNICODE que es int por eso le hacemos cast de char.
		
		char letra1 = 'a';
		char letra2 = (char)(letra1 + 1);
		
		System.out.println(letra2);
	}

}
