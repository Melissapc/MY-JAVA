import javax.swing.JOptionPane;


public class echo {
	public static void main(String[] args) {
		echo("repeat ");
		echo echos = new echo();
	}

	static String echo(String echos) {
		String person =JOptionPane.showInputDialog(null, echos);

		return "person";
	}
}