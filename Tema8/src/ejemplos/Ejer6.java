package ejemplos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JMenu;

public class Ejer6 extends JFrame {

	JLabel lblArchivo;
	JLabel lblArchivoGuardar;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JMenuItem mntmOpenFile_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer6 frame = new Ejer6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejer6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		mntmOpenFile_1 = new JMenuItem("Open File");
		mnFile.add(mntmOpenFile_1);

		mntmOpenFile_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				elegirArchivo(e);
			}
		});

		JMenuItem mntmSaves = new JMenuItem("Save");
		mnFile.add(mntmSaves);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		mntmSaves.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				elegirArchivo(e);
			}
		});
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(12, 0, 770, 263);
		contentPane.add(panel);
		panel.setLayout(null);

		lblArchivo = new JLabel("Archivo: ");
		lblArchivo.setBounds(12, 48, 746, 24);
		panel.add(lblArchivo);

	}

	private void elegirArchivo(ActionEvent e) {
		// Crear un objeto JFileChooser
		JFileChooser eleccion = new JFileChooser();
		if (e.getSource() == mntmOpenFile_1) {
			// Mostrar el cuadro de diálogo
			eleccion.showOpenDialog(this); // this es el JFrame
		} else {
			eleccion.showSaveDialog(this);
		}
		// Obtener el archivo seleccionado
		if (eleccion.getSelectedFile() != null) {

			// Mostrar el nombre del archivo seleccionado
			lblArchivo.setText(lblArchivo.getText() + eleccion.getSelectedFile());

		}
	}

}
