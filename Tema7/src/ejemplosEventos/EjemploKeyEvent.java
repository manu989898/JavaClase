package ejemplosEventos;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EjemploKeyEvent extends JFrame{
	
	public EjemploKeyEvent() {
		
		super("Key Event");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new FlowLayout());
		
		
		JLabel lblTeclaPulsada = new JLabel("Pulsa una tecla!");
		
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				lblTeclaPulsada.setText("Has pulsaod la tecla : " + e.getKeyChar());
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				int codigo = e.getKeyCode();
				
				if(codigo == KeyEvent.VK_UP) {
					lblTeclaPulsada.setText("Has pulsaod la tecla : Flecha arriba");
				} else if (codigo == KeyEvent.VK_DOWN) {
					lblTeclaPulsada.setText("Has pulsaod la tecla : Flecha abajo");
				} else if (codigo == KeyEvent.VK_RIGHT) {
					lblTeclaPulsada.setText("Has pulsaod la tecla : Flecha derecha");
				}else if (codigo == KeyEvent.VK_LEFT) {
					lblTeclaPulsada.setText("Has pulsaod la tecla : Flecha izquierda");
				}
			
			}
		});
		
		add(lblTeclaPulsada);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new EjemploKeyEvent();
	}


	
}
