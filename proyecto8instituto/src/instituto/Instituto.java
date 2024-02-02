package instituto;

import java.util.Scanner;

import auxiliar.Alumno;

public class Instituto {
	
	private final int MAX_ALUMNOS = 30;
	private Alumno[] alumnos;
	
	public void addAlumno(Alumno alu) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = alu;
				return;
			}
		}
	}
	
	public void delAlumno(int numExp) {
		
		Scanner escaner = new Scanner(System.in);
		System.out.println("Ingresa el num de expediente del alumno.");
		int num = escaner.nextInt();
		
		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i].getNumExpediente() == num) {
				alumnos[i] = null;
				return;
			}
		}
	}
	
	public void muestraAlumnos() {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				break;
			}
		}
	}
	
	
}
