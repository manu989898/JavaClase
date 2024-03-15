package ejercicios;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PeliImg extends JFrame implements ActionListener{
	
	JButton btnBR; 
	JButton btnCW; 
	JButton btnAD; 
	JButton btnBRn; 
	JLabel lblImg;
	
	public PeliImg() {
		
		super("Plantilla");
		setSize(700, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		setLayout(new BorderLayout());
		
		
		btnBR = new JButton("Black Rain");
		btnBR.addActionListener(this);
		btnCW = new JButton("El Caso Winslow");
		btnCW.addActionListener(this);
		btnAD = new JButton("Asalto al Distrito 13");
		btnAD.addActionListener(this);
		btnBRn = new JButton("Blade Runner");
		btnBRn.addActionListener(this);
		lblImg = new JLabel();
		
		JPanel panSup = new JPanel();
		panSup.setLayout(new FlowLayout());
		
		panSup.add(btnBR);
		panSup.add(btnCW);
		panSup.add(btnAD);
		panSup.add(btnBRn);
		
		lblImg.setIcon(new ImageIcon("imgsPElis/blackrain.png"));
		
		JPanel pnImg = new JPanel();
		pnImg.add(lblImg);
		
		add(panSup, BorderLayout.NORTH);
		add(pnImg);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new PeliImg();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btnPulsado = (JButton) e.getSource();
		
		if (btnPulsado == btnBR) {
			
			lblImg.setIcon(new ImageIcon("imgsPElis/blackrain.png"));
			
		} else if (btnPulsado == btnCW) {
			
			lblImg.setIcon(new ImageIcon("imgsPElis/winslow.png"));
		
		}else if (btnPulsado == btnAD) {
		
			lblImg.setIcon(new ImageIcon("imgsPElis/asalto.png"));
		}else if (btnPulsado == btnBRn) {
		
			lblImg.setIcon(new ImageIcon("imgsPElis/bladerunner.png"));
		}
		
	}
	
}
