package pack;

public class Network
{
	private Neuron[] neurons;
	double learningRatio;
	public Network(double learningRatio)
	{
		for (Neuron neuron : neurons)
		{
			neuron = new Neuron(24);
		}
		this.learningRatio = learningRatio;
	}
}
