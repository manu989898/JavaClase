
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
/**
 * 
 */
public class CajaRegistradora extends JFrame {

	private String[][] stock = {
			{ "Café con leche", "1.20" }, 
			{ "Café cortado", "1.00" }, 
			{ "Café solo", "0.85" },
			{ "Napolitana de Jamón York y queso", "2.30" },
			{ "Napolitana de chocolate", "2.10" },
			{ "Croissant", "1.80", }, 
			{ "Té verde", "1.80" }, 
			{ "Desayuno especial del lunes", "3.50" }
			};

	JComboBox<String> cmbArticulos;
	JTextField txtUnidades = new JTextField(8);
	JTextArea txtCuenta;
	Cuenta cuenta = new Cuenta(100);
	// No me deja usar el encabezado_Cuenta DE LA CLASE CUENTA POR ESO CREO OTRO AQUÍ.
	String cuentaDefault = "CAFETERÍA SON FERRER\nC/ Cóndor, 9 \nSon Ferrer, Calviá\n---------------------------------"  + String.format("\n%-26s %4s %8s %8s", "\nDESCRIPCIÓN", "UDS.", "PRE./UD.", "TOTAL($)")
	+ String.format("%-26s %4s %8s %8s", "\n----------------------", "----", "--------", "--------");

	public CajaRegistradora() {

		super("Caja Registradora");
		setSize(1100, 560);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new FlowLayout());
		
		// TODO
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Se ha producido un error al aplicar el Loock and Feel a la ventana.",
					"Caja registradora", JOptionPane.ERROR_MESSAGE);
		}

		txtCuenta = new JTextArea();
		// seteamos el texto default por inicio del txtCuenta
		txtCuenta.setText(cuentaDefault);

		JScrollPane scrollPane = new JScrollPane(txtCuenta);
		
		
		JLabel lblProducto = new JLabel("Producto");
		lblProducto.setPreferredSize(new Dimension(200, 20));
		
		// Añadimos los articulos al comboBox (en este caso se podria crear un Array y pasarle el Array)
		cmbArticulos = new JComboBox();
		cmbArticulos.addItem("Café con leche");
		cmbArticulos.addItem("Café cortado");
		cmbArticulos.addItem("Café solo");
		cmbArticulos.addItem("Napolitana de Jamón York y queso");
		cmbArticulos.addItem("Napolitana de chocolate");
		cmbArticulos.addItem("Croissant");
		cmbArticulos.addItem("Té verde");
		cmbArticulos.addItem("Desayuno especial del lunes");

		JLabel lblUnidades = new JLabel("Unidades");
		lblUnidades.setPreferredSize(new Dimension(180, 20));
		txtUnidades.setText("1");

		scrollPane.setPreferredSize(new Dimension(700, 450));

		JButton btnAnyadir = new JButton("Añadir");
		btnAnyadir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				anyadirProducto();

			}
		});

		JLabel lblCuenta = new JLabel("Cuenta");

		// Panel contenedor de la parte izquierda
		JPanel pnLeftContainer = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnLeftContainer.setPreferredSize(new Dimension(290, 500));

		// Panel superior de la aprte izquierda
		JPanel pnUpLeft = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnUpLeft.setPreferredSize(new Dimension(250, 60));

		// Panel medio de la parte izquierda.
		JPanel pnMidLeft = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnMidLeft.setPreferredSize(new Dimension(200, 60));

		// Panel inferior de la aprte izquierda
		JPanel pnDownLeft = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnDownLeft.setPreferredSize(new Dimension(250, 80));

		// Panel contenedor de la parte derecha
		JPanel pnRightContainer = new JPanel(new BorderLayout());

		// Botón de calcular
		JButton btnCalcular = new JButton("Calcular");
		// ACtion listener del botón para ejecutar el método calcularCuenta() de la
		// clase Cuenta al clicar.
		btnCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calcularCuenta();
			}
		});

		// Botón de cuenta nueva
		JButton btnNuevaCuenta = new JButton("Nueva Cuenta");
		// ACtion listener del botón para ejecutar el método nuevaCuenta() de la clase
		// Cuenta al clicar.
		btnNuevaCuenta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				nuevaCuenta();

			}
		});

		// Estilo de los botones
		btnNuevaCuenta.setPreferredSize(new Dimension(112, 25));
		btnAnyadir.setPreferredSize(new Dimension(112, 25));
		btnCalcular.setPreferredSize(new Dimension(112, 25));

		// Añadimos los items a los paneles correspondientes
		pnUpLeft.add(lblProducto);
		pnUpLeft.add(cmbArticulos);

		pnLeftContainer.add(pnUpLeft);

		pnMidLeft.add(lblUnidades);
		pnMidLeft.add(txtUnidades);

		pnLeftContainer.add(pnMidLeft);

		pnDownLeft.add(btnAnyadir);
		pnDownLeft.add(btnCalcular);
		pnDownLeft.add(btnNuevaCuenta);

		pnLeftContainer.add(pnDownLeft);
		add(pnLeftContainer);

		pnRightContainer.add(lblCuenta, BorderLayout.NORTH);
		pnRightContainer.add(scrollPane);
		add(pnRightContainer);

		setVisible(true);

	}

	/**
	 * Método anyadirProducto() Obtiene los datos del producto y los inserta en el
	 * array.
	 */
	public void anyadirProducto() {
		// Uso getselectedItem y lo convierto a String y lo uso como nombre dle
		// producto.
		// Uso el indice del comboBoxItem para saber que producto es de la lista Stock y
		// usarlo para el precio
		// Uso el metodo get para obtener la cantidad del txtUnidades
		cuenta.addArticulo(cmbArticulos.getSelectedItem().toString(), stock[cmbArticulos.getSelectedIndex()][1], txtUnidades.getText());
		txtCuenta.setText(cuenta.listadoArticulos());
		txtUnidades.setText("1");
	}

	public void calcularCuenta() {
		if (!txtCuenta.getText().contains("Total")) {
			txtCuenta.setText(txtCuenta.getText() + cuenta.totales());
		}
	}

	public void nuevaCuenta() {

		int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas crear una nueva cuenta?",
				"Confirmación", JOptionPane.YES_NO_OPTION);

		// Comprobar la opción seleccionada por el usuario
		if (opcion == JOptionPane.YES_OPTION) {
			// Si el usuario selecciona "Sí", restablecer la cuenta
			txtCuenta.setText(cuentaDefault);
			cuenta.resetear();

		} else if (opcion == JOptionPane.NO_OPTION || opcion == JOptionPane.CLOSED_OPTION) {
			// Si el usuario pulsa No, no ocurre nada.
			return;
		}
	}

	public static void main(String[] args) {

		new CajaRegistradora();
	}
}