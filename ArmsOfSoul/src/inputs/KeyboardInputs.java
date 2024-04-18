package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import mainClasses.gamePanel;
import static utils.Constants.Directions.*;

public class KeyboardInputs implements KeyListener{
	
	private gamePanel GamePanel;
	public KeyboardInputs(gamePanel GamePanel) {
		this.GamePanel = GamePanel;
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		switch (e.getKeyCode()) {
		
		case KeyEvent.VK_W:
			GamePanel.setDirection(UP);
			break;
		case KeyEvent.VK_A:
			GamePanel.setDirection(LEFT);
			break;
		case KeyEvent.VK_S:
			GamePanel.setDirection(DOWN);
			break;
		case KeyEvent.VK_D:
			GamePanel.setDirection(RIGHT);
			break;


		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		
		case KeyEvent.VK_W:
		case KeyEvent.VK_A:
		case KeyEvent.VK_S:
		case KeyEvent.VK_D:
			GamePanel.setMoving(false);
			break;
		}
	}

}
