package ejemplosEventos;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EjemploMouseEvent extends JFrame{
	
	public EjemploMouseEvent() {
		
		super("Mouse Listener");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel lblCoordenada = new JLabel("Haz clic en esta ventana!");
		JLabel lblBoton = new JLabel("");
		
		add(lblCoordenada);
		add(lblBoton);

		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				getContentPane().setBackground(Color.BLACK);
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				getContentPane().setBackground(Color.BLUE);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				getContentPane().setBackground(Color.GREEN);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				getContentPane().setBackground(Color.YELLOW);				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				lblCoordenada.setText("Coordenadas: X: " + x + " Y: " + y);
				int boton = e.getButton();
				if(boton == MouseEvent.BUTTON1) {
					lblBoton.setText("BTN IZQUIERDO");
				} else if(boton == MouseEvent.BUTTON2) {
					lblBoton.setText("BTN CENTRAL");
				}else if(boton == MouseEvent.BUTTON3) {
					lblBoton.setText("BTN DERECHO");
				}
				
			}
		});
		
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new EjemploMouseEvent();
	}
	
}
