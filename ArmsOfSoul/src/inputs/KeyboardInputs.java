package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import mainClasses.gamePanel;

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
			GamePanel.changeYDelta(-5);
			break;
		case KeyEvent.VK_A:
			GamePanel.changeXDelta(-5);
			break;
		case KeyEvent.VK_S:
			GamePanel.changeYDelta(5);
			break;
		case KeyEvent.VK_D:
			GamePanel.changeXDelta(5);
			break;

		
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

}
