package writer;

import java.util.List;

import perCapita.PerCapitaAttribute;

public class Writer {

	public boolean writeFile(String outputFilePath , List<PerCapitaAttribute> perCapitaSalaryList) {
		
		if(outputFilePath.contains(".csv"))
		{
			CSVWriter csvWriter = new CSVWriter();
			return csvWriter.writeCSV(outputFilePath, perCapitaSalaryList);
		}
		
		return false;
		
	}

}
