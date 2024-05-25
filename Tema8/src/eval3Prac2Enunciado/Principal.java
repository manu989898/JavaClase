package eval3Prac2Enunciado;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {

	private List<Alumno> alumnos;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAsignatura;
	private String rutaArchivo = "ficheros/alumnos.txt";
	private String rutaGuardado = "ficheros/boletin.txt";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principal() {

		setTitle("Boletín App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			JOptionPane.showMessageDialog(this, "Error al cambiar el look and feel de la aplicación.", "Boletín App",
					JOptionPane.ERROR_MESSAGE);
		}

		JLabel lblAsignatura = new JLabel("Asignatura");
		lblAsignatura.setBounds(10, 10, 100, 13);
		contentPane.add(lblAsignatura);

		txtAsignatura = new JTextField();
		txtAsignatura.setBounds(10, 33, 164, 19);
		contentPane.add(txtAsignatura);
		txtAsignatura.setColumns(10);

		JLabel lblAlumnos = new JLabel("Alumnos");
		lblAlumnos.setBounds(10, 62, 60, 13);
		contentPane.add(lblAlumnos);

		JScrollPane panelAlumnos = new JScrollPane();
		panelAlumnos.setBounds(10, 85, 508, 278);
		contentPane.add(panelAlumnos);

		DefaultListModel<Alumno> modelo = new DefaultListModel<>();
		JList<Alumno> lstAlumnos = new JList<>(modelo);
		lstAlumnos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					abrirFichaAlumno(lstAlumnos);
				}
			}
		});
		panelAlumnos.setViewportView(lstAlumnos);

		alumnos = new ArrayList<>();

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarBoletin(rutaGuardado);
				JOptionPane.showMessageDialog(Principal.this, "Se han guardado las notas de "+ txtAsignatura.getText() + ".", "Boletín App",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnGuardar.setBounds(142, 373, 115, 21);
		contentPane.add(btnGuardar);

		JButton btnImportarAlumnos = new JButton("Importar alumnos");
		btnImportarAlumnos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				alumnos = importarAlumnos(rutaArchivo);
				Principal.this.mostrarAlumnos(modelo);
			}

		});
		btnImportarAlumnos.setBounds(10, 373, 115, 21);
		contentPane.add(btnImportarAlumnos);

	}

	/*
	 * Abre el archivo indicado por rutaArchivo. ◦ Lee el curso y la lista de
	 * alumnos. ◦ Muestra un mensaje indicando que se van a cargar los alumnos del
	 * curso tal. ◦ Almacena cada alumno como un objeto Alumno en un ArrayList. ◦
	 * Devuelve ese ArrayList.
	 */
	public ArrayList<Alumno> importarAlumnos(String rutaArchivo) {
		ArrayList<Alumno> alumnos = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
			String curso = br.readLine();
			JOptionPane.showMessageDialog(this, "Cargando alumnos del curso " + curso, "Boletín App",
					JOptionPane.INFORMATION_MESSAGE);
			String linea;
			br.readLine();

			while ((linea = br.readLine()) != null) {
				String nombre = linea;
				int nota = -1;
				Alumno alumno = new Alumno(nombre, nota);
				alumnos.add(alumno);
			}
			br.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(this, "No se ha encontrado el archivo de alumnos.", "Boletín App",
					JOptionPane.ERROR_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "Error al leer el archivo de alumnos.", "Boletín App",
					JOptionPane.ERROR_MESSAGE);
		}
		return alumnos;
	}
	
	public void abrirFichaAlumno(JList<Alumno> lstAlumnos) {
		VentanaNota ventanaNota = new VentanaNota();
		Alumno alumno = lstAlumnos.getSelectedValue();
		ventanaNota.setAlumno(alumno);
		ventanaNota.setCallback(new Callback() {
			@Override
			public void actualizarVentana(int nota) {
				alumno.setNota(nota);
			}
		});
	}

	public void mostrarAlumnos(DefaultListModel<Alumno> modelo) {
		modelo.clear();
		for (Alumno alumno : alumnos) {
			modelo.addElement(alumno);
		}	
	}
	public void guardarBoletin(String rutaGuardado) {
		
		String mensaje;
		if (txtAsignatura.getText().isEmpty()) {
			mensaje = "No se ha introducido la asignatura.";
		} else if (alumnos.isEmpty()) {
			mensaje = "No hay alumnos para guardar.";
		} else {
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaGuardado))) {
				bw.write("Asignatura= " + txtAsignatura.getText());
				bw.newLine();
				bw.write("Fecha= " + LocalDate.now());
				bw.newLine();
				bw.newLine();
				for (Alumno alumno : alumnos) {
					bw.write("Nombre=" + alumno.getNombre());
					bw.newLine();
					bw.write("Nota=" + alumno.getNota());
					bw.newLine();
				}
				
			} catch (IOException e) {
				mensaje = "Error al guardar el boletín.";
				JOptionPane.showMessageDialog(this, mensaje, "Boletín App", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
