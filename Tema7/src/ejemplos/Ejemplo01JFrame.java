package ejemplos;

import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejemplo01JFrame extends JFrame {

	public Ejemplo01JFrame() {
		
		// Damos valores a la ventana.
		setSize(275, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		FlowLayout dis = new FlowLayout();
		setLayout(dis);
		
		//Creamos botones
		JButton btnPlay = new JButton("Play");
		JButton btnStop = new JButton("Stop");
		JButton btnPausa = new JButton("Pausa");
		
		//Creamos un texto
		JLabel lblPagina = new JLabel("Dirección página web: ", JLabel.LEFT);
		
		//Creamos un campo a rellenar
		JTextField txtPagina = new JTextField("Escribe aquí", 10);
		
		//Creamos un checkbox
		JCheckBox chkCursoJava = new JCheckBox("Curso de Java", true);
		
		ButtonGroup cursos = new ButtonGroup();
		
		add(btnPlay);
		add(btnStop);
		add(btnPausa);
		add(txtPagina);
		add(lblPagina);
		setVisible(true);
		add(chkCursoJava);
		
	}

}
