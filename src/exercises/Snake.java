package exercises;

import java.util.List;

public class Snake {

	List<Snake> sssnakes;
	boolean isVenomous;

	public Snake(boolean isVenomous) {
		super();
		this.isVenomous = isVenomous;
	}

	public Snake(List<Snake> sssnakes) {
		super();
		this.sssnakes = sssnakes;
	}

	public void addSnakes(List<Snake> snakes) {
		for (Snake snake : snakes) {
			sssnakes.add(snake);
		}
	}

	public int getNumberOfVenomousSnakes() {
		int counter = 0;
		for (Snake snake : sssnakes) {
			if (snake.isVenomous)
				counter++;
		}
		return counter;
	}

}