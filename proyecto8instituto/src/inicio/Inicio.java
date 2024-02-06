package inicio;

import auxiliar.Alumno;
import auxiliar.Grupo;
import instituto.Instituto;

public class Inicio {

	public static void main(String[] args) {
		
		
		Grupo grupo1 = new Grupo(1, "ESO", 3, "B");
		
		
		Alumno alumno1 = new Alumno(100, "Perez", "Luis", grupo1);
		Alumno alumno2 = new Alumno(101, "Gonzalez", "Marcos", grupo1);
		Alumno alumno3 = new Alumno(102, "Cuesta", "Pedro", grupo1);
		Alumno alumno4 = new Alumno(103, "Lopez", "Javier", grupo1);
		
		Instituto insti = new Instituto();
		insti.addAlumno(alumno1);
		insti.addAlumno(alumno2);
		insti.addAlumno(alumno3);
		insti.addAlumno(alumno4);
		
		insti.delAlumno(50);
		insti.muestraAlumnos();
	}

}
