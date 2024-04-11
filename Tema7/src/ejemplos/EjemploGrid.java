package ejemplos;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EjemploGrid extends JFrame{
	
	public EjemploGrid() {
		
		super("Alta");
		setSize(400, 140);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new GridLayout(1, 2, 0, 0));
		
		JButton btnAdd = new JButton("Añadir");
				
		
		JPanel pnText = new JPanel();
		pnText.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel lblNombre = new JLabel("Nombre");
		JTextField txtNombre = new JTextField(17);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		JTextField txtApellidos = new JTextField(17);
		
		pnText.add(lblNombre);
		pnText.add(txtNombre);
		pnText.add(lblApellidos);
		pnText.add(txtApellidos);
		
		add(pnText);
		add(btnAdd);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new EjemploGrid();
	}
	
}
