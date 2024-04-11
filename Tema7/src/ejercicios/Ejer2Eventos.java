package ejercicios;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejer2Eventos extends JFrame implements ActionListener {

	JLabel lblCurso = new JLabel("Curso:");
	JComboBox<String> cmbCursos;

	public Ejer2Eventos() {

		super("Plantilla");
		setSize(220, 190);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblApellidos = new JLabel("Apellidos");
		JTextField txtApellidos = new JTextField(18);
		JLabel lblNombre = new JLabel("Nombre");
		JTextField txtNombre = new JTextField(18);
		JLabel lblCursos = new JLabel("Curso");
		cmbCursos = new JComboBox();
		cmbCursos.addActionListener(this);
		cmbCursos.addItem("1º ESO");
		cmbCursos.addItem("2º ESO");
		cmbCursos.addItem("3º ESO");
		cmbCursos.addItem("4º ESO");

		add(lblApellidos);
		add(txtApellidos);
		add(lblNombre);
		add(txtNombre);
		add(lblCursos);
		add(cmbCursos);
		add(lblCurso);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejer2Eventos();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	
		if (cmbCursos.getSelectedItem().equals("1º ESO")) {

			lblCurso.setText("Curso: 1º ESO");
		} else if (cmbCursos.getSelectedItem().equals("2º ESO")) {

			lblCurso.setText("Curso: 2º ESO");
			
		} else if (cmbCursos.getSelectedItem().equals("3º ESO")) {

			lblCurso.setText("Curso: 3º ESO");
			
		}else if (cmbCursos.getSelectedItem().equals("4º ESO")) {

			lblCurso.setText("Curso: 4º ESO");
			
		}

	}

}
