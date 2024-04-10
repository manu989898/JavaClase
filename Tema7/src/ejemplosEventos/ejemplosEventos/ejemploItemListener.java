package ejemplosEventos;

public class ejemploItemListener extends JFrame implements ItemListener {

	private JComboBox<String> cmbAsignaturas;
	private JLabel lblSeleccionada;

	public ejemploItemListener() {

		super("Asignaturas");
		setSize(450, 230);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		JLabel lblAsignaturas = new JLabel("Elige tu asignatura favorita:");

		cmbAsignaturas = new JComboBox<>();
		cmbAsignaturas.addItem("Selecciona una opción");
		cmbAsignaturas.addItem("Programación");
		cmbAsignaturas.addItem("Lenguaje de marcas");
		cmbAsignaturas.addItem("Formación y orientación laboral");
		cmbAsignaturas.addItem("Entornos de desarrollo");
		cmbAsignaturas.addItem("Sistemas informáticos");
		cmbAsignaturas.addItem("Base de datos");

		lblSeleccionada = new JLabel("Elige tu asignatura favorita.");

		cmbAsignaturas.addItemListener(this);

		add(lblAsignaturas);
		add(cmbAsignaturas);
		add(lblSeleccionada);

		setVisible(true);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		String seleccionado = (String) cmbAsignaturas.getSelectedItem();

		if (seleccionado.equals("Selecciona una opción")) {
			lblSeleccionada.setText("Elige tu asignatura favorita.");
		} else {

			lblSeleccionada.setText("Tu asignatura favorita es: " + seleccionado);
		}
	}

	public static void main(String[] args) {

		new ejemploItemListener();
	}
}
