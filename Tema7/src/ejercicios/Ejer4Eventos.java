package ejercicios;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ejer4Eventos extends JFrame implements ChangeListener{
	
	private JSlider sldRojo = new JSlider(JSlider.HORIZONTAL, 0, 255, 255);
	private JSlider sldVerde = new JSlider(JSlider.HORIZONTAL, 0, 255, 255);
	private JSlider sldAzul = new JSlider(JSlider.HORIZONTAL, 0, 255, 255);
	JTextField txtHex = new JTextField(7);
	private JButton btnColor;
	
	public Ejer4Eventos() {
		
		super("Paleta");
		setSize(230, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new FlowLayout());
		
		sldRojo.addChangeListener(this);
		sldVerde.addChangeListener(this);
		sldAzul.addChangeListener(this);
		
		JLabel lblRojo = new JLabel("Rojo");
		sldRojo.setMinorTickSpacing(25); // Elegir valor mínimo de rayas.
		sldRojo.setMajorTickSpacing(50); // Elegir valor máximo de rayas.
		sldRojo.setPaintTicks(true); // Mostrar las rallas en la regla o no.
		sldRojo.setPaintLabels(true);
		
		JLabel lblVerde = new JLabel("Verde");
		sldVerde.setMinorTickSpacing(25); // Elegir valor mínimo de rayas.
		sldVerde.setMajorTickSpacing(50); // Elegir valor máximo de rayas.
		sldVerde.setPaintTicks(true); // Mostrar las rallas en la regla o no.
		sldVerde.setPaintLabels(true);
		
		JLabel lblAzul = new JLabel("Azul");
		sldAzul.setMinorTickSpacing(25); // Elegir valor mínimo de rayas.
		sldAzul.setMajorTickSpacing(50); // Elegir valor máximo de rayas.
		sldAzul.setPaintTicks(true); // Mostrar las rallas en la regla o no.
		sldAzul.setPaintLabels(true);
			
		btnColor = new JButton();
		btnColor.setPreferredSize(new Dimension(100, 30));
		
		
		
		add(lblRojo);
		add(sldRojo);
		add(lblVerde);
		add(sldVerde);
		add(lblAzul);
		add(sldAzul);
		add(btnColor);
		add(txtHex);
		
		setVisible(true);
		
	}
	
	
	private String hexadecimal(int rojo, int verde, int azul) {
		
		//https://stackoverflow.com/questions/12005424/java-converting-int-to-hex-and-back-again
		String rojos = Integer.toHexString(rojo);
		String verdes = Integer.toHexString(verde);
		String azules = Integer.toHexString(azul);
		return "#" + rojos + verdes + azules;
		
		
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		
		int rojo = sldRojo.getValue();
		int verde = sldVerde.getValue();
		int azul = sldAzul.getValue();
		
		btnColor.setBackground(new Color(rojo, verde, azul));
		txtHex.setText(hexadecimal(rojo,verde,azul));
		
	}
	
	public static void main(String[] args) {
		
		new Ejer4Eventos();
	}
}
