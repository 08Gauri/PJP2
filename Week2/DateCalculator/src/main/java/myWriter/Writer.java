package myWriter;

import date.Date;
import myReader.ReadFromConsole;

public class Writer {
	public void write(boolean toFile , String outputFilePath , Date date)
	{
		
		if(toFile == false)
			WriteToConsole.writeToConsole(date);
	
		
	}
}
