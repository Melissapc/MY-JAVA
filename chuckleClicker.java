import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleClicker implements ActionListener {
	public static void main(String[] args) {
		chuckleClicker chuk = new chuckleClicker();
		chuk.makeButtons();

	}

	JButton button1 = new JButton();
	JButton button2 = new JButton();

	void makeButtons() {
		JOptionPane.showMessageDialog(null, "ChuckleClicker");
		JFrame frame = new JFrame("Button");
		frame.setSize(500, 500);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);

		panel.add(button1);
		panel.add(button2);

		button1.setText("Joke");
		button2.setText("Punchline");
		button1.addActionListener(this);
		button2.addActionListener(this);
		System.out.println("hello");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e);
		if (e.getSource() == button1) {

		}
		JOptionPane.showInputDialog(null, "what do you call a nosy pepper?");
		JOptionPane.showMessageDialog(null, "jala pen yo business!!!x3");

		if (e.getSource() == button2) {

			JOptionPane
					.showInputDialog(null,
							" Why do abcdefghijklmopqrstuvwxy & z hate hanging out with the letter n?");
			JOptionPane.showMessageDialog(null,
					" Because n always has to be the center of attention.x3");
		}

	}
}
