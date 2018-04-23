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

	public static double net(double[] weights, int[] inputSignals, double b)
	{
		double net = 0;
		for (int i = 0; i < weights.length; i++)
		{
			net += inputSignals[i] * weights[i];
		}
		net += b;
		return net;
	}
	public static void weightUpdate(Neuron n,double learningRatio,int expectedOutput,int[] patterns)
	{
			double net = net(n.getWeights(),patterns,n.getB());
			int y = progowaUnipolarna(net);
			double [] weightsNew = new double[n.getWeights().length];
			double bNew=0;
			for (int j = 0; j < n.getWeights().length; j++)
			{
				weightsNew[j] = n.getWeights()[j]+(learningRatio*((expectedOutput-y)*patterns[j]));
				bNew = n.getB()+ learningRatio*(expectedOutput-y);
			}
			n.setWeights(weightsNew);
			n.setB(bNew);
			System.out.println(net);
	}
}
