import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		boolean examenesAprobado = true;
		boolean comportClase = true;
		int notaExam = 0;
		int notaClase = 0;

		Scanner escaner = new Scanner(System.in);

		System.out.println("Introduzca la nota media de Examenes: ");
		notaExam = escaner.nextInt();

		System.out.println("Introduzca la nota media de Comportamiento en clase: ");
		notaClase = escaner.nextInt();

		if (notaExam > 4) {
			examenesAprobado = true;
		} else {
			examenesAprobado = false;
		}
		if (notaClase > 4) {
			comportClase = true;
		} else {
			comportClase = false;
		}

		if (examenesAprobado && comportClase) {
			System.out.println("El alumno esta aprobado!");
		} else {
			System.out.println("El alumno esta suspendido!");
		}
		escaner.close();
	}

}
