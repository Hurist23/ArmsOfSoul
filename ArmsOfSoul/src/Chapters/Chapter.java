package Chapters;

public class Chapter {
	
	private int[][] chapData;
	
	public Chapter(int[][] chapData) {
		this.chapData = chapData;
	}
	
	public int getSpriteIndex(int x, int y) {
		return chapData[y][x];
	}

}
