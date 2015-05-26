import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator {

	public static void main(String[] args) {
		Calculator smart = new Calculator();

		int answer = smart.add(8, 5);
		System.out.println(answer);

		int answer1 = smart.multiply(6, 2);
		System.out.println(answer1);

		int answer2 = smart.divide(60, 6);
		System.out.println(answer2);

		int answer3 = smart.subtract(79, 10);
		System.out.println(answer3);
	}

	Calculator() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton multiply = new JButton();
		JButton divide = new JButton();
		JButton add = new JButton();
		JButton subtract = new JButton();
		frame.add(panel);
		frame.setVisible(true);
		frame.add(multiply);
		frame.add(divide);
		frame.add(add);
		frame.add(subtract);
	}

	int multiply(int number1, int number2) {
		return number1 * number2;
	}

	int divide(int number3, int number4) {
		return number3 / number4;

	}

	int add(int number5, int number6) {
		return number5 + number6;

	}

	int subtract(int number7, int number8) {
		return number7 - number8;

	}
}
