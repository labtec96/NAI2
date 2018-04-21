package pack;

public class Main
{

	public static void main(String[] args)
	{
		Network network = new Network(0.2);
		network.startTeaching();
		int [] answer = network.checkYourValue(new int[]
		{ 1,1,1,1,1,0,1,1,1,0,1,1,1,0,1,1,1,0,1,1,1,1,1,1});
		for (int i : answer)
		{
			System.out.println(i);
		}
	}

}
