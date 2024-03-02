package ejemplo04;

public class Main {

	public static void main(String[] args) {

		// Declaramos la variable persona1, de tipo Persona, y le asignamos un objeto de
		// tipo Persona. Usamos el constructor y así evitamos asignar valor a cada atributo por separado.
		Persona persona1 = new Persona("Sánchez","Mario","22100100T", "10/10/1980");

		// Queremos mostrar algunos datos de persona1.
		System.out.println("Nuestra persona se llama " + persona1.nombre + " " + persona1.apellidos + ".");
		System.out.println("Nació el " + persona1.fechaNacimiento + ".");

		// Podemos cambiar cualquier propiedad.
		persona1.apellidos = "Sánchez Pérez";
		System.out.println("Nuestra persona se llama " + persona1.nombre + " " + persona1.apellidos + ".");

		// Podemos crear tantos objetos Persona como necesitemos.
		Persona persona2; // Declaramos la variable de tipo Persona
		persona2 = new Persona(); // Le asignamos un nuevo objeto de tipo Persona

		persona2.apellidos = "Martínez López";
		persona2.nombre = "María";
		System.out.println("Nuestra persona 2 se llama " + persona2.nombre + " " + persona2.apellidos + ".");
		
		Persona persona3 = new Persona("Lozano Peris", "Ana Maria" , "10101010Y" , "10/10/1990");
		Persona persona4 = new Persona("Mas Calatayud", "Pedro");
		Persona persona5 = new Persona("43203270R");
		
		// Cuando no damos un valor a una propiedad ésta recibe un valor por defecto. Si
		// es un objeto, valdrá null, si es un número, valdrá 0 y si es un boolean,
		// valdrá false.
		System.out.println("María nació el " + persona2.fechaNacimiento + ".");

		// Podemos llamar al método mostrar() de Persona.
		persona1.mostrar();
		persona2.mostrar();

		// Probamos el método tieneDni().
		if (persona1.tieneDni()) {
			System.out.println(persona1.nombre + " tiene DNI");
		} else {
			System.out.println(persona1.nombre + " no tiene DNI");
		}

		if (persona2.tieneDni()) {
			System.out.println(persona2.nombre + " tiene DNI");
		} else {
			System.out.println(persona2.nombre + " no tiene DNI");
		}

		// Probamos el método anyoNacimiento().
		if (persona2.anyoNacimiento() == null) {
			System.out.println(persona2.nombre + " no tiene fecha de nacimiento.");
		} else {
			System.out.println(persona2.nombre + " nació el año " + persona2.anyoNacimiento() + ".");
		}
		
		
		persona3.mostrar();
		persona4.mostrar();
		persona5.mostrar();
		
		// Usa el constructor implícito que es el vacio.
		// Para que no de error hay que declarar el implícito siempre que hayamos escrito alguno explícito.
		Persona persona6 = new Persona();
		
	}

}