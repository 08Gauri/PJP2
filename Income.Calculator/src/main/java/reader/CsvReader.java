package reader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import salary.SalaryAttributes;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    static List<SalaryAttributes> salaryList = new ArrayList<SalaryAttributes>();
    public  List<SalaryAttributes> readCSV (String path) throws IOException {
    	Reader reader = Files.newBufferedReader(Paths.get(path));
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        
            for (CSVRecord csvRecord : csvParser) {
                // Accessing Values by Column Index
                String city = csvRecord.get(0);
                String country = csvRecord.get(1);
                String gender = csvRecord.get(2);
                String currency = csvRecord.get(3);
                String amount = csvRecord.get(4);	
                salaryList.add(new SalaryAttributes(city,country,gender,currency,amount));
                
                
            }
			
            //***********************************************//
            System.out.println("From CsvReader");
			SalaryAttributes temp = salaryList.get(0);
            System.out.println(">  " + temp.toString());
            
            //***********************************************//
			return salaryList;
        
    }
}