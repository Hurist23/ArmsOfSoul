package mainClasses;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import java.awt.event.*;
import java.util.Random;

public class gamePanel extends JPanel {
	
	private MouseInputs mouseInputs;
	private float xDelta = 100, yDelta = 100;
	private float xDir = 0.3f, yDir = 0.3f;
	private int frames = 0;
	private long lastCheck = 0;
	private Color color = new Color(150, 20, 90);
	private Random random;
	
	public gamePanel() {
		random = new Random();
		mouseInputs = new MouseInputs(this);
		addKeyListener(new KeyboardInputs(this));
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
		
	}
	
	public void changeXDelta(int value) {
		this.xDelta += value;
		repaint();
	}
	
	public void changeYDelta(int value) {
		this.yDelta += value;
		repaint();
	}
	
	public void setRectPos(int x, int y) {
		this.xDelta = x;
		this.yDelta = y;
		
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		updateRectangle();
		g.setColor(color);
		g.fillRect((int) xDelta, (int) yDelta, 150, 125);
		
		
	}

	private void updateRectangle() {
		xDelta += xDir;
		if (xDelta > 300 || xDelta < 0) {
			xDir *= -1;
			color = getRndColor();
		}
		yDelta += yDir;
		if (yDelta > 300 || yDelta < 0) {
			yDir *= -1;
			color = getRndColor();
		}
	}

	private Color getRndColor() {
		int r = random.nextInt(255);
		int g = random.nextInt(255);
		int b = random.nextInt(255);
		
		return new Color(r, g, b);
	}
	
}
