package ejemplo01persona;

public class Main {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente ("Gutierrez Martín", "Pedro"," 43456464L", "34534564533");
		
		c1.mostrar();
		
		Empleado e1 = new Empleado ("Guzmán Bosc", "Luis", "4534533J", "E1");
		
		e1.mostrar();
		
	}

}
