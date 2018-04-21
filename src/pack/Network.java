package pack;

public class Network
{
	private Neuron[] neurons = new Neuron[2];
	double learningRatio;
	public Network(double learningRatio)
	{
		for (int i = 0; i < neurons.length; i++)
			neurons[i] = new Neuron(24);
		this.learningRatio = learningRatio;
	}
	
	public void teachNetwork()
	{
		
	}
}
