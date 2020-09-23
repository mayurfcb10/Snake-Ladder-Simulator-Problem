/* Welcome to the Snake Ladder Simulator Problem */

public class SnakeLadderSimulator {
	public static final int noPlay = 0;
	public static final int snake = 1;
	public static final int ladder = 2;
	public static final int finalPosition = 100;
	public static int initialPosition = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to the Snake Ladder Simulator Problem");
		int position = 0;
		while(position >= 0 && position != finalPosition) {
			int option = (int) (Math.random()* 10) % 3;
			System.out.println("Selected Option is "+option);
			int dieOutcome = (int)(Math.random()*(6 - 1))+ 1 ;
			System.out.println("Outcome of Die Roll "+dieOutcome);
			if(option == snake) {
				position -= dieOutcome ; 
				if(position < 0) {
					position = 0;
				}
			}else if(option == ladder) {
				position += dieOutcome ;
				if(position > 100) {
					position -= dieOutcome;
				}
			}else {
				position += 0;
			}
			System.out.println("Position of the Player1 "+position);
		}
		
		System.out.println("Exact final Position of Player1 "+ position);

	}


}

