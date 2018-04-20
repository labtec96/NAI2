package pack;

import java.util.HashMap;

public class Neuron
{
	private Neuron(int amountOfWeights, double learningRatio)
	{
		bias = Utils.generateBetween(-1, 1);
		setWeights(amountOfWeights);

	}
}
