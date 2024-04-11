package ejercicios;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Act3 extends JFrame{

	public Act3() {
		super("Parámetros Críticos");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
				
		JLabel lblCombustible = new JLabel("Combustible");
		JLabel lblPresionMotor1 = new JLabel("Presion Motor 1");
		JLabel lblPresionMotor2 = new JLabel("Presion Motor 2");
		
		JProgressBar prgCombustible = new JProgressBar(0,100); 
		prgCombustible.setValue(20);
		prgCombustible.setStringPainted(true);
		prgCombustible.setForeground(Color.RED);
		
		JProgressBar prgPresionMotor1 = new JProgressBar(0,100);
		prgPresionMotor1.setValue(75);
		prgPresionMotor1.setStringPainted(true);
		prgPresionMotor1.setForeground(new Color(8, 158, 43));
		prgPresionMotor1.setBackground(Color.white);
		
		JProgressBar prgPresionMotor2 = new JProgressBar(0,100);
		prgPresionMotor2.setValue(75);
		prgPresionMotor2.setStringPainted(true);
		prgPresionMotor2.setForeground(new Color(8, 158, 43));
		prgPresionMotor2.setBackground(Color.white);
		
		add(prgCombustible);
		add(lblCombustible);
		add(prgPresionMotor1);
		add(lblPresionMotor1);
		add(prgPresionMotor2);
		add(lblPresionMotor2);
		 

		
		
 
		
	 
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Act3();
	}
}
