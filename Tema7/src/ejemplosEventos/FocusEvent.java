package ejemplosEventos;

import java.awt.FlowLayout;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FocusEvent extends JFrame implements FocusListener {

	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtNum3;
	private JLabel lblMedia;

	public FocusEvent() {

		super("Media aritmética");
		setSize(250, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new FlowLayout());

		txtNum1 = new JTextField("0", 5);
		txtNum1.addFocusListener(this);
		txtNum2 = new JTextField("0", 5);
		txtNum2.addFocusListener(this);
		txtNum3 = new JTextField("0", 5);
		txtNum3.addFocusListener(this);

		lblMedia = new JLabel("Promedio = 0");

		add(txtNum1);
		add(txtNum2);
		add(txtNum3);
		add(lblMedia);

		setVisible(true);

	}

	@Override
	public void focusGained(java.awt.event.FocusEvent e) {
		try {
		int num1 = Integer.parseInt(txtNum1.getText());
		int num2 = Integer.parseInt(txtNum2.getText());
		int num3 = Integer.parseInt(txtNum3.getText());
		
		
		double promedio = (num1 + num2 + num3) / 3.0;
		
		lblMedia.setText("Promedio =  " + promedio);
		} catch (NumberFormatException nfe){
			
			lblMedia.setText("Promedio =  ERROR");
			
		}
	}

	@Override
	public void focusLost(java.awt.event.FocusEvent e) {
		
		// No se usa porque basta con el focusGained

	}

	public static void main(String[] args) {

		new FocusEvent();
	}

}
