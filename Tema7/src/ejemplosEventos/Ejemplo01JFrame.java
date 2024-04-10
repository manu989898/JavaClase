package ejemplosEventos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class Ejemplo01JFrame extends JFrame implements ActionListener {

	JButton btnPlay;
	JButton btnStop;
	JButton btnPausa;
	JButton btnBuscar;
	JButton btnGuardar;

	public Ejemplo01JFrame() {

		// Para poner título a la ventana.
		super("Reptroductor");

		// Damos valores a la ventana.
		setSize(340, 680);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Layout sirve para aplicarle un orden a los objetos del JFrame.
		// Se podría poner FlowLayout.RIGHT para que alinee todo a la derecha.
		BorderLayout dis = new BorderLayout();
		setLayout(dis);

		// Para dar un aspecto a las ventanas(Temas). UIManager y SwingUtilities,
		// aplicamos los dos.
		// Siempre entre try-catch
		try {

			// UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

			// UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel"); //Para
			// uno custom

			// UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); Para
			// usar el mismo del sistema operativo

			// UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			// Para que sea igual en todos los SO

			SwingUtilities.updateComponentTreeUI(this);

		} catch (Exception e) {

			System.out.println("Error al cambiar el Look And Feel");
		}

		// Creamos un objeto icono para asignarlo a un botón.
		ImageIcon imgReproductor = new ImageIcon("iconos/39.png");
		ImageIcon imgBuscar = new ImageIcon("iconos/65.png");
		ImageIcon imgStop = new ImageIcon("iconos/90.png");
		ImageIcon imgRepeat = new ImageIcon("iconos/42.png");
		ImageIcon imgGuardar = new ImageIcon("iconos/22.png");

		// Creamos botones y les asignamos la imágen al botón.
		btnPlay = new JButton("Play", imgReproductor);
		btnStop = new JButton("Stop", imgStop);
		btnPausa = new JButton("Repeat", imgRepeat);
		btnBuscar = new JButton("Buscar", imgBuscar);
		btnGuardar = new JButton("Guardar", imgGuardar);

		btnPlay.addActionListener(this);
		btnStop.addActionListener(this);
		btnPausa.addActionListener(this);
		btnBuscar.addActionListener(this);
		btnGuardar.addActionListener(this);

		// Creamos un texto
		JLabel lblPagina = new JLabel("REPRODUCTOR DE MÚSICA V12.3", JLabel.LEFT);
		JLabel lblSatisfecho = new JLabel("Aceptas recibir publicidad?");
		JLabel lblGenero = new JLabel("Selecciona un género");
		JLabel lblDescripcion = new JLabel("Por qué es tu canción favorita?");
		JLabel lblOpinion = new JLabel("Dejanos tu opinión");
		JLabel lblVolumen = new JLabel("Volume");
		JLabel lblCancionesFav = new JLabel("Canciones favoritas");
		JLabel lblNivelDescarga = new JLabel("Nivel de descarga");

		// Creamos una barra de progreso
		JProgressBar prgDescarga = new JProgressBar(0, 100);
		prgDescarga.setValue(27);
		prgDescarga.setStringPainted(true);
		prgDescarga.setPreferredSize(new Dimension(250, 30));
		// prgDescarga.setForeground(Color.green);
		// prgDescarga.setBackground(Color.green);

		// Creamos un campo a rellenar
		JTextField txtPagina = new JTextField("Buscar...", 15);

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

		// Creamos un Slider
		JSlider sldPista = new JSlider(JSlider.VERTICAL, 0, 100, 20); // Valor mínimo, máximo y valor de inicio.
		sldPista.setMinorTickSpacing(5); // Elegir valor mínimo de rayas.
		sldPista.setMajorTickSpacing(20); // Elegir valor máximo de rayas.
		sldPista.setPaintTicks(true); // Mostrar las rallas en la regla o no.
		sldPista.setPaintLabels(true);

		// Creamos un Area de texto
		JTextArea txtDescripcion = new JTextArea();
		JTextArea txtOpinion = new JTextArea();

		// Para que las lineas de texto no se salgan del ancho del rectángulo y no corte
		// las palabras
		txtOpinion.setLineWrap(true);
		txtOpinion.setWrapStyleWord(true);

		// Creamos un pane que es para que puedas hacer scroll
		JScrollPane scrPanel = new JScrollPane(txtDescripcion);
		JScrollPane scrPanelOpi = new JScrollPane(txtOpinion);

		// Creamos una dimensión para asiognarle el mismo tamaño a los demás.
		Dimension botones = new Dimension(120, 50);

		// Usamos setPreferredSize para dar un tamaño al elemento
		scrPanel.setPreferredSize(new Dimension(220, 80));
		btnBuscar.setPreferredSize(new Dimension(240, 30));
		scrPanelOpi.setPreferredSize(new Dimension(220, 80));
		btnGuardar.setPreferredSize(botones);

		// Creamos un array de canciones para pasarlo al JList.
		String[] canciones = { "Money for nothing", "Hate it or love it", "Nothing else mathers", "November Rain",
				"The unforguiven" };

		// Creamos una Lista
		JList<String> lsCanciones = new JList<>(canciones);
		JScrollPane scrCanciones = new JScrollPane(lsCanciones);
		scrCanciones.setPreferredSize(new Dimension(240, 80));

		// Creamos una Tool Bar y le añadimos los botones
		JToolBar tlbHerramientas = new JToolBar();
		tlbHerramientas.add(btnPlay);
		tlbHerramientas.add(btnStop);
		// Para añadir un separador a los iconos
		tlbHerramientas.addSeparator();
		tlbHerramientas.add(btnPausa);

		// Creamos un panel con FlowLayout para todo lo que no es ToolBar
		JPanel pnCentro = new JPanel();
		pnCentro.setLayout(new FlowLayout());

		JPanel pnLateral = new JPanel();
		pnLateral.setLayout(new FlowLayout());

		JPanel pnVolumen = new JPanel();
		pnLateral.setLayout(new FlowLayout());

		JPanel pnLatVol = new JPanel();
		pnLateral.setLayout(new FlowLayout());

		pnLateral.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		pnCentro.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));

		// Añadimos al panel todos los elementos
		pnCentro.add(lblPagina);
		pnVolumen.add(lblVolumen);
		pnLateral.add(sldPista);
		pnCentro.add(lblGenero);
		pnCentro.add(cmbGenero);
		pnCentro.add(txtPagina);
		pnCentro.add(btnBuscar);
		pnCentro.add(chkCursoJava);
		pnCentro.add(lblSatisfecho);
		pnCentro.add(radAcepto);
		pnCentro.add(radNoAcepto);
		pnCentro.add(lblDescripcion);
		pnCentro.add(scrPanel);
		pnCentro.add(lblOpinion);
		pnCentro.add(scrPanelOpi);
		pnCentro.add(btnGuardar);
		pnCentro.add(lblNivelDescarga);
		pnCentro.add(prgDescarga);
		pnCentro.add(lblCancionesFav);
		pnCentro.add(scrCanciones);
		// Añadimos a la ventana los dos paneles.
		add(tlbHerramientas, BorderLayout.NORTH);
		add(pnCentro, BorderLayout.CENTER);
		// add(pnVolumen, BorderLayout.NORTH);
		add(pnLateral, BorderLayout.EAST);

		// Para hacer visible
		setVisible(true);

	}

	public static void main(String[] args) {

		Ejemplo01JFrame ventana = new Ejemplo01JFrame();

		// Uso de paneles de Dialogo
		// JOptionPane.showMessageDialog(null, "Esto es un Message Dialog");

		// En este constructor podemos añadir nombre de ventana y icono usando números
		// enteros o " JOptionPane. "
		// JOptionPane.showMessageDialog(null, "Esto es un Message Dialog", "Message
		// Dialog", JOptionPane.ERROR_MESSAGE);

		// En este podemos elegir "Si", "No", "Cancelar".
		// JOptionPane.showConfirmDialog(null, "Esto es un Confirm Dialog");

		// En este constructor podemos Elegir los botones e icono.
		// JOptionPane.showConfirmDialog(null, "Esto es un Confirm Dialog", null,
		// JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

		// En este constructor podremos escribir y nos devolverá un String
		// JOptionPane.showInputDialog("Escribe tu DNI");

		// En este constructor le asignamos ventana, mensaje, nombre de ventana e icono.
		// JOptionPane.showInputDialog(null, "Escribe tu DNI", "DNI",
		// JOptionPane.INFORMATION_MESSAGE);

		// new Ejemplo08ToolBar();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton btnPulsado = (JButton) e.getSource();

		if (btnPulsado == btnGuardar) {

			JOptionPane.showMessageDialog(null, "Guardado!");

		} else if (btnPulsado == btnBuscar) {

			JOptionPane.showMessageDialog(null, "Buscando...");

		} else if (btnPulsado == btnPlay) {

			JOptionPane.showMessageDialog(null, "Reproduciendo atope!");

		} else if (btnPulsado == btnStop) {

			JOptionPane.showMessageDialog(null, "Parado");

		}
	}
}
