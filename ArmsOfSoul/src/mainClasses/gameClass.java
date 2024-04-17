package mainClasses;

public class gameClass {
	
	private gamePanel GamePanel;
	private gameWindow GameWindow;
	
	public gameClass() {
		GamePanel = new gamePanel();
		GameWindow = new gameWindow(GamePanel);
		GamePanel.requestFocus();
	}
	
}
