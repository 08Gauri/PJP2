package api;

import java.util.ArrayList;
import java.util.List;

import Calculator.FeeCalculator;
import myReader.Reader;
import util.Sort;
import myWriter.Writer;
import report.ReportAttribute;
import transaction.TransactionAttribute;

public class TransactionFeeCalculatorApi {

	final static String inputFilePath = "C:\\Users\\ASUS\\Documents\\transactions.csv";
	final static String outputFilePath = "C:\\Users\\ASUS\\Documents\\outputSummary.csv";
	static List<ReportAttribute> reportList = new ArrayList<ReportAttribute>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Read the file
		Reader reader = new Reader();
		List<TransactionAttribute> transactionList = new ArrayList<TransactionAttribute>();
		transactionList = reader.readFile(inputFilePath);

		// 2. process the transactions

		FeeCalculator feeCalculator = new FeeCalculator();
		reportList = feeCalculator.calculate(transactionList);
		
		// 3. sort according to Client Id, Transaction Type, Transaction Date and Priority.
		
		reportList = Sort.sort(reportList);
		System.out.println(reportList.get(0).toString());
		
		// 4. write to output file

		Writer writer = new Writer();

		boolean result = writer.writeFile(outputFilePath, reportList);

		if (result == true)
			System.out.println("Success");
		else
			System.out.println("Failed");
	}

}
