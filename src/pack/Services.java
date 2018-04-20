package pack;

import java.util.Random;

public class Services
{
	public static double generateBetween(int min, int max)
	{
		return min + (max - (min)) * new Random().nextDouble();
	}
	
	public static int progowaUnipolarna(double net)
	{
		return net >= 0 ? 1 : 0;
	}	
	public static double net(double[] weights, double[] inputSignals,double b)
	{
		double net =0;
		for (int i = 0; i < weights.length; i++) 
		{
			net += inputSignals[i] * weights[i];
		}
		net += b;
		return net;
	}
}
