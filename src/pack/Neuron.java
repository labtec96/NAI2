package pack;

import java.util.HashMap;

public class Neuron
{
	final private double b =Services.generateBetween(-1, 1);
	private double[] weights;
	public Neuron(int amountOfWeights)
	{
		initializationWeights(amountOfWeights);
	}
	private void initializationWeights(int amount)
	{
		weights = new double[amount];
		for (int i = 0; i < weights.length; i++)
		{
			weights[i] = Services.generateBetween(-1, 1);
		}
	}
	
	@Override
	public String toString()
	{
		String toString="";
		for (int i = 0; i < weights.length; i++)
		{
			toString +="w" +(i+1) +" "+ weights[i] + "\n";
		}
		toString +="b "+ b;
		return toString; 
	}
}
