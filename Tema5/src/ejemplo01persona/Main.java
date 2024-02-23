package ejemplo01persona;

import java.util.TooManyListenersException;

public class Main {

	public static void main(String[] args) {

		// Declaramos la variable persona1, de tipo Persona
		// y le asignamos un objeto de tipo Persona.
		Persona persona1 = new Persona();

		// Damos valores a las propiedades de persona1.
		persona1.apellidos = "Sánchez";
		persona1.nombre = "Mario";
		persona1.dni = "3546462616H";
		persona1.fechaNacimiento = "10/12/1981";

		// Queremos mostrar algunos datos de persona1.
		System.out.println("Nuestra persona se llama " + persona1.nombre + " " + persona1.apellidos + ".");
		System.out.println("Nació el " + persona1.fechaNacimiento + ".");

		// Podemos cambiar cualquier propiedad.
		persona1.apellidos = "Sánchez Pérez";
		System.out.println("Nuestra persona se llama " + persona1.nombre + " " + persona1.apellidos + ".");

		// Podemos crear tantos objetos Persona como necesitemos.
		Persona persona2; // Declaramos la variable de tipo Persona
		persona2 = new Persona(); // Le asignamos un nuevo objeto en tipo Persona.

		persona2.apellidos = "Martínez López";
		persona2.nombre = "María";
		System.out.println("Nuestra persona 2 se llama " + persona2.apellidos + " " + persona2.apellidos + ".");

		// Cuando no damos un valor a una propiedad ésta recibe un valor por defecto.
		// Si es un objeto, valdrá null, si es un número, valdrá 0 y si es un boolean
		// false.
		System.out.println("María nació el " + persona2.fechaNacimiento + ".");
		
		// Probamos el metodo tieneDni.
		if(persona1.tieneDni()) {
			System.out.println(persona1.nombre + " tiene DNI.");
		}else {
			System.out.println(persona1.nombre + " No tiene DNI.");
		}
		if(persona2.tieneDni()) {
			System.out.println(persona2.nombre + " tiene DNI.");
		}else {
			System.out.println(persona2.nombre + " no tiene DNI.");
		}
		
		// Probamos el método anyoNacimiento().
		System.out.println("El año de nacimiento de " + persona1.nombre + " es: " + persona1.anyoNacimiento());
		System.out.println("El año de nacimiento de " + persona2.nombre + " es: " + persona2.anyoNacimiento());
		
	}

}
