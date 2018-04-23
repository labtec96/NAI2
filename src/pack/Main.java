package pack;

public class Main
{

	public static void main(String[] args)
	{
		Network network = new Network(0.3);
		network.startTeaching();
		GUI gui = new GUI(network);
		gui.setVisible(true);
	}

}
