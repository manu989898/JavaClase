package practica1TerceraEval;

public class Cuenta {

	public String ENCABEZADO_CUENTA;
	private String[][] articulos;
	private int numArticulos;
	private double total = 0;

	public Cuenta(int maxArticulos) {
		ENCABEZADO_CUENTA = "CAFETERÍA SON FERRER\n" + "C/ Cóndor , 9\n" + "Son Ferrer, Calvià\n"
				+ "-----------------------------------------------\n";
		articulos = new String[maxArticulos][3];
		numArticulos = 0;

	}

	public void addArticulo(String nombre, String precio, String unidades) {

		if (hayEspacio()){
			articulos[numArticulos] = new String[] { nombre, precio, unidades };
	
			numArticulos++;
		}
	}

	// Devuelve true si hay espacio enel array.
	public boolean hayEspacio() {

		if (articulos.length > numArticulos) {
			return true;
		}
		return false;
	}

	// Devuelve el encabezado y la lista de artículos de la cuenta.
	public String listadoArticulos() {
		String listaCompleta = "";
		String descripcion = String.format("%-25s %4s %8s %8s\n", "DESCRIPCIÓN", "UDS.", "PRE./UD.", "TOTAL(€)");
		String separador = String.format("%-25s %4s %8s %8s\n", "-------------------------", "----", "--------",
				"--------");

		for (int i = 0; i < numArticulos; i++) {
			// Sumamos el precio total de los articulos que se van añadiendo.
			// Multiplicamos el precio por las unidades.
			total += Double.parseDouble(articulos[i][1]) * Double.parseDouble(articulos[i][2]);

			String filasLista = String.format("%-25s %4s %8s %8s\n", articulos[i][0], articulos[i][1], articulos[i][2],
					total);
			
			// En cada pasada del bucle añade una fila más al listado.
			listaCompleta += filasLista;
		}

		return descripcion + separador + listaCompleta;
	}

	// Cálculo de los precios.
	public String totales() {
		
		String pago = "A PAGAR\n----------------------------------------------\n";
		String totalSinIva = "  * Total: " + total + " €\n";
		String precioIva = "  * Total: " + redondear(total*0.1) + " €\n";
		String pagoFinal = "  * A pagar: " + redondear(total + (total * 0.1)) + " €";

		return pago + totalSinIva + precioIva + pagoFinal;
	}

	public void resetear() {
		numArticulos = 0;
		total=0;
	}

	private double redondear(double numero) {
	    return Math.round(numero * 100) / 100.0;
	}

}