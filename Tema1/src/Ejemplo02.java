
import java.util.Scanner;

public class Ejemplo02 {

	public static void main(String[] args) {

		// Decraramos e inicializamos la variable edad.
		byte edad = 13;
		String dni = "43203270R";
		String nombre = "Manu Cuesta Rodriguez";
		String a2 = "A2";
		String am = "AM";
		String b = "B";
		String a = "A";
		String a1 = "A1";

		
		// Mostramos las variables con: System.out.println();
		System.out.println("El nombre es: " + nombre);
		System.out.println("El dni es: " + dni);

		// Creamos el escaner
		Scanner escaner = new Scanner(System.in);

		// Asignamos el valor de "edad" segun la entrada del escaner
		System.out.println("Indica su edad: ");
		edad = escaner.nextByte();
		System.out.println(nombre.toUpperCase() + " tiene: " + edad + " años");

		// Usamos if / else para añadir la condicion
		if (edad > 17) {
			System.out.println("Es mayor de edad");
			System.out.println("Tiene acceso a los carnets: ");
			System.out.println(b + " " + a2 + " " + a1 + " " + a + " " + am);
		} else {
			System.out.println("Es menor de edad");
			System.out.println("Tiene acceso a los carnets: ");
			System.out.println(am + " a los 15 años de edad");
		}
		escaner.close();
	}

}
