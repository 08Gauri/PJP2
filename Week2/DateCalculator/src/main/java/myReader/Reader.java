package myReader;

import date.Date;

public class Reader {

	public Date read(boolean fromFile , String inputFilePath)
	{
		Date date = new Date();
		if(fromFile == false)
			date = ReadFromConsole.read();
	
		return date;
	}
}
