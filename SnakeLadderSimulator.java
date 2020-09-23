/* Welcome to the Snake Ladder Simulator Problem */

public class SnakeLadderSimulator {
	public static final int safePosition = 0;
	public static final int snake = 1;
	public static final int ladder = 2;
	public static final int finalPosition = 100;
	public static final int initialPosition = 0 ;
	
	private static int getRandomInteger(int max, int min) {
		return (int)(Math.random()*(max - min))+ min ;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the Snake Ladder Simulator Problem");
		System.out.println("Player rolls the Die the outcome is "+getRandomInteger(6, 1));

	}

}
