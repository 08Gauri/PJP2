package persistentStorage;

import java.util.ArrayList;
import java.util.List;

import date.Date;
import myReader.ReadFile;
import myWriter.WriteFile;

public class SessionStorage {

	List<Date> resultArray = new ArrayList<Date>();
	String path = "";
	public void updateFile()
	{
		resultArray = ReadFile.readFile(path);
		
		while(resultArray.size() > 100)
			resultArray.remove(0);
		
		
		
		WriteFile.writeFile(path , resultArray);
	}
}
