package ejercicios;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejer3Eventos extends JFrame implements ItemListener{
	
	private JCheckBox chkBilletes;
	private JCheckBox chkTransporte;
	private JCheckBox chkEstancia;
	private JCheckBox chkPension;
	private JLabel lblPrecio;
	private int precio;
	
	public Ejer3Eventos() {
		
		super("Plantilla");
		setSize(200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		chkBilletes = new JCheckBox("Billetes de avión", false);
		chkBilletes.addItemListener(this);
		chkTransporte = new JCheckBox("Transporte aeropuerto", false);
		chkTransporte.addItemListener(this);
		chkEstancia = new JCheckBox("Estancia en el hotel", false);
		chkEstancia.addItemListener(this);
		chkPension = new JCheckBox("Pensión completa", false);
		chkPension.addItemListener(this);
		lblPrecio = new JLabel("Precio total: " + precio + " $");
		
		add(chkBilletes);
		add(chkTransporte);
		add(chkEstancia);
		add(chkPension);
		add(lblPrecio);
		
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new Ejer3Eventos();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
			
		precio = 0;
		
		if (chkBilletes.isSelected()== true) {
			precio += 120;
		} else if (chkTransporte.isSelected()== true) {
			precio += 40;
		} else if (chkEstancia.isSelected()== true) {
			precio += 180;
		} else if (chkPension.isSelected()== true) {
			precio += 70;
		}
		
		lblPrecio.setText("Precio total: " + precio + " $");
	}

	
	
}
