package interfacciaGrafica;

import javax.swing.JFrame;

import pattern.*;

public class Output {
	
JFrame frame;
	
	Pannello pannello;
	
	public Output() {
		
		frame = new JFrame("Output");
		
		pannello = new Pannello();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(pannello);
		frame.setSize(860, 480);
		
		frame.setLocation(0, 0);
		
		frame.setResizable(false);
		
		frame.setVisible(true);
		
	}


}
