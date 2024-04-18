package mainClasses;

import javax.swing.JFrame;

public class gameWindow {
	private JFrame jframe;
	
	public gameWindow(gamePanel GamePanel) {
		
		jframe = new JFrame();
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.add(GamePanel);
		jframe.setLocationRelativeTo(null);
		jframe.setResizable(false);
		jframe.pack();
		jframe.setVisible(true);
		
	}
}
