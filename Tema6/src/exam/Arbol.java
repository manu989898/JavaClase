package exam;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Arbol extends JFrame {
	
	
	public Arbol() {
		
		super("Fotos aleatorias");
		setSize(500,400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			System.out.println("Error al aplicar el Look and Feel");
			
		}
		
		ImageIcon imgDefault = new ImageIcon("imgs/arbol01.png");
		JLabel lblImg = new JLabel(imgDefault);
		lblImg.setPreferredSize(new Dimension(500,300));
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setPreferredSize( new Dimension(160,40));
		btnSiguiente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double num = Math.random()*7.0/1.0;
			
				if (num<=1) {
					lblImg.setIcon(new ImageIcon("imgs/arbol01.png"));
				} else if(num>1 && num<=2) {
					lblImg.setIcon(new ImageIcon("imgs/arbol02.png"));
				}else if(num>2 && num<=3) {
					lblImg.setIcon(new ImageIcon("imgs/arbol03.png"));
				}else if(num>3 && num<=4) {
					lblImg.setIcon(new ImageIcon("imgs/arbol04.png"));
				}else if(num>4 && num<=5) {
					lblImg.setIcon(new ImageIcon("imgs/arbol05.png"));
				}else if(num>5 ) {
					lblImg.setIcon(new ImageIcon("imgs/arbol06.png"));
				}
			}
		});
		JButton btnReset = new JButton("Reset");
		btnReset.setPreferredSize( new Dimension(160,40));
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblImg.setIcon(imgDefault);
			}
		});
		
	
		
		double num = 0;
		add(lblImg);
		add(btnSiguiente);
		add(btnReset);
				
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Arbol();
	}
}
