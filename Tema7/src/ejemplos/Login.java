package ejemplos;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.EventListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame implements ItemListener{
		
		private JCheckBox mostrarContrasenia = new JCheckBox("Mostrar contraseña");
		JLabel lblImg = new JLabel(new ImageIcon("iconos/tapados.jpeg"));
	public Login() {
		
		super("Plantilla");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new FlowLayout());
		
		JLabel lblUser = new JLabel("Ususario");
		JTextField txtUser = new JTextField(12);
		
		mostrarContrasenia.addItemListener(this);
		JLabel lblPass = new JLabel("Contraseña");
		JTextField txtPass = new JTextField(12);
		
		add(lblUser);
		add(txtUser);
		add(lblImg);
		add(mostrarContrasenia);
		add(lblPass);
		add(txtPass);
		ImageIcon img = new ImageIcon("iconos/abiertos.jpeg");
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new Login();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (mostrarContrasenia.isSelected() == true) {

			lblImg.setIcon(new ImageIcon("iconos/abiertos.jpeg"));
			
		}
		
	}
	
}
