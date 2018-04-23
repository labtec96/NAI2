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

	public void startTeaching()
	{
		ReadPatterns n = new ReadPatterns();
		for (int j = 0; j < 50; j++) 
		{
			for (int i = 0; i < 6; i++)
			{
				Services.weightUpdate(neurons[0], learningRatio, 0, n.getPatternsListForZero().get(i));
				Services.weightUpdate(neurons[1], learningRatio, 0, n.getPatternsListForZero().get(i));
				Services.weightUpdate(neurons[0], learningRatio, 0, n.getPatternsListForOne().get(i));
				Services.weightUpdate(neurons[1], learningRatio, 1, n.getPatternsListForOne().get(i));
				Services.weightUpdate(neurons[0], learningRatio, 1, n.getPatternsListForTwo().get(i));
				Services.weightUpdate(neurons[1], learningRatio, 0, n.getPatternsListForTwo().get(i));
			}
		}
	}

	public int[] checkYourValue(int[] inputValues)
	{
		int[] answer = new int[neurons.length];
		for (int i = 0; i < neurons.length; i++)
		{
			double net = Services.net(neurons[i].getWeights(),inputValues,neurons[i].getB());
			int y = Services.progowaUnipolarna(net);
			answer[i] = y;
		}
		return answer;
	}
}
