package reader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import salary.SalaryAttributes;

public class Reader {

	public List<SalaryAttributes> readFile(String path) {
		// TODO Auto-generated method stub

		List<SalaryAttributes> salaryList = new ArrayList<SalaryAttributes>();
		if (path.contains(".csv")) {
			CsvReader csvReader = new CsvReader();
			try {
				salaryList = csvReader.readCSV(path);

				// ***********************************************//
				System.out.println("From Reader");
				SalaryAttributes temp = salaryList.get(0);
				System.out.println(">  " + temp.toString());

				// ***********************************************//

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return salaryList;
	}

}
