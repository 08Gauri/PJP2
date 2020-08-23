package myReader;

import date.Date;
import util.MyScanner;

public class ReadFromConsole {

	public static Date read() {
		
		MyScanner myScanner = new MyScanner();
		String userInput = MyScanner.readString();
		Date date = new Date(userInput);
		
		return date;
		
	}

}
