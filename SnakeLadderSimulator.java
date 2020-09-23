/* Welcome to the Snake Ladder Simulator Problem */

public class SnakeLadderSimulator {
	public static void main(String[] args) {
		System.out.println("Welcome to the Snake Ladder Simulator Problem");
		int startPosition = (int)(Math.random() * 10) % 2;

		if(startPosition == 0) {
			System.out.println("The start position for player is "+startPosition);
		}	
	}
} 
