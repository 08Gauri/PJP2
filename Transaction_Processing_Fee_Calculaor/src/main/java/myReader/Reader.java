package myReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import transaction.TransactionAttribute;


public class Reader {

	public List<TransactionAttribute> readFile(String path) {
		// TODO Auto-generated method stub

		List<TransactionAttribute> transactionList = new ArrayList<TransactionAttribute>();
		if (path.contains(".csv")) {
			CsvReader csvReader = new CsvReader();
			try {
				transactionList = csvReader.readCSV(path);

				// ***********************************************//
				System.out.println("From Reader");
				TransactionAttribute temp = transactionList.get(0);
				System.out.println(">  " + temp.toString());

				// ***********************************************//

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return transactionList;
	}

}
