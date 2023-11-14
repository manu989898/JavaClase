package actividades;

import java.util.Scanner;

public class actividad3 {
	public static void main(String[] args) {

		/*
		 Crea un programa que haga la división entera entre dos números (devolviendo cociente y resto).
		 */
		
		
		boolean examenesAprobado = true;
		boolean comportClase = true;

		Scanner escaner = new Scanner(System.in);
		
		System.out.println("ingresa el primer numero para dividir:");
		int num1 = escaner.nextInt();
		
		System.out.println("ingresa el primer numero para dividir:");
		int num2 = escaner.nextInt();
		
		int resultadoResto = (num1%num2);
		int resultadoCoci = (num1/num2);
		System.out.println("El resto de la operacion es: " + resultadoResto + "\nEl cociente es: " + resultadoCoci);
		
	}

}


