package ejemplo05Interfaces;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner escaner = new Scanner(System.in);
		int mes = Mes.FEBRERO;

		System.out.println(mes);

		System.out.println("¿En que número de mes estamos?");
		mes = escaner.nextInt();

		if (mes == Mes.MARZO) {

			System.out.println("Estamos en MARZO");
		}
	}
}
