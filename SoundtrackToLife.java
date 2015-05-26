import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {
		// 1. Find out what mood the user is in. Store their answer in a
		// variable.
		String mood = JOptionPane.showInputDialog(null,"what type of mood are you on:happy , rad,chill");
		// 2. If they are in a happy mood, use the playVideo method to play a
		// happy song from YouTube
		if (mood.equals("happy")) {
			playVideo("https://www.youtube.com/watch?v=y6Sxv-sUYtM");
		}
		// 3. Play different songs for other moods
		else if (mood.equals("rad")) {
			playVideo("https://www.youtube.com/watch?v=fe4EK4HSPkI&");
		} else if (mood.equals("chill")) {
			playVideo("https://www.youtube.com/watch?v=EPUvpRLakzc");
		}

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
 