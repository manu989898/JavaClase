package project;

public class Taller {

	private int MAX_LAVADORAS = 20;
	private Lavadora[] lavadoras = new Lavadora[MAX_LAVADORAS];

	public void listaLavadoras() {
		System.out.println("*** LISTADO DE LAVADORAS EN STOCK ***");
		for (int i = 0; i < lavadoras.length; i++) {
			if (lavadoras[i] != null) {
				System.out.println(lavadoras[i].toString());
			}
		}
		return;
	}

	public void addLavadora(Lavadora lav) {

		for (int i = 0; i < lavadoras.length; i++) {
			if (lavadoras[i] == null) {
				lavadoras[i] = lav;
				return;
			}
		}
	}

	public int buscaLavadora(int id) {
		for (int i = 0; i < lavadoras.length; i++) {
			if (lavadoras[i] != null && lavadoras[i].getId() == id) {
				return i;
			}
		}
		return -1;
	}


	public void borraLavadora(int id) {
		int pos = buscaLavadora(id);
		
			if (pos != -1) {
				lavadoras[pos] = null;
		}
	}

}
