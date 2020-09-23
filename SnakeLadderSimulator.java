/* Welcome to the Snake Ladder Simulator Problem */

public class SnakeLadderSimulator {

	public static final int noPlay = 0;
	public static final int snake = 1;
	public static final int ladder = 2;
	public static final int finalPosition = 100;
	public static final int initialPosition = 0;
	public static final int Player1 = 1;
	public static final int Player2 = 2;

	public static void main(String[] args) {
		System.out.println("Welcome to the Snake Ladder Simulator Problem");
		int position1 = initialPosition, position2 = 0;
		int selectPlayer = (int)(Math.random() * 10 ) % 2 + 1;

		while(position1 >= 0 && position1 != finalPosition && position2 >= 0 && position2 != finalPosition ) {
			int option = (int) (Math.random()* 10) % 3;
			int dieOutcome = (int)(Math.random()*(6 - 1))+ 1 ;
			switch (selectPlayer) {
			case Player1:
				if(option == snake) {
					position1 -= dieOutcome ; 
					if(position1 < 0) {
						position1 = 0;
					}
				}else if(option == ladder) {
					position1 += dieOutcome ;
					if(position1 > 100) {
						position1 -= dieOutcome;
					}
				}else {
					position1 += 0;
				}
			case Player2:
				if(option == snake) {
					position2 -= dieOutcome ; 
					if(position2 < 0) {
						position2 = 0;
					}
				}else if(option == ladder) {
					position2 += dieOutcome ;
					if(position2 > 100) {
						position2 -= dieOutcome;
					}
				}else {
					position2 += 0;
				}


			}
		}

		if(position1 == finalPosition) {
			System.out.println("Winner is Player1 at destination "+position1);
		}else if(position2 == finalPosition){
			System.out.println("Winner is Player2 at destination "+position2);
		}

	}

}




