package ejemplos;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EjemploGridLayout extends JFrame{
	
	public EjemploGridLayout() {
		
		super("Stream Deck");
		setSize(400, 230);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new GridLayout(2, 4, 10, 10));
		
		JButton btnPedo = new JButton("Pedo");
		JButton btnRisas = new JButton("Risas");
		JButton btnEsc1 = new JButton("Escena1");
		JButton btnEsc2 = new JButton("Escena2");
		JButton btnEsc3 = new JButton("Escena3");
		JButton btnEsc4 = new JButton("Escena4");
		JButton btnCam1 = new JButton("Cam1");
		JButton btnCam2 = new JButton("Cam2");
		
		add(btnCam1);
		add(btnCam2);
		add(btnPedo);
		add(btnRisas);
		add(btnEsc1);
		add(btnEsc2);
		add(btnEsc3);
		add(btnEsc4);
		
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new EjemploGridLayout();
	}
	
}
