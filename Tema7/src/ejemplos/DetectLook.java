package ejemplos;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class DetectLook extends JFrame {
	
	public DetectLook() {
		UIManager.LookAndFeelInfo[] laf = UIManager.getInstalledLookAndFeels();
		for (int i = 0; i < laf.length; i++) {
			System.out.println("Class name: " + laf[i].getClassName());
			System.out.println("Name: " + laf[i].getName() + "\n");
		}
	}

	public static void main(String[] arguments) {
		DetectLook dialog = new DetectLook();
	}
}
