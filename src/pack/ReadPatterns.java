package pack;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadPatterns
{
	String fileString;
	public ReadPatterns()
	{	
		fileString = readFile();
		ArrayList<int[]> patternsList = patternsForNumber(2, fileString);
		System.out.println(patternsList.size());
	}
	private String readFile()
	{
		String tmp="";
		try
		{
			tmp = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir") + "/Pattern/patterns.txt")));
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		return tmp;
	}
	private int serachForChar(String[] lines,int number)
	{
		int tmp=0;
		for (String string : lines)
		{
			if (string.equals("\""+number+"\""))
				break;
			tmp++;
		}
		tmp++;
		return tmp;
	}
	private int[] fromStringArrayToInt(String line)
	{
		String[] tmpArray = line.split(",");
		int[] ints = new int[tmpArray.length];
		for(int i=0; i<tmpArray.length; i++)
		{
		    try {
		        ints[i] = Integer.parseInt(tmpArray[i]);           
		    } catch (NumberFormatException nfe) {
		        //Not an integer 
		    }
		}
		return ints;
	}
	private ArrayList<int[]> patternsForNumber(int number,String fileString)
	{
		ArrayList<int[]> patternsList = new ArrayList<int[]>();
		String[] lines = fileString.split(System.getProperty("line.separator"));
		int tmp=serachForChar(lines, number);
		while (tmp<lines.length && lines[tmp].charAt(0)!='"')
		{
			int[] ints = fromStringArrayToInt(lines[tmp]);
			patternsList.add(ints);
			tmp++;
		}
		
		return patternsList;
	}
}
