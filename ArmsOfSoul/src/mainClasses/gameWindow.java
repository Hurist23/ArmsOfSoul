package mainClasses;

import javax.swing.JFrame;

public class gameWindow {
	private JFrame jframe;
	
	public gameWindow(gamePanel GamePanel) {
		
		jframe = new JFrame();
		
		jframe.setSize(300, 300);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.add(GamePanel);
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
		
	}
}
