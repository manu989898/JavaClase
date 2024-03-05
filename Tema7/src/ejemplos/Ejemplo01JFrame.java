package ejemplos;

import java.awt.*;
import javax.swing.*;

public class Ejemplo01JFrame extends JFrame {

	public Ejemplo01JFrame() {

		// Para poner título a la ventana.
		super("Reptroductor");

		// Damos valores a la ventana.
		setSize(270, 550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Layout sirve para aplicarle un ordena los objetos del JFrame.
		// Se podría poner FlowLayout.RIGHT para que alinee todo a la derecha.
		FlowLayout dis = new FlowLayout();
		setLayout(dis);

		// Para dar un aspecto a las ventanas(Temas). UIManager y SwingUtilities,
		// aplicamos los dos.
		// Siempre entre try-catch
		try {

			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel"); // Para uno custom
			// UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); Para
			// usar el mismo del sistema operativo
			// UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			// Para que sea igual en todos los SO
			SwingUtilities.updateComponentTreeUI(this);

		} catch (Exception e) {

			System.out.println("Error al cambiar el Look And Feel");
		}

		// Creamos botones
		JButton btnPlay = new JButton("Play");
		JButton btnStop = new JButton("Stop");
		JButton btnPausa = new JButton("Pausa");
		JButton btnBuscar = new JButton("Buscar");
		JButton btnGuardar = new JButton("Guardar");

		// Creamos un texto
		JLabel lblPagina = new JLabel("REPRODUCTOR DE MÚSICA V12.3", JLabel.LEFT);
		JLabel lblSatisfecho = new JLabel("Aceptas recibir publicidad?");
		JLabel lblGenero = new JLabel("Selecciona un género");
		JLabel lblDescripcion = new JLabel("Por qué es tu canción favorita?");
		JLabel lblOpinion = new JLabel("Dejanos tu opinión");

		// Creamos un campo a rellenar
		JTextField txtPagina = new JTextField("Buscar", 15);

		// Creamos un checkbox
		JCheckBox chkCursoJava = new JCheckBox("Like", false);

		// Creamos un RadioButton
		JRadioButton radAcepto = new JRadioButton("Acepto", false);
		JRadioButton radNoAcepto = new JRadioButton("No acepto", false);

		// Creamos un grupo para que no se puedan pulsar los dos a la vez.
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(radAcepto);
		grupo.add(radNoAcepto);

		// Creamos un desplegable.
		JComboBox<String> cmbGenero = new JComboBox<>();
		cmbGenero.addItem("Rock");
		cmbGenero.addItem("Pop");
		cmbGenero.addItem("Classic");
		cmbGenero.addItem("Dance");
		cmbGenero.addItem("Punk");

		// Creamos un Area de texto
		JTextArea txtDescripcion = new JTextArea();
		JTextArea txtOpinion = new JTextArea();

		// Creamos un pane que es para que puedas hacer scroll
		JScrollPane scrPanel = new JScrollPane(txtDescripcion);
		JScrollPane scrPanelOpi = new JScrollPane(txtOpinion);

		// Creamos una dimensión para asiognarle el mismo tamaño a los demás.
		Dimension botones = new Dimension(120, 50);

		// Usamos setPreferredSize para dar un tamaño al elemento
		scrPanel.setPreferredSize(new Dimension(220, 80));
		btnBuscar.setPreferredSize(new Dimension(220, 30));
		scrPanelOpi.setPreferredSize(new Dimension(220, 80));
		btnGuardar.setPreferredSize(botones);

		// Para que las lineas de texto no se salgan del ancho del rectángulo y no corte
		// las palabras
		txtOpinion.setLineWrap(true);
		txtOpinion.setWrapStyleWord(true);

		add(lblPagina);
		add(btnPlay);
		add(btnStop);
		add(btnPausa);
		add(lblGenero);
		add(cmbGenero);
		add(txtPagina);
		add(btnBuscar);
		add(chkCursoJava);
		add(lblSatisfecho);
		add(radAcepto);
		add(radNoAcepto);
		add(lblDescripcion);
		add(scrPanel);
		add(lblOpinion);
		add(scrPanelOpi);
		add(btnGuardar);
		setVisible(true);

	}

	public static void main(String[] args) {

		Ejemplo01JFrame ventana = new Ejemplo01JFrame();
		
		// Uso de paneles de Dialogo
		// JOptionPane.showMessageDialog(null, "Esto es un Message Dialog");
		
		// En este constructor podemos añadir nombre de ventana y icono usando números enteros o " JOptionPane. "
		JOptionPane.showMessageDialog(null, "Esto es un Message Dialog", "Message Dialog", JOptionPane.ERROR_MESSAGE);
		
		// En este podemos elegir "Si", "No", "Cancelar".
		// JOptionPane.showConfirmDialog(null, "Esto es un Confirm Dialog");
		
		// En este constructor  podemos Elegir los botones e icono.
		JOptionPane.showConfirmDialog(null, "Esto es un Confirm Dialog", null, JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

	}
}
