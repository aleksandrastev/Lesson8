package exercises;

import java.util.ArrayList;
import java.util.List;

public class Plane {

	List<Snake> snakesOnAPlane = new ArrayList<Snake>();
	Snake snake = new Snake(snakesOnAPlane);

	public void addSnakes(List<Snake> snakes) {
		snake.addSnakes(snakes);
	}

	public int getNumberOfVenomousSnakes() {

		return snake.getNumberOfVenomousSnakes();
	}

}
