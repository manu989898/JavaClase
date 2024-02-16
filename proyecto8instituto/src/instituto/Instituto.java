package instituto;

import java.util.Scanner;

import auxiliar.Alumno;

public class Instituto {

	private final int MAX_ALUMNOS = 30;
	private Alumno[] alumnos = new Alumno[MAX_ALUMNOS];

	public void addAlumno(Alumno alumno) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = alumno;
				return;
			}
		}
	}

	public void delAlumno(int numExpediente) {
		
		int pos = buscaAlumnos(numExpediente);
		if(pos != -1) {
		alumnos[pos] = null;
		}
	}

	public void muestraAlumnos() {

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				System.out.println(alumnos[i]);
			}
		}
		System.out.println();
	}

	public int numAlumnos() {
		int numAlumn = 0;
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				numAlumn++;
			}
		}
		return numAlumn;
	}

	public int buscaAlumnos(int numExpediente) {
		int posicion = -1;
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumExpediente() == numExpediente) {
				return i;
			}
		}
		return -1;
	}
}
