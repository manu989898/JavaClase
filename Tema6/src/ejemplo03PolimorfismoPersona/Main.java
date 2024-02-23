package ejemplo03PolimorfismoPersona;

public class Main {

	public static void main(String[] args) {
		
		// Sólo se puede llamar al métodos de p1 o p2 si exsisten en la clase padre (Persona).
		
		
		
		
		Cliente c1 = new Cliente ("Gutierrez Martín", "Pedro"," 43456464L", "34534564533");	
		c1.mostrar();
		
		Empleado e1 = new Empleado ("Guzmán Bosc", "Luis", "4534533J", "E1");	
		e1.mostrar();
		
		Directivo d1 = new Directivo("Guzmán Bosc", "Luis", "4534533J", "A51", 200);
		
		//Ejemplos de polimorfismo
		//Es de tipo persona y se le asigna un tipo cliente.
		Persona p1 = c1;
		
		Persona p2 = d1;
		
		// Si llamamos al método ejecutar de p2 se ejecuta el de Directivo.
		p2.mostrar();
		
		// Si llamamos al método ejecutar de p1 se ejecuta el de Cliente.
		p1.mostrar();
		
		Persona p3 = new Persona();
		
		// Un objeto de tipo Persona no necesariamente puede asignarse a una variable Cliente.
		// No cualquier persona es un cliente.
		// Cliente c2 = p1;
		
		// Podemos asignar a una variable de tipo Cliente otra variable de tipo Persona haciendo un (cast) a Cliente.
		// Siempre que sepamos que la variable tipo Persona apunta a un objeto Cliente.
		Cliente c3 = (Cliente)p1;
		
		// Esto dará error ya que esta apuntando a un objeto tipo Directivo y no Cliente.
		Cliente c4 = (Cliente) p2;
		
		// Podemos crear un Array de tipo Persona y guardar ahí tanto clientes como empleados como directivos.
		Persona[] personal = new Persona[10];
		
		personal[0] = c1;
		personal[1] = d1;
		personal[2] = new Empleado("Jimenez Llosantos", "Pedro", "4245456U", "A98");
		
		Empleado e2 = (Empleado) personal[2];
		
	}

}
