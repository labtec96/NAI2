package pack;

public class Neuron
{
	public double b = Services.generateBetween(-1, 1);
	public double[] weights;

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
		String toString = "";
		for (int i = 0; i < weights.length; i++)
		{
			toString += "w" + (i + 1) + " " + weights[i] + "\n";
		}
		toString += "b " + b;
		return toString;
	}

	public synchronized void setB(double b)
	{
		this.b = b;
	}

	public synchronized double getB()
	{
		return b;
	}

	public synchronized double[] getWeights()
	{
		return weights;
	}

	public synchronized void setWeights(double[] weights)
	{
		this.weights = weights;
	}
}
