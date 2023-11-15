package actividades;

import java.util.Scanner;

public class actividad1 {

	public static void main(String[] args) {

		/*
		 Crea un programa que pida dos números y los multiplique.
		 */
		
		boolean examenesAprobado = true;
		boolean comportClase = true;

		Scanner escaner = new Scanner(System.in);
		
		System.out.println("ingresa el primer numero para multiplicar:");
		int num1 = escaner.nextInt();
		
		System.out.println("ingresa el primer numero para multiplicar:");
		int num2 = escaner.nextInt();
		
		int resultadoMult = (num1*num2);
		System.out.println("El resultado de la operacion es " + resultadoMult);
		
		escaner.close();
		
	}

}
