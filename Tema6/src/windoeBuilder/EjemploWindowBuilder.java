package windoeBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class EjemploWindowBuilder extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private final JTextField txtApellidos = new JTextField();
	private JTextField txtDni;
	private JTextField txtNombreUsuario;
	private JPasswordField pwdContrasea;
	private JPasswordField pwdContrasea_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemploWindowBuilder frame = new EjemploWindowBuilder();
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
	public EjemploWindowBuilder() {
		setTitle("Sistema de Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmNuevo = new JMenuItem("Nuevo");
		mnArchivo.add(mntmNuevo);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir...");
		mnArchivo.add(mntmAbrir);
		
		JMenuItem mntmGuardarComo = new JMenuItem("Guardar como...");
		mnArchivo.add(mntmGuardarComo);
		
		JMenuItem mntmCerrar = new JMenuItem("Cerrar");
		mntmCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnArchivo.add(mntmCerrar);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmContacto = new JMenuItem("Contacto");
		mnAyuda.add(mntmContacto);
		
		JMenuItem mntmManualDeAyuda = new JMenuItem("Manual de ayuda");
		mnAyuda.add(mntmManualDeAyuda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(39, 12, 70, 15);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setText("nombre...");
		txtNombre.setBounds(39, 32, 135, 19);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(39, 68, 70, 15);
		contentPane.add(lblApellidos);
		txtApellidos.setText("apellidos...");
		txtApellidos.setBounds(39, 85, 135, 19);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(39, 116, 135, 15);
		contentPane.add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setText("dni...");
		txtDni.setBounds(39, 135, 135, 19);
		contentPane.add(txtDni);
		txtDni.setColumns(10);
		
		JLabel lblNombreUsusario = new JLabel("Nombre Ususario");
		lblNombreUsusario.setBounds(256, 12, 135, 15);
		contentPane.add(lblNombreUsusario);
		
		txtNombreUsuario = new JTextField();
		txtNombreUsuario.setText("Nombre Usuario...");
		txtNombreUsuario.setBounds(256, 29, 135, 19);
		contentPane.add(txtNombreUsuario);
		txtNombreUsuario.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(257, 68, 143, 15);
		contentPane.add(lblContrasea);
		
		pwdContrasea = new JPasswordField();
		pwdContrasea.setText("Contraseña");
		pwdContrasea.setBounds(256, 85, 144, 19);
		contentPane.add(pwdContrasea);
		
		JLabel lblRepiteContrasea = new JLabel("Repite contraseña");
		lblRepiteContrasea.setBounds(256, 120, 143, 15);
		contentPane.add(lblRepiteContrasea);
		
		pwdContrasea_1 = new JPasswordField();
		pwdContrasea_1.setText("contraseña");
		pwdContrasea_1.setBounds(256, 135, 143, 19);
		contentPane.add(pwdContrasea_1);
		
		JButton btnCrearCuenta = new JButton("Crear");
		btnCrearCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCrearCuenta.setBounds(39, 179, 135, 51);
		contentPane.add(btnCrearCuenta);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(214, 12, 2, 158);
		contentPane.add(separator);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNombre.setText("");
				txtApellidos.setText("");
				txtDni.setText("");
				txtNombreUsuario.setText("");
				pwdContrasea_1.setText("");
				pwdContrasea.setText("");
			}
		});
		btnBorrar.setBounds(256, 179, 144, 51);
		contentPane.add(btnBorrar);
	}
}
