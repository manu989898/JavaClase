package ejercicios;



	import java.awt.FlowLayout;

	import javax.swing.JFrame;
	import javax.swing.JMenu;
	import javax.swing.JMenuBar;
	import javax.swing.JMenuItem;

	public class Carlosmenu  extends JFrame {

	public Carlosmenu() {

	super("Asistente matemático");
	setSize(320, 220);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	setLayout(new FlowLayout());

	JMenu menuMat = new JMenu("Aritmética");

	JMenuItem itemSuma = new JMenuItem("Suma");
	JMenuItem itemResta = new JMenuItem("Resta");
	JMenuItem itemMult = new JMenuItem("Multiplicación");
	JMenuItem itemDiv = new JMenuItem("División");
	JMenuItem itemPorcentaje = new JMenuItem("Porcentaje");
	
	//Añadimos los items
	menuMat.add(itemSuma);
	menuMat.add(itemResta);
	
	menuMat.addSeparator();
	
	menuMat.add(itemMult);
	menuMat.add(itemDiv);
	
	menuMat.addSeparator();
	
	menuMat.add(itemPorcentaje);

	JMenu menuCalc = new JMenu("Cálculo");

	JMenuItem itemDerivadas = new JMenuItem("Derivada");
	JMenuItem itemIntergral = new JMenuItem("Intergral");
	JMenuItem itemPoli = new JMenuItem("Polinomio de Tailor");
	JMenuItem itemEcu = new JMenuItem("Ecuación diferencial");
	
	//Añadimos los items
	menuCalc.add(itemDerivadas);
	menuCalc.add(itemIntergral);
	
	menuCalc.addSeparator();
	
	menuCalc.add(itemPoli);
	menuCalc.add(itemEcu);

	JMenuBar barraMenu = new JMenuBar();

	barraMenu.add(menuMat);
	barraMenu.add(menuCalc);
	
	//Se lo asignaMOS
	setJMenuBar(barraMenu);

	setVisible(true);
	}

	public static void main(String[] args) {

	new Carlosmenu();
	}

	
	}
	
	
