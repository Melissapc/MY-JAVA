import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Candyman implements ActionListener {
	public static void main(String[] args) {

		Candyman candy = new Candyman();
		candy.candydude();

	}

	public void candydude() {
		JFrame frame = new JFrame();
		JButton button = new JButton("Candyman");
		JPanel panel = new JPanel();

		frame.add(button);
		button.addActionListener(this);
		button.setText("CandyMan");
		frame.setVisible(true);

	}

	int buttonPressed = 0;

	private void pack() {
		// TODO Auto-generated method stub
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		buttonPressed++;
		if (buttonPressed == 5) {
			showPictureFromTheInternet("http://www.horror-movies.ca/wp-content/uploads/2012/10/pinhead-chains-610x406.jpg");
			playSound(1);
		}

	}

	// TODO Auto-generated method stub
	private static void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(
					"http://www.horror-movies.ca/wp-content/uploads/2012/10/pinhead-chains-610x406.jpg");
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	static final int CREEPY = 0;
	static final int SCREAM = 1;

	public static void playSound(int whichSound) {

		String soundURL = "";
		if (whichSound == CREEPY)
			soundURL = "http://school.wintrisstech.org/sounds/creepynoise.wav";
		else if (whichSound == SCREAM)
			soundURL = "http://school.wintrisstech.org/sounds/scream.wav";

		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new URL(soundURL));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}