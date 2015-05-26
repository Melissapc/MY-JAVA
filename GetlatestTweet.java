import javax.management.Query;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.GeoQuery;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.api.SearchResource;
import twitter4j.auth.AccessToken;

public class GetlatestTweet {
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setSize(100, 30);
		JTextField text = new JTextField(30);
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		

		JButton button = new JButton();

		frame.add(panel);
		panel.add(button);
		panel.add(text);
		text.setVisible(true);
		button.setText("Search The twitterverse ");
		button.setSize(20, 40);
		panel.setVisible(true);
		frame.setVisible(true);
		button.setVisible(true);
		
	}

	private String getLatestTweet(String searchingFor) {

		Twitter twitter = new TwitterFactory().getInstance();
		AccessToken accessToken = new AccessToken(
				"2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
				"6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query();
		try {
			SearchResource result = twitter.search();
			return ((QueryResult) result).getTweets().get(0).getText();
		} catch (Exception e) {
			System.err.print(e.getMessage());
			return "What the heck is that?";

		}
	}

}