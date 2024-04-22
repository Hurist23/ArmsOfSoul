package Chapters;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import mainClasses.gameClass;
import utils.LoadSave;

public class Handler {
	
	private gameClass game;
	private BufferedImage[] chapSprite;
	private Chapter prologue;
	
	public Handler (gameClass game) {
		this.game = game;
//		chapSprite = LoadSave.GetSpriteAtlas(LoadSave.LEVEL_ATLAS);
		importOutsideSprites();
		prologue = new Chapter(LoadSave.GetChapterData());
	}
	
	private void importOutsideSprites() {
		BufferedImage img = LoadSave.GetSpriteAtlas(LoadSave.LEVEL_ATLAS);
		chapSprite = new BufferedImage[48];
		for (int j = 0; j < 9; j++) {
			for (int i = 0; i < 10; i++) {
				int index = j * 10 + i;
				chapSprite[index] = img.getSubimage(i * 32, j * 32, 32, 32);
			}
		}
		
	}

	public void draw(Graphics g) {
		
		for (int j = 0; j < gameClass.TILES_IN_HEIGHT; j++) {
			for (int i = 0; i < gameClass.TILES_IN_WIDTH; i++) {
				int index = prologue.getSpriteIndex(i, j);
				g.drawImage(chapSprite[index], gameClass.TILES_SIZE * i, gameClass.TILES_SIZE * j, gameClass.TILES_SIZE, gameClass.TILES_SIZE, null);
			}
		};
	}
	
	public void update() {
		
	}

}
