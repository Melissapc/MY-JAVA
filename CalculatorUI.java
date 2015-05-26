import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorUI implements ActionListener {
	public static void main(String[] args) {

		CalculatorUI instace = new CalculatorUI();
		instace.easymath();
	}

	JTextField a = new JTextField(20);
	JTextField b = new JTextField(20);

	void easymath() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		JButton button1 = new JButton("Multiply");
		JButton button2 = new JButton("divide");
		JButton button3 = new JButton("add");
		JButton button4 = new JButton("subtract");
		JLabel answer = new JLabel("answer");
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.setVisible(true);
		panel.setVisible(true);

		panel.add(a);
		panel.add(b);
		panel.add(answer);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);

		panel.add(b);

		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Calculator okkk = new Calculator();
		int x = Integer.parseInt(a.getText());
		int y = Integer.parseInt(b.getText());

		// TODO Auto-generated method stub
		JButton source = (JButton) e.getSource();
		System.out.println(source.getText());
		if (source.getText().equals("Multiply")) {
			System.out.println(okkk.multiply(x, y));
			JOptionPane.showMessageDialog(null, okkk.multiply(x, y));

		} else if (source.getText().equals("add")) {
			System.out.println(okkk.add(x, y));
			JOptionPane.showMessageDialog(null, okkk.add(x, y));

		}
		if (source.getText().equals("subtract")) {
			System.out.println(okkk.subtract(x, y));
			JOptionPane.showMessageDialog(null, okkk.subtract(x, y));

		} else if (source.getText().equals("divide")) {
			System.out.println(okkk.divide(x, y));
			JOptionPane.showMessageDialog(null, okkk.divide(x, y));

		}
	}
}
