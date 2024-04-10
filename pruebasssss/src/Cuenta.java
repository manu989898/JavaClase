

public class Cuenta {

	public final String ENCABEZADO_CUENTA = "CAFETERÍA SON FERRER\nC/ Cóndor, 9 \nSon Ferrer, Calviá\n---------------------------------"  + String.format("\n%-26s %4s %8s %8s", "\nDESCRIPCIÓN", "UDS.", "PRE./UD.", "TOTAL($)")
	+ String.format("%-26s %4s %8s %8s", "\n----------------------", "----", "--------", "--------");
	private int numArticulos = 0;
	private String[][] articulos;
	public static final double IVA = 0.10;

	/**
	 * 
	 * @param maxArticulos Cantidad que le pasamos como tamaño máximo del array
	 */
	public Cuenta(int maxArticulos) {

		articulos = new String[maxArticulos][3];
	}

	
	/**
	 * 
	 * @param nombre   Nombre del producto
	 * @param precio   Precio del producto
	 * @param unidades Unidades
	 * 
	 * Método para añadir articulos al array de la classe Cuenta.
	 */
	public void addArticulo(String nombre, String precio, String unidades) {
		// Comprobación de que tengamos espacio antes de añadir mas productos.
		if (hayEspacio() == true) {

			articulos[numArticulos][0] = nombre;
			articulos[numArticulos][1] = precio;
			articulos[numArticulos][2] = unidades;
			numArticulos++; // Contados de número de productos
		}
	}
	
	/**
	 * 
	 * @return true si hay espacio y false si no lo hay Método para comprobar si hay
	 *         espacio en el array para mas productos.
	 */
	public boolean hayEspacio() {
		if (numArticulos < articulos.length) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @return Devuelve el listado con la cabecera y los articulos de dentro del
	 *         array
	 */
	public String listadoArticulos() {
		// https://codegym.cc/groups/posts/string-format
		String listado = ENCABEZADO_CUENTA;
		// Recorremos el array
		for (int i = 0; i < numArticulos; i++) {
			double total = (Double.parseDouble(articulos[i][1]) * (Double.parseDouble(articulos[i][2])));
			// Comprobamos si el nombre del producto es mayor a 25caracteres y lo cortamos o
			// no.
			if (articulos[i][0].length() > 25) {
				listado += String.format("\n%-25s %4s %8s %8s", articulos[i][0].substring(0, 25), articulos[i][2],
						articulos[i][1], redondear(total));
			} else {
				listado += String.format("\n%-25s %4s %8s %8s", articulos[i][0], articulos[i][2], articulos[i][1],
						redondear(total));
			}
		}
		return listado;
	}

	/**
	 * 
	 * @return Devuelve los precios totales con iva sin iva y el iva solo con el
	 *         formato adecuado.
	 */
	public String totales() {
		// Creo el total en variable para que sea mas cómodo tratarlo.
		double total = 0;
		// Recorro el array y voy asignandole a total su valor mas el precio * cantidad
		// del producto que está en esa linea del array.
		for (int i = 0; i < numArticulos; i++) {
			// Parseo el String a double apra poderlo tratar matematicamente.
			total += (Double.parseDouble(articulos[i][1]) * (Double.parseDouble(articulos[i][2])));
		}
		// El formato del String que devolvemos al final del método con sus cálculos
		// apra el iva.
		String totales = "\n\n\nA PAGAR" + "\n-----------------------------" + "\n" + "\t *  Total:   "
				+ redondear(total) + " $" + "\n\t *  IVA:  " + redondear(total * IVA) + " $" + "\n\t *  A pagar:   "
				+ redondear(total + (total * IVA)) + " $";
		return totales;
	}

	// Recorremos el array y le asignamos "" a cada posición. 
	// No hace falta renombrar todas las posiciones del array  con "" ya que al resetaear numArticulos nunca se mostrarian.
	public void resetear() {

		// Reseteo la variable numArticulos ya que ahora es de 0.
		numArticulos = 0;
	}

	private double redondear(double numero) {
		// Uso math.round para redondear el número que le pasemos
		return Math.round(numero * 100.0) / 100.0;
	}
}
