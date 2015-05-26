// Copyright Wintriss Technical Schools 2013 
import java.awt.Color;
import java.awt.Component;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.TurtlePanel;

public class FeedTheTortoise implements KeyEventDispatcher {

	// 1. Decide where to put the food by setting these variables
	int foodLocationX = 100;
	int foodLocationY = 120;

	// 2. Choose a character for your food or leave it as *
	Component food = new Label("*");

	private void goUp() {
		// 3. Make the Tortoise move up the screen
		Tortoise.move(30);

	}

	private void goDown() {
		// 4. Make the Tortoise move down the screen
		Tortoise.move(-30);
	}

	private void goLeft() {
		// 5. make the tortoise move left. Hint: Make sure to end with the
		// Tortoise facing UP.
		Tortoise.turn(-90);
		Tortoise.move(20);
		Tortoise.turn(90);

	}

	private void goRight() {
		// 6. make the tortoise move right
		Tortoise.turn(90);
		Tortoise.move(20);
		Tortoise.turn(-90);

	}

	private void checkIfFoodFound() throws Exception {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();
		System.out.println("x" + tortoiseLocationX);
		System.out.println("y" + tortoiseLocationY);

		// 7. if tortoise is near the food
		// say something. Hint: Runtime.getRuntime().exec("say chomp")
		if (tortoiseLocationX == foodLocationX
				&& tortoiseLocationY == foodLocationY) {
			Runtime.getRuntime().exec("say chomp");

		}

	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();
			if (e.getKeyCode() == KeyEvent.VK_W)
				moveFoodUp();
			if (e.getKeyCode() == KeyEvent.VK_Z)
				moveFoodDown();
			if (e.getKeyCode() == KeyEvent.VK_A)
				moveFoodLeft();
			if (e.getKeyCode() == KeyEvent.VK_D)
				moveFoodRight();

			// Hint: "e.getKeyCode() == KeyEvent.VK_T" is TRUE when T is pressed
			// 8. if the W key is pressed,
			// call the method moveFoodUp();

			// 11. Do the same for left, right, and down. You can choose your
			// own keys if you like. You will need to make new methods for
			// moving the food.

			// 12. If the secret key is pressed

		}
		Tortoise.getBackgroundWindow().setBackground(Color.yellow);
		return processEvent();
	}

	private void moveFoodUp() {
		System.out.println("Move food up!");
		// 9. decrement foodLocationY
		foodLocationY = foodLocationY - 20;
		// 10. call the moveFood() method
		moveFood();
	}

	private void moveFoodDown() {
		System.out.println("Move food down!");
		foodLocationY = foodLocationY + 20;
		moveFood();
	}

	private void moveFoodLeft() {
		System.out.println("Move food to the right!");
		foodLocationX = foodLocationX - 20;
		moveFood();
	}

	private void moveFoodRight() {
		System.out.println("move food to the left!");
		foodLocationX = foodLocationX + 20;
		moveFood();
	}

	private void moveFoodToARandomLocation() {
		foodLocationX = new Random().nextInt(window.getSize().width);
		foodLocationY = new Random().nextInt(window.getSize().height);
		moveFood();
	}

	private void moveFood() {
		food.setLocation(foodLocationX, foodLocationY);
		System.out.println("melissa");
		food.setBackground(Colors.getRandomColor());
		window.add(food);
	}

	TurtlePanel window = Tortoise.getBackgroundWindow();

	public static void main(String[] args) {
		FeedTheTortoise feeder = new FeedTheTortoise();
		feeder.controlTheTortoise();
		feeder.feedTheTortoise();
	}

	private void controlTheTortoise() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager()
				.addKeyEventDispatcher(this);
		Tortoise.show();
		Tortoise.setSpeed(10);
		Tortoise.getBackgroundWindow().setBackground(Colors.getRandomColor());

	}

	private void feedTheTortoise() {
		moveFood();
	}

	private boolean processEvent() {
		try {
			checkIfFoodFound();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
