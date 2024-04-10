package ejercicios;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Plantilla extends JFrame{
	
	public Plantilla() {
		
		super("Plantilla");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new FlowLayout());
		
		
		
		
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new Plantilla();
	}
	
}
