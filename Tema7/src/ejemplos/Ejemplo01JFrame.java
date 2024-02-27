package ejemplos;

import java.awt.*;
import javax.swing.*;

public class Ejemplo01JFrame extends JFrame {

	public Ejemplo01JFrame() {

		// Damos valores a la ventana.
		setSize(510, 110);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		// Layout sirve para aplicarle un ordena los objetos del JFrame.
		FlowLayout dis = new FlowLayout();
		setLayout(dis);

		// Creamos botones
		JButton btnPlay = new JButton("Play");
		JButton btnStop = new JButton("Stop");
		JButton btnPausa = new JButton("Pausa");
		JButton btnBuscar = new JButton("Buscar");

		// Creamos un texto
		JLabel lblPagina = new JLabel("REPRODUCTOR DE MÚSICA", JLabel.LEFT);

		// Creamos un campo a rellenar
		JTextField txtPagina = new JTextField("Buscar", 10);

		// Creamos un checkbox
		JCheckBox chkCursoJava = new JCheckBox("Like", false);

		ButtonGroup cursos = new ButtonGroup();

		add(lblPagina);
		add(btnPlay);
		add(btnStop);
		add(btnPausa);
		add(txtPagina);
		add(btnBuscar);
		add(chkCursoJava);
		setVisible(true);

	}

	public static void main(String[] args) {

		Ejemplo01JFrame ventana = new Ejemplo01JFrame();

	}
}
