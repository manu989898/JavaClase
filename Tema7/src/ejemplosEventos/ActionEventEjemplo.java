

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.annotation.processing.SupportedSourceVersion;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ActionEventEjemplo extends JFrame implements ActionListener {

	public JButton btnAzul;
	public JButton btnRojo;
	public JLabel lblMensaje;

	public ActionEventEjemplo() {

		super("Elige Botón");
		setSize(250, 160);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		btnRojo = new JButton("Rojo");
		btnRojo.setBackground(Color.red);
		btnRojo.addActionListener(this);

		btnAzul = new JButton("Azul");
		btnAzul.setBackground(new Color(90, 100, 255));
		btnAzul.addActionListener(this);

		lblMensaje = new JLabel("Pulsa alguno de los dos botones");

		add(btnRojo);
		add(btnAzul);
		add(lblMensaje);

		setLayout(new FlowLayout());

		setVisible(true);

	}

	// Método de escucha obligatorio al implementar la interfaz.
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Creamos un botón y le asignamos el valor del botón pulsado.
		JButton btnPulsado = (JButton) e.getSource();

		if (btnPulsado == btnAzul) {

			lblMensaje.setText("Pulsaste el azul!");
		} else {

			lblMensaje.setText("Pulsaste el rojo!");
		}

	}

	public static void main(String[] args) {

		new ActionEventEjemplo();
	}

}
