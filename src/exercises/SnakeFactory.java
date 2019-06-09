package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SnakeFactory {

	/*
	 * I've found in some article about this movie that only one third of the snakes
	 * on set were real and no more than 60 real snakes were on set at any one time.
	 * The snakes were regularly swapped out during filming because they get tired
	 * after 15 or 20 minutes. So, I have counted that there have to be
	 * approximately 150 snakes on a plane :D
	 */

	public static List<Snake> createListOfSnakesWithThatAreRandomlyVenomous() {
		Random random = new Random();
		List<Snake> snakes = new ArrayList<Snake>();
		for (int i = 0; i < 150; i++) {
			snakes.add(new Snake(random.nextBoolean()));
		}
		return snakes;
	}

}
