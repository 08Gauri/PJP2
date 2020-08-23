package myWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import date.Date;

public class WriteFile {

	public static void writeFile(String path, List<Date> resultArray) {

		FileWriter fw;
		try {
			fw = new FileWriter(path);

			for (Date date : resultArray) {
				String dateString = date.toString();

				for (int i = 0; i < dateString.length(); i++)

					fw.write(dateString.charAt(i));

				fw.write("/n");
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
