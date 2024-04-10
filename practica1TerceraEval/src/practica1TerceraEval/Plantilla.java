package practica1TerceraEval;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Plantilla extends JFrame{
	
	public Plantilla() {
		
		super("Menús");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		// Creamos el JMenu Archivo
		JMenu menuArchivo = new JMenu("Archivo");
		
		// Creamos las opciones del menú
		JMenuItem itemNuevo = new JMenuItem("Nuevo");
		JMenuItem itemAbrirArchivo = new JMenuItem("Abrir archivo...");
		JMenuItem itemAbrirProyecto = new JMenuItem("Abrir proyectos");
		JMenuItem itemArchivosRecientes = new JMenuItem("Archivos recientes...");
		
		// Añadimos...
		menuArchivo.add(itemNuevo);
		menuArchivo.add(itemAbrirArchivo);
		menuArchivo.add(itemAbrirProyecto);
		menuArchivo.add(itemArchivosRecientes);
		
		// Creamos el JMenu Editar
		JMenu menuEditar = new JMenu("Editar"); 
		
		// Creamos las opciones del menú
		JMenuItem itemDeshacer = new JMenuItem("Deshacer");
		JMenuItem itemCopiar = new JMenuItem("Copiar");
		JMenuItem itemPegar = new JMenuItem("Pegar");
		JMenuItem itemCortar = new JMenuItem("Cortar");
		
		// Añadimos...
		menuEditar.add(itemDeshacer);
		menuEditar.addSeparator();
		menuEditar.add(itemCopiar);
		menuEditar.add(itemPegar);
		menuEditar.add(itemCortar);

		// Añadimos todos los JMenus a la barra de menús.
		JMenuBar barraMenu = new JMenuBar();
		
		barraMenu.add(menuArchivo);
		barraMenu.add(menuEditar);
		
		//Así se añade el menu a la pantalla.
		setJMenuBar(barraMenu);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new Plantilla();
	}
	
}
