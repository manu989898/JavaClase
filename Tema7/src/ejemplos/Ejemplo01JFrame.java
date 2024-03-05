package ejemplos;

import java.awt.*;
import javax.swing.*;

public class Ejemplo01JFrame extends JFrame {

	public Ejemplo01JFrame() {

		// Para poner título a la ventana.
		super("Reptroductor");

		// Damos valores a la ventana.
		setSize(250, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Layout sirve para aplicarle un ordena los objetos del JFrame.
		// Se podría poner FlowLayout.RIGHT para que alinee todo a la derecha.
		FlowLayout dis = new FlowLayout();
		setLayout(dis);

		// Creamos botones
		JButton btnPlay = new JButton("Play");
		JButton btnStop = new JButton("Stop");
		JButton btnPausa = new JButton("Pausa");
		JButton btnBuscar = new JButton("Buscar");

		// Creamos un texto
		JLabel lblPagina = new JLabel("REPRODUCTOR DE MÚSICA", JLabel.LEFT);
		JLabel lblSatisfecho = new JLabel("Aceptas recibir publicidad?");
		JLabel lblGenero = new JLabel("Selecciona un género");
		JLabel lblDescripcion = new JLabel ("Por qué es tu canción favorita?");
		JLabel lblOpinion = new JLabel ("Dejanos tu opinión");

		// Creamos un campo a rellenar
		JTextField txtPagina = new JTextField("Buscar", 19);

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
		
		// Usamos setPreferredSize para dar un tamaño al elemento
		scrPanel.setPreferredSize(new Dimension(220,80));
		btnBuscar.setPreferredSize(new Dimension(220,30));
		scrPanelOpi.setPreferredSize(new Dimension(220,80));
	
		// Para que las lineas de texto no se salgan del ancho del rectángulo y no corte las palabras
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
		setVisible(true);

	}

	public static void main(String[] args) {

		Ejemplo01JFrame ventana = new Ejemplo01JFrame();

	}
}
