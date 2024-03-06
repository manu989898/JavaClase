package ejercicios;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;

import ejemplos.Main;

public class Ejer1 extends JFrame {

	public Ejer1() {

		super("Velocidad de crucero");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		FlowLayout dis = new FlowLayout();
		setLayout(dis);
		
		// Ejercicio1
		// JOptionPane.showConfirmDialog(null, "Confirmacion de formateo","¿Formatear el
		// disco duro?" , JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

		// Ejercicio2
		// JOptionPane.showInputDialog(null, "Escribe tu DNI", "DNI",  JOptionPane.QUESTION_MESSAGE);

		// Ejercicio3
		/* JOptionPane.showMessageDialog(null, "Se ha detectado un escaneo " + "de red desde la IP 192.168.1.12",
				"Alerta de seguridad",  JOptionPane.WARNING_MESSAGE); */
		
		//Ejer1 Slider
		
		JSlider sld1 = new JSlider(10,120,90);
		sld1.setPaintLabels(true);
		sld1.setPaintTicks(true);
		sld1.setMajorTickSpacing(20);
		sld1.setMinorTickSpacing(5);
		
		JSlider sld2 = new JSlider(JSlider.VERTICAL,0,25,17);
		sld2.setPaintLabels(true);
		sld2.setPaintTicks(true);
		sld2.setMajorTickSpacing(5);
		sld2.setMinorTickSpacing(1);
		
		JLabel lbl2 = new JLabel("Temperatura ºC");
		
		//add(sld1); 
		add(sld2);
		add(lbl2);
		setVisible(true);

	}

	public static void main(String[] args) {

		Ejer1 ventana = new Ejer1();

	}

}
