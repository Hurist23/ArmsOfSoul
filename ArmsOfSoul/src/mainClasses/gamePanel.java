package mainClasses;

import java.awt.Graphics;

import javax.swing.JPanel;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import java.awt.event.*;

public class gamePanel extends JPanel {
	
	private MouseInputs mouseInputs;
	private int xDelta = 100, yDelta = 100;
	
	public gamePanel() {
		
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
		repaint();
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		g.fillRect(xDelta, yDelta, 150, 125);
	}
	
}
