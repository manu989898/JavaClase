package ejercicios;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ejer1H5 extends JFrame implements FocusListener {

	JTextField txt1 = new JTextField(10);
	JTextField txt2 = new JTextField(10);
	JTextField txt3 = new JTextField(10);

	public Ejer1H5() {

		super("Plantilla");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new FlowLayout());

		txt1.addFocusListener(this);
		txt2.addFocusListener(this);
		txt3.addFocusListener(this);

		add(txt1);
		add(txt2);
		add(txt3);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejer1H5();
	}

	@Override
	public void focusGained(FocusEvent e) {

		JTextField seleccionado = (JTextField) e.getSource();

		if (seleccionado == txt1) {
			txt1.setBackground(Color.YELLOW);
		} else {
			txt1.setBackground(Color.WHITE);
		}
		if (seleccionado == txt2) {
			txt2.setBackground(Color.YELLOW);
		} else {
			txt2.setBackground(Color.WHITE);
		}
		if (seleccionado == txt3) {
			txt3.setBackground(Color.YELLOW);
		} else {
			txt3.setBackground(Color.WHITE);

		}

	}

	@Override
	public void focusLost(FocusEvent e) {

		// no se usa
	}
}
