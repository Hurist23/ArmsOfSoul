package mainClasses;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import inputs.KeyboardInputs;
import inputs.MouseInputs;
import static mainClasses.gameClass.GAME_HEIGHT;
import static mainClasses.gameClass.GAME_WIDTH;

public class gamePanel extends JPanel {
	
	private MouseInputs mouseInputs;
	private gameClass game;

	public gamePanel(gameClass game) {
		mouseInputs = new MouseInputs(this);
		this.game = game;
		
		setPanelSize();
		addKeyListener(new KeyboardInputs(this));
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
		
	}
	
	private void setPanelSize() {
		Dimension size = new Dimension(GAME_WIDTH, GAME_HEIGHT);
		setPreferredSize(size);
		System.out.println("size: " + GAME_WIDTH + " : " + GAME_HEIGHT);
		
	}

	public void updateGame() {
		
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		game.render(g);
	}
	
	public gameClass getGame() {
		return game;
	}
	
}
