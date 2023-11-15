package actividades;

	import java.util.Scanner;

	public class actividad2 {

		public static void main(String[] args) {

			/*
			 Crea un programa que pida dos números y calcule el resto de dividirlos.
			 */
			
			boolean examenesAprobado = true;
			boolean comportClase = true;

			Scanner escaner = new Scanner(System.in);
			
			System.out.println("ingresa el primer numero para dividir:");
			int num1 = escaner.nextInt();
			
			System.out.println("ingresa el primer numero para dividir:");
			int num2 = escaner.nextInt();
			
			int resultadoDiv = (num1/num2);
			System.out.println("El resultado de la operacion es " + resultadoDiv);
			
		}

	}

