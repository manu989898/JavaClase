package exam;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.function.DoublePredicate;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ejer3 extends JFrame{
	double total = 0;
	public Ejer3() {
		super("Payload");
		setSize(500,390);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		String[][] cargas = { { "Detector de partículas de alta energía", "19.2" },
				{ "Subsistema espectrómetro de plasma", "12.5" },
				{ "Analizador de polvo cósmico", "40" },
				{ "Magnetómetro", "4.5" },
				{ "Detector de ondas de plasma", "51" },
				{ "Espectrómetro de masas", "43" },
				{ "Instrumento para radioastronomía planetaria",
				"80" }
				};
		
		JLabel lblcombo = new JLabel("Elija las cargas (carga máxima, 150.0 kg):");
		JComboBox<String> cmbCarga = new JComboBox();
		for (int i = 0; i < cargas.length; i++) {
			String dato = cargas[i][0] + " (" + cargas[i][1] + " kg)";
			cmbCarga.addItem(dato);
		}
		JTextArea txtLista = new JTextArea("");

		JScrollPane scrLista = new JScrollPane(txtLista);
		
		scrLista.setPreferredSize(new Dimension(470,150));
		JLabel lblTotal = new JLabel("0 kg");
		
		JButton btnanyadir = new JButton("Añadir carga");
		btnanyadir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int indice = cmbCarga.getSelectedIndex();
				txtLista.setText(txtLista.getText() + cargas[indice][0] + " ... " + cargas[indice][1] + " kg"  + "\n");
				
				total += Double.parseDouble(cargas[indice][1]);
				total = Math.round(total*100.00)/100.00;
				lblTotal.setText(""+total);
				if(total > 150) {	
					JOptionPane.showMessageDialog(btnanyadir, "El peso de la carga ha superado el máximo permitido", "Payload", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		lblTotal.setFont(new Font("Arial", Font.PLAIN, 80));
		
		add(lblcombo);
		add(cmbCarga);
		add(btnanyadir);
		add(scrLista);
		add(lblTotal);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		
		new Ejer3();
	}
}
