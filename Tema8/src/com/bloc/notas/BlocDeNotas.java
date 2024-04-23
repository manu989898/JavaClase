package com.bloc.notas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class BlocDeNotas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCompra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlocDeNotas frame = new BlocDeNotas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BlocDeNotas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 401);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmNuevaNota = new JMenuItem("Nueva nota");
		mnArchivo.add(mntmNuevaNota);
		
		JSeparator separator = new JSeparator();
		mnArchivo.add(separator);
		
		JMenuItem mntmBorrarNota = new JMenuItem("Borrar nota");
		mnArchivo.add(mntmBorrarNota);
		
		JSeparator separator_1 = new JSeparator();
		mnArchivo.add(separator_1);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, -13, 450, 356);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNotas = new JLabel("Notas");
		lblNotas.setBounds(92, 35, 42, 15);
		panel.add(lblNotas);
		
		JLabel lblTtulo = new JLabel("Título");
		lblTtulo.setBounds(308, 35, 70, 15);
		panel.add(lblTtulo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 57, 194, 275);
		panel.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		txtCompra = new JTextField();
		txtCompra.setText("Compra");
		txtCompra.setBounds(234, 57, 204, 19);
		panel.add(txtCompra);
		txtCompra.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(291, 88, 87, 15);
		panel.add(lblDescripcion);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(234, 114, 204, 218);
		panel.add(scrollPane_1);
		
		JTextArea txtDescripcion = new JTextArea();
		scrollPane_1.setViewportView(txtDescripcion);
	}
}
