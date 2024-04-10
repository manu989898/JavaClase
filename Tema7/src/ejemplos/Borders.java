package ejemplos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Borders extends JFrame{
	
	public Borders() {
		
		super("Plantilla");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new FlowLayout());
		
		
			// PANEL SUPERIOR
			JPanel panelSuperior = new JPanel();
			panelSuperior.setPreferredSize(new Dimension(370, 120));
			panelSuperior.setBorder(BorderFactory.createLineBorder(Color.RED));
			
			// PANEL INFERIOR
			JPanel panelInferior = new JPanel();
			panelInferior.setPreferredSize(new Dimension(370, 120));
			
			panelInferior.setBorder(BorderFactory.createLineBorder(Color.GREEN));
			// VENTANA COMPLETA
			add(panelSuperior);
			add(panelInferior);
		
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new Borders();
	}
	
}
