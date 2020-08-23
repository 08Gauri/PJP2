package writer;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import perCapita.PerCapitaAttribute;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CSVWriter {
		
		private String country = "COUNTRY";
		private String gender = "GENDER";
		private String perCapitaIncome = "PER CAPITA INCOME";
        public boolean writeCSV (String outputFilePath , List<PerCapitaAttribute> perCapitaSalaryList) 
        		 {
        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFilePath));
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                    .withHeader(country , gender , perCapitaIncome));
            
            for(PerCapitaAttribute item : perCapitaSalaryList)
            {
            	String itemCountry = item.getCountry();
            	String itemGender = item.getGender();
            	String itemPerCapitaIncome = Float.toString(item.getPerCapitaIncome());
            	
            	csvPrinter.printRecord(itemCountry , itemGender , itemPerCapitaIncome);
            }
        
            csvPrinter.flush();
            
        }
        
        catch(IOException e )
        {
        	return false;
        }

        
			return true;            
        
    }
}