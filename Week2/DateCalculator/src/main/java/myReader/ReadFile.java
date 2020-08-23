package myReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import date.Date;

public class ReadFile {

	static List<Date> resultList;

	public static List<Date> readFile(String path) {

		File file = new File(path);

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));

			String dateString;
			while ((dateString = br.readLine()) != null)
				resultList.add(new Date(dateString));

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return resultList;
	}

}
