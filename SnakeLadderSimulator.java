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
		System.out.println(option);
		int dieOutcome = (int)(Math.random()*(6 - 1))+ 1 ;
		System.out.println(dieOutcome);
		if(option == snake) {
			position -= dieOutcome ; 
			if(position < 0) {
				position = 0;
			}
		}else if(option == ladder) {
			position += dieOutcome ;
		}else {
			position += 0;
		}
		 System.out.println(position);
	}
	

}


}
