package ejemplos;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class Jugador extends JFrame{
	String nombre;
	String puntuacion;
	JList<String> listPuntuaciones;
	DefaultListModel<String> model;
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
		
		scrPuntuaciones.setPreferredSize(new Dimension(370,520));
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
	* válidos.
	*/
	private Jugador leerDatosJugador() {
		String nombreJugador = JOptionPane.showInputDialog(this, "ingresa nombre", "Nombre", JOptionPane.QUESTION_MESSAGE);
		String puntuacionJugador = JOptionPane.showInputDialog(this, "ingresa nombre", "Nombre", JOptionPane.QUESTION_MESSAGE);
		
		try {
			
			
			double num = Double.parseDouble(puntuacionJugador);
			Jugador j1 = new Jugador(nombreJugador,puntuacionJugador);
		
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
			BufferedWriter bufferEscritura = new BufferedWriter(new FileWriter("ficheros/jugadores.txt", true));
			bufferEscritura.write(jugador.getNombre() + "," + jugador.getPuntuacion()+",");
			bufferEscritura.close();
	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	/**
	* Lee los datos sobre nombres y puntuaciones de jugadores. Los añade a la lista
	* que se muestra en la ventana.
	6
	*/
	public void cargarJugadores() {
	
			String leido;
			try {
				BufferedReader bufferLect = new BufferedReader(new FileReader("ficheros/jugadores.txt"));
				leido = bufferLect.readLine();
				String[]jugadores = leido.split(",");
				bufferLect.close();
				for (int i = 0; i < jugadores.length; i=i+2) {
					model.addElement(jugadores[i] + "..." + jugadores[i+1]);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	/**
	* Borra el contenido del archivo de jugadores, dejándolo en blanco. Y la lista
	* de jugadores en la ventana. Este método es llamado desde el listener del botón
	* Borrar.
	*/
	public void borrarArchivo() {
		
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
