package ejemplos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class Ejemplo08ToolBar extends JFrame{
	
	public Ejemplo08ToolBar() {
		
		super("Tool Bars");
		setSize(500,390);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
	
		// Creamos una Tool Bar
		JToolBar tlbHerramientas = new JToolBar();
		
		// Creamos los iconos
		ImageIcon imgNuevo = new ImageIcon("iconos/1.png");
		ImageIcon imgAbrir = new ImageIcon("iconos/52.png");
		ImageIcon imgGuardar = new ImageIcon("iconos/22.png");
		
		// Creamos los botones y les asignamos iconos
		JButton btnNuevo = new JButton(imgNuevo);
		JButton btnAbrir = new JButton(imgAbrir);
		JButton btnGuardar = new JButton(imgGuardar);
		
		// Creamos un JLabel
		JLabel lblComentarios = new JLabel("Comentarios:");
		
		// Creamos un JTextArea
		JTextArea txtComentarios = new JTextArea();
		
		// Creamos un JScrollPane
		JScrollPane scrComentarios = new JScrollPane(txtComentarios);
		scrComentarios.setPreferredSize(new Dimension(450, 200));
		
		// Añadimos un JPanel en el centro de la pantalla (div).
		JPanel pnCentral = new JPanel();
		pnCentral.setLayout(new FlowLayout());
		pnCentral.setBackground(Color.RED);
		
		pnCentral.add(lblComentarios);
		pnCentral.add(scrComentarios);
		
		// Añadimos los botones al ToolBar
		tlbHerramientas.add(btnNuevo);
		tlbHerramientas.add(btnAbrir);
		
		// Añadimos un separador al ToolBar
		tlbHerramientas.addSeparator();
		tlbHerramientas.add(btnGuardar);
		
		// Añadimos el Tool Bar y le decimos que se posicione arriba.
		add(tlbHerramientas, BorderLayout.NORTH);
		add(pnCentral, BorderLayout.CENTER);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		 new Ejemplo08ToolBar();
		
	}

}
