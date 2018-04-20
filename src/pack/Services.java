package pack;

import java.util.Random;

public class Services
{
	public static double generateBetween(int min, int max)
	{
		return min + (max - (min)) * new Random().nextDouble();
	}
}
