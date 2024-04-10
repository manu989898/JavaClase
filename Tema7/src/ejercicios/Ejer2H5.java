package ejercicios;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejer2H5 extends JFrame implements KeyListener {

	JLabel lblColor = new JLabel("COLOR");

	public Ejer2H5() {

		super("Plantilla");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new FlowLayout());
		addKeyListener(this);
		add(lblColor);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejer2H5();
	}

	@Override
	public void keyTyped(KeyEvent e) {

		char pulsado = e.getKeyChar();

		if (pulsado == 'r') {
			lblColor.setText("ROJO");
			lblColor.setForeground(Color.RED);
		} else if (pulsado == 'a') {
			lblColor.setText("AZUL");
			lblColor.setForeground(Color.BLUE);
		} else if (pulsado == 'v') {
			lblColor.setText("VERDE");
			lblColor.setForeground(Color.GREEN);
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
