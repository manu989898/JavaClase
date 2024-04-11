package ejercicios;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Ejer02 extends JFrame {

	public Ejer02() {
		super("Selección de modelo");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		String[] marcas = { "Peugeot", "Volkswagen", "Renault", "Seat", "Ferrari", "Porsche", "Ferrari", "Jaguar",
				"Dacia" };

		JList<String> lstMarcas = new JList<>(marcas);
		JScrollPane scrMarcas = new JScrollPane(lstMarcas);

		JLabel lblModelo = new JLabel("Modelo?");

		add(scrMarcas);
		add(lblModelo);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejer02();
	}

}