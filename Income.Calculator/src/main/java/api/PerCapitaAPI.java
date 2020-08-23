package api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import perCapita.PerCapitaAttribute;
import perCapita.PerCapitaCalculator;
import perCapita.Sort;
import reader.Reader;
import salary.SalaryAttributes;
import writer.Writer;

public class PerCapitaAPI {

	final static String inputFilePath = "C:\\Users\\ASUS\\Documents\\users.csv";
	final static String outputFilePath = "C:\\Users\\ASUS\\Documents\\output.csv";
	static List<PerCapitaAttribute> perCapitaSalaryList = new ArrayList<PerCapitaAttribute>();

	public static void main(String[] args) {

		// 1. Read the file.
		Reader reader = new Reader();
		List<SalaryAttributes> salaryList = new ArrayList<SalaryAttributes>();
		salaryList = reader.readFile(inputFilePath);

		// ****************printing to Debug*******************************//
		System.out.println("From PerCapitaAPI");
		SalaryAttributes temp = salaryList.get(0);
		System.out.println(">  " + temp.toString());

		// ***********************************************//

		// 2. Calculating per capita income
		PerCapitaCalculator perCapitaCalculator = new PerCapitaCalculator();
		perCapitaSalaryList = perCapitaCalculator.calculate(salaryList);

		// ******************printing to Debug*****************************//
		System.out.println("From PerCapitaAPI");
		PerCapitaAttribute temp2 = perCapitaSalaryList.get(0);
		System.out.println(">  " + temp2.toString());

		// ***********************************************//

		// 3. Sorting
		perCapitaSalaryList = Sort.sort(perCapitaSalaryList);

		// 4. Writing to output file

		Writer writer = new Writer();

		boolean result = writer.writeFile(outputFilePath, perCapitaSalaryList);

		if (result == true)
			System.out.println("Success");
		else
			System.out.println("Failed");

	}

}
