package utils;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import mainClasses.gameClass;

public class LoadSave {
	
	public static final String PLAYER_ATLAS = "Main_Char_Sprite.png";
	public static final String LEVEL_ATLAS = "Forest_TileSet.png";
	public static final String AREA_ONE_DATA = "Area_1.png";

	
	public static BufferedImage GetSpriteAtlas(String fileName) {
		BufferedImage img = null;
		InputStream is = LoadSave.class.getResourceAsStream("/" + fileName);
		
		try {
			img = ImageIO.read(is);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return img;
	}
	
	public static int[][] GetChapterData() {
		int [][] chapData = new int[gameClass.TILES_IN_HEIGHT][gameClass.TILES_IN_WIDTH];
		BufferedImage img = GetSpriteAtlas(AREA_ONE_DATA);
		
		for (int j  = 0; j < img.getHeight(); j++) {
			for (int i = 0; i < img.getWidth(); i++) {
				Color color = new Color(img.getRGB(i, j));
				int value = color.getRed();
				if (value >= 90) {
					value = 0;
				}
				chapData[j][i] = value;
			}
		}
		return chapData;
		
	}
}
