
public class Ejemplo08 {

	public static void main(String[] args) {

		// Operaciones logicas: and(Y)(&&) / or(O)(||) / not(NO)(|)(!).

		/*
		 [A][B][A&&B]	AND
		 [F][F][F]
		 [F][V][F]
		 [V][F][F]
		 [V][V][V]
		 		 
		 [A][B][A||B]	OR
		 [F][F][F]
		 [F][V][V]
		 [V][F][V]
		 [V][V][V]

		 [A][!A]		NOT
		 [F][V]	
		 [V][F]
		 */
		
		boolean a = false;
		boolean b = true;
		
		// Operacion AND (&&) (Si hay alguna "false" el resultado sera false).
		
		System.out.println("VALOR DE A = FALSE // VALOR DE B = TRUE");
		
		System.out.println("Operacion con AND (&&)");
		System.out.println(a && b);

		// Operacion OR (||) (con que una sea verdadera).
		System.out.println("Operacion con OR (||)");
		System.out.println(a || b);

		// Operacion NOT (!) (Invierte el true a false o el false a true).
		System.out.println("Operacion con NOT (!) cambiando valor de B");
		System.out.println(!b);
	}

}
