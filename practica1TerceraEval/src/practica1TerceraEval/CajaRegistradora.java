package practica1TerceraEval;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CajaRegistradora extends JFrame {

	private String stock[][] = new String[][] { { "Café con leche", "1.20" }, { "Café cortado", "1.00" },
			{ "Café solo", "0.85" }, { "Napolitana de Jamón York y queso", "2.30" },
			{ "Napolitana de chocolate", "2.10" }, { "Croissant", "1.80", }, { "Té verde", "1.80" },
			{ "Desayuno especial del lunes", "3.50" } };
	private Cuenta cuenta;
	private JComboBox<String> cmbArticulos;
	private JTextField txtUnidades;
	private JTextArea txtCuenta;

	public CajaRegistradora() {
		super("Caja registradora");
		setSize(1000, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		// Creamos cuenta con 3 articulos.
		cuenta = new Cuenta(3);

		// Panel principal de la izquierda donde irán los panales de la izquierda.
		JPanel panelIzquierda = new JPanel();
		panelIzquierda.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelIzquierda.setPreferredSize(new Dimension(300, 550));

		// Panel de productos.
		JPanel panelProducto = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelProducto.setPreferredSize(new Dimension(290, 55));

		JLabel lblProducto = new JLabel(" Producto");
		lblProducto.setPreferredSize(new Dimension(250, 20));
		String articulos[] = new String[] { "Café con leche", "Café cortado", "Café solo",
				"Napolitana de Jamón York" + " y queso", "Napolitana de chocolate", "Croissant", "Té verde",
				"Desayuno especial del lunes" };
		cmbArticulos = new JComboBox<String>(articulos);
		cmbArticulos.setPreferredSize(new Dimension(237, 20));

		panelProducto.add(lblProducto);
		panelProducto.add(cmbArticulos);

		// Panel de unidades.
		JPanel panelUnidades = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelUnidades.setPreferredSize(new Dimension(290, 50));

		JLabel lblUnidades = new JLabel(" Unidades");
		lblUnidades.setPreferredSize(new Dimension(250, 20));
		txtUnidades = new JTextField("1", 9);

		panelUnidades.add(lblUnidades);
		panelUnidades.add(txtUnidades);

		// Panel de botones.
		JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelBotones.setPreferredSize(new Dimension(290, 80));

		JButton btnAnyadir = new JButton("Añadir");
		btnAnyadir.setPreferredSize(new Dimension(115, 20));
		btnAnyadir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				anyadirProducto();
			}
		});

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setPreferredSize(new Dimension(115, 20));
		btnCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("si");
//				txtCuenta.setText(calcularCuenta());

			}
		});

		JButton btnNuevaCuenta = new JButton("Nueva Cuenta");
		btnNuevaCuenta.setPreferredSize(new Dimension(115, 20));

		panelBotones.add(btnAnyadir);
		panelBotones.add(btnCalcular);
		panelBotones.add(btnNuevaCuenta);

		// Agregamos los subpaneles del panel izquierdo
		panelIzquierda.add(panelProducto);
		panelIzquierda.add(panelUnidades);
		panelIzquierda.add(panelBotones);

		// Agregamos panel derecho.
		JPanel panelDerecho = new JPanel();
		panelDerecho.setPreferredSize(new Dimension(660, 520));
		panelDerecho.setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblCuenta = new JLabel("Cuenta");
		lblCuenta.setPreferredSize(new Dimension(100, 20));

		txtCuenta = new JTextArea(cuenta.ENCABEZADO_CUENTA + cuenta.listadoArticulos(), 650, 500);

		// Agregamos el label y el textArea al lado derecho.
		panelDerecho.add(lblCuenta);
		panelDerecho.add(txtCuenta);

		add(panelIzquierda);
		add(panelDerecho);

		setVisible(true);
	}

	public void anyadirProducto() {
		// PENDIENTE DE HACER
	}

	public void calcularCuenta() {
		cuenta.totales();
	}

	public void nuevaCuenta() {
		// PENDIENTE DE HACER
	}

	public static void main(String[] args) {
		new CajaRegistradora();

	}

}