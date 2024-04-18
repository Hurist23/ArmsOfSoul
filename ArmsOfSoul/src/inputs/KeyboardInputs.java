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
			GamePanel.getGame().getPlayer().setUp(true);
			break;
		case KeyEvent.VK_A:
			GamePanel.getGame().getPlayer().setLeft(true);
			break;
		case KeyEvent.VK_S:
			GamePanel.getGame().getPlayer().setDown(true);
			break;
		case KeyEvent.VK_D:
			GamePanel.getGame().getPlayer().setRight(true);
			break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		
		case KeyEvent.VK_W:
			GamePanel.getGame().getPlayer().setUp(false);
			break;
		case KeyEvent.VK_A:
			GamePanel.getGame().getPlayer().setLeft(false);
			break;
		case KeyEvent.VK_S:
			GamePanel.getGame().getPlayer().setDown(false);
			break;
		case KeyEvent.VK_D:
			GamePanel.getGame().getPlayer().setRight(false);
			break;
		}
	}

}
