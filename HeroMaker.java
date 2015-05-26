import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HeroMaker extends JPanel {

	private static final Image BufferedImage = null;
	private final int WIDTH = 200;
	private final int HEIGHT = 500;

	private JFrame window;

	private Font font;

	// 1. create a Hero object and initialize it using the constructor in the
	// Hero class

	Hero heroo = new Hero("Hero");

	// 16. Let's add an image of your hero. Find a picture of your hero on the
	// Internet
	// and save it to the computer. Then drag the image into the same package as
	// your main class

	// 17. create a BufferedImage object
	BufferedImage bf;

	public static void main(String[] arg) {
		new HeroMaker();
	}

	public HeroMaker() {
		window = new JFrame("RPG");
		window.add(this);
		window.setSize(WIDTH, HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

		font = new Font("Arial", Font.PLAIN, 14);

		// 4. call the correct method in the Hero class to change the
		// hero's type to whatever you choose (warrior, mage, hunter, etc...)
		heroo.setHeroType("Warrior");
		// 7. call the correct method in the Hero class to change the hero's
		// strength to any value you choose
		heroo.setStrength(10000);
		// 10. call the correct method in the Hero class to change
		// his or her wisdom to any value you choose
		heroo.setWisdom(100);
		// 13. call the correct method in the Hero classto change
		// the hero's magic level to any value you choose
		heroo.setMagic(100);
		// 18. add the following code. Make sure the *** is the
		// same name as the BufferedImage object you created in step 17

		try {

			bf = ImageIO.read(getClass().getResourceAsStream("heroo.jpg"));
		} catch (IOException e) {
			System.out.println("Cannot Load Image!");
		}

	}

	public void paint(Graphics g) {
		super.paint(g);

		g.setFont(font);

		g.drawString("HERO MAKER", 35, 20);

		// 2. Uncomment the following line and add the method to get the Hero's
		// name where you see ***
		g.drawString("NAME: " + heroo.getName(), 20, 50);

		// 3. run the program. Do you see the Hero's name?

		// 5. Uncomment the following line and add the method to get the Hero
		// type where you see ***
		g.drawString("Type: " + heroo.getHeroType(), 20, 66);

		// 6. run the program. Do you see the Hero type?

		// 8. Uncomment the following line and add the method to get the hero's
		// strength where you see ***
		g.drawString("Strength: " + heroo.getStrength(), 20, 82);

		// 9. run the program. Do you see the strength?

		// 11. Uncomment the following line and add the method to get the hero's
		// wisdom where you see ***
		g.drawString("Wisdom: " + heroo.getWisdom(), 20, 98);

		// 12. run the program. Do you see the wisdom?

		// 14. Uncomment the following line and add the method to get the hero's
		// magic where you see ***
		g.drawString("Magic: " + heroo.getMagic(), 20, 114);

		// 15. run the program. Do you see the hero's magic?

		// 19. use g.drawImage() to display your image. The parameters are:
		g.drawImage(bf, 100, 150, 400, 600 ,null);

		// 20. call the repaint method
		repaint();
	}

}
