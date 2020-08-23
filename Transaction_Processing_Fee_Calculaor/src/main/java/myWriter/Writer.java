package myWriter;

import java.util.List;

import report.ReportAttribute;

public class Writer {

	public boolean writeFile(String outputFilePath , List<ReportAttribute> reportList) {
		
		if(outputFilePath.contains(".csv"))
		{
			CSVWriter csvWriter = new CSVWriter();
			return csvWriter.writeCSV(outputFilePath, reportList);
		}
		
		return false;
		
	}

}
