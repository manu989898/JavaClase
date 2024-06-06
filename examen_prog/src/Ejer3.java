import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejer3 {
	private static List<Pregunta> preguntas;
	
	public static void main(String[] args) {
		preguntas = new ArrayList<Pregunta>();
		cargarPreguntas("ficheros/trivial.txt", preguntas);
		listarPreguntas(preguntas);
	}
	
	public static void cargarPreguntas(String archivo, List<Pregunta> preguntas) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("ficheros/trivial.txt"));
			String linea = br.readLine();
			
			while (linea != null) {
				linea =  br.readLine();
				String enunciado = linea;
				String respuesta = br.readLine();
				int i = 0;
				if (i <= preguntas.size()) {
					
					preguntas.add(i, new Pregunta(enunciado, respuesta));
					i++;
					
				}
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void listarPreguntas(List<Pregunta> preguntas) {
		
		System.out.println("Listado de preguntas");
		for (int i = 0; i < preguntas.size(); i++) {
			System.out.println(preguntas.toString());
		}
		
	}
	
}
