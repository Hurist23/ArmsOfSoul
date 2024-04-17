package utils;

public class Constants {
	public static class Directions {
		public static final int LEFT = 0;
		public static final int UP = 1;
		public static final int RIGHT = 2;
		public static final int DOWN = 3;
	}

	public static class PlayerConstants {
		public static final int IDLE = 0;
		public static final int RUNNING = 1;
		public static final int JUMP = 2;
		public static final int DAMAGE = 3;
		public static final int ATTACK = 4;

		public static int GetSpriteAmount(int player_action) {
			switch (player_action) {
			case IDLE, RUNNING:
				return 6;
			case DAMAGE, ATTACK:
				return 3;
			case JUMP:
			default:
				return 1;
			}
		}
	}

}