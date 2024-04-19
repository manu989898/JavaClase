package ejemplos;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.Buffer;
import java.util.Formatter;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class Jugador extends JFrame {
	String nombre;
	String puntuacion;
	JList<String> listPuntuaciones;
	DefaultListModel<String> model;
	final String RUTA = "ficheros/jugadores.txt";

	public Jugador() {

		super("Puntuaciones");
		setSize(400, 630);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		model = new DefaultListModel<>();
		listPuntuaciones = new JList<>(model);

		JLabel lblTitulo = new JLabel("***Hall of Fame***");
		JScrollPane scrPuntuaciones = new JScrollPane(listPuntuaciones);

		scrPuntuaciones.setPreferredSize(new Dimension(370, 520));
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				nuevoJugador();
			}
		});
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				borrarArchivo();
			}
		});
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
			CrearArchivo();
			cargarJugadores();
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		add(lblTitulo);
		add(scrPuntuaciones);
		add(btnNuevo);
		add(btnBorrar);
		setVisible(true);

	}

	public Jugador(String nombre, String puntuacion) {
		this.nombre = nombre;
		this.puntuacion = puntuacion;
	}

	/**
	 * Añade un jugador nuevo y su puntuación. Este método es llamado desde el
	 * listener del botón Nuevo.
	 */
	private void nuevoJugador() {

		guardarJugador(leerDatosJugador());
		cargarJugadores();

//		try {
//			BufferedWriter bufferEscritura = new BufferedWriter(new FileWriter("ficheros/jugadores.txt"));
//			
//			String nombreJugador = JOptionPane.showInputDialog(this, "ingresa nombre", "Nombre", JOptionPane.QUESTION_MESSAGE);
//			String puntuacionJugador = JOptionPane.showInputDialog(this, "ingresa nombre", "Nombre", JOptionPane.QUESTION_MESSAGE);
//			bufferEscritura.write(nombreJugador + "," + puntuacionJugador);
//			model.addElement(nombreJugador + "..." + puntuacionJugador);
//			
//			bufferEscritura.close();
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
	}

	/**
	 * Pide al usuario los datos de un nuevo jugador y devuelve un objeto Jugador.
	 *
	 * @return Un objeto Jugador con los datos leídos, o null si los datos no son
	 *         válidos.
	 */
	private Jugador leerDatosJugador() {
		String nombreJugador = JOptionPane.showInputDialog(this, "ingresa nombre", "Nombre",
				JOptionPane.QUESTION_MESSAGE);
		String puntuacionJugador = JOptionPane.showInputDialog(this, "ingresa nombre", "Nombre",
				JOptionPane.QUESTION_MESSAGE);

		try {

			// Pruebo a parsear el resultado del segundo dialog para ver si es correcto el
			// forato introducido.
			double num = Double.parseDouble(puntuacionJugador);
			Jugador j1 = new Jugador(nombreJugador, puntuacionJugador);
			return j1;

		} catch (Exception e) {
			System.out.println("Oye esto no se puede hacer");
			return null;
		}
	}

	/**
	 * Guarda la información de un jugador en el archivo de disco, en formato csv.
	 *
	 * @param jugador Objeto Jugador con el nombre y la puntuación a añadir.
	 */
	public void guardarJugador(Jugador jugador) {

		try {
			// Añado esta comprobación ya que el método leer datos nos puede dar null y
			// a la hora de ejecutar en jugador.getNombre() nos daria error al invocar
			if (jugador != null) {
				BufferedWriter bufferEscritura = new BufferedWriter(new FileWriter(RUTA, true));
				bufferEscritura.write(jugador.getNombre() + "," + jugador.getPuntuacion() + ",");
				bufferEscritura.close();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Lee los datos sobre nombres y puntuaciones de jugadores. Los añade a la lista
	 * que se muestra en la ventana. 6
	 */
	public void cargarJugadores() {

		try (BufferedReader br = new BufferedReader(new FileReader(RUTA))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				// Separamos los elementos del CSV y los guardamos en un array.
				String[] partes = linea.split(",");

				// Eliminamos los elementos de la lista (solo de la lista)
				model.removeAllElements();

				// Recorremos el Array para agregarlos a la lista y que se muestren.
				for (int i = 0; i < partes.length; i = i + 2) {
					model.addElement(partes[i] + "..." + partes[i + 1]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Borra el contenido del archivo de jugadores, dejándolo en blanco. Y la lista
	 * de jugadores en la ventana. Este método es llamado desde el listener del
	 * botón Borrar.
	 */
	public void borrarArchivo() {
		int avisoBorrado = new JOptionPane().showConfirmDialog(this,
				"¿Seguro que quieres borrar los datos de los jugadores?", "Advertencia", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);

		if (avisoBorrado == 0) {
			try {
				Formatter formateo = new Formatter(RUTA);
				model.removeAllElements();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			new JOptionPane().showMessageDialog(null, "Operación cancelada. No se ha borrado ningún dato.", "Mensaje",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void CrearArchivo() {
		File archivo = new File(RUTA);
		BufferedWriter bw;
		if (archivo.exists()) {
			// El fichero ya existe
		} else {
			// El fichero no existe y hay que crearlo
			try {
				new JOptionPane().showMessageDialog(null,
						"No se han encontrado datos guardados de jugadores. Se creará un archivo nuevo.", "Mensaje",
						JOptionPane.INFORMATION_MESSAGE);
				bw = new BufferedWriter(new FileWriter(archivo));
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Jugador();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(String puntuacion) {
		this.puntuacion = puntuacion;
	}

}
