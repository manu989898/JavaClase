package ejercicios;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ejer3H5 extends JFrame implements ActionListener {

	JTextField txtOperandoA = new JTextField("0",10);
	JTextField txtOperandoB = new JTextField("0",10);
	JTextField txtResultado = new JTextField(10);
	JComboBox<String> cmbTipoOperacion = new JComboBox<>();

	public Ejer3H5() {

		super("Plantilla");
		setSize(250, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblOperandoA = new JLabel("Operando A");
		JLabel lblOperandoB = new JLabel("Operando B");
		JLabel lblOperación = new JLabel("Operación");
		JLabel lblResultado = new JLabel("Resultado");

		cmbTipoOperacion.addItem("Suma");
		cmbTipoOperacion.addItem("Resta");
		cmbTipoOperacion.addItem("Multiplicación");
		cmbTipoOperacion.addItem("División");

		add(lblOperandoA);
		add(txtOperandoA);
		add(lblOperandoB);
		add(txtOperandoB);
		add(lblOperación);
		add(cmbTipoOperacion);
		add(lblResultado);
		add(txtResultado);
		cmbTipoOperacion.addActionListener(this);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejer3H5();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double resultado;
		
		try {
			if (cmbTipoOperacion.getSelectedItem().equals("Resta")) {
				resultado = Double.parseDouble(txtOperandoA.getText()) - Double.parseDouble(txtOperandoB.getText());
				txtResultado.setText("" + resultado);

			} else if (cmbTipoOperacion.getSelectedItem().equals("Suma")) {
				resultado = Double.parseDouble(txtOperandoA.getText()) + Double.parseDouble(txtOperandoB.getText());
				txtResultado.setText("" + resultado);

			} else if (cmbTipoOperacion.getSelectedItem().equals("División")) {
				resultado = Double.parseDouble(txtOperandoA.getText()) / Double.parseDouble(txtOperandoB.getText());
				txtResultado.setText("" + resultado);

			} else if (cmbTipoOperacion.getSelectedItem().equals("Multiplicación")) {
				resultado = Double.parseDouble(txtOperandoA.getText()) * Double.parseDouble(txtOperandoB.getText());
				txtResultado.setText("" + resultado);
			}
		
			
			// No leer el catch porfis!!!!!!
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			// te dije que no bajes!
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//porfi
			
			
			
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Carlos, solo puedes poner números! -0,25 Puntos menos.");
		}
		
	}
}
