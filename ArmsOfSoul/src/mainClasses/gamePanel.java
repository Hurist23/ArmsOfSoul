package mainClasses;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import inputs.KeyboardInputs;
import inputs.MouseInputs;

import static utils.Constants.PlayerConstants.*;
import static utils.Constants.Directions.*;

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
		Dimension size = new Dimension(1200, 750);
		setPreferredSize(size);
		
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
