package pack;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReadPatterns
{
	private String fileString;
	public ArrayList<int[]> patternsListForZero;
	public ArrayList<int[]> patternsListForOne;
	public ArrayList<int[]> patternsListForTwo;

	public ReadPatterns()
	{
		fileString = readFile();
		patternsListForZero = patternsForNumber(0, fileString);
		patternsListForOne = patternsForNumber(1, fileString);
		patternsListForTwo = patternsForNumber(2, fileString);
	}

	private String readFile()
	{
		String tmp = "";
		try
		{
			tmp = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir") + "/Pattern/patterns.txt")));
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		return tmp;
	}

	private ArrayList<int[]> patternsForNumber(int number, String fileString)
	{
		ArrayList<int[]> patternsList = new ArrayList<int[]>();
		String[] lines = fileString.split(System.getProperty("line.separator"));
		int tmp = serachForChar(lines, number);
		while (tmp < lines.length && lines[tmp].charAt(0) != '"')
		{
			int[] ints = fromStringArrayToInt(lines[tmp]);
			patternsList.add(ints);
			tmp++;
		}
		return patternsList;
	}

	private int serachForChar(String[] lines, int number)
	{
		int tmp = 0;
		for (String string : lines)
		{
			if (string.equals("\"" + number + "\""))
				break;
			tmp++;
		}
		tmp++;
		return tmp;
	}

	private int[] fromStringArrayToInt(String line)
	{
		String[] tmpArray = line.split(" ");
		int[] ints = new int[tmpArray.length];
		for (int i = 0; i < tmpArray.length; i++)
		{
			try
			{
				ints[i] = Integer.parseInt(tmpArray[i]);
			} catch (NumberFormatException nfe)
			{
				// Not an integer
			}
		}
		return ints;
	}

	public synchronized ArrayList<int[]> getPatternsListForZero()
	{
		return patternsListForZero;
	}

	public synchronized ArrayList<int[]> getPatternsListForOne()
	{
		return patternsListForOne;
	}
	
	public synchronized ArrayList<int[]> getPatternsListForTwo()
	{
		return patternsListForTwo;
	}


}
