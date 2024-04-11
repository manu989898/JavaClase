package exam;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ejer2 extends JFrame{
 
	public Ejer2() {
		
		super("Potencia");
		setSize(500,300);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JProgressBar prgBar = new JProgressBar( 0, 100);
		prgBar.setOrientation(JProgressBar.VERTICAL);
		prgBar.setPreferredSize(new Dimension(40,200));
		prgBar.setMaximum(2000);
		prgBar.setStringPainted(true);
		
		JSlider sld = new JSlider(0, 2000);
		sld.setOrientation(JSlider.HORIZONTAL);
		sld.setPreferredSize(new Dimension(300,50));
		sld.setMinorTickSpacing(100);
		sld.setMajorTickSpacing(500);
		sld.setPaintLabels(true);
		sld.setPaintTicks(true);
		sld.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				int value = sld.getValue(); 
				prgBar.setValue(value);
				if(value <= 1400) {
					prgBar.setForeground(Color.green);
				}else if (value>1400 && value <= 1800 ) {
					prgBar.setForeground(Color.orange);
				}else {
					prgBar.setForeground(Color.red);
				}
			}
		});;
		
		sld.setValue(300);
		add(sld);
		add(prgBar);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ejer2();
	}
	
	}

