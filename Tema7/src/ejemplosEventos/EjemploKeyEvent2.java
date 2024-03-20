package ejemplosEventos;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EjemploKeyEvent2 extends JFrame {

	private int x = 30;
	private int y = 30;

	public EjemploKeyEvent2() {

		super("Key Event");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(null);

		JLabel lblCorazon = new JLabel(new ImageIcon("iconos/15.png"));
		lblCorazon.setBounds(x, y, 24, 24);

		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// No lo usamos

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// No lo usamos

			}

			@Override
			public void keyPressed(KeyEvent e) {
				int codigo = e.getKeyCode();
				int velocidad = 3;
				if (codigo == KeyEvent.VK_UP) {
					y = y -velocidad;
				} else if (codigo == KeyEvent.VK_DOWN) {
					y = y +velocidad;
				} else if (codigo == KeyEvent.VK_RIGHT) {
					x = x + velocidad;
				} else if (codigo == KeyEvent.VK_LEFT) {
					x = x - velocidad;
				}
				lblCorazon.setBounds(x, y, 24, 24);
			}
		});

		add(lblCorazon);

		setVisible(true);

	}

	public static void main(String[] args) {

		new EjemploKeyEvent2();
	}

}
