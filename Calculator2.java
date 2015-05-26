import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setTitle("Melissa's Calc");
		JButton multiply = new JButton("*");
		JButton divide = new JButton("/");
		JButton add = new JButton("+");
		JButton subtract = new JButton("-");
		panel.add(multiply);
		panel.add(divide);
		panel.add(add);
		panel.add(subtract);
		JTextField texter = new JTextField();
		panel.add(texter);
		frame.setVisible(true);
		frame.pack();
	}
}
